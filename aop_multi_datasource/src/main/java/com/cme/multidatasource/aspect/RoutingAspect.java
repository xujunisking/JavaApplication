package com.cme.multidatasource.aspect;

import com.cme.multidatasource.annotation.Router;
import com.cme.multidatasource.dynamicdatasource.MultiDataSourceHolder;
import com.cme.multidatasource.enumuration.DataBaseType;
import com.cme.multidatasource.exception.LoadRoutingStategyUnMatch;
import com.cme.multidatasource.exception.RoutingFiledArgsIsNull;
import org.apache.commons.beanutils.BeanUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.log4j.Logger;

/**
 * 拦截切面组件
 * Created by dracula on 2020-11-05
 */
@Component
@Aspect
public class RoutingAspect {
    private static Logger log = Logger.getLogger(RoutingAspect.class.getName());

    @Pointcut("@annotation(com.cme.multidatasource.annotation.Router)")
    public void pointCut(){};

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) throws LoadRoutingStategyUnMatch, RoutingFiledArgsIsNull, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        long beginTime = System.currentTimeMillis();
        //获取方法调用名称
        Method method = getInvokeMethod(joinPoint);

        //获取方法指定的注解
        Router router = method.getAnnotation(Router.class);
        //获取指定的路由key --orderId
        String routingFiled = router.routingFiled();

        //获取方法入参  --userId, money,orderId
        Object[] args = joinPoint.getArgs();

        MultiDataSourceHolder.setDataSourceKey(routingFiled);
    }

    private Method getInvokeMethod(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature)signature;
        Method targetMethod = methodSignature.getMethod();
        return targetMethod;
    }

    /**
     * 清除线程缓存
     * @param joinPoint
     */
    @After("pointCut()")
    public void methodAfter(JoinPoint joinPoint){
        MultiDataSourceHolder.clearDataSourceKey();
        //MultiDataSourceHolder.clearTableIndex();
    }
}

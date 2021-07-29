package spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainClass {

    public static void main(String[] args) {

        /*IParseDOC iParseDOC = new ExcelParse();
        iParseDOC.parse();*/

        testSPI1();
    }

    public static void testSPI1() {
        //step1:把接口类型保存到ServiceLoader service 变量中
        //创建一个lazyIterator对象 （把接口保存   保存classLoader）

        ServiceLoader<IParseDOC> iParseDOCS = ServiceLoader.load(IParseDOC.class);

        //返回懒加载的迭代对象
        Iterator<IParseDOC> iParseDOCIterator = iParseDOCS.iterator();

        while (iParseDOCIterator.hasNext()) {
            iParseDOCIterator.next().parse();
        }
    }
}

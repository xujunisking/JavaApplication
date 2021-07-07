package com.cme;

import com.cme.multidatasource.core.IRouting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EducationApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private IRouting Routing;

	@Test
	public void contextLoads() {
		System.out.println("OK");
	}

}

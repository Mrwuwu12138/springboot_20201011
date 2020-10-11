package com.wujy.springboot_20201010;

import com.wujy.springboot_20201010.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot20201010ApplicationTests {

	@Autowired
	private Person person;

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}

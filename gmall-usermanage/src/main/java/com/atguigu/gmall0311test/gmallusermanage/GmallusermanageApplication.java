package com.atguigu.gmall0311test.gmallusermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.atguigu.gmall0311test.gmallusermanage.mapper")
public class GmallusermanageApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallusermanageApplication.class, args);
	}

}

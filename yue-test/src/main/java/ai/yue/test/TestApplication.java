package ai.yue.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  孙金川
 * @version 创建时间：2018年8月7日
 */
@RestController
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TestApplication.class, args);
	}
	
	@GetMapping("/get")
	public String get() {
		String str = "Hello, world.";
		String str2 = "World, hello.";
		System.out.println(str);
		return str2;
	}
	
}

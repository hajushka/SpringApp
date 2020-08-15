package lv.ksenija_java.springProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}

//	@GetMapping ("/ho")
//	public String hello(@RequestParam(value = "name", defaultValue = "KM") String name){
//		return String.format("Hello %s", name);

//	}

}


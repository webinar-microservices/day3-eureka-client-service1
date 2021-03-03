package in.webinar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class FirstMicroService {

	/**
	 * http://localhost:8081/service1/
	 * @return
	 */
	@GetMapping("/")
	public String sayHello() {
		return "Hello First MicroService";
	}
	
}

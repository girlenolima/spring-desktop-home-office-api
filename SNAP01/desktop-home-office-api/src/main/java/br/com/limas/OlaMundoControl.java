package br.com.limas;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OlaMundoControl {
	
	private static final String template = "Ola , %s!";
	private  final AtomicLong counter = new AtomicLong();
	
	
	@RequestMapping("/olamundo")
	public OlaMundo olamundo(@RequestParam(value="name" ,defaultValue = "Mundo") String name) {
		
		
		
		return new OlaMundo(counter.incrementAndGet(),String.format(template, name));
		
	}

}

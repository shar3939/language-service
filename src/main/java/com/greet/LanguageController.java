/**
 * 
 */
package com.greet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shar939
 *
 */
@RestController
public class LanguageController {
	
	private Logger log = LoggerFactory.getLogger(LanguageController.class);

	@GetMapping(path = "/hello/{language}")
	public String language(@PathVariable(name = "language") String language) {
		log.debug("Inside language method");
		if("DE".equals(language)) {
			return "Hallo"; 
		} else if("ES".equals(language)) {
			return "Hola";
		} else if("IT".equals(language)) {
			return "Ciao";
		} else if("ES".equals(language)) {
			return "Hola";
		} else {
			return "Hello"; 
		}		
	}
}

package in.sampath.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppException {

	@ExceptionHandler(value = Exception.class)
	public String exceptionHandling (Exception e) {
		
		return "exceptionhandling";
	}
}

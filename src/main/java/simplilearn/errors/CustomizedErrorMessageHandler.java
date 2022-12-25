package simplilearn.errors;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

// centralized exception handler
@RestControllerAdvice
public class CustomizedErrorMessageHandler extends ResponseEntityExceptionHandler{
	
	
	@ExceptionHandler (value = Exception.class)
	public final ResponseEntity handleAllExceptionInTodoApplication(Exception e,WebRequest webRequest) {
		
		
		ErrorResponse usersErrorResponse =
				new ErrorResponse(new Date(), e.getMessage(), webRequest.getDescription(true));
		
		return new ResponseEntity(usersErrorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler (value = NotFoundException.class)
	public final ResponseEntity handleUsersNotFoundException(Exception e,WebRequest webRequest) {
		
		
		ErrorResponse usersErrorResponse =
				new ErrorResponse(new Date(), e.getMessage(), webRequest.getDescription(true));
		
		return new ResponseEntity(usersErrorResponse, HttpStatus.NOT_FOUND);
		
	}

	@Override
	protected ResponseEntity handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
	
		ErrorResponse usersErrorResponse =
				new ErrorResponse(new Date(), "invalid information", ex.getBindingResult().toString());
		
		return new ResponseEntity(usersErrorResponse, HttpStatus.BAD_REQUEST);
	}
	
}
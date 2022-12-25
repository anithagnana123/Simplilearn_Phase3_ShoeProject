package simplilearn.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import simplilearn.errors.NotFoundException;
import simplilearn.model.Users;
import simplilearn.services.UsersService;

@RestController
public class UsersResource {
	
	@Autowired
	private UsersService usersService;	
	
	
	@GetMapping (path = "/users/{username}/users/{id}")	
	public Users getUsers(@PathVariable String username,@PathVariable long id){
	    Users theUsers = usersService.findById(id);
	    if( theUsers == null) {
	    	throw new NotFoundException("id - " + id);
	    }
	    
		return theUsers;		
	}	
	
	@GetMapping ( path = "/users/{username}/users")
	public List<Users> getAllUsers(@PathVariable String username){
	    System.out.println("username : " + username);
		return usersService.findAll();
	}
		
	

}


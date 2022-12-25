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
import simplilearn.model.Admin;
import simplilearn.model.Product;
import simplilearn.repository.AdminRepository;
import simplilearn.services.AdminService;
import simplilearn.services.ProductService;

@RestController
public class AdminResource {
	
	@Autowired
	private AdminService adminService;	
	private AdminRepository adminRepository;
	
	
	@GetMapping (path = "/users/{username}/admin/{id}")	
	public Admin getAdmin(@PathVariable String username,@PathVariable String id){
	    Admin theAdmin = adminService.findById(id);
	    if( theAdmin == null) {
	    	throw new NotFoundException("id - " + id);
	    }
	    
		return theAdmin;		
	}
	
	@PostMapping(path = "/users/{username}/admin")
	public ResponseEntity updateAdmin (@PathVariable String username,@Valid @RequestBody Admin theAdmin) {
		Admin saveAdmin = adminService.save(theAdmin);
		
		//current request = http://localhost:8080/users/anitha/product
		
		//current request + path = http://localhost:8080/users/anitha/product/10001
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				       .buildAndExpand(saveAdmin.getUsername()).toUri();
		return ResponseEntity.created(location).build();
		
	}
	
		
	}
	



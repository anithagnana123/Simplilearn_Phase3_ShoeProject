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
import simplilearn.model.Purchase;
import simplilearn.services.PurchaseService;

@RestController
public class PurchaseResource {
	
	@Autowired
	private PurchaseService purchaseService;	
	
	
	@GetMapping (path = "/users/{username}/purchase/{id}")	
	public Purchase getPurchase(@PathVariable String username,@PathVariable long id){
	    Purchase thePurchase = purchaseService.findById(id);
	    if( thePurchase == null) {
	    	throw new NotFoundException("id - " + id);
	    }
	    
		return thePurchase;		
	}
	
	@GetMapping ( path = "/users/{username}/purchase")
	public List<Purchase> getAllPurchase(@PathVariable String username){
	    System.out.println("username : " + username);
		return purchaseService.findAll();
	}
		
	

}


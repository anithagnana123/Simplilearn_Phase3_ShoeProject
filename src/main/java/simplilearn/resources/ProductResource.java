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
import simplilearn.model.Product;
import simplilearn.services.ProductService;

@RestController
public class ProductResource {
	
	@Autowired
	private ProductService productService;	
	
	
	@GetMapping (path = "/users/{username}/product/{id}")	
	public Product getProduct(@PathVariable String username,@PathVariable long id){
	    Product theProduct = productService.findById(id);
	    if( theProduct == null) {
	    	throw new NotFoundException("id - " + id);
	    }
	    
		return theProduct;		
	}

	@PostMapping(path = "/users/{username}/product")
	public ResponseEntity createProduct (@PathVariable String username,@Valid @RequestBody Product theProduct) {
		Product saveProduct = productService.save(theProduct);
		
		//current request = http://localhost:8080/users/anitha/product
		
		//current request + path = http://localhost:8080/users/anitha/product/10001
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				       .buildAndExpand(saveProduct.getProductId()).toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	@DeleteMapping ( path = "/users/{username}/product/{id}")
	public ResponseEntity delete(@PathVariable String username, @PathVariable long id ) {
		Product theProduct = productService.deleteById(id);
		
		if( theProduct != null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
		
	}
	
	
	
	@GetMapping ( path = "/users/{username}/product")
	public List<Product> getAllProduct(@PathVariable String username){
	    System.out.println("username : " + username);
		return productService.findAll();
	}
		
	

}


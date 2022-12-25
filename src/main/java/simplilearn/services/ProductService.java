package simplilearn.services;

import java.util.List;

import simplilearn.model.Product;

public interface ProductService {

	public List<Product> findAll();
	public Product findById(long theId);
	public Product save(Product theProduct);
	public Product deleteById(long theId);
	
	
}

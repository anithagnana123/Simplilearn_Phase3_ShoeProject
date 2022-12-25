package simplilearn.services;

import java.util.List;

import simplilearn.model.Purchase;

public interface PurchaseService {

	public List<Purchase> findAll();
	public Purchase findById(long theId);
	
}

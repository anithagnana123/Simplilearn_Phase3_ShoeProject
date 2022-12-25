package simplilearn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplilearn.model.Purchase;
import simplilearn.repository.PurchaseRepository;


@Service(value = "purchaseService")
public class PurchaseServiceImpl implements PurchaseService {

	// depends on 'TodoRepository'
	private PurchaseRepository purchaseRepository;
	
	public PurchaseServiceImpl() {
		super();
	}
	
	public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
		super();
		System.out.println("spring ioc container invoked constructor to assemble the purchaseRepository bean");
		this.purchaseRepository = purchaseRepository;
	}

	@Autowired
	public void setPurchaseRepository(PurchaseRepository purchaseRepository) {
		System.out.println("spring ioc container invoked setter method to assemble the purchaseRepository bean");
		this.purchaseRepository = purchaseRepository;
	}

	@Override
	public List<Purchase> findAll() {
		return purchaseRepository.findAll();
	}
	
	@Override
	public Purchase findById(long theId) {
		return purchaseRepository.findById(theId).get();
	}
	
}
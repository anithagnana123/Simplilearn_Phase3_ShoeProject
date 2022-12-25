package simplilearn.services;

import java.util.List;

import simplilearn.model.Admin;
import simplilearn.model.Product;

public interface AdminService {

	public Admin findById(String id);
	public Admin save(Admin theAdmin);
	
}

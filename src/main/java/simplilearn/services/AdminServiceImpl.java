package simplilearn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplilearn.model.Admin;
import simplilearn.repository.AdminRepository;

@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {

	// depends on 'AdminRepository'
	private AdminRepository adminRepository;
	
	public AdminServiceImpl() {
		super();
	}
	
	public AdminServiceImpl(AdminRepository adminRepository) {
		super();
		System.out.println("spring ioc container invoked constructor to assemble the adminRepository bean");
		this.adminRepository = adminRepository;
	}

	@Autowired
	public void setAdminRepository(AdminRepository adminRepository) {
		System.out.println("spring ioc container invoked setter method to assemble the adminRepository bean");
		this.adminRepository = adminRepository;
	}
	
	@Override
	public Admin findById(String theId) {
		return adminRepository.findById(theId).get();
	}
	
	@Override
	public Admin save(Admin theAdmin) {
		return adminRepository.save(theAdmin);
	}
	
}
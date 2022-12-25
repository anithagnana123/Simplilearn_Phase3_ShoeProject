package simplilearn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplilearn.model.Purchase;
import simplilearn.model.Users;
import simplilearn.repository.UsersRepository;


@Service(value = "usersService")
public class UsersServiceImpl implements UsersService {

	// depends on 'UsersRepository'
	private UsersRepository usersRepository;
	
	public UsersServiceImpl() {
		super();
	}
	
	public UsersServiceImpl(UsersRepository usersRepository) {
		super();
		System.out.println("spring ioc container invoked constructor to assemble the usersRepository bean");
		this.usersRepository = usersRepository;
	}

	@Autowired
	public void setUsersRepository(UsersRepository usersRepository) {
		System.out.println("spring ioc container invoked setter method to assemble the usersRepository bean");
		this.usersRepository = usersRepository;
	}

	@Override
	public List<Users> findAll() {
		return usersRepository.findAll();
	}
	
	@Override
	public Users findById(long theId) {
		return usersRepository.findById(theId).get();
	}
	
	
}
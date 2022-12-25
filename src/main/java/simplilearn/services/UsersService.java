package simplilearn.services;

import java.util.List;

import simplilearn.model.Users;

public interface UsersService {

	public List<Users> findAll();
	public Users findById(long theId);
	
}

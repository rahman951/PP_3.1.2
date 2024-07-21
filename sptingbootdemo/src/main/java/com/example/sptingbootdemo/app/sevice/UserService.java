package com.example.sptingbootdemo.app.sevice;


import com.example.sptingbootdemo.app.model.User;

import java.util.List;

public interface UserService {
	List<User> index();
	
	User show(long id);
	
	void save(User user);
	
	void update(User personToBeUpdated);
	
	void delete(long id);
}

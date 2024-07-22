package com.example.sptingbootdemo.app.sevice;

import com.example.sptingbootdemo.app.dao.UserDao;
import com.example.sptingbootdemo.app.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
	private final UserDao userDao;
	
	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	
	public List<User> index() {
		return userDao.index();
	}
	
	@Override
	public User show(long id) {
		return userDao.show(id);
	}
	
	@Override
	@Transactional
	public void save(User user) {
		userDao.save(user);
	}
	
	@Override
	@Transactional
	public void update(User personUpdated) {
		userDao.update(personUpdated);
	}
	
	@Override
	@Transactional
	public void delete(long id) {
		userDao.delete(id);
	}
	
}
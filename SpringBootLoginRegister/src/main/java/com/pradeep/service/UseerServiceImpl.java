package com.pradeep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.dao.UserDao;
import com.pradeep.model.Login;
import com.pradeep.model.Register;


@Service
public class UseerServiceImpl implements UserService {
	
	
	@Autowired
	UserDao userDao;

	@Override
	public boolean validateUser(Login login) {
		
		Register reg=userDao.findByEmail(login.getEmail());
		
		if (reg!=null) {
			if(reg.getEmail().equals(login.getEmail()) && reg.getPassword().equals(login.getPassword())) {
				return true;
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Register regsiteruser(Register register) {
		return userDao.save(register);
	}

}

package com.pradeep.service;

import com.pradeep.model.Login;
import com.pradeep.model.Register;

public interface UserService {
	
	boolean validateUser(Login login);
	Register regsiteruser(Register register);

}

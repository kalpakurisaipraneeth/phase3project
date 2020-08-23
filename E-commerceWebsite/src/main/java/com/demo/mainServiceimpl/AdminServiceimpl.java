package com.demo.mainServiceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.Admin;
import com.demo.mainService.AdminService;
import com.demo.maindao.AdminDao;
@Service
public class AdminServiceimpl implements AdminService{
@Autowired
private AdminDao dao;

@Override
public Admin addAdmin(Admin admin) {
	
	return dao.save(admin);
}

@Override
public Admin getAdminByid(long id) {
	
	return dao.findById(id).get();
}

@Override
public Admin updatePwd(Admin admin) {
	
	return dao.save(admin);
}

@Override
public Admin authenticate(String adminId, String pwd) {
	return null ;
	
	
}


}

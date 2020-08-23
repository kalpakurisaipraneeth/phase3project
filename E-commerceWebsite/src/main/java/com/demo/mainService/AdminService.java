package com.demo.mainService;

import com.demo.main.Admin;

public interface AdminService {
	public Admin authenticate(String adminId, String pwd);
	public Admin addAdmin(Admin admin);
	public Admin getAdminByid(long id);
	public Admin updatePwd(Admin admin);
	
	
}

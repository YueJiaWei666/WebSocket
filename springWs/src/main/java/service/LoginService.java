package service;


public interface LoginService {
	//根据用户名获取用户密码
	String getpwdbyname(String name);
	//根据用户名获取用户id
	Long getUidbyname(String name);
	//根据用户id获取用户id
	String getnamebyid(long id);
}

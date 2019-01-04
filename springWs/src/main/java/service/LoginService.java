package service;


public interface LoginService {
	//根据登陆名查看密码
	String getpwdbyname(String name);
	Long getUidbyname(String name);
	//根据id查看登陆名
	String getnamebyid(long id);
}

package mapper;

import po.Staff;


public interface LoginMapper {
	//根据登陆名查看密码
	Staff getpwdbyname(String name);
	//根据id查看登陆名
	Staff getnamebyid(long id);
}

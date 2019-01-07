package mapper;

import po.Staff;


public interface LoginMapper {
	/**
	 * 根据用户名获取用户信息
	 * @param name
	 * @return
	 */
	Staff getpwdbyname(String name);
	/**
	 * 根据用户id获取用户信息
	 * @param id
	 * @return
	 */
	Staff getnamebyid(long id);
}

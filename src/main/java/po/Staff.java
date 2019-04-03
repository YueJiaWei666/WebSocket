package po;

/**
 * 用户表
 * @author 开发
 */
public class Staff {
	//主键id
	private byte staff_id;
	//用户姓名
	private String first_name;
	//用户姓名
	private String last_name;
	//用户地址
	private short address_id;
	//用户邮件
	private String email;
	//登陆名称
	private String username;
	//登陆密码
	private String password;
	//时间
	private String last_update;
	
	public String getLast_update() {
		return last_update;
	}
	public byte getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(byte staff_id) {
		this.staff_id = staff_id;
	}
	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public short getAddress_id() {
		return address_id;
	}
	public void setAddress_id(short address_id) {
		this.address_id = address_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
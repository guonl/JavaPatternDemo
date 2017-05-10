package com.guonl.listutils;

public class ListBeanCompare {

	public static void main(String[] args) {

		UserBean user01 = new UserBean();
		UserBean user02 = new UserBean();

		user01.setName("张三");
		user01.setGender("male");
//		user01.setMobile("123456789");
		user01.setEmail("111111@qq.com");
		
		user02.setName("张三");
		user02.setGender("male");
//		user02.setMobile(null);
		user02.setEmail("111111@qq.com");
		
		/*user02.setName("李四");
		user02.setGender("female");
		user02.setMobile("123456789");
		user02.setEmail("111111@qq.com");*/
		
		System.out.println(compare(user01, user02));

	}

	public static boolean compare(UserBean user01, UserBean user02) {
		if(!user01.getName().equals(user02.getName())){
			return false;
		}
		if(!user01.getGender().equals(user02.getGender())){
			return false;
		}
		if(user01.getMobile() != null && !user01.getMobile().equals(user02.getMobile())){
			return false;
		}
		if(!user01.getEmail().equals(user02.getEmail())){
			return false;
		}
		return true;
	}

}

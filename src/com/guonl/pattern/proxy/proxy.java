package com.guonl.pattern.proxy;

public class proxy {
	
	public static Object newProxyInstance(){
		
		String rn = "\r\n";
		String str =
		" package com.guonl.pattern.proxy; " + rn +
		" public class $Proxy0 implements Moveable { " + rn +

		"	public $Proxy0(Moveable m) { " + rn +
		"		super(); " + rn +
		"		this.m = m; " + rn +
		"	} " + rn +

		"	private Moveable m; " + rn +
			
		"	@Override " + rn +
		"	public void move() { " + rn +
				
		"		long starttime = System.currentTimeMillis(); " + rn +
		"		System.out.println(\"汽车开始行驶。。。\"); " + rn +
				
		"		m.move(); " + rn +
				
		"		long endtime = System.currentTimeMillis(); " + rn +
		"		System.out.println(\"汽车结束行驶。。。\" + \"行驶时间：\" + (endtime - starttime) + \"毫秒\"); " + rn +

		"	} " + rn +

		"}  ";

		
		return null;
	}
	

}

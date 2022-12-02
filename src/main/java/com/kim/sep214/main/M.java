package com.kim.sep214.main;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class M {

	//¿äÃ»°´Ã¼¸¦ ÆÄ¶ó¹ÌÅÍ·Î ¹Þ¾Æ¿È
	public static void multiply(HttpServletRequest request) {
		int x= Integer.parseInt(request.getParameter("x"));
		int y= Integer.parseInt(request.getParameter("y"));
		int z = x*y;
		request.setAttribute("z", z);
		
		Beaver b= new Beaver("ºñ¹ö", 3, 50.5, 10.1);
		request.setAttribute("b", b);

		ArrayList<Beaver> bvs = new ArrayList<>();
		bvs.add(b);
		bvs.add(new Beaver("º÷¾î",2,40.3,7.8));
		bvs.add(new Beaver("º÷¿À",2,40.3,7.8));
		bvs.add(new Beaver("º÷¿ö",2,40.3,7.8));
		request.setAttribute("bvs", bvs);
	}
}

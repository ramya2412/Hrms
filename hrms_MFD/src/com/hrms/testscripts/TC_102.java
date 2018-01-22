package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.lib.*;
public class TC_102 {
@Test
		public void Tc_01()throws Exception{
			General g=new General();
		g.openAppln();
		g.login();
		g.addEmp();
		g.logout();
		g.closeAppln();
		System.out.println("appln closed");

	}

}

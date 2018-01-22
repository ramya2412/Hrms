package com.hrms.testscripts;

import com.hrms.lib.*;

public class TC_103 {
	public static void main(String[] args) {
		General g=new General();
		g.openAppln();
		g.login();
		g.enter_frame();
		g.delEmp();
		g.exit_frame();
		g.logout();
		g.closeAppln();

	}


}

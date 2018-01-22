package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.lib.*;

public class TC_104_PIM {
	General g=new General();
	@Test
		public void meth2(){
			
		
		g.openAppln();
		g.login();
		g.navigate_pim();
		
		g.enter_frame();
		g.search_btn();
		g.exit_frame();
		g.enter_frame();
		g.delete_emp();
		g.verify_del_title();
		g.exit_frame();
		g.logout();
		
		g.closeAppln();
	}

}


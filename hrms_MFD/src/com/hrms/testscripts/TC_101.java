package com.hrms.testscripts;
import org.testng.annotations.Test;




import com.hrms.lib.*;

public class TC_101 {
	
	@Test
	public void meth1()throws Exception {
		General g=new General();
		g.openAppln();
		g.login();
		g.logout();
		g.closeAppln();

	}

}

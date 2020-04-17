package org.development.webapp.Controller.test;

import static org.junit.Assert.assertEquals;

import org.development.webapp.Controller.LoginController;
import org.junit.Test;

public class LoginControllerTest {
@Test	
public void addTest() {
	LoginController lc = new LoginController();
	assertEquals(10, lc.add(5, 5));
}

}

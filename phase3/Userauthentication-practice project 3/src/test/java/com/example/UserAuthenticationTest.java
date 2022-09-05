package com.example;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class UserAuthenticationTest {
	private UserAuthentication authenticate;
	@Before
	public void objectcreate() {
		authenticate=new UserAuthentication();
		System.out.println("userauthenticate object created");
		
	}
	@Test
	public void checkusername() {
		assertEquals("johnson",authenticate.username());
	}
	@Test
	public void checkemail()
	{
		assertEquals("johnson12@gamil.com",authenticate.email());
	}
	@Test
	public void checkpassword()
	{
		assertEquals("john@123",authenticate.password());
	}
	@After
	public void objectremove()
	{
		authenticate=null;
		System.out.println("userauthenticate object destroyed");
		
	}
	

}

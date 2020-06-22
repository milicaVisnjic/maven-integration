package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	public void whenEmptyString_thenAccept() {
	    App palindromeTester = new App();
	    assertTrue(palindromeTester.isPalindrome(""));
	}
	@Test
	public void whenPalindrom_thenAccept() {
	    App palindromeTester = new App();
	    assertTrue(palindromeTester.isPalindrome("noon"));
	}
	     
	@Test
	public void whenNearPalindrom_thanReject(){
	    App palindromeTester = new App();
	    assertFalse(palindromeTester.isPalindrome("neon"));
	}
}

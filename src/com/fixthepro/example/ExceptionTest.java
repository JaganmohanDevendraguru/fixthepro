/**
 * jegan
 * 2020
 */
package com.fixthepro.example;

import java.io.IOException;

/**
 * @author jegan
 *
 */
public class ExceptionTest {

	/**
	 * @param
	 * void
	 */
	public static void main(String[] args) {
		try {
			exMethod();
		} catch (IOException e) {
			System.out.println("Handled in Main");
			e.printStackTrace();
		}
	}
	
	static void exMethod() throws IOException{
		try {
			int i =0;
			if(i == 0)
				throw new Exception("i is zero");
		} catch (Exception e) {
			System.out.println("exMethod ex");
			e.printStackTrace();
		}
	}

}

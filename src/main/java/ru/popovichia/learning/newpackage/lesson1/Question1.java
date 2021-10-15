/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.popovichia.learning.newpackage.lesson1;

/** @author Igor */
public class Question1 {
	
	static int[] arrayInt = new int[100];
	
	public void doTest() {
		byte[] arrayByte = new byte[100];
		for (int i = 0; i < 100; i++) {
			if (arrayInt[i] != arrayByte[i]) {
				throw new IllegalStateException("error");
			}
      System.out.println("arrayInt[i] - " + arrayInt[i]);
      System.out.println("arrayByte[i] - " + arrayByte[i]);
		}
	} 
}

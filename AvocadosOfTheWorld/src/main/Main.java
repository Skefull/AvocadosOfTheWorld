/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */
package main;

import fruit.Avocado;
import fruit.Fruit;

public class Main {

	public static void main(String[] args) {
		// Declare and instantiate a fruit called avocajoe
		//Fruit avocajo = new Fruit(); // Cannot instantiate an abstract class
									 // Be able to explain why we have abstract classes
		// Declare and instantiate an Avocado named avocajoe
		Avocado avocajoe = new Avocado(2, (float).75);
		System.out.println(avocajoe.toString());
	}
}

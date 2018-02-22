package com.example.demo.services;

// static import
/* Un import statique permet de faire appel à des méthodes statiques 
   sans préciser le nom de la classe qui définit ces méthodes.*/
/* import static java.lang.Math.cos;

import static java.lang.Math.PI;


Alors ceci est valide :

double d = cos(2*PI);


Sans les imports statiques il aurait fallu faire :

double d = Math.cos(2*Math.PI); */

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticServiceImpTest {

	@Test
	public final void testMultiply() {
		ArithmeticServiceImp calc = new ArithmeticServiceImp();
		int a, b, res;
		a = 5;
		b = 5;
		res = a + b;
		if (calc.add(a, b) != res) {
			fail("a et b positif");
		}
		a = 0;
		b = 5;
		res = a + b;
		if (calc.add(a, b) != res) {
			fail("a nul");
		}
		a = 5;
		b = 0;
		res = a + b;
		if (calc.add(a, b) != res) {
			fail("b nul");
		}
		a = 0;
		b = 0;
		res = a + b;
		if (calc.add(a, b) != res) {
			fail("a et b nuls");
		}
		a = -5;
		b = 5;
		res = a + b;
		if (calc.add(a, b) != res) {
			fail("a negatif");
		}
		a = 5;
		b = -5;
		res = a + b;
		if (calc.add(a, b) != res) {
			fail("b negatif");
		}
		a = -5;
		b = -5;
		res = a + b;
		if (calc.add(a, b) != res) {
			fail("a et b negatif");
		}
	}

	@Test

	public final void testAdd() {

		ArithmeticServiceImp calc = new ArithmeticServiceImp();
		int a, b, res;
		a = 5;
		b = 5;
		res = a + b;
		assertTrue("a et b positif", calc.add(a, b) == res);

		a = 0;
		b = 5;
		res = a + b;
		assertTrue("a nul", calc.add(a, b) == res);

		a = 5;
		b = 0;
		res = a + b;
		assertTrue("b nul", calc.add(a, b) == res);

		a = 0;
		b = 0;
		res = a + b;
		assertTrue("a et b nuls", calc.add(a, b) == res);

		a = -5;
		b = 5;
		res = a + b;
		assertTrue("a negatif", calc.add(a, b) == res);

		a = 5;
		b = -5;
		res = a + b;
		assertTrue("b negatif", calc.add(a, b) == res);

		a = -5;
		b = -5;
		res = a + b;
		assertTrue("a et b negatif", calc.add(a, b) == res);

	}

}

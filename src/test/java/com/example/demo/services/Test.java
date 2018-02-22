package com.example.demo.services;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.lang.Object.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.services.MyList;

public class Test {

	private static MyList<Integer> sut;  //la classe à tester
	private static int expectedSize;  // la taille à l'origine
	private static Properties prop;  // les propriétés
	private static List<Integer> testSet;  //les nombres que nous mettrons 
	private static FileInputStream propFile;  //le fichier de propriétés
	
	//initialiser des variables et ressources communes à tous les tests
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("avant tout");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("après tout");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("avant un test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("après un test");
	}

	@org.junit.Test
	public void test() {
		
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Chris Alves, Jake Sanchez, Alisha Saiyed
 */
public class ConverterMethodsTest {
    
    public ConverterMethodsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of convertF2C method, of class ConverterMethods.
     */
    @Test
    public void testConvertF2C() {
        System.out.println("convertF2C");
        ConverterMethods instance = new ConverterMethods();
	assertEquals(-73.333336, instance.convertF2C(-100));
	assertEquals(-17.777779, instance.convertF2C(0));
	assertEquals(37.77778, instance.convertF2C(100));
    }

    /**
     * Test of convertC2F method, of class ConverterMethods.
     */
    @Test
    public void testConvertC2F() {
        System.out.println("convertC2F");
        ConverterMethods instance = new ConverterMethods();
        assertEquals(-148.0, instance.convertC2F(-100));
	assertEquals(32.0, instance.convertC2F(0));
	assertEquals(212.0, instance.convertC2F(100));
    }

    /**
     * Test of convertIn2Cm method, of class ConverterMethods.
     */
    @Test
    public void testConvertIn2Cm() {
        System.out.println("convertIn2Cm");
        ConverterMethods instance = new ConverterMethods();
        assertEquals(-254.0, instance.convertIn2Cm(-100));
	assertEquals(0.0, instance.convertIn2Cm(0));
	assertEquals(254.0, instance.convertIn2Cm(100));
    }

    /**
     * Test of convertCm2In method, of class ConverterMethods.
     */
    @Test
    public void testConvertCm2In() {
        System.out.println("convertCm2In");
        ConverterMethods instance = new ConverterMethods();
    assertEquals(-39.37, instance.convertCm2In(-100));
	assertEquals(0.0, instance.convertCm2In(0));
	assertEquals(39.37, instance.convertCm2In(100));
    }

    /**
     * Test of convertF2M method, of class ConverterMethods.
     */
    @Test
    public void testConvertF2M() {
        System.out.println("convertF2M");
        ConverterMethods instance = new ConverterMethods();
	assertEquals(-30.48, instance.convertF2M(-100));
	assertEquals(0.0, instance.convertF2M(0));
	assertEquals(30.48, instance.convertF2M(100));
    }

    /**
     * Test of convertM2F method, of class ConverterMethods.
     */
    @Test
    public void testConvertM2F() {
        System.out.println("convertM2F");
        ConverterMethods instance = new ConverterMethods();
	assertEquals(-165.34392, instance.convertM2F(-100));
	assertEquals(0.0, instance.convertM2F(0));
	assertEquals(165.34392, instance.convertM2F(100));
    }

    /**
     * Test of convertM2K method, of class ConverterMethods.
     */
    @Test
    public void testConvertM2K() {
        System.out.println("convertM2K");
        ConverterMethods instance = new ConverterMethods();
	assertEquals(-160.9, instance.convertM2K(-100));
	assertEquals(0.0, instance.convertM2K(0));
	assertEquals(160.9, instance.convertM2K(100));
       
    }

    /**
     * Test of convertK2M method, of class ConverterMethods.
     */
    @Test
    public void testConvertK2M() {
        System.out.println("convertK2M");
        ConverterMethods instance = new ConverterMethods();
    assertEquals(-62.14, instance.convertK2M(-100));
	assertEquals(0.0, instance.convertK2M(0));
	assertEquals(62.14, instance.convertK2M(100));
    }

    /**
     * Test of convertG2L method, of class ConverterMethods.
     */
    @Test
    public void testConvertG2L() {
        System.out.println("convertG2L");
        ConverterMethods instance = new ConverterMethods();
    assertEquals(-378.5, instance.convertG2L(-100));
	assertEquals(0.0, instance.convertG2L(0));
	assertEquals(378.5, instance.convertG2L(100));

    }

    /**
     * Test of convertL2G method, of class ConverterMethods.
     */
    @Test
    public void testConvertL2G() {
        System.out.println("convertL2G");
        ConverterMethods instance = new ConverterMethods();
    assertEquals(-26.42008, instance.convertL2G(-100));
	assertEquals(0.0, instance.convertL2G(0));
	assertEquals(26.42008, instance.convertL2G(100));
    }

    /**
     * Test of convertOz2G method, of class ConverterMethods.
     */
    @Test
    public void testConvertOz2G() {
        System.out.println("convertOz2G");
        ConverterMethods instance = new ConverterMethods();
	
	
	
    assertEquals(-2835.0, instance.convertOz2G(-100));
	assertEquals(0.0, instance.convertOz2G(0));
	assertEquals(2835.0, instance.convertOz2G(100));

    }

    /**
     * Test of convertG2Oz method, of class ConverterMethods.
     */
    @Test
    public void testConvertG2Oz() {
        System.out.println("convertG2Oz");
        ConverterMethods instance = new ConverterMethods();
    assertEquals(-3.5273368, instance.convertG2Oz(-100));
	assertEquals(0.0, instance.convertG2Oz(0));
	assertEquals(3.5273368 , instance.convertG2Oz(100));
    }

    /**
     * Test of convertLb2K method, of class ConverterMethods.
     */
    @Test
    public void testConvertLb2K() {
        System.out.println("convertLb2K");
        ConverterMethods instance = new ConverterMethods();
    assertEquals(-45.36, instance.convertLb2K(-100));
	assertEquals(0.0, instance.convertLb2K(0));
	assertEquals(45.36, instance.convertLb2K(100));
    }

    /**
     * Test of convertK2Lb method, of class ConverterMethods.
     */
    @Test
    public void testConvertK2Lb() {
        System.out.println("convertK2Lb");
        ConverterMethods instance = new ConverterMethods();
    assertEquals(-220.5, instance.convertK2Lb(-100));
	assertEquals(0.0, instance.convertK2Lb(0));
	assertEquals(220.5, instance.convertK2Lb(100));
    }
    
}

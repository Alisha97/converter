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
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertF2C(base);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertC2F method, of class ConverterMethods.
     */
    @Test
    public void testConvertC2F() {
        System.out.println("convertC2F");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertC2F(base);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertIn2Cm method, of class ConverterMethods.
     */
    @Test
    public void testConvertIn2Cm() {
        System.out.println("convertIn2Cm");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertIn2Cm(base);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertCm2In method, of class ConverterMethods.
     */
    @Test
    public void testConvertCm2In() {
        System.out.println("convertCm2In");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertCm2In(base);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertF2M method, of class ConverterMethods.
     */
    @Test
    public void testConvertF2M() {
        System.out.println("convertF2M");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertF2M(base);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertM2F method, of class ConverterMethods.
     */
    @Test
    public void testConvertM2F() {
        System.out.println("convertM2F");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertM2F(base);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertM2K method, of class ConverterMethods.
     */
    @Test
    public void testConvertM2K() {
        System.out.println("convertM2K");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertM2K(base);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of convertK2M method, of class ConverterMethods.
     */
    @Test
    public void testConvertK2M() {
        System.out.println("convertK2M");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertK2M(base);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertG2L method, of class ConverterMethods.
     */
    @Test
    public void testConvertG2L() {
        System.out.println("convertG2L");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertG2L(base);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of convertL2G method, of class ConverterMethods.
     */
    @Test
    public void testConvertL2G() {
        System.out.println("convertL2G");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertL2G(base);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertOz2G method, of class ConverterMethods.
     */
    @Test
    public void testConvertOz2G() {
        System.out.println("convertOz2G");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertOz2G(base);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of convertG2Oz method, of class ConverterMethods.
     */
    @Test
    public void testConvertG2Oz() {
        System.out.println("convertG2Oz");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertG2Oz(base);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertLb2K method, of class ConverterMethods.
     */
    @Test
    public void testConvertLb2K() {
        System.out.println("convertLb2K");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertLb2K(base);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertK2Lb method, of class ConverterMethods.
     */
    @Test
    public void testConvertK2Lb() {
        System.out.println("convertK2Lb");
        float base = 0.0F;
        ConverterMethods instance = new ConverterMethods();
        float expResult = 0.0F;
        float result = instance.convertK2Lb(base);
        assertEquals(expResult, result);
    }
    
}

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
 * @author chris
 */
public class ConverterToolTest {
    
    public ConverterToolTest() {
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
     * Test of decimalConverter method, of class ConverterTool.
     */
    @Test
    public void testDecimalConverter() {
        System.out.println("decimalConverter");
        int precision = 0;
        Object[] args = null;
        String expResult = "";
        String result = ConverterTool.decimalConverter(precision, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBaseVal method, of class ConverterTool.
     */
    @Test
    public void testGetBaseVal() {
        System.out.println("getBaseVal");
        ConverterTool instance = new ConverterTool();
        float expResult = 0.0F;
        float result = instance.getBaseVal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBaseVal method, of class ConverterTool.
     */
    @Test
    public void testSetBaseVal() {
        System.out.println("setBaseVal");
        float baseVal = 0.0F;
        ConverterTool instance = new ConverterTool();
        instance.setBaseVal(baseVal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConvertedVal method, of class ConverterTool.
     */
    @Test
    public void testGetConvertedVal() {
        System.out.println("getConvertedVal");
        ConverterTool instance = new ConverterTool();
        float expResult = 0.0F;
        float result = instance.getConvertedVal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConvertedVal method, of class ConverterTool.
     */
    @Test
    public void testSetConvertedVal() {
        System.out.println("setConvertedVal");
        float convertedVal = 0.0F;
        ConverterTool instance = new ConverterTool();
        instance.setConvertedVal(convertedVal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSliderVal method, of class ConverterTool.
     */
    @Test
    public void testGetSliderVal() {
        System.out.println("getSliderVal");
        ConverterTool instance = new ConverterTool();
        int expResult = 0;
        int result = instance.getSliderVal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSliderVal method, of class ConverterTool.
     */
    @Test
    public void testSetSliderVal() {
        System.out.println("setSliderVal");
        int sliderVal = 0;
        ConverterTool instance = new ConverterTool();
        instance.setSliderVal(sliderVal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ConverterTool.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ConverterTool.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

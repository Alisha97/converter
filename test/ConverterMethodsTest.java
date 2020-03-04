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

    ConverterMethods converter;

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
        converter = new ConverterMethods();
    }

    @AfterEach
    public void tearDown() {
        converter = null;
    }

    /**
     * Test of convertF2C method, of class ConverterMethods.
     *
     * Observability: We are able to see the result of formula of converting from
     * degrees F to C which we should be able to observe the output easily.  We are testing
     * positive, negative, and a value that should output 0 in Celsius.
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits
     */
    @Test
    public void testConvertF2C() {
        System.out.println("convertF2C");
        assertEquals(-73.33333587646484, converter.convertF2C(-100));
        assertEquals(-17.77777862548828, converter.convertF2C(0));
        assertEquals(37.77777862548828, converter.convertF2C(100));
    }

    /**
     * Test of convertC2F method, of class ConverterMethods.
     *
     * Observability: We are now able to see C to F conversion and see if we receive
     * a higher number and ensure that it is correct just like its reverse conversion.
     * We can also see what happens with negative, positive, and 0 values
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits
     */
    @Test
    public void testConvertC2F() {
        System.out.println("convertC2F");
        assertEquals(-148.0, converter.convertC2F(-100));
        assertEquals(32.0, converter.convertC2F(0));
        assertEquals(212.0, converter.convertC2F(100));
    }

    /**
     * Test of convertIn2Cm method, of class ConverterMethods.
     *
     * Observability: We are able to observe conversion of inches to centimeters
     * and see if we get the correct output both positive and negative. We will also
     * ensure that 0 values will give the same exact 0 output.
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits including integers and 0.
     */
    @Test
    public void testConvertIn2Cm() {
        System.out.println("convertIn2Cm");
        assertEquals(-254.0, converter.convertIn2Cm(-100));
        assertEquals(0.0, converter.convertIn2Cm(0));
        assertEquals(254.0, converter.convertIn2Cm(100));
    }

    /**
     * Test of convertCm2In method, of class ConverterMethods.
     *
     * Observability: We can observe the conversion output from centimeters to
     * inches and ensure that we get the correct output of +-100 for the correct
     * input of positive or negative centimeters.  We will also compare 0 equality
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits
     */
    @Test
    public void testConvertCm2In() {
        System.out.println("convertCm2In");
        assertEquals(-39.369998931884766, converter.convertCm2In(-100));
        assertEquals(0.0, converter.convertCm2In(0));
        assertEquals(39.369998931884766, converter.convertCm2In(100));
    }

    /**
     * Test of convertF2M method, of class ConverterMethods.
     *
     * Observability: WE will see the conversion formula of feet to meter and ensure
     * that it works both for positive and negative direction and gives the proper
     * output of 100 exactly. We also test for 0 equality on both sides.
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits including integers and 0.
     */
    @Test
    public void testConvertF2M() {
        System.out.println("convertF2M");
        assertEquals(-30.479999542236328, converter.convertF2M(-100));
        assertEquals(0.0, converter.convertF2M(0));
        assertEquals(30.479999542236328, converter.convertF2M(100));
    }

    /**
     * Test of convertM2F method, of class ConverterMethods.
     *
     * Observability: Observe the conversion formula from meters to feet and enure
     * we get the proper value for both positive and negative values. 0 equality is
     * also tested to ensure proper initial values work correctly.
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits including integers and 0.
     */
    @Test
    public void testConvertM2F() {
        System.out.println("convertM2F");
        assertEquals(-165.3439178466797, converter.convertM2F(-100));
        assertEquals(0.0, converter.convertM2F(0));
        assertEquals(165.3439178466797, converter.convertM2F(100));
    }

    /**
     * Test of convertM2K method, of class ConverterMethods.
     *
     * Observability: Conversion formula for miles to kilometers are tested and
     * ensuring both positive and negative values work properly and that 0 equality
     * remains true on both ends
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits including integers and 0.
     */
    @Test
    public void testConvertM2K() {
        System.out.println("convertM2K");
        assertEquals(-160.89999389648438, converter.convertM2K(-100));
        assertEquals(0.0, converter.convertM2K(0));
        assertEquals(160.89999389648438, converter.convertM2K(100));

    }

    /**
     * Test of convertK2M method, of class ConverterMethods.
     *
     * Observability: Testing the Kilometers to miles conversion and ensuring the
     * same output on both ends of positive and negative direction hold and that 0
     * equality remains true on both sides.
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits including integers and 0.
     */
    @Test
    public void testConvertK2M() {
        System.out.println("convertK2M");
        assertEquals(-62.13999938964844, converter.convertK2M(-100));
        assertEquals(0.0, converter.convertK2M(0));
        assertEquals(62.13999938964844, converter.convertK2M(100));
    }

    /**
     * Test of convertG2L method, of class ConverterMethods.
     *
     * Observability: Testing the conversion formula for gallons to liters ensuring
     * they remain true both positive and negative. 0 equality is checked on both
     * ends of the conversion as well.
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits including integers and 0.
     */
    @Test
    public void testConvertG2L() {
        System.out.println("convertG2L");
        assertEquals(-378.5, converter.convertG2L(-100));
        assertEquals(0.0, converter.convertG2L(0));
        assertEquals(378.5, converter.convertG2L(100));

    }

    /**
     * Test of convertL2G method, of class ConverterMethods.
     *
     * Observability: Ensuring the conversion formula for liters to gallon is correct
     * in both positive and negative directions and the 0 equality remains true for
     * both ends
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits including integers and 0.
     */
    @Test
    public void testConvertL2G() {
        System.out.println("convertL2G");
        assertEquals(-26.420080184936523, converter.convertL2G(-100));
        assertEquals(0.0, converter.convertL2G(0));
        assertEquals(26.420080184936523, converter.convertL2G(100));
    }

    /**
     * Test of convertOz2G method, of class ConverterMethods.
     *
     * Observability: Testing the conversion formula from ounces to gallons ensuring
     * both positive and negative values work properly. 0 equality is also checked
     * to hold up that property.
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits including integers and 0.
     */
    @Test
    public void testConvertOz2G() {
        System.out.println("convertOz2G");
        assertEquals(-2835.0, converter.convertOz2G(-100));
        assertEquals(0.0, converter.convertOz2G(0));
        assertEquals(2835.0, converter.convertOz2G(100));

    }

    /**
     * Test of convertG2Oz method, of class ConverterMethods.
     *
     * Observability: We are able to see if gallons to ounces conversion formula
     * is correct and will display the proper value for converison. 0 equality is checked
     * as well to ensure the property holds true.
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits including integers and 0.
     */
    @Test
    public void testConvertG2Oz() {
        System.out.println("convertG2Oz");
        assertEquals(-3.527336835861206, converter.convertG2Oz(-100));
        assertEquals(0.0, converter.convertG2Oz(0));
        assertEquals(3.527336835861206 , converter.convertG2Oz(100));
    }

    /**
     * Test of convertLb2K method, of class ConverterMethods.
     *
     * Observability: Testing that the pounds to kilogram conversion is returning
     * proper output to display. 0 equality is checked as well to assure initial
     * zero values function properly.
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits including integers and 0.
     */
    @Test
    public void testConvertLb2K() {
        System.out.println("convertLb2K");
        assertEquals(-45.36000061035156, converter.convertLb2K(-100));
        assertEquals(0.0, converter.convertLb2K(0));
        assertEquals(45.36000061035156, converter.convertLb2K(100));
    }

    /**
     * Test of convertK2Lb method, of class ConverterMethods.
     *
     * Observability: Ensuring the kilogram to pounds formula for conversion is
     * correct as well as 0 equality holding true to ensure all cases work for positive,
     * negative, and 0 values.
     *
     * Controllability: Test inputs are simple as they are just floating point
     * numbers and are easy to run the tests providing any floating point number
     * possible in 64 bits including integers and 0.
     */
    @Test
    public void testConvertK2Lb() {
        System.out.println("convertK2Lb");
        assertEquals(-220.5, converter.convertK2Lb(-100));
        assertEquals(0.0, converter.convertK2Lb(0));
        assertEquals(220.5, converter.convertK2Lb(100));
    }


    // TDD ASSIGNMENT PROCESS BEGINS HERE! TDD ASSIGNMENT PROCESS BEGINS HERE! TDD ASSIGNMENT PROCESS BEGINS HERE!

    // NOTE: All of the expected outputs are modified slightly with just a small fraction in order to be equivalent
    //       to the output of the formulas since they are done with floating point number which when given large values
    //       is very limited in accuracy and not mathematically equivalent and needs rounding which is done by our slider
    //       in the actual application where user can select the number of decimals and will see it done correctly.


    /**
     * This test will see what we expect and how we should call a conversion method
     * that will later be created.
     *
     * This test is from miles per gallon -> kilometers per liter
     *
     * 1) Started by writing the test method and creating a method name for it in here
     *    and the expected outcome and way to call the method before even attempting to
     *    write it in the actual source code.
     * 2) For the first test case, simply inserted 1 for a simple happy path that will just test our
     *    formula for it first.
     * 3) Test didn't compile since the method does not exist in source code, but now created the method in
     *    source file and just returning the answer expected to make it pass.
     * 4) Now added in a second assertEquals comparison with a value of 50 to make sure our formula
     *    works for multiple cases which results in a red bar since it is a hardcoded value
     * 5) Refactored the source file's method to actually implement the formula and now get a green bar for both of
     *    the cases.
     * 6) Included a negative number to check an unusual path and got correct output and green bars all across.
     */
    @Test
    public void testConvertMpg2Kpl() {
        System.out.println("convertMpg2Kpl");
        assertEquals(0.42517006397247314, converter.convertMpg2Kpl(1));
        assertEquals(21.258502960205078, converter.convertMpg2Kpl(50));
        assertEquals(-4.2517008781433105, converter.convertMpg2Kpl(-10));
    }

    /**
     * This test is to evaluate conversion from kilometers per liter -> miles per gallon
     *
     * 1) Started by writing out the conversion method and coming up with a name for the
     *    kind of conversion performed and what should be expected by a simple input of 1
     * 2) The test had a compilation error since it the actual method has not been created in the
     *   source file.
     * 3) To just make it pass, I returned the expected output which is just the hardcoded value of what is
     *    expected of the conversion method with input of 1
     * 4) Now, the test method is refactored to include a second happy path with an unusual input of 35.5 to see if
     *   it handles a float properly and will fail since no formula has been implemented
     * 5) Refactored the actual method in source file to include the formula and return correct results all across.
     * 6) Included negative unusual path to ensure formula work properly.
     * 7) Green bars all across for all test cases passed with all refactoring done
     */
    @Test
    public void testConvertKpl2MpgPositiveCases() {
        System.out.println("convertKpl2MpgPositiveCases");
        assertEquals(2.3519999980926514, converter.convertKpl2Mpg(1));
        assertEquals(83.49600219726562, converter.convertKpl2Mpg((float) 35.5));
    }

    @Test
    public void testConvertKpl2MpgNegativeCase() {
        System.out.println("convertKpl2MpgNegativeCase");
        assertEquals(-11.760000228881836, converter.convertKpl2Mpg(-5));
    }

    /**
     * These two following tests we implemented the same pattern for both since they are just the vice versa
     * of each other and will handle the same kinds of cases just in the opposite direction.
     *
     * 1) We started by creating the tests first and ensuring that we think of what kind of name the actual method
     *    that will do the calculation should be called.
     * 2) We then gave it a simple happy path of 0 / -273.15 to ensure that our conversion from kelvin to celsius would be accurate
     *    since it is just a simple addition / subtraction.
     * 3) Obviously, the compiler then failed since the actual method had not been written up, but now we went to the source file,
     *    created the methods, and just returned a hard coded value for each that just lets that one case pass.
     * 4) Now, another test is given with a different value which allows us to see a red bar and go back and refactor the actual
     *    conversion method and implement the following formula of kelvin->celsius (vice-versa).
     * 5) Green bar comes up for different values now and test methods are refactored to see if negative values work right
     *    and just make sure that the conversion works properly and how we expect it to.
     */

    @Test
    public void testConvertK2CPositiveValues() {
        System.out.println("convertK2CPositiveValues");
        assertEquals(-273.1499938964844, converter.convertK2C(0));
        assertEquals(-247.39999389648438, converter.convertK2C((float) 25.75));
    }

    @Test
    public void testConvertK2CNegativeValues() {
        System.out.println("convertK2CNegativeValues");
        assertEquals(-773.1500244140625, converter.convertK2C(-500));
    }

    @Test
    public void testConvertC2K() {
        System.out.println("convertC2KPositiveValues");
        // as close to 0 as floating point can get, will get rounded off to 0 in actual application
        assertEquals(6.10351571594947E-6, converter.convertC2K((float) -273.15));
        assertEquals(373.1499938964844, converter.convertC2K(100));
    }
}

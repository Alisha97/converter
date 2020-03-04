/**
 *
 * @author FNU Alisha Zamir Saiyed, Jake Sanchez, Chris Alves
 */
public class ConverterMethods {

    /* Converter Methods */
    public float convertF2C (float base)
    {  // Convert farenheit to celsius
        float converted= (float) ( ( (base-32.0) * 5.0) / 9.0);

        return converted;
    }
    public float convertC2F (float base)
    {  // Convert celsius to farenheit
        float converted= (float) ( (base * 9.0 / 5.0) + 32.0);

        return converted;
    }

    // small distance
    public float convertIn2Cm (float base)
    {  // Convert inches to centimeters
        float converted= (float) (base * 2.54);

        return converted;
    }

    public float convertCm2In (float base)
    {  // Convert centimeters to inches
        float converted= (float) (base * 0.3937);

        return converted;
    }

    // medium distance
    public float convertF2M (float base)
    {  // Convert feet to meters
        float converted= (float) (base * 0.3048);

        return converted;
    }

    public float convertM2F (float base)
    {  // Convert meters to feet
        float converted= (float) (base / 0.6048);

        return converted;
    }

    // large distance
    public float convertM2K (float base)
    {  // Convert miles to kilometers
        float converted= (float) (base * 1.609);

        return converted;
    }

    public float convertK2M (float base)
    {  // Convert kilometers to miles
        float converted= (float) (base * 0.6214);

        return converted;
    }

    // volume
    public float convertG2L (float base)
    {  // Convert gallons to liters
        float converted= (float) (base * 3.785);

        return converted;
    }

    public float convertL2G (float base)
    {  // Convert liters to gallons
        float converted= (float) (base / 3.785);

        return converted;
    }

    // small weight
    public float convertOz2G (float base)
    {  // Convert ounces to grams
        float converted= (float) (base * 28.35);

        return converted;
    }

    public float convertG2Oz (float base)
    {  // Convert grams to ounces
        float converted= (float) (base / 28.35);

        return converted;
    }

    // medium weight
    public float convertLb2K (float base)
    {  // Convert pounds to kilograms
        float converted= (float) (base * 0.4536);

        return converted;
    }

    public float convertK2Lb (float base)
    {  // Convert kilograms to pounds
        float converted= (float) (base * 2.205);

        return converted;
    }

    public float convertMpg2Kpl(float base) {
        // convert miles per gallon to kilometer per liter
        return (float) (base / 2.352);
    }

    public float convertKpl2Mpg(float base) {
        // convert kilmoeter per liter to miles per gallon
        return (float) (base * 2.352);
    }

    public float convertK2C(float base) {
        // convert kelvin to celsius
        return (float) (base - 273.15);
    }

    public float convertC2K(float base) {
        // convert celsius to kelvin
        return (float) (base + 273.15);
    }


    public static void main (String[] args) {
        ConverterMethods instance= new ConverterMethods();
        System.out.println(instance.convertK2Lb(0));
    }

}

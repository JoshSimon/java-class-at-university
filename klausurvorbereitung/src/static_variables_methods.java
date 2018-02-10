/**
 * static variables and static methods
 *
 * use case static variables:
 *      - the variable is independent of the state of an instance of its class
 *      - class-wid global variable
 *      - apply ' public final' and it becomes a class-wide
 *       global constant (immutable = state cannot be changed)
 *      - f.e. a constant that is needed for further calculations many times (mass of an electron)
 *
 *
 * use case static methods:
 *      - utility task which is independent of the state of an instance its class
 *      - f.e. turning degrees celsius into Fahrenheit
 */




public class static_variables_methods {

    private int someInformationForTheConstructor;

    public static_variables_methods(int something){
        this.someInformationForTheConstructor = this.bisect(something);
        System.out.println("I've got something from the constructor! " + this.someInformationForTheConstructor);
    }

    /**
     * the massOfElectron can be accessed by 'static_variables_methods.massOfElectron'
     * !! no instantiation of the class is needed!!
     *
     * global variable within that class --> public
     * as a singleton* --> static, *singleton = variable exists once and can be accessed
     * as a constant --> final
     */
    public final static double MASS_OF_ELECTRON = 9.10938356 * java.lang.Math.pow(10,-31);
    // style guide: constants are written in capital letters

    /**
     * method can be accessed by 'static_variables_methods.fahrenheitInCelsius(...)'
     * !! no instantiation of the class is needed!!
     *
     * @param temperatureInFahrenheit temperature in Fahrenheit
     * @return the temperature in degrees Celsius
     */
    public final static double fahrenheitInCelsius(float temperatureInFahrenheit){
        return (temperatureInFahrenheit -32)/1.8;
    }
    // style guide: always use double if in doubt, only use float if you are 100% sure
    // you need less than "7 numbers" accuracy --> 0,1234567


    /**
     * What's the use of a STATIC PRIVATE method?
     * You want to declutter the constructor by using a method
     * which is independent of the state of its instance class
     * (of course, it is happening in the constructor, there is no class yet)
     * and
     * it shouldn't be used outside of the class.
     *
     * @param something integer something
     * @return half of something
     */
    private static int bisect(int something){
        return something/2;
    }
}

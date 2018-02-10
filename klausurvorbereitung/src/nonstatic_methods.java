/**
 * nonstatic variables and nonstatic methods
 *
 * difference between static & nonstatic:
 *
 *           | static                 | nonstatic
 * __________|________________________|____________________________________________
 *           |                        |
 * variables | one global copy        | a new one with each instance of the class
 * __________|________________________|____________________________________________
 *           |                        |
 *  methods  | independent of state   | dependent on the state of its class
 *           |                        |
 */


public class nonstatic_methods {

    public int integer;
    public static int staticInteger;
    // style guide: this is not a constant, there will only one copy exist which can
    // be assigned to new values
    public final static int finalInteger = 42;


    public nonstatic_methods(int integer) {
        this.integer = integer;
    }

    // nonstatic method, needs the instance variable 'this.integer'
    public void iNeedAnInstanceOfMyClass(){
        System.out.println("That's your dependent integer "+ this.integer);
    }

    // static method, value as an argument
    public static void printStaticInteger(int integer){
       System.out.println("That's your integer as an argument from a static method "+ integer);
    }

    // static final method, difference between public static and public FINAL static value
    public static final void printFinalInteger(){
        System.out.println("That's a static integer "+ nonstatic_methods.staticInteger);
        nonstatic_methods.staticInteger++;
        System.out.println("That's the same static integer but I added one"+ nonstatic_methods.staticInteger);
        System.out.println("That's a final static integer "+ nonstatic_methods.finalInteger);
    }

}

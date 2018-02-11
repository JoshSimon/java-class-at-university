/**
 *
 * interfaces are literal interfaces
 * they ensure that certain class have certain functionality
 * without implementing that functionality
 *
 * interfaces only provide method signature plus the return value
 * method signature = method name + parameters (type, amount, order)
 *
 * and they can provide static variables which are accessible at compile
 * time (similar to static variables from classes)
 *
 * the concrete implementation has to be done in the class which implements
 * the interface
 *
 * interfaces can inherit from as many other interfaces as needed,
 * NO sub & super relationship exists like with sub- & superclass
 *
 * classes can implement as many interfaces as needed at once
 */
public class interfaces {

    public interface basicInterface {
        // the method actually does not rely on a class instance
        // --> is there a way to tell that in the interface?
        // yes you can define static methods in an interface
        public static int getCurrentTime(){
            return 1505;
        };


        public double otherMethodNobodyCaresAbout(String one, double two);
        public static final double MASS_OF_ELECTRON = 9.10938356 * java.lang.Math.pow(10,-31);

    }

    public interface advancedInterface extends basicInterface {
        public void howMuchTimeDidPass(int timestamp);
    }


    // instantiating objects of a certain interface
    protected interface someOtherInterfaceForReal{
        // style guide: you do not need to write public for an interface, because
        // interfaces only define public methods and static variables
        /* final */ static void log(String str){ // ! final doesn't work because an interface
        // should be created so a class can implement it
        // final allows NO IMPLEMENTATION and NO OVERRIDE

            System.out.println(str);
        }
    }
}

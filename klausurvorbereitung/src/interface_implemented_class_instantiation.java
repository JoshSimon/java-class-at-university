public class interface_implemented_class_instantiation {
    public static void main(String[] args) {
        interfaces.basicInterface a = new interface_implementation("test", 3.3);
        // calling a static method from the interface itself works
        interface_implementation.getCurrentTime();
        // a.getCurrentTime() ! does not work, static methods from interfaces which are implemented in a class cannot
        // be called on that class or be inherited to subclasses
        double ret = a.otherMethodNobodyCaresAbout("testTwo",4.3 );
        System.out.println("some double "+ret); // 7.6 the mass of the electron is lost, because it is too small!
        interfaces.advancedInterface b =  new interface_implementation("whatever", 42);
        b.howMuchTimeDidPass(((interface_implementation) b).getTheTime()); // casting to type is necessary, because the interface which
        // which b is a type of, does not implement the 'getTheTime' method. The class itself does and therefore the object
        // which instantiated that class is still treated as type 'advancedInterface' and needs to be casted to the type of its class.
    }
}

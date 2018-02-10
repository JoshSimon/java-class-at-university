/**
 * access modifiers enable the developer to restrict the access to
 * variables and methods
 *
 * the following table outlines the scope of restriction (also known as visibility):
 *
 *           | class | package | inheritance possible?            | subclass access | project
 * __________|_______|_________|__________________________________|_________________|__________
 *           |       |         |                                  |                 |
 * private   | yes   | no      | cannot be inherited              | not visible     | no
 * __________|_______|_________|__________________________________|_________________|__________
 *           |       |         |                                  |                 |
 * default*  | yes   | yes     | cannot be inherited              | not visible     | no
 * __________|_______|_________|__________________________________|_________________|__________
 *           |       |         |                                  |                 |
 * protected | yes   | yes     | inheritance all over the project | yes             | no
 * __________|_______|_________|__________________________________|_________________|__________
 *           |       |         |                                  |                 |
 * public    | yes   | yes     | inheritance all over the project | yes             | yes
 * __________|_______|_________|__________________________________|_________________|__________
 *
 * *is used if no access modifier is present only in classes !not in interfaces
 *
 *
 * use case of protected:
 * you want to inherit a method that should remain visible only within the parent class and
 * within the children classes
 *
 *
 * PRINCIPLE OF LEAST PRIVILEGE:
 * "every class must be able to access only the information and resources that are necessary
 *  for its legitimate purpose"
 */

public class access_modifiers {

    private int privateInteger; // can be only used within the class
    public String publicString;

    // overloaded constructors, both arguments are optional (also in argument sequence)

    public access_modifiers(String str){
        this.publicString = str;
        this.privateInteger = 0;
    }

    public access_modifiers(int number){
        this.privateInteger = number;
        this.publicString = "zero";
    }

    public access_modifiers(int number, String str){
        this.privateInteger = number;
        this.publicString = str;
    }

    public access_modifiers(String str, int number){
        this.privateInteger = number;
        this.publicString = str;
    }

    public access_modifiers(){
        this.privateInteger = 0;
        this.publicString = "zero";
    }


    public static final void printPublicString(){
        access_modifiers a = new access_modifiers();
        System.out.println("If no string argument provided the publicString is instantiated with "+ a.publicString);
        access_modifiers b = new access_modifiers("customString");
        System.out.println("If there is an argument, the publicString is assigned its value " + b.publicString);

    }

    public final void printPrivateInteger(){
        System.out.println(this.privateInteger); // this ! --> cannot be static, can be printed
        // but not accessed from outside of the class
    }

    int defaultInteger=3; // primitive data types are IMMUTABLE!
    // if you access a primitive data type of another instanciated object
    // you actually deal with a copy

    static_variables_methods a = new static_variables_methods(3);

    public static_variables_methods getSomeInstantiatedObject(){
        static_variables_methods aa =  a;
        return aa;
        // return a;  bad practice! --> the actual reference to the object a is handed over
        // possible consequence, the once DEFAULT object a of class access_modifiers can
        // be modified outside of the package, because the getter method is public

    }

    protected static final Integer protectedInteger = 42; // mutable object!

    protected static final void someLoggin(){
        System.out.println("Only my children will read this");
    }


}

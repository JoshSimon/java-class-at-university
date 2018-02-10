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

public class access_to_varibles_from_class {

    private int privateInteger; // can be only used within the class
    public String publicString;

    // overloaded constructors, both arguments are optional (also in argument sequence)

    public  access_to_varibles_from_class(String str){
        this.publicString = str;
        this.privateInteger = 0;
    }

    public access_to_varibles_from_class(int number){
        this.privateInteger = number;
        this.publicString = "zero";
    }

    public access_to_varibles_from_class(int number, String str){
        this.privateInteger = number;
        this.publicString = str;
    }

    public access_to_varibles_from_class(String str, int number){
        this.privateInteger = number;
        this.publicString = str;
    }

    public access_to_varibles_from_class(){
        this.privateInteger = 0;
        this.publicString = "zero";
    }


    public static final void printPublicString(){
        access_to_varibles_from_class a = new access_to_varibles_from_class();
        System.out.println("If no string argument provided the publicString is instantiated with "+ a.publicString);
        access_to_varibles_from_class b = new access_to_varibles_from_class("customString");
        System.out.println("If there is an argument, the publicString is assigned its value " + b.publicString);

    }

    int defaultInteger;

    

    protected int protectedInteger


}

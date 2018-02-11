import java.util.Date;



public class interface_implementation implements interfaces.advancedInterface, interfaces.someOtherInterfaceForReal
// , interface_implementation.someOtherInterface ! does not work --> cyclic implementation,
// implementing an interface which is relying on its own class instance
{

    String str; double doub;

    protected interface someOtherInterface {

    }

    public interface_implementation(String a, double b) {
        this.str = a;
        this.doub = b;
    }
        // actual implementation by override
        // style guide: always indicate if you are implementing an
        // existing method signature, therefor if the method is removed from
        // the interface you may notice it due to a compile error
        // or if there is a static implementation in the interface and you
        // actually override it
        @Override
        public static int getCurrentTime(){
        // return this.getTheTime() ! not possible, because you would access the method by a class instance
           return interface_implementation.getTheTime();
        }

        // actual implementation
        public void howMuchTimeDidPass(int timestamp){
            this.getTheTime(); // method of a class instance!
            if(timestamp > 2459){

            }
        }

        // actual implementation, this time it relies on an instance of the class
        public double otherMethodNobodyCaresAbout(String one, double two){
        System.out.println("Provided " +one);
        return this.doub + two + interface_implementation.MASS_OF_ELECTRON; // accessing a static value from the interface
        }

        // get the time like HHMM, f.e. 03:06pm --> 1506
        protected final static int getTheTime(){
            Date time = new Date();
            long hours = (time.getTime() / 1000 / 60 / 60) % 24;
            long minutes = (time.getTime() / 1000 / 60) % 60;
            String concatenate = ""+hours+minutes; // use of the '+' concatenate implementation of the String class
            Integer hoursMinutes = new Integer(concatenate);
            return hoursMinutes;
        }



}

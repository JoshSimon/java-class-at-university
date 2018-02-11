public class overwrite_unstatic_methods extends nonstatic_methods {

    private int additionalInteger;

    public overwrite_unstatic_methods(int additionalInteger){
        super(3);
        this.additionalInteger = additionalInteger;
    };

    /**
     * that is not possible, static methods cannot be overridden
     */
//    @Override public static void printStaticInteger(int integer) {
//        System.out.println("That's your dynamic integer added " + integer);
//    };

     public void printInteger(){
        System.out.println("That's your dynamic integer but overridden "+ super.integer);
    };

}

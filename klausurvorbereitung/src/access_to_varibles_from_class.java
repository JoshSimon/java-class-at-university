public class access_to_varibles_from_class {
    private int privateInteger;
    default int defaultInteger
    protected int protectedInteger
    public String string;

    public  access_to_varibles_from_class(String string){
        this.string = string;
    };

    public access_to_varibles_from_class(int integer){
        this.privateInteger = integer;
    };
}

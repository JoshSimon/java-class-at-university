public class interfaces {

    public interface basicInterface {
        public void getCurrentTime();
        public void otherMethodNobodyCaresAbout(String one, double two);
    }

    public interface advancedInterface extends basicInterface {
        public void howMuchTimeDidPass(int timestamp);
    }

}

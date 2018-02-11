import org.junit.Assert;
import org.junit.Test;

public class unit_testing {

    @Test
    public void testInterfaceImplementation(){
        interface_implementation a = new interface_implementation("s",2.2222);
        Assert.assertTrue(a instanceof interfaces.advancedInterface);
    }
}


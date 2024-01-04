package demo.helloworld;

import demo.helloworld.HelloWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    public void testHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();
        assertEquals("Hello World !", result, "les deux messages doivent être identiques");
        assertNotEquals("qqch", result);
        assertSame("Hello World !", result);
    }
}
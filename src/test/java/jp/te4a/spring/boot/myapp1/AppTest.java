package jp.te4a.spring.boot.myapp1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void printHello()
    {
        var expected = "Hello, Spring Boot!";

        var helloController = new HelloController();
        var actual = helloController.index();

        assertEquals(expected, actual);
    }
}

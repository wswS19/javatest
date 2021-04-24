package com.imooc.maven01.model;
import org.junit.*;
import org.junit.Assert.*;
public class helloworldtest {
    @Test
    Assert.assertEquals("hello",new HelloWorld().sayHello());
}

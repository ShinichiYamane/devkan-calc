package services;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator sut = new Calculator();
        String actual = sut.add(1, 1);
        assertThat(actual, is("2"));
    }
    @Test
    public void testAdd2() {
    	Calculator sut = new Calculator();
    	String actual = sut.add(1, 3);
    	assertThat(actual,is("4"));
    }
    @Test
    public void testAdd3() {
    	Calculator sut = new Calculator();
    	String actual = sut.add(2, -3);
    	assertThat(actual,is("-1"));
    }
    @Test
    public void testSub() {
    	Calculator sut = new Calculator();
    	String actual = sut.subtract(3, 1);
    	assertThat(actual,is("2"));
    }
    @Test
    public void testMul() {
    	Calculator sut = new Calculator();
    	String actual = sut.multiply(1, 3);
    	assertThat(actual,is("3"));
    }
}

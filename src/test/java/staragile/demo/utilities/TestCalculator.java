package staragile.demo.utilities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.staragile.demo.utilities.LoggerStackTraceUtil;

public class TestCalculator {
	

    private static final Logger LOG = LoggerFactory.getLogger(TestCalculator.class);
    @Test
    public void testSum() {
          int num1=10;
          int num2=20;
          int sum=num1+num2;
          assertEquals("sum is:", 30, sum);
          
            
    }
    
    @Test
    public void testSubstract() {
          int num1=20;
          int num2=10;
          int difference=num1-num2;
          assertEquals("difference is :", 10, difference);
          
            
    }
    
    @Test
    public void testMultiply() {
          int num1=20;
          int num2=30;
          int multiply=num1*num2;
          assertEquals("multiply is :", 600, multiply);
            
    }
    
    @Test
    public void testDivide() {
    	int num1 = 100;
    	int num2 = 5;
    	int divide = num1/num2;
    	assertEquals("division is :",20,divide);
    }


}

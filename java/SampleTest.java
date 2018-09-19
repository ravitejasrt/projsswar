import static org.junit.Assert.*;

import org.junit.Test;


public class SampleTest {

	public static void main(String[] args) {
		System.out.println("Test cases");

	}
	
    @Test	
	public void simpletestPass(){
		int a=1;
		int b=1;
		assertTrue(a==b);
		
	}

    @Test	
	public void simpletestFail(){
		int a=2;
		int b=2;
		assertTrue(a==b);
	}
    
}

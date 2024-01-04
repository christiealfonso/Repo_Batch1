import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class add_mult_divTest {

	@Test
	void add_test() {
    add_mult_div a1=new add_mult_div();
    int expected=4;
    int actual=a1.add(2, 2);
    assertEquals(expected,actual);
    
	}
	
	@Test
	void mult_test() {
	    add_mult_div m1=new add_mult_div();
	    int expected=8;
	    int actual=m1.mult(2,2,2);
	    assertEquals(expected,actual);
}

	@Test
	void div_test() {
	    add_mult_div m1=new add_mult_div();
	    int expected=2;
	    int actual=m1.div(10,5);
	    assertEquals(expected,actual);
}
}
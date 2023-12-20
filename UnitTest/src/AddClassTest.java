import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddClassTest {
	@Test
	void testAdd() {
		AddClass objAdd = new AddClass();
		int expected =64;
		int actual=objAdd.add(4,4,4);
		assertEquals(expected, actual);
		
}
	@Test
	void testdiv() {
		AddClass objAdd = new AddClass();
		int expected =2;
		int actual=objAdd.div(8,4);
		assertEquals(expected, actual);
}
}

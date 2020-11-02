import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SuperStackTest {

		@Test
		void test() {
			fail("Not yet implemented");
		}

		@Test
		void testSuperStack() {

		}

		@Test
		void testIsEmpty() {
			// create and empty stack and check if it's empty
			SuperStack<Integer> stack = new SuperStack<>(1);
			boolean result = stack.isEmpty();
			assertTrue(result);

			result = stack.push(new Integer(0));
			result = stack.isEmpty();
			assertFalse(result);
			// add a few elements and check it is empty
		}

		@Test
		void testisFull() {
			fail("Not yet implemented");
		}

	}


}

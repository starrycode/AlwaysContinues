
public class Driver {

	public static void main(String[] args) {
		System.out.println("Github!!");
		SuperStack<String> stack = new SuperStack<>(10);
		stack.push("aha");
		System.out.println(stack.peek());

	}

}

package general;

import table.Message;

public class Program {
	public static void main(String[] args) {
		Factory factory =Factory.getFactory();
		
		Message message = new Message();
		message.setContent("test");
		factory.getMessageUser().add(message);

	}
}

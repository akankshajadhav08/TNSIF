package day8TNSIFFunctionalInterface;

public class GreetClass {
	
	public class GreetClass implements Greet {

		@Override
		public void greetings() {
			System.out.println("Greet Method");
			
		}

	}

}

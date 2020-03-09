package com.epam.Behavioral;

public class App {

	public static void main(String[] args) {
		System.out.println("Observer");
		Subject subject = new Subject();
	      new OctalObserver(subject);
	      new BinaryObserver(subject);
	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	      System.out.println("Iterator");
	      NameRepository namesRepository = new NameRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	}
	
}

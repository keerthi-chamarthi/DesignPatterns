public class Main {
	public static void main(String[] args) {
		System.out.println("Facade");
	      ShapeMaker shapeMaker = new ShapeMaker();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();
		System.out.print("Decorator");
	      Shape redSquare = new RedShapeDecorator(new Square());

	      Shape redRectangle = new RedShapeDecorator(new Rectangle());

	      System.out.println("\nSquare of red border");
	      redSquare.draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	   }
}

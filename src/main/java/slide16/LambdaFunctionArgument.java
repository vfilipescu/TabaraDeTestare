package slide16;

/** Exemplu de lambda function in Java 8 https://www.baeldung.com/java-8-streams */
public class LambdaFunctionArgument {
  interface Circle {
    double get(double radius);
  }

  public double circleOperation(double radius, Circle c) {
    return c.get(radius);
  }

  public static void main(String[] args) {
    LambdaFunctionArgument reference = new LambdaFunctionArgument();
    Circle circleArea = r -> Math.PI * r * r;
    Circle circleCircumference = r -> 2 * Math.PI * r;

    double area = reference.circleOperation(10, circleArea);
    double circumference = reference.circleOperation(10, circleCircumference);

    System.out.println("Area: " + area + " . Circumference: " + circumference);
  }
}

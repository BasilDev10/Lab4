import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        do {
            System.out.println("type calculation you want : ");
            System.out.println("1. Circle\n2. Rectangle\n3. Triangle\n4. Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Radius:");
                    double radius = input.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("The area of the circle is " + String.format("%.2f",circle.calculateArea()));
                    System.out.println("The circumference of the circle is " + String.format("%.2f",circle.calculateCircumference()));
                    break;
                case 2:
                    System.out.println("Enter Height:");
                    double height = input.nextDouble();
                    System.out.println("Enter Base:");
                    double base = input.nextDouble();
                    Rectangle rectangle = new Rectangle(height, base);
                    System.out.println("The area of the rectangle is " + String.format("%.2f",rectangle.calculateArea()));
                    System.out.println("The circumference of the rectangle is " + String.format("%.2f",rectangle.calculateCircumference()));
                    break;
                case 3:
                    System.out.println("Enter Height:");
                    double height1 = input.nextDouble();
                    System.out.println("Enter Base:");
                    double base1 = input.nextDouble();
                    Triangle triangle = new Triangle(height1, base1);
                    System.out.println("The area of the triangle is " + String.format("%.2f",triangle.calculateArea()));
                    System.out.println("The circumference of the triangle is " +  String.format("%.2f", triangle.calculateCircumference()));
                    break;
                    case 4:
                    System.out.println("Exiting...");
                    break;

            }
            if (choice == 4) {
                break;
            }
        }while (true);



    }
}
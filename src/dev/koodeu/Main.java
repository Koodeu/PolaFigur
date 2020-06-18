package dev.koodeu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj jakiej figury pole lub obwód chcesz obliczyć: prostokat, kwadrat czy koło?");
        String figura = scanner.nextLine();


        switch (figura) {
            case "koło":
                Circle circle1 = new Circle(12);

                System.out.println("Podaj czy chcesz obliczyć pole czy obwód");
                String dzialanie = scanner.nextLine();

                switch (dzialanie) {

                    case "pole":
                       System.out.println("Podaj promień okręgu.");
                        double radius = scanner.nextDouble();
                        circle1.setRadius(radius);
                        double circleField = circle1.fieldOfCircle(circle1.radius);
                        System.out.printf("Pole koła to: %.2f ", circleField);
                        break;
                    case "obwód":
                        System.out.println("Podaj promień okręgu.");
                        double radius2 = scanner.nextDouble();
                        circle1.setRadius(radius2);
                        double circlePerimeter = circle1.perimeterOfCircle(circle1.radius);
                        System.out.printf("Obwód koła to: %.2f", circlePerimeter);
                        break;

                        default:
                        System.out.println("Nie znam takiego działania");
                }
                break;

            case "kwadrat":
                Square square1 = new Square(5);
                System.out.println("Podaj czy chcesz obliczyć pole czy obwód");
                String dzialanie4kwadrat = scanner.nextLine();

                switch (dzialanie4kwadrat) {
                    case "pole":
                        System.out.println("Podaj długość boku kwadratu.");
                        double side = scanner.nextDouble();
                        square1.setSide(side);
                        double squareField = square1.fieldOfSquare(square1.side);
                        System.out.printf("Pole kwadratu to: %.2f", squareField);
                        break;
                    case "obwód":
                        System.out.println("Podaj długość boku kwadratu.");
                        double side2 = scanner.nextDouble();
                        square1.setSide(side2);
                        double squarePerimeter = square1.perimeterOfSquare(square1.side);
                        System.out.printf("Obwód kwadratu to: %.2f", squarePerimeter);
                        break;
                    default:
                        System.out.printf("Nie znam takiego działania");
                        break;

                }
                break;

            case "prostokąt":
                Rectangle rectangle1 = new Rectangle(5, 2);

                System.out.println("Podaj czy chcesz obliczyć pole czy obwód");
                String dzialanie4prostokat = scanner.nextLine();
                switch (dzialanie4prostokat) {
                    case "pole":
                        System.out.println("Podaj długość pierwszego boku.");
                        double sideA = scanner.nextDouble();
                        rectangle1.setSideA(sideA);
                        System.out.println("Podaj długość drugiego boku.");
                        double sideB = scanner.nextDouble();
                        rectangle1.setSideB(sideB);

                        double rectangleField = rectangle1.fieldOfRectangle(rectangle1.sideA, rectangle1.sideB);
                        System.out.printf("Pole prostokąta wynosi: %.2f", rectangleField);
                        break;

                    case "obwód":
                        System.out.println("Podaj długość pierwszego boku.");
                        double sideA2 = scanner.nextDouble();
                        rectangle1.setSideA(sideA2);
                        System.out.println("Podaj długość drugiego boku.");
                        double sideB2 = scanner.nextDouble();
                        rectangle1.setSideB(sideB2);

                        double rectanglePerimeter = rectangle1.perimeterOfRectanle(rectangle1.sideA, rectangle1.sideB);
                        System.out.printf("Obwód prostokąta wynosi: %.2f", rectanglePerimeter);
                        break;

                    default:
                        System.out.printf("Nie znam takiego działania");
                        break;
                }
                break;

                default:
                System.out.printf("Nie znam takiej figury!");
        }
    }

}


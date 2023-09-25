import java.util.Scanner; //use this import function for getting input

class input {
    public static void main(String[] args) {
        //int a, b, sum;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int a = input.nextInt();

        System.out.println("Enter b value: ");
        int b = input.nextInt();

        int sum = a + b;

        System.out.println("The sum is = " + sum);

    }
}

// biggest number among trhee numbers
class BiggestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int biggestNumber = findBiggestNumber(num1, num2, num3);

        System.out.println("The biggest number is: " + biggestNumber);

        scanner.close();
    }

    public static int findBiggestNumber(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}

// Area of triangle
class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = calculateTriangleArea(base, height);

        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}

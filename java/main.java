/* import java.util.Scanner; //use this import function for getting input

class input {
    public static void main(String[] args) {
        int a, b, sum;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value: ");
        a = input.nextInt();

        System.out.println("Enter b value: ");
        b = input.nextInt();

        sum = a + b;

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
 */

/* import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        double a, b, c, d, x1, x2, x;

        System.out.println("Enter a value");
        a = ob.nextDouble();

        System.out.println("Enter b value");
        b = ob.nextDouble();

        System.out.println("Enter c value");
        c = ob.nextDouble();

        d = (b * b) - (4 * a * c);

        if (d == 0) {
            x = (-b) / (2 * a);
            System.out.println("The x value is=" + x);
        } else if (d > 0) {
            x1 = ((-b) + Math.pow(d, 0.5)) / (2 * a);
            System.out.println("The x1 value is=" + x1);
            x2 = ((-b) - Math.pow(d, 0.5)) / (2 * a);
            System.out.println("The x1 value is=" + x2);
        } else
            System.out.println("The equetion is imaginary");

    }
}

// 1-10 sumation program
class looping {
    public static void main(String[] args) {
        int i, sum;
        sum = 0;
        for (i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Ans is" + sum);
    }
} */

class moulik {
    public static void main(String[] args) {
        int i, j;
        for (i = 2; i <= 100; i++) {

            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(" " + i);
            }

        }

    }
}

class primgs {
    public static void main(String args[]) {
        int i, j;
        System.out.println("Series of Prime number upto 25 is:\n");
        for (i = 2; i <= 25; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j)
                System.out.println(" " + i + " ");
        }
    }
}







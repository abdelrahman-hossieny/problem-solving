//=================================================
// problem: Say Hello
//=================================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello, " + name);
    }
}
//=================================================
// problem: Basic Data Types
//=================================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        long l = scanner.nextLong();
        char c = scanner.next().charAt(0);
        float f = scanner.nextFloat();
        double d = scanner.nextDouble();
        
        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.printf("%.2f%n", f);
        System.out.printf("%.6f%n", d); 
    }
}
//=================================================
// problem: Simple Calculator
//=================================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2)); 
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
    }
}
//=================================================
// problem: Difference
//=================================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int n4 = s.nextInt();
        System.out.println("Difference = " + ((n1*n2)-(n3*n4)));
    }
}
//=================================================
// problem:  Area of a Circle
//=================================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        double area = Math.PI * r * r;
        System.out.printf("%.9f%n",area);
    }
}
//=================================================
// problem:  Digits  or alpha(cap - small)
//=================================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char X = s.next().charAt(0);

        if (X >= '0' && X <= '9') {
            System.out.println("IS DIGIT");
        } else {
            System.out.println("ALPHA");
            if (X >= 'A' && X <= 'Z') {
                System.out.println("IS CAPITAL");
            } else {
                System.out.println("IS SMALL");
            }
        }
    }
}
//=================================================
// problem:  Char
//=================================================

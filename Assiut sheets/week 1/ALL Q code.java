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
// problem:  Calculator
//=================================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String operator = input.replaceAll("[0-9]", "");
        
        String[] parts = input.split("[+\\-*/]");

        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);

        int result = switch (operator) {
            case "+" -> A + B;
            case "-" -> A - B;
            case "*" -> A * B;
            case "/" -> A / B;
            default -> 0;
        };
        System.out.println(result);
    }
}

//=================================================
// problem:  First digit !
//=================================================
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        int fnum = Integer.parseInt(String.valueOf(input.charAt(0)));                                                //  ❌look here❌
        System.out.println("First number: " + fnum); 
    }
}

//=================================================
// problem:  Coordinates of a Point
//=================================================
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x > 0 && y > 0) 
            System.out.println("Q1");
        else if (x < 0 && y > 0) 
            System.out.println("Q2");
        else if (x < 0 && y < 0) 
            System.out.println("Q3");
        else if (x > 0 && y < 0) 
            System.out.println("Q4");
        else if (y == 0 && x != 0) 
            System.out.println("Eixo X");
        else if (x == 0 && y != 0) 
            System.out.println("Eixo Y");
        else 
            System.out.println("Origem");
    }
}

//=================================================
// problem:  Age in Days
//=================================================
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int years = N / 365;
        int remainingDays = N % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");
    }
}
//=================================================
// problem:  Interval
//=================================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        sc.close();

        if (X >= 0 && X <= 25) {
            System.out.println("Interval [0,25]");
        } else if (X > 25 && X <= 50) {
            System.out.println("Interval (25,50]");
        } else if (X > 50 && X <= 75) {
            System.out.println("Interval (50,75]");
        } else if (X > 75 && X <= 100) {
            System.out.println("Interval (75,100]");
        } else {
            System.out.println("Out of Intervals");
        }
    }
}
//=================================================
// problem:  Interval
//=================================================

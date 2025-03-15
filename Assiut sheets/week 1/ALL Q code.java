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
// another solution

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char X = s.next().charAt(0);
        s.close();

        if (Character.isDigit(X)) {
            System.out.println("IS DIGIT");
        } else {
            System.out.println("ALPHA");
            if (Character.isLowerCase(X)) {
                System.out.println("IS SMALL");
            } else {
                System.out.println("IS CAPITAL");
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
// problem:  Sort Numbers
//=================================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);

        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
//=================================================
// problem:  Float or int
//=================================================
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();

        int intPart = (int) N;  
        double decimalPart = N - intPart; 

        if (decimalPart == 0) {
            System.out.println("int " + intPart);
        } else {
            System.out.printf("float %d %.3f%n", intPart, decimalPart);
        }
    }
}
//=================================================
// problem: Comparison
//=================================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        int b = sc.nextInt();

        if ((s.equals(">") && a > b) || (s.equals("<") && a < b) || (s.equals("==") && a == b)) {
            System.out.println("Right");
        } else {
            System.out.println("Wrong");
        }
    }
}
//another solution
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String S = sc.next();
        int B = sc.nextInt();

        boolean isCorrect = (S.equals("<") && A < B) || (S.equals(">") && A > B) || (S.equals("=") && A == B);

        System.out.println(isCorrect ? "Right" : "Wrong");
    }
}
//=================================================
// problem: The last 2 digits                                                                    //  ❌look here❌
//=================================================
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int l1 = sc.nextInt();
       int r1 = sc.nextInt();
       int l2 = sc.nextInt();
       int r2 = sc.nextInt();

       int product = l1 * r1 * l2 * r2;
       int lastTwoDigits = Math.abs(product % 100);

       System.out.println(lastTwoDigits);
   }
}
//correct solution⬇️⬇️

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        sc.close();

        // Keep only the last two digits at each step
        long result = (A % 100) * (B % 100) % 100;
        result = (result * (C % 100)) % 100;
        result = (result * (D % 100)) % 100;

        System.out.printf("%02d%n", result);
    }
}
//=================================================
// problem: Hard Compare
//=================================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        if (Math.pow(A,B) > Math.pow(C,D)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
//correct solution⬇️⬇️

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        sc.close();

        // Use logarithms to compare
        double left = B * Math.log(A);
        double right = D * Math.log(C);

        if (left > right) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


// ===========================================
// problem:  Winter Sale
// ===========================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double pafter = sc.nextDouble();

        double pbefore = (pafter) /(1-(x/100));
        System.out.printf("%.2f%n", pbefore);
    }
}
// ===========================================
// problem:  Memo and Momo
// ===========================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        if(a % k == 0 && b % k == 0){
            System.out.println("Both");
        }else if(a % k == 0){
            System.out.println("Memo");
        }else if(b % k ==0){
            System.out.println("Momo");
        }else {
            System.out.println("No One");
        }
    }
}
// ===========================================
// problem:  Next Alphabet
// ===========================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int ascii = (int) a;
        int next=0;
        if(ascii == 122){
            next= 97;
            System.out.println((char) next);
        }else {
            next= a+1;
            System.out.println((char) next);
        }

    }
}
// ===========================================
// problem:  Ali Baba and Puzzles
// ==========================================

// ===========================================
// problem:  Interval Sweep
// ==========================================

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Odd numbers count
        int b = sc.nextInt(); // Even numbers count

        if (a == 0 ||b == 0) {
            System.out.println("NO");
        } else if (Math.abs(a-b)==1 ||Math.abs(a-b)==0 ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
// ===========================================
// problem:  F. Adding Bits
// ==========================================
// IFF you need to know about adding 2 nums 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;
        int carry;
        while (b!=0){
            sum = a ^ b;
            carry = (a & b) << 1;
            a=sum;
            b=carry;
       }
        System.out.println(a);
    }
}
// True solution
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A ^ B);  // Bitwise XOR to simulate Parker's mistake
    }
}
// ===========================================
// problem:  G. Katryoshka
// ==========================================
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long e = sc.nextLong(); // Number of eyes
        long m = sc.nextLong(); // Number of mouths
        long b = sc.nextLong(); // Number of bodies

        long res = 0;

        // Find the minimum among (e, m, b)
        long mn = Math.min(e, Math.min(m, b));

        res += mn;
        e -= mn;
        m -= mn;
        b -= mn;

        // Find the minimum among (e/2, b)
        mn = Math.min(e / 2, b);
        res += mn;

        System.out.println(res);

        sc.close();
    }
}


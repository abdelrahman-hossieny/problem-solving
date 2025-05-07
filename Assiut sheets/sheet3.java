//--------------------------------------------------
// problem: palendrom
//--------------------------------------------------
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isPalindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

//--------------------------------------------------
// problem: I. Smallest Pair
//--------------------------------------------------
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // عدد الحالات
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    int sum = A[i] + A[j] + (j - i);
                    if (sum < min) {
                        min = sum;
                    }
                }
            }

            System.out.println(min);
        }
    }
}
//--------------------------------------------------
// problem: L. Max Subarray                ❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌
//--------------------------------------------------
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            List<Integer> maxValues = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int max = arr[i];
                for (int j = i; j < n; j++) {
                    max = Math.max(max, arr[j]);
                    maxValues.add(max);
                }
            }
            for (int val : maxValues) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}

//--------------------------------------------------
// problem: N - Check Code
//--------------------------------------------------
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        String s = sc.next();

        // تحقق من الطول أولًا
        if (s.length() != A + B + 1) {
            System.out.println("No");
            return;
        }

        // تحقق أن الحرف في الموضع A هو '-'
        if (s.charAt(A) != '-') {
            System.out.println("No");
            return;
        }

        // تحقق أن باقي الأحرف هي أرقام
        for (int i = 0; i < s.length(); i++) {
            if (i == A) continue; // نتخطى الشرطة

            if (!Character.isDigit(s.charAt(i))) {
                System.out.println("No");
                return;
            }
        }

        // إذا مرّت كل الشروط
        System.out.println("Yes");
    }
}
//--------------------------------------------------
// problem: O - Fibonacci
//--------------------------------------------------
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        long [] fib = new int[N + 1];  // look this must be long not integer

        fib[1] = 0;  
        fib[2] = 1;  

        for (int i = 3; i <= N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println(fib[N]);
    }
}


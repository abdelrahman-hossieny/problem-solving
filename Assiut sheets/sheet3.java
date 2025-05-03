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

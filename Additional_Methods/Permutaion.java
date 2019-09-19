import java.util.Scanner;

class Main
{
    static void printCString(char[] str,int r)
    {
        for (int i = 0; i < r; i++)
        {
            System.out.print(str[i]);
        }
        System.out.print("\n");
    }

    static void swap(char[] arr, int depth, int i) {
        char temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
    // 순서 없이 n 개중에서 r 개를 뽑는 경우
// 사용 예시: permutation(arr, 0, n, 4);
    static void permutation(char[] arr, int depth, int n, int r) {
        if(depth == r) {
            printCString(arr, r);
            return;
        }

        for(int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }


    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++)
        {
            String input = sc.next();
            int N = input.length();
            int K = sc.nextInt();
            char[] str = input.toCharArray();

            System.out.printf("#%d\n", test_case);
            permutation(str, 0, N,K);
        }
        sc.close();
    }
}
//alt shift f10
//psvm tap
//

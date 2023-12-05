import java.util.Scanner;

class Solution {

    static void findMajority(int arr[], int n) {
        int flag = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            // if count is greater than n/3 means the current element is a majority element
        
            if (count > n / 3) {
                System.out.print(arr[i] + " ");
                flag = 1;
            }
        }

        // if flag is 0 means there is no majority element is present
  
        if (flag == 0)
            System.out.println("No Majority Element");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        findMajority(arr, n);

        scanner.close();
    }
}

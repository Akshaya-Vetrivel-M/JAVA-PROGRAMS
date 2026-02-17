import java.util.Scanner;

public class DoLoopExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the stopping number: ");
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
        sc.close();
    }
}

Ouput:
Enter the stopping number: 5
1
2
3
4
5

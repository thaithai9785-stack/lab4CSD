import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BSTree t = new BSTree();
        int[] keys = {5, 3, 10, 20, 14, 7, 2, 40, 6, 8, 100, 200};
        for (int k : keys) t.insert(k);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to run Q1?");
        System.out.println("1. Run f1()");
        System.out.println("2. Run f2()");
        System.out.println("3. Run f3()");
        System.out.println("4. Run f4()");
        System.out.println("5. Run f5()");
        System.out.print("Enter a number : ");

        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(t.f1(10));
                break;
            case 2:
                System.out.println("OUTPUT:");
                System.out.println(t.f2());
                break;
            case 3:
                System.out.println("OUTPUT:");
                System.out.println(t.f3());
                break;
            case 4:
                System.out.println("OUTPUT:");
                System.out.println(t.f4());
                break;
            case 5:
                System.out.println("OUTPUT:");
                System.out.println(t.f5(42));
                break;
            default:
                System.out.println("Invalid input");
        }

        scanner.close();
    }  
}
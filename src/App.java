import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Set <Course> set = new HashSet<>();

        System.out.print("How many students for course A?: ");
        int std = sc.nextInt();

        for (int i = 0; i<std; i++){
            int x = sc.nextInt();
            set.add(new Course(x));
        }

        System.out.print("How many students for course B?: ");
        int std2 = sc.nextInt();

        for (int i = 0; i<std2; i++){
            int x = sc.nextInt();
            set.add(new Course(x));
        }

        System.out.print("How many students for course C?: ");
        int std3 = sc.nextInt();

        for (int i = 0; i<std3; i++){
            int x = sc.nextInt();
            set.add(new Course(x));
        }

        System.out.print("Total students: " + set.size());

        sc.close();
    }
}

public class HW2 {
    public static void main(String[] args) {
        int num = 2;

        System.out.println("Even numbers from 2 to 30 using do while loop..");
        do {
            if (num % 2 == 0){
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 30);
        System.out.println("\n--------------------------");

        System.out.println("even numbers using for loop...");
        for (int i =2; i<=30; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n------------------------------");


        System.out.println("Odd numbers from 2 to 30 using do while loop..");
        int num2 = 2;
        do {
            if (num2 % 2 != 0){
                System.out.print(num2 + " ");
            }
            num2++;
        } while (num2 <= 30);

        System.out.println("\n--------------------------");

        System.out.println("od numbers using for loop...");
        for (int i =2; i<=30; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n------------------------------");


    }
}

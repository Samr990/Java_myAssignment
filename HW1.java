public class HW1 {
    public static void main(String[] args) {

        Compare c = new Compare();
        c.setComparator(5, 4 ,8);
        c.findHighest();
        c.setComparator(3 , 2,1);
        c.findHighest();

        CalculatorI cal = new CalculatorI();
        cal.setCalculator(1000, 5, 3, 5);
        cal.simpleInterest();
        cal.compoundInterest();

        Scale s = new Scale();
        s.setScale("Michael",31000);
        char f1 = s.findScale();
        Scale s2 = new Scale();
        s.setScale("Kamal", 100000);
        char f2 = s.findScale();


    }
}

class Compare{
    private int x;
    private int y;
    private int z;

    void setComparator(int a, int b, int c){
        x =a;
        y= b;
        z= c;
    }

    void findHighest(){
        if (x >= y && x >= z){
            System.out.println("highest value out of " + x + ", " + y + ", " + z + " is : " + x);
        }
        else if(y >= x && y >= z){
            System.out.println("highest value out of " + x + ", " + y + ", " + z + " is : " + y);
        }
        else{
            System.out.println("highest value out of " + x + ", " + y + ", " + z + " is : " + z);
        }
        System.out.println("--------------------");
    }
}

class CalculatorI{
    private int p;
    private int n;
    private double r;
    private int t;

    void setCalculator(int principal, double rate, int time, int num){
        p = principal;
        n=num;
        t=time;
        r= rate / 100;
    }

    void simpleInterest(){

        double si= 0;
        si = (double) p * (1 + r*t);
        System.out.println("Simple Interest: " + si);
        System.out.println("--------------------");

    }

    void compoundInterest(){

        double ci = 0;
//        compoundI= p*(Math.pow((1+r/100),t));
//        System.out.println("total compound interest: " + compoundI);
        ci = p * (Math.pow((1+ (r/n)),n*t));
        System.out.println("Compound Interest: " + ci);
        System.out.println("--------------------");

    }

}

class Scale{
    private String name;
    private double salary;
    private char sScale;

    void setScale(String s, double x){
        name = s;
        salary = x;
    }

    char findScale(){

        if (salary < 0){
            System.out.println("ERROR!! invalid salary for " + name);
            System.out.println("--------------------");
            return 'I';
        }
        else if (salary <= 20000){
            System.out.println(name + "'s salary scale is: " + 'L');
            System.out.println("--------------------");
            return 'L';
        } else if (salary <= 50000) {
            System.out.println(name + "'s salary scale is: " + 'M');
            System.out.println("--------------------");
            return 'M';
        }
        else {
            System.out.println(name + "'s salary scale is: " + 'H');
            System.out.println("--------------------");
            return 'H';
        }

    }
}

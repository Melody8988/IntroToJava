public class PowerTable {
    public static void main(String[] args) {
        int base, i, power;

        base = Integer.valueOf(args[0]);

        System.out.println("Power is:" + base);
        System.out.println(" base     n           b^n");

        if (base <= 0) {
            System.out.println("Error: Please enter a number greater than 0");
            return;
        }

        for (i=1; i<=10; i++){

        power = (int)Math.pow(base,i);

        System.out.printf("%5d %5d %13d\n", base, i, power);

    }
        
    
    }
}
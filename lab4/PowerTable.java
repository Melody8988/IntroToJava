public class PowerTable {
    public static void main(String[] args) {
        int base, i, power;

        base = Integer.valueOf(args[0]);

        System.out.println("Power is:" + base);
        System.out.println("Given Base   Exponential   Power is Equal to");
        System.out.printf("--------------------------------------------\n");

        if (base <= 0) {
            System.out.println("Error: Please enter a number greater than 0");
            return;
        }

        for (i=1; i<=10; i++){
        power = (int)Math.pow(base,i);
        System.out.printf("%10d %13d %19d\n", base, i, power);
        }
    }
}
package in.co.IO;

public class printf_Demo {
    public static void main(String[] args) {
        int x= 100;
        System.out.printf("printing simple " +"integer : x= %d\n",x);
        System.out.printf("Formatted with " +"precision: PI = %.2f\n",Math.PI);

        float n= 5.2f;
        System.out.printf("Formatted to " + " specific width : n=%.4f\n",n);
        n= 2324435.3f;
    }
}

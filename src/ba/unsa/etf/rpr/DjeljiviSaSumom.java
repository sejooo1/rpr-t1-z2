package ba.unsa.etf.rpr;
import java.util.Scanner;

public class DjeljiviSaSumom {

    public static int suma(int n){
        int suma=0, pom;
        while(n>0){
            pom=n%10;
            suma=suma+pom;
            n=n/10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for(int i = 1; i<n; i++){
            if(i%suma(i)==0){
                System.out.println(i);
            }
        }
    }
}

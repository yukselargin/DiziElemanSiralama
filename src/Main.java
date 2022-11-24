import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*1. Elemanı : 99
        2. Elemanı : -2
        3. Elemanı : -2121
        4. Elemanı : 1
        5. Elemanı : 0*
        Sıralama : -2121 -2 0 1 99 */

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();
        int[] element= new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Dizinin "+(i+1)+".elemanını giriniz: ");
            element[i] = input.nextInt();
        }
        Arrays.sort(element);
        System.out.println("Sıralama: "+Arrays.toString(element));
    }
}
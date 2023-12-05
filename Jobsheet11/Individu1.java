import java.util.Scanner; 
public class Individu1 {
    public static void main(String[] args) {
        int N; 
        Scanner sc01=new Scanner(System.in); 
        System.out.print("Masukkan jumlah baris : "); 
        N=sc01.nextInt();
        for (int i=0; i<=N; i++){ 
            int number=1; 
            for (int j=0; j<=N; j++) { 
            if (j > N - i) { 
                System.out.print(number); 
                number++; 
            } else {
                System.out.print(" "); 
            }
        }
        System.out.println();
        }
    } 
}
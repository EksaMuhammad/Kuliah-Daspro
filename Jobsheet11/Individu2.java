import java.util.Scanner; 
public class Individu2 {
    public static void main(String[] args) {
        int N; 
        Scanner sc01=new Scanner(System.in); 
        System.out.print("Inputkan N : "); 
        N=sc01.nextInt(); 
        for (int i=0; i<=N; i++){ 
            for (int j=N; j>i; j--) 
            
            System.out.print("*"); 
            System.out.println(); 
        }
    } 
}
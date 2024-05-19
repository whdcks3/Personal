import java.util.Random;
import java.util.StringTokenizer;

public class A_Test{

    public A_Test(){
        
    }
    public static void main(String[] args) {
        double a = Math.sqrt(9);
        Random rand = new Random() ;
        StringTokenizer st = new StringTokenizer("3 : 4 : 5 ",": ");
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken()+" ");
        }System.out.println();
        System.out.println(rand.nextInt(19));
        System.out.println(a);
        
    }
}
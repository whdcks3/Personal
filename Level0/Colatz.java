import java.util.ArrayList;

public class colatz {
    public static void main(String[] args) {
        int n=10;
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(n);

        while(n!=1){
            if(n%2==0){
                n/=2;
                answer.add(n);
            }else {
                n=3*n+1;
                answer.add(n);
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181919
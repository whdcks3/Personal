package Level1;

public class Between_two {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        long answer=0;

        if (a <= b) {
            for (int i = a; i <= b; i++)
                answer += i;
        }else {
            for (int i = b; i <= a; i++)
                answer += i;
        }
        System.out.println(answer);
    }    
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12912
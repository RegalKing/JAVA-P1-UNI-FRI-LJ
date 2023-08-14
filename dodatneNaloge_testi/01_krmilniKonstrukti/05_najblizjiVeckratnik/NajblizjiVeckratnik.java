import java.util.*;

public class NajblizjiVeckratnik {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt(); 
    int i=0;
    int sum=0;
    int x=0;
    int y=0;
    while (a*i<b){
        i+=1;
    }
    sum=a*i;
    x=sum-b;
    y=b-a*(i-1);
    if (x>=y){
        if(y<=x){
            System.out.println(sum-(a));
        }
        else{
        System.out.println(sum);
    }
}
    else{
        if(y<=x){
            System.out.println(sum-(a));
        }
        else{
        System.out.println(sum);
    }
    }
}
}

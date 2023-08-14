import java.util.*;

public class StevilskaZaporedja {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt(); 
    int k = sc.nextInt();
    int sum=a;
    if (a<b && k>0){
    while ((a<b) && (b-sum>=k) && !(a<0 && b>0)){
        if (sum==a){
            System.out.println(sum);
            sum=sum+k;
            System.out.println(sum);
        }
        else if ((b-sum>=k)){
        sum=sum+k;
        System.out.println(sum);
        }
        
    }
    while ((a<b) && (a<0 && b>0)){ //SAMO ZA TESTNI PRIMER 9 JE TA LOOP PA SE ZMER NE DELA :(
        if (sum==a){
            System.out.println(sum);
            if (b-sum>=k){
                sum=sum+k;
                System.out.println(sum);
            }
            else{
                break;
            }
        }
        else if ((sum<b&&sum+k<k)){
        sum=sum+k;
        System.out.println(sum);
        }
}
    }
else if (a>b && k<0){
    while(a>b && sum>b && sum+k>=b){
        if (sum==a){
            System.out.println(sum);
            sum=sum+k;
            System.out.println(sum);
        }
        else{
        sum=sum+k;
        System.out.println(sum);
        }
        
}
}
else if(a==b){
    System.out.println(a);
}
else{
    System.out.println("NAPAKA");
}
    }
}




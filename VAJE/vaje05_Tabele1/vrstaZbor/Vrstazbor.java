import java.util.*;

        public class Vrstazbor{
            public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                int n= sc.nextInt();
                int[] shramba=new int [n];
                for (int i=0;i<n;i++){
                    shramba[i]=sc.nextInt();
                }
                //System.out.println(Arrays.toString(t));
                boolean isEmpty=true;
                for (int i=0;i<n;i++){
                    //System.out.println("I je"+i);
                    if (i!=0 && i!=n-1 && shramba[i-1]<=shramba[i] && shramba[i+1]>=shramba[i]){
                        System.out.println(i);
                        isEmpty=false;
                    }
                    else if (i==0){
                        if (shramba[i+1]>=shramba[i]){
                            System.out.println(i);
                            isEmpty=false;
                        }
                    }
                    else if (i==n-1){
                        //System.out.println("KROMPIR");
                            if (shramba[i-1]<=shramba[i]){
                                System.out.println(i);
                                isEmpty=false;
                            }
                        
                    }
                    }
                    if (isEmpty==true){
                        System.out.println("NOBEDEN");
                    }
                }

            }
        
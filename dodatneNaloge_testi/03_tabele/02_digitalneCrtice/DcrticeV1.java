import java.util.*;
            public class DcrticeV1{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
                    int[] st = new int[a];
                    int MaxCena=0;
                    int NumOfMaxCena=0;
                    int cena=0;

                        for (int i=0;i<st.length;i++){
                            st[i]=sc.nextInt();
                        }
                //    int steviloCrtic=value[1][n];

                    for (int m=0;m<st.length;m++){
                        int vsakoStevilo=st[m];
                        cena=separateIntoDigits(vsakoStevilo);
                        if (cena>MaxCena){
                            MaxCena=cena;
                            NumOfMaxCena=m;
                        }
                    }
                    int max=st[NumOfMaxCena];
                    System.out.println(max);
                    }
                public static int separateIntoDigits (int num){ // this method separates an integer into an array of its digits
                    int totalCost=0;
                    int [][] value={
                        {0,1,2,3,4,5,6,7,8,9},
                        {6,2,5,5,4,5,6,3,7,6}
                    };
                    String integer = String.valueOf(num);
                        int[] digits=new int[integer.length()];
                        for(int i = 0; i < integer.length(); i++) {
                        int j = Character.digit(integer.charAt(i), 10);
                        digits[i]=j;
                    }
                    for (int l=0;l<digits.length;l++){
                        int currentCost=value[1][digits[l]];
                        totalCost+=currentCost;
                        
                    }
                    return totalCost;

                }
            }
            
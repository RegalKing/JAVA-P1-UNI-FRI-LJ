import java.util.*;
            public class Vsirazlicni2{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int[][] shramba=new int[2][n];
                    for (int i=0; i<n; i++){
                            int nextNumber=sc.nextInt();
                            Object x = (int) nextNumber;
                        //    System.out.println(Arrays.toString(shramba[0]));
                        //   System.out.println(x);
                            boolean hasNumber=false;
                            for (int j=0;j<i;j++){
                                if (shramba[0][j]==nextNumber){
                                    shramba[1][j]+=1;
                                    hasNumber=true;
                                }
                            }
                            if (hasNumber==false){
                                shramba[0][i]=nextNumber;    
                        }
                    }
                   //System.out.println(Arrays.deepToString(shramba));
                    boolean null2=false;
                    //int min=Integer.MIN_VALUE;
                    int min=0;
                    int max=Integer.MAX_VALUE;
                    int maxCount=0;
                    for (int j=0;j<n;j++){
                        int currentCount=shramba[1][j];
                        //System.out.println("CC="+shramba[1][j]);
                        int currentNumber=shramba[0][j];
                        //System.out.println("CN="+shramba[0][j]);
                        // System.out.println("MAX="+max);
                        // System.out.println("MIN="+min);
                        if (currentCount>=maxCount && currentNumber<max){
                        //    System.out.println(shramba[0][j]);
                            maxCount=currentCount;
                            min=shramba[0][j];
                            //System.out.println(min);
                        }

                    }
                    if (maxCount==0){
                        System.out.println("RAZLICNI");
                    }
                    else{
                        System.out.println(min);
                    }
                }
            }

            
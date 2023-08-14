import java.util.*;
            public class Vsirazlicni2{
                private static final int MAKS_STEVILO = 10000;
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int s = sc.nextInt();
                    int k = sc.nextInt();
                    Random random = new Random(s);
                    int size = 2 * MAKS_STEVILO + 1;
                    int[] shramba=new int[size];

                    for (int i=0; i<k; i++){
                            int nextNumber=random.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO;
                            if (nextNumber>0){
                                int posindex=nextNumber+10000;
                                //System.out.println("POSnumber="+nextNumber);
                                //System.out.println("POS="+posindex);
                                shramba[posindex]+=1;
                            }
                            if (nextNumber<0){
                                int index=nextNumber*(-1);
                                //System.out.println("NEGnumber="+nextNumber);
                                //System.out.println("NEG="+index);
                                shramba[index]+=1;
                            }
                            if (nextNumber==0){
                                shramba[0]+=1;
                            }
                        }        
                  // System.out.println(shramba.length);
                   int highestCount=Integer.MIN_VALUE;
                   int highestCountNumber=Integer.MAX_VALUE;
                   for (int i=0;i<size;i++){
                        int currentIndex=i;
                        int currentValue=shramba[i];
                        int currentNumber=0;
                            if (currentIndex<=10000){
                                 currentNumber=currentIndex*(-1);
                            }
                            else if (currentIndex>10000){
                                 currentNumber=currentIndex-10000;
                            }
                            //System.out.println("CURRENT VALUE="+highestCountNumber);
                        if (currentValue>=highestCount && currentNumber<highestCountNumber){
                            highestCount=currentValue;
                            highestCountNumber= currentNumber;
                        }
                    }
                    //System.out.println(shramba[16685]);
                    //System.out.println(shramba[793]);
                    //System.out.println(highestCount);
                   if (highestCount==1){
                       System.out.println("RAZLICNI");
                   }
                   else{
                       System.out.println(highestCountNumber);
                   }
               }
           }

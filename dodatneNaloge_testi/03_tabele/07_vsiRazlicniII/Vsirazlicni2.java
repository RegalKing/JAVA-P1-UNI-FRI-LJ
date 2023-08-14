import java.util.*;
            public class Vsirazlicni2{
                private static final int MAKS_STEVILO = 10000;
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int s = sc.nextInt();
                    int k = sc.nextInt();
                    Random random = new Random(s);
                    int[] shramba=new int[2 * MAKS_STEVILO + 1];

                    for (int i=1; i<k; i++){
                            int nextNumber=random.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO;
                            shramba[nextNumber+MAKS_STEVILO]+=1;
                        }        
                  // System.out.println(Arrays.toString(shramba));
                  int iMax = 0;
                  boolean different = true;
                  for(int i = 0; i < shramba.length; i++){
                      if(shramba[i] > shramba[iMax])
                          iMax = i;
                          if(shramba[i] > 1)
                              different = false;
                  }
                  //System.out.println(iMax-MAKS_STEVILO);
                   if (different==true){
                       System.out.println("RAZLICNI");
                   }
                   else{
                       System.out.println(iMax-MAKS_STEVILO);
                   }
               }
           }

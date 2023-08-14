import java.util.*;

        public class Izstevanka{
            public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                int stOtrok=sc.nextInt();
                int JeIzpadel[]=new int[stOtrok];
                int count=sc.nextInt();
                String t[]=new String[stOtrok];
                for (int i=0;i<stOtrok;i++){
                    t[i]=sc.next();
                }
                int kidsLeft=stOtrok;
                for (int i=1;i<stOtrok;i++){
                    int naslednjiIzpadel=count;
                    while (naslednjiIzpadel>kidsLeft){
                        naslednjiIzpadel-=kidsLeft;
                    }
                    kidsLeft--;
                    int currentIndex=0;
                    int count2=naslednjiIzpadel;
                    for (int k=0;k<stOtrok;k++){
                        if (JeIzpadel[k]==1){
                            continue;
                        }
                        else{
                            count2--;
                        }
                        if (count2==0){
                            JeIzpadel[k]=1;
                            currentIndex=k;
                        }
                    }
                    

                    System.out.printf("%s%n",t[currentIndex]);
                //System.out.println(Arrays.toString(t));
                }


            }
        }
import java.util.*;
        public class VBoris2{
            Random RNG;
            public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                int s = sc.nextInt();
                int dan = sc.nextInt();
                int totalLiho=totalLiho(dan);
                System.out.println("TOTAL LIHO="+totalLiho);
                vrziKocko(dan, s, totalLiho);




            }
            
            public static void vrziKocko(int dan,int s, int totalLiho){
                Random RNG = new Random(s);
                int lihoCounter=0;
                int totalLihoLocal=0;
                int totalLocal=0;
                int totalFINAL=0;
                boolean nedelja=false;
                while (totalFINAL<=totalLiho){
                    if (totalLihoLocal==18){
                        totalFINAL+=5;
                        totalLihoLocal=0;
                        totalLocal=0;
                        System.out.printf("%d"+" ("+"N"+"): ",dan,"weekOrEnd");
                        nedelja=true;
                    }
                    else if ((totalLihoLocal%3==0 && totalLihoLocal>=3) || totalLihoLocal==0 && totalLocal==0){
                        System.out.printf("%d"+" ("+"D"+"): ",dan,"weekOrEnd");
                    }
                    int trenutnoStevilo=RNG.nextInt(6)+1;
                    System.out.printf("%d ",trenutnoStevilo);
                    totalLocal++;
                    if (trenutnoStevilo%3==0){
                        totalLihoLocal++;
                        totalFINAL++;
                    }
                    if (totalLihoLocal%3==0 && totalLihoLocal>=3){
                        dan++;
                        System.out.println();
                    }
                }


            }
            public static int totalLiho(int dan){
                int lihoCounter=0;
                for (int i=1;i<=dan;i++){
                    if (i%7==0){
                        lihoCounter+=5;
                    }
                    else{
                        lihoCounter+=3;
                    }
                }
                return lihoCounter;
            }
        }


                
    


                
                
import java.util.*;

            public class PotencaPoModulu {
                static long full=1;
                static long PolModula=0;
            public static void main (String[] args){ // druga resitev -> lahko bi tole psevdokodo iz wikipedijo pretvoru: https://en.wikipedia.org/wiki/Exponentiation_by_squaring
                                                        // prva resitev -> rewriti z BigInteger -> import java.math.BigInteger;
                                                        // tretja resitev -> ?

                    Scanner sc = new Scanner(System.in);
                    long a = sc.nextLong();
                    long b = sc.nextLong();
                    long m = sc.nextLong();
                    long result = polModula(a,b,m);   
                    System.out.println(result);     
            }
            public static long polModula(long a,long e,long m){
                if (e%2==0){
                        e=e/2;
                        for (long i=1;i<=e;i++){
                            if (PolModula==0){
                                PolModula=a;
                            }
                            else{
                                PolModula=PolModula*a;
                                //System.out.println(PolModula);
                            }
                        }
                        //long polModula=((PolModula%m)*(PolModula%m))%m;
                        //System.out.println(polModula);
                        full=((PolModula%m)*(PolModula%m))%m;
                        //System.out.println(full);
                    }
                    return full;
                    
            }



            
        }
    
        
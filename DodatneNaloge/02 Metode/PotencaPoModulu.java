import java.util.*;
import java.math.BigInteger;

            public class PotencaPoModulu {
            public static void main (String[] args){ // druga resitev -> lahko bi tole psevdokodo iz wikipedijo pretvoru: https://en.wikipedia.org/wiki/Exponentiation_by_squaring
                                                        // prva resitev -> rewriti z BigInteger -> import java.math.BigInteger;
                                                        // tretja resitev -> z formulami v namigih razdel mod na tok delov dokler ne bo nehal overflowat sam to se mi ne da delat 
                                                        // in se mi ne sanja cist kako sploh bi se clovk lotu tega
                    Scanner sc = new Scanner(System.in);
                    long i1 = sc.nextLong();
                    long i2 = sc.nextLong();
                    long i3 = sc.nextLong();
                    BigInteger a = BigInteger.valueOf(i1);
                    BigInteger b = BigInteger.valueOf(i2);
                    BigInteger m = BigInteger.valueOf(i3);

                    BigInteger rezultat = a.modPow(b, m);  // a^b mod m
                    System.out.println(rezultat);  
        }
    }
                    
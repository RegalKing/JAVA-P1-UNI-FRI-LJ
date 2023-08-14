import java.util.*;
                public class RazbijanjeStevil {
                    public static void main (String[] args){
                        Scanner sc = new Scanner(System.in);
                        long a = sc.nextLong();
                        long b = sc.nextLong();
                        long StevecMest=0;
                        long trenutnoStevilo=b;
                        long trenutniOstanek=b;
                        long trenutniRezultat;
                        long trenutniKolicnik;
                        sc.close();
                        for (long i=18;i>=1;i--){
                            long potenca=(long)Math.pow(10, i);
                            trenutniOstanek=trenutnoStevilo%potenca;
                            trenutniKolicnik=trenutnoStevilo/potenca;
                            if (trenutniOstanek==b) continue;
                            System.out.println("trenutniOstanek="+trenutniKolicnik);
                            System.out.println("trenutniOstanek="+trenutniOstanek);
                        }
                    }
                }



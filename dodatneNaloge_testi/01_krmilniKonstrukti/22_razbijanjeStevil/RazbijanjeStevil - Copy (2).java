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
                        long trenutnaMestaA=0;
                        long trenutniOstanekA=a;
                        long trenutnoSteviloA=a;
                        long trenutniKolicnikA;
                        sc.close();
                        
                        for (int i=18;i>=0;i--){
                            long potenca=(long)Math.pow(10, i); 
                            trenutniOstanek=trenutnoStevilo%potenca;
                            trenutniKolicnik=trenutnoStevilo/potenca;
                            if (trenutniOstanek==b) continue;
                            System.out.println("trenutniKOL="+trenutniKolicnik);
                            System.out.println("trenutniOstanek="+trenutniOstanek);
                            trenutnoStevilo=trenutniOstanek;
                            for (int l=0;l<trenutniKolicnik;l++){
                                trenutnaMestaA++;
                            }
                            System.out.println("Amesta="+trenutnaMestaA);
                            while (trenutnaMestaA>0 && trenutniKolicnik>0){
                                long potencaA=(long)Math.pow(10, trenutnaMestaA);
                                trenutniOstanekA=trenutnoSteviloA%potencaA;
                                trenutniKolicnikA=trenutnoSteviloA/potencaA;
                                trenutnoSteviloA=trenutniOstanekA;
                                System.out.println("STEVILOOO="+trenutniKolicnikA);
                                trenutnaMestaA--;
                                trenutniKolicnik--;
                            }
                                

                        }
                    }
                }



import java.util.*;
            public class Nelement{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int[] t = new int[b];
                    int indeksCounter=-1;
                    while (sc.hasNextInt()){
                        for (int i=0;i<t.length;i++){
                            t[i]=sc.nextInt();
                        }
                        }
                        sc.close();

                    int[] razdalja= new int[b];

                    for (int index: t){
                        indeksCounter++;
                        razdalja[indeksCounter]=Math.abs(a-index);
                    }
                    int min=Integer.MAX_VALUE;
                    for (int j=0;j<razdalja.length;j++){
                        if (razdalja[j] < min){
                            min = razdalja[j];
                            indeksCounter=j;
                            }
                        }
                        System.out.println(indeksCounter);
                    }
                }
            
            
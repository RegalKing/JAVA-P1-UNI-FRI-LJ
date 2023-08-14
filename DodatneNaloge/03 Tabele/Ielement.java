import java.util.*;
            public class Ielement{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int[] shramba=new int [n];
                    //int gcd=findGCDofArray(shramba);
                    //System.out.println(gcd);
                    for (int i=0;i<n;i++){
                        shramba[i]=sc.nextInt();
                    }
                    //System.out.println(Arrays.toString(shramba));
                    boolean GCDexists=false;
                    for (int k=0;k<n;k++){
                        int currentNumber=shramba[k];
                        int[] temp=new int [n];
                        for (int j=0;j<n;j++){
                            int currentStevilka=shramba[j];
                            if (currentStevilka!=currentNumber){
                                temp[j]=shramba[j];
                            }
                        }
                        int currentGCD=findGCDofArray(temp);
                        if (currentNumber%currentGCD!=0){
                            System.out.println(currentNumber);
                            GCDexists=true;
                        }
                        //System.out.println(Arrays.toString(temp));
                    }
                    if (GCDexists==false){
                        System.out.println("NIC");
                    }
                }
                public static int findGCDofArray(int shramba[]){
                    int number=0;
                    for(int i=0; i<shramba.length-1; i++){
                        number = findGCD(shramba[i], number);
                    }
                    return number;
                }
                public static int findGCD(int a, int b){
                    if(b == 0){
                      return a;
                    }
                    return findGCD(b, a%b);
                }
            }

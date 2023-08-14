import java.util.*;
            public class Vrazlicni1{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int[][] shramba=new int[2][n];
                    for (int i=0; i<n; i++){
                            int nextNumber=sc.nextInt();
                            Object x = (int) nextNumber;
                            System.out.println(Arrays.toString(shramba[0]));
                            System.out.println(x);
                            if (Arrays.asList(shramba[0]).contains(x)){   // tale if pogoj mi noce delat pa nevem zakaj pls
                                System.out.println("DICK");

                                shramba[1][i]+=1;
                                
                            }
                            else{
                                shramba[0][i]=nextNumber;
                            }
                        }
                    System.out.println(Arrays.deepToString(shramba));
                }
            }
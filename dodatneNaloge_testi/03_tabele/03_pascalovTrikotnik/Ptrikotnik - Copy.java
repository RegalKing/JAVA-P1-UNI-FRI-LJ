import java.util.*;
            public class Ptrikotnik{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
                    int[][] t = new int[a+1][a+1];
                    for (int i=0;i<t.length;i++){
                            for (int j=0;j<=i;j++){
                                if (j==0){
                                    t[0][j]=1;
                                    System.out.printf("1");
                                }
                                else{
                                    int p1=t[i-1][j-1];
                                    int p2=t[i-1][j];
                                    int p=p1+p2;
                                    t[i][j]=p;
                                    System.out.printf(" %d",p);
                                }
                            }
                            System.out.println();
                        }
                    }
                }
            
                                    


                            

                    
                        
                


                             


                             








import java.util.*;
            public class Ptrikotnik{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
                    int[][] t = new int[a+2][a+2];
                    for (int i=0;i<=t.length-1;i++){
                            for (int j=0;j<=i;j++){
                                if (j==0){
                                    t[0][j]=1;
                                }

                                else if (j==i){
                                    int p=t[i-1][j-1]+t[i-1][j];
                                    t[i][j]=p;
                                    System.out.printf("%d",p);
                                }

                                else{
                                    int p=t[i-1][j-1]+t[i-1][j];
                                    t[i][j]=p;
                                    System.out.printf("%d ",p);
                                }
                            }
                            if (i!=0){
                            System.out.println();
                            }
                        }
                    }
                }
            
                                    


                            

                    
                        
                


                             


                             








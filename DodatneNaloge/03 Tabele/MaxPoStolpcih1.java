import java.util.*;
            public class MaxPoStolpcih1{
                public static void main (String[] args){
                    Scanner sc = new Scanner(System.in);
                    int v = sc.nextInt();
                    int s = sc.nextInt();
                    int[][] shramba= new int[v][s];
                    for (int i=0;i<v;i++){
                        for (int j=0;j<s;j++){
                            shramba[i][j]=sc.nextInt();
                        }
                    }
                    int[] maxPoStolpcih=new int[s];
                    //System.out.println(Arrays.deepToString(shramba));
                    for (int i=0;i<s;i++){
                        int maxNumber=Integer.MIN_VALUE;
                        for (int j=0;j<v;j++){
                            int currentNumber=shramba[j][i];
                            if (currentNumber>maxNumber){
                                maxNumber=currentNumber;
                            }
                        }
                        maxPoStolpcih[i]=maxNumber;
                        //System.out.println(Arrays.toString(maxPoStolpcih));

                    }
                    System.out.println(Arrays.toString(maxPoStolpcih));





                        }
                    }
                
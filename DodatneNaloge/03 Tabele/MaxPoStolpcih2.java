import java.util.*;
            public class MaxPoStolpcih2{
                public static void main (String[] args){
                    Scanner sc = new Scanner(System.in);
                    int v = sc.nextInt();
                    int[][] shramba= new int[v][100];
                    for (int i=0;i<v;i++){
                        for (int j=0;j<100;j++){
                            shramba[i][j]=Integer.MIN_VALUE;
                        }
                    }
                    int maxLengthOfColumn=0;
                    for (int i=0;i<v;i++){
                        int currentLengthOfColumn=sc.nextInt();
                        if (currentLengthOfColumn>maxLengthOfColumn){
                            maxLengthOfColumn=currentLengthOfColumn;
                        }
                        for (int j=0;j<currentLengthOfColumn;j++){
                            shramba[i][j]=sc.nextInt();
                        }
                    }
                    int[] maxByRow=new int[maxLengthOfColumn];
                    for (int i=0;i<maxLengthOfColumn;i++){
                        int maxNumber=Integer.MIN_VALUE;
                        for (int j=0;j<v;j++){
                            int currentNumber=shramba[j][i];
                            if (currentNumber>maxNumber){
                                maxNumber=currentNumber;
                            }
                        }
                        maxByRow[i]=maxNumber;
                    }
                    System.out.println(Arrays.toString(maxByRow));
                }
            }
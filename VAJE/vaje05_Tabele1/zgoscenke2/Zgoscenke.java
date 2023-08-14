import java.util.*;

        public class Zgoscenke{
            public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                int n= sc.nextInt();
                int max= sc.nextInt();
                int[] array=new int [n];
                //System.out.println(Arrays.toString(array));
                while (sc.hasNextInt()){
                    int lowestIndex=Integer.MAX_VALUE;
                    int lowestNumber=Integer.MAX_VALUE;
                    int next=sc.nextInt();
                    for (int i=0;i<n;i++){
                        int currentNumber=array[i];
                        if (currentNumber<lowestNumber && currentNumber+next<=max){
                            lowestIndex=i;
                            lowestNumber=currentNumber;
                        }
                    }
                    //System.out.println(lowestNumber);
                    //System.out.println(lowestIndex);
                    if (lowestIndex==Integer.MAX_VALUE){
                        break;
                    }
                    array[lowestIndex]+=next;
                    System.out.println(next+" EP -> zgoscenka "+(lowestIndex+1)+" "+Arrays.toString(array));
                }

                    

                
            }
        }
    
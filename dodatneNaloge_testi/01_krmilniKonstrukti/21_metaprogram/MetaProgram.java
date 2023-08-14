import java.util.*;
            public class MetaProgram {
                public static void main (String[] args){
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    sc.close();
                    System.out.println("public class Nizi {");
                    System.out.println("    public static void main(String[] args) {");
                    int SpaceCounter=4;
                    int counter=1;
                    for (int i=1;i<=n;i++){
                        SpaceCounter+=4;
                        for (int j=1;j<=SpaceCounter;j++){
                            System.out.printf(" ");
                        }
                        System.out.printf("for (char c"+counter+" = 'A';  c"+counter+" <= 'Z';  c"+counter+"++) {");
                        counter++;
                        System.out.println();
                    }
                    SpaceCounter+=4;
                    counter=counter-1;
                    for (int j=1;j<=SpaceCounter;j++){
                        System.out.printf(" ");
                    }
                    System.out.printf("System.out.println(\"\"");
                    for (int k=1;k<=counter;k++){
                        System.out.printf(" + c"+k);
                    }
                    System.out.printf(");");
                    System.out.println();
                    SpaceCounter=SpaceCounter-4;
                    for (int m=0;m<=(n+1);m++){
                        for (int l=1;l<=SpaceCounter;l++){
                            System.out.printf(" ");
                        }
                        SpaceCounter-=4;
                        System.out.printf("}");
                        System.out.println();
                    }
                }
            }
        
    
        
    


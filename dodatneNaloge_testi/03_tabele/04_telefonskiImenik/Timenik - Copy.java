import java.util.*;
            public class Timenik{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    String[][] imenik = new String[2][n];
                    for (int i=0;i<n;i++){
                    //    System.out.println(i);
                        String a=sc.next();
                        boolean ZeObstaja=false;
                        for (int h=0;h<i;h++){
                            String b=imenik[0][h];
                            if (a.equals(b)){
                                imenik[1][h]=sc.next();
                                ZeObstaja=true;
                                //System.out.println("ZE OBSTAJA="+ZeObstaja);
                                //System.out.println(Arrays.deepToString(imenik));
                            }
                        }
                        if (ZeObstaja==false){
                            imenik[0][i]=a;
                            imenik[1][i]=sc.next();
                            //System.out.println("ZE OBSTAJA="+ZeObstaja);
                           //System.out.println(Arrays.deepToString(imenik));
                        }

                }
                    System.out.println(Arrays.deepToString(imenik));
                    
                    
                    int k = sc.nextInt();
                    String[] poklici= new String[k];
                        for (int l=0;l<k;l++){
                            poklici[l]=sc.next();
                            String currentName=poklici[l];
                            for (int m=0;m<n;m++){
                                boolean obstaja=false;
                                String imenikName=imenik[0][m];
                            //    System.out.println("IMENIK NAME="+imenikName);
                            //    System.out.println("CURRENT NAME="+currentName);
                                if (currentName.equals(imenikName)){
                                    String currentPhone=imenik[1][m];
                                    System.out.printf("%s%n",currentPhone);
                                    obstaja=true;
                                }
                            
                            }
                            
                        
                        }
                        System.out.println(Arrays.deepToString(poklici));






                }
            }
        


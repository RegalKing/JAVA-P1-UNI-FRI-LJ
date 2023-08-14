import java.util.*;


                    public class StetjeKlicev {
                        public static void main (String [] args){
                            Scanner sc = new Scanner(System.in);
                            int a = sc.nextInt();
                            int b = sc.nextInt();
                            int c = sc.nextInt();
                            int d = steviloKlicev(a, b, c);
                            //System.out.println(d);
            }
                        public static int steviloKlicev(int a, int b, int c){
                            int steviloKlicev=0;
                            int divideByA=0;
                            int divideByB=0;
                            if (c!=0){
                                divideByA=c/a;
                                steviloKlicev++;
                            }
                            if (c!=0){
                                divideByB=c/b;
                                steviloKlicev++;
                            }
                            if (divideByA!=0){
                                steviloKlicev(a, b, divideByA);
                            }
                            if (divideByB!=0){
                                steviloKlicev(a, b, divideByB);
                            }
                            //if (divideByA==0 || divideByB==0){
                            //    steviloKlicev++;
                            //}

                            System.out.println(steviloKlicev);
                            return steviloKlicev;
                        }
                    }

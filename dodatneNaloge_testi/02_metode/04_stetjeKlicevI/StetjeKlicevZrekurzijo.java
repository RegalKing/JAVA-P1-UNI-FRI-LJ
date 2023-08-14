import java.util.*;


                    public class StetjeKlicevZrekurzijo {
                        public static void main (String [] args){
                            Scanner sc = new Scanner(System.in);
                            int a = sc.nextInt();
                            int b = sc.nextInt();
                            int c = sc.nextInt();
                            sc.close();
                            int d = steviloKlicev(a, b, c);
                            System.out.println(d);
                            //System.out.println(d);
            }
                        public static int steviloKlicev(int a, int b, int c){
                            if (c==0){
                                return 1;
                            }
                            return (steviloKlicev(a, b, c/a)+steviloKlicev(a, b, c/b)+1);
                        }
                    }


/*
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static class Tocka {
        private double x;
        private double y;

        public Tocka(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double vrniX() {
            return this.x;
        }

        public double vrniY() {
            return this.y;
        }
    }

    public static class Najdba {
        private String najditelj;
        private int cas;

        public Najdba(String najditelj, int cas) {
            this.najditelj = najditelj;
            this.cas = cas;
        }

        public String vrniNajditelja() {
            return this.najditelj;
        }

        public int vrniCas() {
            return this.cas;
        }
    }

    public static class Zaklad {
        private String id;
        private Tocka polozaj;
        private Najdba[] najdbe;

        public Zaklad(String id, Tocka polozaj, Najdba[] najdbe) {
            this.id = id;
            this.polozaj = polozaj;
            this.najdbe = najdbe;
        }

        public Tocka vrniPolozaj() {
            return this.polozaj;
        }

        public Najdba[] vrniNajdbe() {
            return this.najdbe;
        }

        public String[] najditelji() {
            String[] najditelji=new String [najdbe.length];
            for (int i=0;i<najdbe.length;i++){
                najditelji[i]=najdbe[i].vrniNajditelja();
            }
            return najditelji;
        }

        @Override
        public String toString() {
            return this.id;
        }
    }

    public static class Geolov {
        private Zaklad[] zakladi;

        public Geolov(Zaklad[] zakladi) {
            this.zakladi = zakladi;
        }

        public Zaklad[] vrniZaklade() {
            return this.zakladi;
        }

        public double pot(Tocka zacetna) {
            double initialX=zacetna.vrniX();
            double initialY=zacetna.vrniY();
            double pot=0;
            for (int i=0;i<this.zakladi.length;i++){
                if (i==0){
                double currentX=this.zakladi[i].polozaj.vrniX();
                double currentY=this.zakladi[i].polozaj.vrniY();
                double diffX=Math.abs(currentX-initialX);
                double diffY=Math.abs(currentY-initialY);
                pot+=diffX;
                pot+=diffY;
                }
            }
            return pot;

        }

        public Zaklad nazadnjeOdkrit() {
            int maxCas=Integer.MIN_VALUE;
            Zaklad CurrentZaklad=this.zakladi[0];
            int time=Integer.MIN_VALUE;
            for (int i=0;i<this.zakladi.length;i++){
                Zaklad trenutni=this.zakladi[i];
                Najdba najdbe[]=trenutni.vrniNajdbe();
                if (najdbe.length!=0){
                Najdba lowest=najdbe[0];
                int currentTime=lowest.vrniCas();
                if (currentTime>time){
                    time=currentTime;
                    CurrentZaklad=trenutni;
                }
                }
            }
            return CurrentZaklad;
        }


    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}

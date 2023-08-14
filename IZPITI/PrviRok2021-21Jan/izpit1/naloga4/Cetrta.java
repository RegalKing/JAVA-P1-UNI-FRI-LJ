
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    //=========================================================================
    public static class Barva {
        private int r;
        private int g;
        private int b;

        public Barva(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d, %d)", this.r, this.g, this.b);
        }
    }

    //=========================================================================
    public static abstract class Lik {
        private Barva barva;

        protected Lik(Barva barva) {
            this.barva = barva;
        }

        public abstract String vrsta(); 
        public abstract String mere(); 

        @Override
        public String toString() {
            return String.format("%s [%s, %s]", this.vrsta(), this.barva, this.mere());
        }
    }

    //=========================================================================
    public static class Pravokotnik extends Lik {
        private int a;
        private int b;

        public Pravokotnik(Barva barva, int a, int b) {
            super(barva);
            this.a = a;
            this.b = b;
        }

        public int vrniA() {
            return this.a;
        }

        @Override
        public String vrsta() {
            return "pravokotnik";
        }

        @Override
        public String mere() {
            return String.format("a = %d, b = %d", this.a, this.b);
        }
    }

    //=========================================================================
    public static class Kvadrat extends Pravokotnik {
        public Kvadrat(Barva barva, int a) {
            super(barva, a, a);
        }

        @Override
        public String vrsta() {
            return "kvadrat";
        }

        @Override
        public String mere() {
            return String.format("a = %d", this.vrniA());
        }
    }

    //=========================================================================
    public static class Krog extends Lik {
        private int r;

        public Krog(Barva barva, int r) {
            super(barva);
            this.r = r;
        }

        @Override
        public String vrsta() {
            return "krog";
        }

        @Override
        public String mere() {
            return String.format("r = %d", this.r);
        }
    }

    //=========================================================================
    public static void urediNaravno(List<Lik> liki) {
        // dopolnite ...
    }

    //=========================================================================
    public static Collection<Lik> poTipuInBarvi(Collection<Lik> liki) {
        // popravite / dopolnite ...
        return null;
    }

    //=========================================================================
    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}

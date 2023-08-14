
public class Test01 {

    public static void main(String[] args) {
        Tretja.Oseba ana = new Tretja.Oseba("Ana Arko", "Slovenija");
        Tretja.Oseba bernd = new Tretja.Oseba("Bernd Biermann", "Avstrija");
        Tretja.Oseba giuseppe = new Tretja.Oseba("Giuseppe Gironi", "Italija");
        Tretja.Oseba jevgenij = new Tretja.Oseba("Jevgenij Javlinski", "Rusija");
        Tretja.Oseba jill = new Tretja.Oseba("Jill Johnson", "ZDA");
        Tretja.Oseba vasil = new Tretja.Oseba("Vasil Vasileski", "Severna Makedonija");
        Tretja.Oseba zbigniew = new Tretja.Oseba("Zbigniew Zielinski", "Poljska");

        Tretja.Oseba[] osebe = {ana, bernd, giuseppe, jevgenij, jill, vasil, zbigniew};

        Tretja.Cilj ljubljana = new Tretja.Cilj("Ljubljana", "Slovenija");
        Tretja.Cilj bled = new Tretja.Cilj("Bled", "Slovenija");
        Tretja.Cilj dunaj = new Tretja.Cilj("Dunaj", "Avstrija");
        Tretja.Cilj rim = new Tretja.Cilj("Rim", "Italija");
        Tretja.Cilj newyork = new Tretja.Cilj("New York", "ZDA");
        Tretja.Cilj beograd = new Tretja.Cilj("Beograd", "Srbija");
        Tretja.Cilj ohrid = new Tretja.Cilj("Ohrid", "Severna Makedonija");

        Tretja.Cilj[] cilji = {ljubljana, bled, dunaj, rim, newyork, beograd, ohrid};

        Tretja.Nocitev[] nocitve = {
            new Tretja.Nocitev(ana, bled, 2010),
            new Tretja.Nocitev(ana, ljubljana, 2012),
            new Tretja.Nocitev(ana, bled, 2013),
            new Tretja.Nocitev(ana, bled, 2015),

            new Tretja.Nocitev(bernd, rim, 2015),
            new Tretja.Nocitev(bernd, rim, 2017),
            new Tretja.Nocitev(bernd, rim, 2018),
            new Tretja.Nocitev(bernd, rim, 2019),
            new Tretja.Nocitev(bernd, rim, 2020),

            new Tretja.Nocitev(giuseppe, beograd, 2016),

            new Tretja.Nocitev(jill, ohrid, 2009),
            new Tretja.Nocitev(jill, newyork, 2014),
            new Tretja.Nocitev(jill, ohrid, 2016),
            new Tretja.Nocitev(jill, dunaj, 2016),
            new Tretja.Nocitev(jill, newyork, 2017),

            new Tretja.Nocitev(vasil, ohrid, 2011),
            new Tretja.Nocitev(vasil, ohrid, 2012),
            new Tretja.Nocitev(vasil, ljubljana, 2015),
            new Tretja.Nocitev(vasil, rim, 2019),

            new Tretja.Nocitev(zbigniew, newyork, 2014),
            new Tretja.Nocitev(zbigniew, newyork, 2014),
            new Tretja.Nocitev(zbigniew, beograd, 2015),
            new Tretja.Nocitev(zbigniew, ljubljana, 2015),
            new Tretja.Nocitev(zbigniew, ohrid, 2016)
        };

        System.out.println(Tretja.notranje(nocitve));
    }
}

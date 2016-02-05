package OOP;

import java.util.ArrayList;

/**
 * Created by Evelin.Jogi on 5.02.2016.
 */
public class Korter {
    ArrayList <String> korter = new ArrayList<>();
    int mahutavus;
    int paljuMahubVeel;

    public Korter(int mahutab) {
        mahutavus = mahutab;

    }

    public void saabus(String taavi) {
        if (korter.size() < mahutavus) {
            korter.add(taavi);
        } else {
            System.out.println("Sa ei mahu kahjuks peole, meid on juba 10");
        }
    }

    public void prindiKylalisteArv() {
        System.out.println(korter.size());

    }

    public void prindiPaljuVeelMahub() {
        paljuMahubVeel = mahutavus - korter.size();
        System.out.println(paljuMahubVeel);




    }

    public void lahkus(String taavi) {
        korter.remove(taavi);

    }
}

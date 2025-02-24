package hu.szamalk.Modell;

import java.util.HashSet;
import java.util.Iterator;

public class Garazs implements Iterable{
    private HashSet<Jarmu> ferohely;



    public Garazs(HashSet<Jarmu> ferohely) {
        this.ferohely = new HashSet<>(5);
        //ferohely.add();
    }

    @Override
    public Iterator iterator() {
        return null;
    }


    public void beall(Jarmu jarmu){
        if (ferohely.contains(jarmu)){
            System.out.println("Már van ilyen jármű a garázsban.");

        }else{
            ferohely.add(jarmu);
        }

    }

    public void kiall(Jarmu jarmu){
        if (ferohely.contains(jarmu)){
            ferohely.remove(jarmu);
        }else{
            System.out.println("Még nincs ilyen jármű a garázsban.");
        }

    }

    @Override
    public String toString() {
        return "Garazs{" +
                "ferohely=" + ferohely +
                '}';
    }

}

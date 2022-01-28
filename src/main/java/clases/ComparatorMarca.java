package clases;

import java.util.Comparator;

public class ComparatorMarca implements Comparator<Marca> {

    @Override
    public int compare(Marca o1, Marca o2) {
        return o1.compareTo(o2);
    }
}

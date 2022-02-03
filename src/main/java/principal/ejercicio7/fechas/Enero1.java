package principal.ejercicio7.fechas;

import java.time.Month;

public class Enero1 {


    public static void main(String[] args) {
        Fecha fecha = new Fecha();
        System.out.println(fecha.whatDayWas(1, Month.JANUARY.ordinal(), 1970));
    }
}

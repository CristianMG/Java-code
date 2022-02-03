package principal.ejercicio7.fechas;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Fecha implements Comparable<Fecha> {

    int dia;
    int mes;
    int anyo;

    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public Fecha() {
    }

    public String whatDayWas(int day, int month, int year) {
        GregorianCalendar calendar = new GregorianCalendar();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = new String[]{"", "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};

        //Solucion buena
        //SimpleDateFormat formatterDay = new SimpleDateFormat("EEEE");
        //System.out.println(formatterDay.format(calendar.getTime()));

        return days[dayOfWeek];
    }
    
    /*
    2 En  la clase Fecha desarrolle el método  public boolean posterior(Fecha f). Utilícelo desde un programa que lea dos fechas 
    e indique cuál de ellas  es posterior a la otra. (Posterior)
    */

    public boolean posterior(Fecha f) {
        if (this.anyo > f.getAnyo()) return true;
        if (this.anyo < f.getAnyo()) return false;
        if (this.mes > f.getMes()) return true;
        if (this.mes < f.getMes()) return false;
        if (this.dia > f.getDia()) return true;
        return false;
    }

    /*
    3 En la clase  Fecha y a semejanza del método compareTo() de la clase String, desarrolle un método con el mismo nombre que
    compare dos objetos de la clase Fecha,  la propia instancia de la clase Fecha y  otra recibida como parámetro. 
    */
    //mayor que = 1
    //igual que = 0
    //menor que = -1
    @Override
    public int compareTo(Fecha f) {
        // preguntamos si la fecha f es igual, si es asi retorna un 0 o igual
        if (this.equals(f)) return 0;
        // preguntamos si la fecha f es posterior, si es asi retorna un 1
        if (this.posterior(f)) return 1;
        // si la fecha es anterior retorna un -1
        return -1;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return dia == fecha.dia && mes == fecha.mes && anyo == fecha.anyo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, anyo);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

}

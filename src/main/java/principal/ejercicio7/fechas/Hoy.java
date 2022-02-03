package principal.ejercicio7.fechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Hoy {


    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int month = calendar.get(Calendar.MONTH) + 1;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        System.out.println(formatter.format(calendar.getTime()));
    }
}

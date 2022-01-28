package clases;

/**
 * @author C4lderon
 */
public class Atleta {

    String nombre;
    Marca marca1;
    Marca marca2;
    Marca marca3;

    public Atleta() {

    }

    public Atleta(String nombre, Marca marca1,
                  Marca marca2,
                  Marca marca3
    ) {

        this.nombre = nombre;
        this.marca1 = marca1;
        this.marca2 = marca2;
        this.marca3 = marca3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca1(Marca marca1) {
        this.marca1 = marca1;
    }

    public void setMarca2(Marca marca2) {
        this.marca2 = marca2;
    }

    public void setMarca3(Marca marca3) {
        this.marca3 = marca3;
    }

    public String getNombre() {
        return nombre;
    }

    public Marca getMarca1() {
        return marca1;
    }

    public Marca getMarca2() {
        return marca2;
    }

    public Marca getMarca3() {
        return marca3;
    }


    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", marca1=" + marca1 +
                ", marca2=" + marca2 +
                ", marca3=" + marca3 +
                '}';
    }
}

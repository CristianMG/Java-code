package clases;


public class Marca implements Comparable<Marca> {

    int horas;
    int minutos;
    int segundos;
    String nombreAtleta;
    String evento;

    public Marca(){

    }

    public Marca(int horas, int minutos, int segundos, String nombreAtleta, String evento) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.nombreAtleta = nombreAtleta;
        this.evento = evento;
    }

    @Override
    public int compareTo(Marca marcaParaCompara) {
        if (this.horas < marcaParaCompara.getHoras()) {
            return 1;
        } else if (this.horas > marcaParaCompara.getHoras()) {
            return -1;
        } else {
            if (this.minutos < marcaParaCompara.getMinutos()) {
                return 1;
            } else if (this.minutos > marcaParaCompara.getMinutos()) {
                return -1;
            } else {
                if (this.segundos < marcaParaCompara.getSegundos()) {
                    return 1;
                } else if (this.segundos > marcaParaCompara.getSegundos()) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }


    public String getNombreAtleta() {
        return nombreAtleta;
    }

    public void setNombreAtleta(String nombreAtleta) {
        this.nombreAtleta = nombreAtleta;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }


    @Override
    public String toString() {
        return "Marca{" +
                "horas=" + horas +
                ", minutos=" + minutos +
                ", segundos=" + segundos +
                ", nombreAtleta='" + nombreAtleta + '\'' +
                ", evento='" + evento + '\'' +
                '}';
    }
}

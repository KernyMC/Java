public class Fecha {
    private int anio;
    private int mes;
    private int dia;

    public int getAnio() {
        return anio;
    }
    public int getMes() {
        return mes;
    }
    public int getDia() {
        return dia;
    }

    public void setAnio(int nuevoAnio) {
        anio = nuevoAnio;
    }

    public void setMes(int nuevoMes) {
        mes = nuevoMes;
    }

    public void setDia(int nuevoDia) {
        dia = nuevoDia;
    }

    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

}

public class Cuadrado {

    public int lado;

    public double areaCuadrado(){
        double area;
        area = lado * lado;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro;
        perimetro = 4 * lado;
        return perimetro;
    }

}
public class Rectangulo {
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int nuevaBase) {
        base = nuevaBase;
    }

    public void setAltura(int nuevaAltura) {
        altura = nuevaAltura;
    }

    public int calcularArea() {
        int area;
        area = base * altura;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro;
        perimetro = 2 * (base + altura);
        return perimetro;
    }

}

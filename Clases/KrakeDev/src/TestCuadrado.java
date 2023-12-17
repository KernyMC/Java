public class TestCuadrado {
    
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado(5);
        Cuadrado c2 = new Cuadrado(10);
        Cuadrado c3 = new Cuadrado(15);
        
        double areaC1 = c1.areaCuadrado();
        double areaC2 = c2.areaCuadrado();
        double areaC3 = c3.areaCuadrado();
        
        double perimetroC1 = c1.calcularPerimetro();
        double perimetroC2 = c2.calcularPerimetro();
        double perimetroC3 = c3.calcularPerimetro();

        System.out.println("El perimetro es de C1: " + perimetroC1);
        System.out.println("El perimetro es de C2: " + perimetroC2);
        System.out.println("El perimetro es de C3: " + perimetroC3);
        
        System.out.println("El area es de C1: " + areaC1);
        System.out.println("El area es de C2: " + areaC2);
        System.out.println("El area es de C3: " + areaC3);
    }

}

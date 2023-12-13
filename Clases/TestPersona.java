public class TestPersona {
    public static void main(String[] args) {
        Persona personaA = new Persona();
        Persona personaB = new Persona();
        Persona personaC = new Persona();

        personaA.setNombre("Juan");
        personaA.setEdad(20);
        personaA.setEstatura(1.80);

        personaB.setNombre("Pedro");
        personaB.setEdad(30);
        personaB.setEstatura(1.65);

        personaC.setNombre("Maria");
        personaC.setEdad(25);
        personaC.setEstatura(1.70);

        System.out.println("Nombre: " + personaA.getNombre());
        System.out.println("Edad: " + personaA.getEdad());
        System.out.println("Estatura: " + personaA.getEstatura());

        System.out.println("Nombre: " + personaB.getNombre());
        System.out.println("Edad: " + personaB.getEdad());
        System.out.println("Estatura: " + personaB.getEstatura());

        System.out.println("Nombre: " + personaC.getNombre());
        System.out.println("Edad: " + personaC.getEdad());
        System.out.println("Estatura: " + personaC.getEstatura());
    }
}

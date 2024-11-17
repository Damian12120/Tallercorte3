import java.util.Scanner;

public class Encuesta {

    private Persona[] personas = new Persona[6];
    private int contador = 0;

    public void agregarPersona() {
        Scanner scanner = new Scanner(System.in);

        if (contador < personas.length) {

            Persona persona = new Persona();

            System.out.print("Ingresa el Nombre: ");
            persona.setNombre(scanner.nextLine());

            System.out.print("Ingresa la Cedula: ");
            persona.setCedula(scanner.nextLine());

            System.out.print("Ingresa la Fecha de Nacimiento: ");
            persona.setFechaNacimiento(scanner.nextLine());

            System.out.print("Ingresa el Correo: ");
            persona.setCorreo(scanner.nextLine());

            System.out.print("Ingresa la Ciudad de Residencia: ");
            persona.setCiudadResidencia(scanner.nextLine());

            System.out.print("Ingresa la Ciudad de Origen: ");
            persona.setCiudadOrigen(scanner.nextLine());

            for (int i = 0; i < 3; i++) {
                System.out.print("Ingresa el Titulo de la cancion favorita " + (i + 1) + ": ");
                String titulo = scanner.nextLine();
                System.out.print("Ingresa el Artista de la cancion favorita " + (i + 1) + ": ");
                String artista = scanner.nextLine();
                Cancion cancion = new Cancion(titulo, artista);
                persona.agregarCancion(cancion, i);
            }

            personas[contador++] = persona;
        } else {
            System.out.println("No se pueden agregar mas personas porque ya esta lleno.");
        }
    }

    public void mostrarInformacionPersona() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar la posicion de la persona: ");
        int posicion = scanner.nextInt();

        if (posicion >= 0 && posicion < contador) {
            personas[posicion].mostrarInformacion();
        } else {
            System.out.println("Posicion no valida ya que no existe o esta fuera de rango.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Encuesta encuesta = new Encuesta();
        int opcion;

        do {
            System.out.println("1. Agregar Persona");
            System.out.println("2. Mostrar Informacion de Persona");
            System.out.println("3. Salir");
            System.out.print("opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    encuesta.agregarPersona();
                    break;
                case 2:
                    encuesta.mostrarInformacionPersona();
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 3);
    }
}

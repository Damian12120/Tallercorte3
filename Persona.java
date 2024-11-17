public class Persona {
    private String nombre;
    private String cedula;
    private String fechaNacimiento;
    private String correo;
    private String ciudadResidencia;
    private String ciudadOrigen;
    private Cancion[] canciones;

    public Persona() {
        canciones = new Cancion[3];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void agregarCancion(Cancion cancion, int indice) {
        if (indice < canciones.length) {
            canciones[indice] = cancion;
        } else {
            System.out.println("Índice de canción inválido.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Correo: " + correo);
        System.out.println("Ciudad de Residencia: " + ciudadResidencia);
        System.out.println("Ciudad de Origen: " + ciudadOrigen);
        System.out.println("Canciones Favoritas:");
        for (int i = 0; i < 3; i++) {
            if (canciones[i] != null) {
                canciones[i].mostrarCancion();
            }
        }
    }
}

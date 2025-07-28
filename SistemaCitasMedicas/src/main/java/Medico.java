public class Medico {
    private String nombre;
    private String especialidad;

    public Medico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {

        if (this.nombre == null) {
            throw new IllegalStateException("El nombre no puede ser nulo");
        }
        return nombre;
    }

    

    public String getEspecialidad() {
         
        if (this.especialidad == null) {
            throw new IllegalStateException("La especialidad no puede ser nulo");
        }
        return especialidad;
    }

    @Override
    public String toString() {
        return nombre + " - " + especialidad;
    }
}
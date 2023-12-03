package modelo;

public class Estudiante {

    Curso curso;
    private String nombre;
    private String rut;
    private String email;

    public Estudiante(String nombre, String rut, String email) {
        this.nombre = nombre;
        this.rut = rut;
        this.email = email;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return this.rut;
    }


    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return this.email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Estudiante {" + "Nombre =" + nombre + ", Rut =" + rut + ", Email =" + email + '}';
    }




}

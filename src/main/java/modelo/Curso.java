package modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Estudiante> estudiantes;
    private String codCurso;


    public Curso(String codCurso) {

        this.codCurso = codCurso;
        estudiantes = new ArrayList<Estudiante>();

    }


    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


    public boolean agregarEstudiante(Estudiante estudiante) {
        if(!estudianteExiste(estudiante)){
            estudiantes.add(estudiante);
            return true;
        }
        return false;

    }


    public Estudiante buscarEstudiante(String rut) {
        for(Estudiante e : this.estudiantes){
            if(e.getRut().equals(rut)){
                System.out.println(e);
                return e;
            }
        }
        System.out.println("El estudiante con RUT: " +rut+ " no se encuentra en el sistema. ");
        return null;
    }

    public void mostrarEstudiantes(List<Estudiante> estudiantes) {
        for(Estudiante e : estudiantes){
            System.out.println(e.toString());
        }
    }


    public boolean eliminarEstudiante(String rut) {

        Estudiante estudiante = this.buscarEstudiante(rut);
        if(estudiante != null){
            this.estudiantes.remove(estudiante);
            return true;
        } else {
            return false;
        }
    }


    public boolean estudianteExiste(Estudiante estudiante) {
        for(Estudiante e : estudiantes){
            if(estudiante.getRut().equals(e.getRut())){
                return true;
            }

        }
        return false;
    }

    public String getCodCurso() {
        return this.codCurso;
    }


    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }
}

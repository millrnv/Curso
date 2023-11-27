package modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String codCurso;


    public String getCodCurso(){
        return this.codCurso;

    }

    public void setCodCurso(String codCurso){
        this.codCurso = codCurso;

    }

    private List<Estudiante> estudiantes;


    //Constructor
    public Curso(String codCurso){

        this.codCurso = codCurso;
        this.estudiantes = new ArrayList<>();


    }

    public boolean estudianteExiste(Estudiante estudiante){

        for(Estudiante e : estudiantes){
            if(estudiante.getRut().equals(e.getRut())){
                return true;
            }

        }
        return false;
    }


    public boolean agregarEstudiante(Estudiante estudiante){
        if(!estudianteExiste(estudiante)){
            this.estudiantes.add(estudiante);
            return true;

        }
        return false;

    }



    public boolean eliminarEstudiante(Estudiante estudiante){

        if(estudianteExiste(estudiante)){
            this.estudiantes.remove(estudiante);
            return true;
        }
        return false;
    }

    public void mostrarEstudiantes(List<Estudiante> estudiantes){

        for(Estudiante e : estudiantes){
            System.out.println(e.toString());
        }

    }

    public Estudiante buscarEstudiante(String nombre){

        for(Estudiante e : this.estudiantes){
            if(e.getNombre().equals(nombre)){
                return e;
            }
        }
        return null;
    }
}

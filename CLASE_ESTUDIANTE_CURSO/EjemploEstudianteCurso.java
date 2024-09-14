package CLASE_ESTUDIANTE_CURSO;

import java.util.ArrayList;
import java.util.List;

class Curso {
    private String nombreCurso;
    private String codigoCurso;
    private String instructor;

    public Curso(String nombreCurso, String codigoCurso, String instructor) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.instructor = instructor;
    }

    public void mostrarInfoCurso() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Código: " + codigoCurso);
        System.out.println("Instructor: " + instructor);
    }

}

class Estudiante {
    private String nombre;
    private String idEstudiante;
    private List<Curso> cursos = new ArrayList<>();

    public Estudiante(String nombre, String idEstudiante) {
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("ID: " + idEstudiante);
        System.out.println("Cursos:");
        for (Curso curso : cursos) {
            curso.mostrarInfoCurso();
        }
    }

    
}

public class EjemploEstudianteCurso {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Programación Orientada a Objetos", "POO101", "Prof. García");
        Curso curso2 = new Curso("Bases de Datos", "BD201", "Prof. López");
        Curso curso3 = new Curso("Estructura de Datos", "ED301", "Prof. Pérez");
        Curso curso4 = new Curso("Cálculo", "MAT101", "Prof. Ramírez");
        Curso curso5 = new Curso("Física", "FIS101", "Prof. Hernández");

        Estudiante estudiante1 = new Estudiante("Juan Pérez", "20231234");
        Estudiante estudiante2 = new Estudiante("María Gómez", "20235678");
        Estudiante estudiante3 = new Estudiante("Ana López", "20234567");

        estudiante1.agregarCurso(curso1);
        estudiante1.agregarCurso(curso2);
        estudiante1.agregarCurso(curso4);
        estudiante2.agregarCurso(curso2);
        estudiante2.agregarCurso(curso3);
        estudiante2.agregarCurso(curso5);
        estudiante3.agregarCurso(curso1);
        estudiante3.agregarCurso(curso3);
        estudiante3.agregarCurso(curso5);

        estudiante1.mostrarInformacion();
        System.out.println();
        estudiante2.mostrarInformacion();
        System.out.println();
        estudiante3.mostrarInformacion();
    }
}

package usuarios.medicos;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Medico extends Usuario {

    private String rfc;

    //constructor
    public Medico(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String rfc,String contrasenia ) {
        super(id, nombre, apellidos, fechaNacimiento, telefono, contrasenia, Rol.MEDICO);
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }


    public String mostrarMedico() {
        String datos = String.format("Id: %s, nombre: %s, apellidos: %s, fecha de nacimiento: %s, telefono: %s, rfc: %s",
                id,
                nombre,
                apellidos,
                fechaNacimiento,
                telefono,
                rfc);
        return datos;
    }
}



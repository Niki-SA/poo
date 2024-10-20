package usuarios.administrador;
import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Administrador extends Usuario{

    public double sueldo;
    public String rfc;
    public int añosTrabajados;


    public Administrador(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String contrasenia, double sueldo, String rfc, int añosTrabajados ) {


        super(id, nombre, apellidos, fechaNacimiento, telefono, contrasenia, Rol.ADMIN);
        this.sueldo = sueldo;
        this.rfc = rfc;
        this.añosTrabajados = añosTrabajados;

    }

    public double getSueldo() {
        return sueldo;
    }

    public String getRfc() {
        return rfc;
    }

    public int getAñosTrabajados() {
        return añosTrabajados;
    }

    public String mostrarDatos() {
        String datos = String.format("Id: %s, nombre: %s, apellidos: %s, fecha de nacimiento: %s, telefono: %s, rfc: %s, sueldo: %s, años Trabajados: %s",
                id,
                nombre,
                apellidos,
                fechaNacimiento,
                telefono,
                rfc,
                sueldo,
                añosTrabajados);
        return datos;
    }
}

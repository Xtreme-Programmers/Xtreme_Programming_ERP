package modelo;

import excepciones.MyException;
import java.util.HashSet;
import java.util.Objects;

public class MiembroEquipo {

    public static final String[] ROLES = {"Programador", "Tester", "Tracker", "Trainner", "Manager", "Cliente"};

    private String idMiembro;
    private String pass;
    private static HashSet<String> rolesMiembros = new HashSet<>();

    // Getters & Setters
    public String getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(String idMiembro) throws MyException {
        if (idMiembro == null) {
            throw new MyException("El id del miembro no puede ser nulo");
        }
        if (idMiembro.equals("")) {
            throw new MyException("El id del miembro no puede ser vacio");
        }
        this.idMiembro = idMiembro;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) throws MyException {
        if (pass == null) {
            throw new MyException("El password no puede ser nulo");
        }
        if (pass.equals("")) {
            throw new MyException("EL password no puede estar vacio");
        }
        this.pass = pass;
    }

    //Gestora
    public static boolean addRol(String rol) {
        return rolesMiembros.add(rol);
    }

    public static boolean removeRol(String rol) {
        return rolesMiembros.remove(rol);
    }

    /**
     *
     * @param entradaPorTeclado
     * @return False si no se puede añadir el rol
     * @throws Exception
     */
    public static boolean setRol(String entradaPorTeclado) throws Exception {
        String rol = buscarRolNombre(entradaPorTeclado);

        if (!rol.equals("")) {
            return rolesMiembros.add(entradaPorTeclado);
        }
        return false;
    }

    public static String buscarRolNombre(String nombre) {
        for (int i = 0; i < ROLES.length; i++) {
            if (ROLES[i].equalsIgnoreCase(nombre)) {
                return ROLES[i];
            }
        }
        return "";
    }

    public boolean eliminarRol(String codigo) {
        for (String s : ROLES) {
            if (s.equalsIgnoreCase(codigo)) {
                return rolesMiembros.remove(s);
            }
        }
        return false;
    }

    // Equals y HashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.idMiembro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MiembroEquipo other = (MiembroEquipo) obj;
        if (!Objects.equals(this.idMiembro, other.idMiembro)) {
            return false;
        }
        return true;
    }

}

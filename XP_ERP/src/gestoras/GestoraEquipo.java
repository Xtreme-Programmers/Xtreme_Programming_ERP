/*
 *Clase Gestora
 */
package gestoras;

import java.util.HashSet;
import java.util.Iterator;
import modelo.MiembroEquipo;

/**
 *
 * @author danie
 */
public class GestoraEquipo {

    private static HashSet<MiembroEquipo> listadoMiembros = new HashSet<>();

    public static boolean addMiembro(MiembroEquipo mE) {
        return listadoMiembros.add(mE);
    }

    /**
     *
     * @param codigo
     * @return True si se puede eliminar del listado de miembros
     */
    public static boolean borrarMiembroCodigo(String codigo) {
        Iterator it = listadoMiembros.iterator();
        while (it.hasNext()) {
            MiembroEquipo next = (MiembroEquipo) it.next();
            if (next.getIdMiembro().equalsIgnoreCase(codigo)) {
                return listadoMiembros.remove(next);
            }
        }
        return false;
    }

    public static boolean loguearMiembro(String nick, String password) {
        Iterator it = listadoMiembros.iterator();
        while (it.hasNext()) {
            MiembroEquipo next = (MiembroEquipo) it.next();
            if (next.getIdMiembro().equalsIgnoreCase(nick) && next.getPass().equals(password)) {
                return true;
            }
        }
        return false;
    }

}

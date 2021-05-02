package gestoras;

import excepciones.MyException;
import java.util.HashSet;
import modelo.Proyecto;

/*EQUIPO B*/
public class GestoraProyecto {
    
    private static HashSet<Proyecto> listaProyectos = new HashSet<>();
    
    public static void inicializa(){
        listaProyectos = new HashSet<>();
    }
    
    public static boolean addProyecto(Proyecto p) {
        return listaProyectos.add(p);
    }
    
    public static boolean borraProyecto(Proyecto p) {
        return listaProyectos.remove(p);
    }

    public static HashSet<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public static int getNumProyectos() {
        return listaProyectos.size();
    }

    public static Proyecto buscaProyecto(String idSt) throws MyException {
        int id;
        try {
            id = Integer.parseInt(idSt);
        } catch (NumberFormatException e) {
            throw new MyException("No se ha seleccionado ningún proyecto");
        }
        for (Proyecto p : listaProyectos) {
            if (p.getIdProyecto() == id) {
                return p;
            }
        }
        throw new MyException("No se ha encontrado ningún proyecto");
    }

    public static void eliminaProyecto(Proyecto p) throws MyException {
        if (!listaProyectos.remove(p)) {
            throw new MyException("No se ha encontrado ningún proyecto");
        }
    }
    
    
    
}

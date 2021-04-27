package gestoras;

import java.util.HashSet;
import modelo.Proyecto;

/*EQUIPO B*/
public class GestoraProyecto {
    
    private static HashSet<Proyecto> listaProyectos;
    
    public static void inicializa(){
        listaProyectos = new HashSet<>();
    }
    
    public static boolean addProyecto(Proyecto p) {
        return listaProyectos.add(p);
    }

    public static HashSet<Proyecto> getListaProyectos() {
        return listaProyectos;
    }
    
    
    
}

package modelo;
/*EQUIPO B*/
import excepciones.MyException;
import gestoras.GestoraProyecto;
import java.util.HashSet;

/**
 *
 * @author ryano
 */
public class Proyecto {
    private int idProyecto;
    private String nombreProyecto;
    private String descripcion;
    private HashSet<Story> listaStories;
    private final String[] ESTADOS = {"borrador", "enCurso", "archivado"};
    private String estadoProyecto;

    public Proyecto(String nombreProyecto, String descripción) throws MyException {
        this.idProyecto = GestoraProyecto.getNumProyectos();
        setNombreProyecto(nombreProyecto);
        setDescripcion(descripción);
        setEstadoProyecto("borrador");
    }
    
    public void aniadeStory(Story s) throws MyException {
        if (s != null) {
            if (!listaStories.add(s)) {
                throw new MyException("No se ha añadido la Story");
            }
        } else {
            throw new MyException("La Story es null");
        }
    }

    public void setNombreProyecto(String nombreProyecto) throws MyException {
        if (nombreProyecto == null || nombreProyecto.equals("")) {
            throw new MyException("El nombre está vacío");
        }
        this.nombreProyecto = nombreProyecto;
    }

    public void setDescripcion(String descripcion) throws MyException {
        if (descripcion == null || descripcion.equals("")) {
            throw new MyException("La descripción está vacía");
        }
        this.descripcion = descripcion;
    }

    public void setEstadoProyecto(String estadoProyecto) {
        this.estadoProyecto = estadoProyecto;
    }
    
}

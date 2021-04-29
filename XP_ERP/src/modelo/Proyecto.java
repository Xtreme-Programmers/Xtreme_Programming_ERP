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
    private final String[] ESTADOS = {"enCurso", "archivado"};
    private String estadoProyecto;

    public Proyecto(String nombreProyecto, String descripción) throws MyException {
        listaStories = new HashSet<>();
        this.idProyecto = GestoraProyecto.getNumProyectos();
        setNombreProyecto(nombreProyecto);
        setDescripcion(descripción);
        setEstadoProyecto("enCurso");
    }
    
    public void aniadeStory(Story s) throws MyException {
        if (s != null) {
            if (!listaStories.add(s)) {
                throw new MyException("La Story con ese nombre ya existe en el proyecto");
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

    public void setEstadoProyecto(String estadoProyecto) throws MyException {
        if (estadoProyecto == null || estadoProyecto.equals(null)) {
            throw new MyException("El estado de proyecto está vacío");
        } 
        boolean esValido = false;
        for (int i = 0; i < ESTADOS.length; i++) {
            if (estadoProyecto.equals(ESTADOS[i])) {
                esValido = true;
            }
        }
        if (!esValido) {
            throw new MyException("El estado de proyecto no es válido");
        }
        this.estadoProyecto = estadoProyecto;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstadoProyecto() {
        return estadoProyecto;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "idProyecto=" + idProyecto + ", nombreProyecto=" + nombreProyecto + ", descripcion=" + descripcion + ", listaStories=" + listaStories + ", ESTADOS=" + ESTADOS + ", estadoProyecto=" + estadoProyecto + '}';
    }
    
    
    
}

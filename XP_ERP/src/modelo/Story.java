package modelo;
import excepciones.MyException;
import java.util.Objects;
/*EQUIPO B*/
public class Story {

    private String titulo;
    private int idStory;
    private MiembroEquipo miembroA;
    private MiembroEquipo miembroB;
    private int horasEstimadas;
    private int horasFinales;
    private String contenido;
    
    public Story(String titulo, int horasEstimadas, String contenido) throws MyException {
        setTitulo(titulo);
        setHorasEstimadas(horasEstimadas);
        setContenido(contenido);
    }
    
    public Story(String titulo, String horasEstimadas, String contenido) throws MyException {
        setTitulo(titulo);
        setHorasEstimadas(horasEstimadas);
        setContenido(contenido);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws MyException {
        if (titulo == null || titulo.equals("")) {
            throw new MyException("El título no puedo quedar vacío");
        }
        this.titulo = titulo;
    }

    public int getIdStory() {
        return idStory;
    }

    public void setIdStory(int idStory) throws MyException {
        if (idStory < 0) {
            throw new MyException("El id del Story no puede ser negativo");
        }
        this.idStory = idStory;
    }

    public MiembroEquipo getMiembroA() {
        return miembroA;
    }

    public void setMiembroEquipo(MiembroEquipo miembroA, MiembroEquipo miembroB) {
        this.miembroA = miembroA;
        this.miembroB = miembroB;
    }

    public MiembroEquipo getMiembroB() {
        return miembroB;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(String horasEstimadas) throws MyException {
        if (horasEstimadas == null || horasEstimadas.equals("")) {
            throw new MyException("Las horas estimadas no contienen nada");
        }
        try {
            
        } catch (NumberFormatException e) {
            throw new MyException("Las horas estimadas contienen caracteres no válidos");
        }
    }
    
    public void setHorasEstimadas(int horasEstimadas) throws MyException {
        if (horasEstimadas < 0) {
            throw new MyException("Las horas estimadas no puede ser negativo");
        }
        this.horasEstimadas = horasEstimadas;
    }

    public int getHorasFinales() {
        return horasFinales;
    }

    public void setHorasFinales(int horasFinales) throws MyException {
        if (horasFinales < 0) {
            throw new MyException("Las horas finales no puede ser negativo");
        }
        this.horasFinales = horasFinales;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) throws MyException {
        if (contenido == null || contenido.equals("")) {
            throw new MyException("El contenido no puedo quedar vacío");
        }
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Story{" + "titulo=" + titulo + ", idStory=" + idStory + ", miembroA=" + miembroA + ", miembroB=" + miembroB + ", horasEstimadas=" + horasEstimadas + ", horasFinales=" + horasFinales + ", contenido=" + contenido + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.titulo);
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
        final Story other = (Story) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }


    
}

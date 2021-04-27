package modelo;

import excepciones.MyException;

/*EQUIPO B*/
public class Story {

    private String titulo;
    private int idStory;
    private MiembroEquipo miembroA;
    private MiembroEquipo miembroB;
    private int horasEstimadas;
    private int horasFinales;
    private String contenido;
    private Fecha fechaInicio;
    
    public Story(String titulo, int horasEstimadas, String contenido) throws MyException {
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

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idStory;
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
        if (this.idStory != other.idStory) {
            return false;
        }
        return true;
    }
    
}

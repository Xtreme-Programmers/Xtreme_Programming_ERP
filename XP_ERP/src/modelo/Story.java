package modelo;

/*EQUIPO B*/
public class Story {

    private String titulo;
    private int idStory;
    private MiembroEquipo miembroA;
    private MiembroEquipo miembroB;
    private int horasEstimadas;
    private int horasFinales;
    private String contenido;
    
    public Story(String titulo, int horasEstimadas, String contenido) {
        setTitulo(titulo);
        setHorasEstimadas(horasEstimadas);
        setContenido(contenido);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdStory() {
        return idStory;
    }

    public void setIdStory(int idStory) {
        this.idStory = idStory;
    }

    public MiembroEquipo getMiembroA() {
        return miembroA;
    }

    public void setMiembroA(MiembroEquipo miembroA, MiembroEquipo miembroB) {
        this.miembroA = miembroA;
    }

    public MiembroEquipo getMiembroB() {
        return miembroB;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public int getHorasFinales() {
        return horasFinales;
    }

    public void setHorasFinales(int horasFinales) {
        this.horasFinales = horasFinales;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
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

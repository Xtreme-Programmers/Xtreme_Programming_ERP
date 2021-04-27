package fecha;

import java.util.ArrayList;

/*Carina*/
public class Fecha implements Comparable {

    private final int dia;
    private final int mes;
    private final int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getMesLetras(int mes) {
        String resultado[] = {"mes incorrecto", "enero", "febrero", "Marzo",
            "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre",
            "noviembre", "diciembre"};
        if (mes <= 12 && mes > 0) {
            return resultado[mes];
        }
        return resultado[0];
    }

    private boolean esBisiesto() {
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            return true;
        }
        return false;
    }

    private int getDiasMes(int mes) {
        if (mes <= 12 && mes > 0) {
            int resultado[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (mes == 2 && esBisiesto()) {
                resultado[1] = 29;
            }
            return resultado[mes - 1];
        }
        return 0;
    }

    public boolean esCorrecta() {
        if (dia > getDiasMes(mes)
                || dia < 1
                || mes < 1
                || mes > 12
                || anio < 1900) {
            return false;
        }
        return true;
    }

    public String muestraFechaLarga() {
        if (esCorrecta()) {
            return dia + " de " + getMesLetras(mes) + " de " + anio;
        }
        return "Fecha incorrecta: \n" + "Dia: " + dia + "\n" + "Mes: " + mes
                + "\n" + "AÃ±o: " + anio;
    }

    public String muestraFechaCorta() {
        if (esCorrecta()) {
            return dia + " de " + mes + " de " + anio;
        }
        return "Fecha incorrecta: \n" + "Dia: " + dia + "\n" + "Mes: " + mes
                + "\n" + "AÃ±o: " + anio;
    }

    public String muestraFechaFormateada() {
        return anio + "" + mes + "" + dia;
    }

    public static void rellenarLista(ArrayList<Integer> listaNumeros) {
        int numeroAleatorio;
        for (int i = 0; i < 2000; i++) {
            numeroAleatorio = (int) (Math.random() * (1900 - 2019 + 1));
            listaNumeros.add(numeroAleatorio);
        }
    }

    @Override
    public int compareTo(Object t) {
        Fecha otraFecha = (Fecha) t;
        if (this.anio > otraFecha.anio) {
            return 1;
        } else if (this.anio < otraFecha.anio) {
            return -1;
        } else {
            if (this.mes > otraFecha.mes) {
                return 1;
            } else if (this.mes < otraFecha.mes) {
                return -1;
            } else {
                if (this.dia > otraFecha.dia) {
                    return 1;
                } else if (this.dia < otraFecha.dia) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.dia;
        hash = 29 * hash + this.mes;
        hash = 29 * hash + this.anio;
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
        final Fecha other = (Fecha) obj;
        if (this.dia != other.dia) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        return true;
    }
}

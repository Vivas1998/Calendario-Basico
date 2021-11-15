
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int ano;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        dia = 1;
        mes = 1;
        ano = 1;
    }
    
    // Devuelve fecha completa
    public String obtenerFecha() {
        String fechaActual;
        String diaActual = "";
        String mesActual = "";
        String anoActual = "";
        
        if (dia < 10) {
            diaActual = "0";
        }
        if (mes < 10) {
            mesActual = "0";
        }
        if (ano < 10) {
            anoActual = "0";
        }
        fechaActual = (diaActual + dia + "-" + mesActual + mes + "-" + anoActual + ano);
        return fechaActual;
    }
    
    // Cambiar Fecha
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno) {
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
    
    // Avanza la Fecha
    public void avanzarFecha() {
        if (dia < 30) {
            dia = dia + 1;
        }
        else {
            dia = 1;
            if (mes < 12) {
                mes = mes + 1;
                }
            else {
                mes = 1;
                if (ano < 2099){
                    ano = ano + 1;
                }
                else {
                    ano = 1;
                }
            }
        }
    }
}

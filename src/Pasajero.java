import java.text.SimpleDateFormat;
import java.util.Date;

public class Pasajero implements Frecuencia{
    
   private int millasAcumuladas;
    private Date fechaUltimoViaje;

    public Pasajero(int millasAcumuladas, Date fechaUltimoViaje) {
        this.millasAcumuladas = millasAcumuladas;
        this.fechaUltimoViaje = fechaUltimoViaje;
    }

    @Override
    public int millas() {
        return millasAcumuladas;
    }

    @Override
    public Date ultimoViaje() {
        return fechaUltimoViaje;
    }

    public Date getFechaUltimoViaje() {
        return fechaUltimoViaje;
    }

    public void getInformacion(){
        System.out.println("Millas acumuladas: " +millas());
        System.out.println("Ultimo viaje: " + formateoFecha(ultimoViaje()));
    }

    //Método para formatear la fecha
    public static String formateoFecha(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

}

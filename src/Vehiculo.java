import java.util.Date;


public class Vehiculo implements Frecuencia {

    private int millasAcumuladas;
    private Date fechaUltimoViaje;

    public Vehiculo(int millasAcumuladas, Date fechaUltimoViaje) {
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
        System.out.println("Ultimo viaje: " + Pasajero.formateoFecha(ultimoViaje()));
    }

}

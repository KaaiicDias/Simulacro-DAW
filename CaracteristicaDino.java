public class CaracteristicaDino implements IVolador, ICaracterizable{
    public String descripcion;
    public int edad;
    public String color;
    public double longitud;

    @Override
    public String agregarCaracteristicas() {
        return null;
    }

    @Override
    public String eliminarCaracteristicas(String descripcion) {
        return null;
    }

    @Override
    public String mostrarCaracteristicas() {
        return null;
    }

    @Override
    public void despegar() throws AlturaInsuficienteException {

    }

    @Override
    public double calcularAlturaMaxima(int velocidad, int tiempo) throws AlturaInsuficienteException {
        return 0;
    }

    @Override
    public double calcularDistanciaRecorrida(int velocidad, int tiempo) {
        return 0;
    }
}

public class Gato extends Animal{
    public String color_pelaje;
    public boolean caza_ratones;

    public Gato(String nombre, int edad, String tipo_alimentacion, boolean tiene_cola, String color_pelaje, boolean caza_ratones) {
        super(nombre, edad, tipo_alimentacion, tiene_cola);
        this.color_pelaje = color_pelaje;
        this.caza_ratones = caza_ratones;
    }

    @Override
    public void hacerSonido(ComportamientoSonido comportamientoSonido) {
        if (comportamientoSonido!=ComportamientoSonido.miau){
            System.out.println("El gato no hace sonidos");
        }else {
            System.out.println("Miau");
        }
    }

    @Override
    public void moverse(TipoMovimiento tipoMovimiento) {
        if (tipoMovimiento == TipoMovimiento.cazar_ratones && caza_ratones){
            System.out.println("Caza ratones");
        }else {
            System.out.println("No se mueve");
        }
    }
}

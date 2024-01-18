public class Perro extends Animal{
    public String raza;
    public boolean ladra;

    public Perro(String nombre, int edad, String tipo_alimentacion, boolean tiene_cola, String raza, boolean ladra) {
        super(nombre, edad, tipo_alimentacion, tiene_cola);
        this.raza = raza;
        this.ladra = ladra;
    }

    @Override
    public void hacerSonido(ComportamientoSonido comportamientoSonido) {
        if (comportamientoSonido != ComportamientoSonido.Ladra){
            System.out.println("Guau");
        }else {
            System.out.println("No ladra");
        }
    }

    @Override
    public void moverse(TipoMovimiento tipoMovimiento) {
        if (tipoMovimiento != TipoMovimiento.correr_jugar){
            System.out.println("No se mueve");
        }else {
            System.out.println("corre y juega");
        }
    }
}


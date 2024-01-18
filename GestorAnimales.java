public class GestorAnimales {
    public static void main(String[] args) {
        Gato g1 = new Gato("Hera", 2,"aaa",true,"marron",true);
        g1.hacerSonido(ComportamientoSonido.miau);
        g1.moverse(TipoMovimiento.cazar_ratones);

        Perro p1 = new Perro("Hera", 2,"aaa",true,"marron",true);
        p1.hacerSonido(ComportamientoSonido.Ladra);
        p1.moverse(TipoMovimiento.correr_jugar);
    }
}

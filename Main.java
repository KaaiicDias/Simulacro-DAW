public class MainDinosaurios {
    public static void main(String[] args) {
        Dino d = new Dino("Cachalote",60);
        CaracteristicaDino C1 = new CaracteristicaDino("aa", 2,"c1",10);
        d.agregarCaracteristicas(C1);
        d.mostrarCaracteristicas();
        d.eliminarCaracteristicas("desc");
        d.eliminarCaracteristicas("desc1");

        d.despegar();
        d.calcularAlturaMaxima(10,6);
        d.despegar();
        System.out.println(d.calcularDistanciaRecorrida(5,10));
    }
}

package EjercicioAuto;

public class Application {
    public static void main(String[] args) {
        int numCarriles = 4;
        int kilometros = 200;
        Juego juego = new Juego(numCarriles, kilometros, "pista Nazcar");
        Auto rojo= new Auto(Auto.Color.ROJO, "XX1");
        rojo.agregarConductor(new Conductor("C1", "Juan","Juan@gmail.com", "Juan01"));
        Auto azul= new Auto(Auto.Color.AZUL, "XX2");
        azul.agregarConductor(new Conductor("C2", "Jose","Jose@gmail.com", "Jose04"));
        Auto blanco= new Auto(Auto.Color.BLANCO, "XX3");
        blanco.agregarConductor(new Conductor("C3", "Anacleto","Anacleto@gmail.com", "Anacleto"));
        Auto negro= new Auto(Auto.Color.NEGRO, "XX3");
        negro.agregarConductor(new Conductor("C4", "Tulio","Tulio@gmail.com", "Tulio1"));

        juego.agregarAutoaCarril(1,rojo);
        juego.agregarAutoaCarril(2,azul);
        juego.agregarAutoaCarril(3,negro);
        juego.agregarAutoaCarril(4,blanco);

        Podium podium=juego.iniciarJuego();
        System.out.println(podium);

    }

}

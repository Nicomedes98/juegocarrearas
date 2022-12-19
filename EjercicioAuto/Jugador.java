package EjercicioAuto;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private final String idJugador;
    private String email;
    private List<Integer> puntos;
    private final String userName;

    public Jugador(String idJugador, String email, String userName) {
        this.idJugador = idJugador;
        this.email = email;
        this.puntos = new ArrayList<>();
        this.userName = userName;
    }
    public void setEmail(){
        this.email=email;
    }
    public void agregarPunto(Integer punto){
        this.puntos.add(punto);
    }
    public Integer puntos(){
        return puntos.stream().reduce(Integer::sum).orElseThrow();
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "idJugador='" + idJugador + '\'' +
                ", email='" + email + '\'' +
                ", puntos=" + puntos +
                ", userName='" + userName + '\'' +
                '}';
    }

}

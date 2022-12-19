package EjercicioAuto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carril {
    private final Integer numero;
    private final Integer kilometros;
    private static List<Auto> autos;


    public Carril(Integer numero,Integer kilometros) {
        this.kilometros = Objects.requireNonNull(kilometros);
        this.numero = Objects.requireNonNull(numero);
        this.autos = new ArrayList<>();
        if (kilometros <= 0) {
            throw new IllegalArgumentException("No es un kilometro permitido");
        }
    }
    public void agregarAuto(Auto auto){
        autos.add(auto);
    }
    public Integer kilometros(){
        return kilometros;
    }
    public Integer numero(){
        return numero;
    }
    public static List<Auto> autos(){
        return autos;
    }
    public double progresoAuto(String placa){
        for(Auto auto : this.autos) {
            if(auto.placa().equalsIgnoreCase(placa)){
                int metros = kilometros()*1000;
                return (100*auto.metros())/metros;
            }
        }
        throw new IllegalArgumentException("no existe el auto");
    }
}
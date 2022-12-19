package EjercicioAuto;


import java.util.Map;
import java.util.Set;

public class Pista {
    private final String id;
    private final Map<Integer, Carril> carriles;
    private String nombre;

    public Pista(String id, Map<Integer, Carril> carriles, String nombre) {
        this.id = id;
        this.carriles = carriles;
        this.nombre = nombre;
    }
    public void cambiarNombre(String nombre){
        this.nombre = nombre;
    }
    public String id(){
        return id;
    }
    public String nombre(){
        return nombre;
    }
    public Map<Integer, Carril> Carriles(){
        return carriles;
    }
    public void agregarAutoACarril(Integer numeroCarril, Auto auto){
         carriles.get(numeroCarril).agregarAuto(auto);
    }

}


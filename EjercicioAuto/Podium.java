package EjercicioAuto;

public class Podium {
    private Conductor primero;
    private Conductor segundo;
    private Conductor tercero;

    public void setPrimero(Conductor primero) {
        this.primero = primero;
    }

    public void setSegundo(Conductor segundo) {
        this.segundo = segundo;
    }

    public void setTercero(Conductor tercero) {
        this.tercero = tercero;
    }
    public Conductor primero(){
        return primero;
    }
    public Conductor segundo(){
        return segundo;
    }
    public Conductor tercero(){
        return tercero;
    }

    @Override
    public String toString() {
        return "Podium{" +
                "primero=" + primero +
                ", segundo=" + segundo +
                ", tercero=" + tercero +
                '}';
    }
}


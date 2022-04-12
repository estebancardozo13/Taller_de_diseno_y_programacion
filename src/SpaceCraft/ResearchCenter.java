package SpaceCraft;

public class ResearchCenter extends SpaceCraft implements SpaceResearch {

    private int peopleCapacity;
    private boolean activated;

    public ResearchCenter(String name, float weight, float height, String fuelType, float speed, float thrust, int peopleCapacity, boolean activated) {
        super(name, weight, height, fuelType, speed, thrust);
        this.peopleCapacity = peopleCapacity;
        this.activated = activated;
    }

    @Override
    public void takeOff() {
        if(peopleCapacity > 0) {
            System.out.println("Soltar Propulsor");
            System.out.println("Expulsar cubierta exterior");
            System.out.println("Encender Motores");
            System.out.println("Fijar ubicación objetiva");
        }else{
            System.out.println("La nave no puede despegar sin personal a bordo");
        }
    }

    @Override
    public void land() {
        System.out.println("Desplegar amortiguación");
        System.out.println("Disminución de velocidad");
        System.out.println("Control de aterrizaje");
        System.out.println("Desplegar tren de aterrizaje");
        System.out.println("Aterrizaje exitoso");
    }

    @Override
    public void research(SpaceCraft target) {
        System.out.println("Enviar naves de investigación a cuerpo celeste");
        System.out.println("Recibir reportes y enviarlos");
        report();
        System.out.println("Investigación completada");
    }

    @Override
    public void report() {
        System.out.println("Reportar novedades y descubrimientos de orbita");
    }

    @Override
    public void explore() {

    }
}

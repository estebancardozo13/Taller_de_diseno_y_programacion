package SpaceCraft;

public class Crewed extends SpaceCraft implements SpaceResearch {

    private int peopleCapacity;

    public Crewed(String name, float weight, float height, String fuelType, float speed, float thrust, int peopleCapacity) {
        super(name, weight, height, fuelType, speed, thrust);
        this.peopleCapacity = peopleCapacity;
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
        System.out.println("Desplegar astronautas en nave " + target.getName());
        System.out.println("Verificar condiciones de la nave de investigación");
        System.out.println("Informar novedades, inconvenientes y descubrimientos");
        report();
        System.out.println("Replegar astronautas");
        System.out.println("Investigación completada");
    }

    @Override
    public void report() {
        System.out.println("Enviar informes de descubrimiento");
        System.out.println("Esperar ordenes nuevas");
        System.out.println("Informar cualquier novedad imprevista");
        System.out.println("Reporte completado");
    }

    @Override
    public void explore() {
        System.out.println("Realizar viaje de exploración");
        System.out.println("Anotar novedades de investigación");
        System.out.println("Realizar reporte");
        report();
        System.out.println("Retornar a base");
        System.out.println("Exploración completada");
    }

}

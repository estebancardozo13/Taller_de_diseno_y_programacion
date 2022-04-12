package SpaceCraft;

import java.sql.SQLOutput;

public class Uncrewed extends SpaceCraft implements SpaceResearch {

    private boolean activated;

    public Uncrewed(String name, float weight, float height, String fuelType, float speed, float thrust, boolean activated) {
        super(name, weight, height, fuelType, speed, thrust);
        this.activated = activated;
    }

    @Override
    public void takeOff() {

        System.out.println("Soltar Propulsor");
        System.out.println("Expulsar cubierta exterior");
        System.out.println("Encender Motores");
        System.out.println("Despegue realizado con exito");

    }

    @Override
    public void land() {
        System.out.println("Desplegar bolsa de aire");
        System.out.println("Impacto conseguido con exito");
        System.out.println("Desinflar bolsa de aire");
        System.out.println("Desplegar piezar de anclaje");
        System.out.println("Aterrizaje exitoso");
    }


    @Override
    public void research(SpaceCraft target) {
        System.out.println("Acercamiento al objeto" + target.getName());
        System.out.println("Abstraer novedades y caracteristicas encontradas");
        System.out.println("Investigación completada");
        report();
    }

    @Override
    public void report() {

        System.out.println("Reportar novedades encontradas");
        System.out.println("Reportar estado y posición de la nave");

    }

    @Override
    public void explore() {
        System.out.println("Realizar viaje de exploración");
        System.out.println("Capturar muestras de exploración");
        report();
    }

    public void supply(SpaceCraft target){
        System.out.println("Cargar suministros para la nave" + target.getName());
        System.out.println("Realizar viaje hacia el objetivo");
        land();
        System.out.println("Entregar suministros a la nave" + target.getName());
        System.out.println("Suministros entregados correctamente");
    }

    public void clear(SpaceCraft target){
        System.out.println("Limpiar nave " + target.getName());
        System.out.println("Limpieza realizada correctamente");
    }
}

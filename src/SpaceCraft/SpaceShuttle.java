package SpaceCraft;

public class SpaceShuttle extends SpaceCraft {

    private float loadCapacity;

    public SpaceShuttle(String name, float weight, float height, String fuelType, float speed, float thrust, float loadCapacity) {
        super(name, weight, height, fuelType, speed, thrust);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void takeOff() {

        if (loadCapacity > 0) {
            System.out.println("Encender motores");
            System.out.println("Apertura de camara de combustion");
            System.out.println("Hacer combustion");
            System.out.println("Despegue realizado con exito");
        } else {
            System.out.println("Para realizar el despegue debe tener carga util");
        }
    }

    @Override
    public void land() {
        if(loadCapacity == 0){

            System.out.println("Cerrar puertas de carga");
            System.out.println("Activar SCR");
            System.out.println("Disminución de velocidad de descenso");
            System.out.println("Despliegue de tren de aterrizaje");
            System.out.println("Apertura de paracaidas");
            System.out.println("Aterrizaje Exitoso");
            System.out.println("Quema de combustible (Por seguridad)");
        }else {
            System.out.println("Para realizar maniobras de aterrizaje se debe soltar la carga que lleva");
        }

    }

    public void load(SpaceCraft targetLoad){
        if (targetLoad.getWeight() > loadCapacity){
        System.out.println("Anclar Carga a lanzadera espacial");
        loadCapacity -= targetLoad.getWeight();
        System.out.println("Carga util cargada correctamente");

        } else {
            System.out.println("Esta lanzadera no tiene la capacidad para cargar el objetivo");
        }

    }

    public void drop(){
        if(loadCapacity > 0 ) {
        loadCapacity = 0;
        System.out.println("Carga soltada exitosamente");

        } else {
            System.out.println("La lanzadera no se encuentra cargada");
        }


    }
}

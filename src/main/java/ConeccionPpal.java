import java.util.Random;

public class ConeccionPpal {

    public static void main(String[] args) throws InterruptedException{
        IConnection conection=null;
        ConcreteFactory concreteFactory=new ConcreteFactory();

        Random rnd=new Random();
        Integer var=0;

        for (;;){
            var= rnd.nextInt(4);
            Thread.sleep(5000);

            switch (var){
                case 0:
                    conection= concreteFactory.factoryConnection(TipoBD.MYSQL);
                    break;
                case 1:
                    conection= concreteFactory.factoryConnection(TipoBD.MONGODB);
                    break;
                case 2:
                    conection= concreteFactory.factoryConnection(TipoBD.ORACLE);
                    break;
                default:
                    System.out.println("No hay Conexion..."+ "\n");
                    break;
            }

            conection.crearConnection();


        }
    }

}

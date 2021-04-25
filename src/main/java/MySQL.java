public class MySQL implements IConnection {

    @Override
    public void crearConnection() {
        System.out.println("Creando Conexión con "+TipoBD.MYSQL);
    }
}

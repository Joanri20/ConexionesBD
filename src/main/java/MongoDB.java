public class MongoDB implements IConnection {
    @Override
    public void crearConnection() {
        System.out.println("Creando Conexión con "+TipoBD.MONGODB);
    }
}

public class ORACLE implements IConnection {
    @Override
    public void crearConnection() {
        System.out.println("Creando Conexión con "+TipoBD.ORACLE);
    }
}

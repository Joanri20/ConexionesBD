public class ConcreteFactory extends AbstracFactory{
    @Override
    public IConnection factoryConnection(TipoBD ConeccionBD) {
        IConnection result= null;

        switch (ConeccionBD){
            case MYSQL:
                result= new MySQL();
                break;

            case ORACLE:
                result= new ORACLE();
                break;

            case MONGODB:
                result= new MongoDB();
                break;
        }
        return result;
    }
}

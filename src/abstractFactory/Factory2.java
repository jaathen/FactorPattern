package abstractFactory;

/**
 * Created by ASUS on 2017/5/31.
 */
public class Factory2 implements abstractFactory{
    @Override
    public productionA getProductionA() {
        return new ProductionA2();
    }

    @Override
    public productionB getProductionB() {
        return new ProductionB2();
    }
}

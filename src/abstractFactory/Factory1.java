package abstractFactory;

/**
 * Created by ASUS on 2017/5/31.
 */
public class Factory1 implements abstractFactory {
    @Override
    public productionA getProductionA() {
        return new ProductionA1();
    }

    @Override
    public productionB getProductionB() {
        return new ProductionB1();
    }
}

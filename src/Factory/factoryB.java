package Factory;

/**
 * Created by ASUS on 2017/5/31.
 */
public class factoryB implements abstractFactory{
    @Override
    public abstractProduction getProduction() {
        return new productionB();
    }
}

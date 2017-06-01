package simpleFactory;

/**
 * Created by ASUS on 2017/5/31.
 */
public class Factory {
    public static abstractProduction getProduction(String name){
        switch (name){
            case "A": return new productionA();
            case "B": return new productionB();
            default: return null;
        }
    }
    public static void main(String[] args) {
        Factory.getProduction("A").fun();
    }
}

package fruit;

import com.codegym.Edible;

public class Orange extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}

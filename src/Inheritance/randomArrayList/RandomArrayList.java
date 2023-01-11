package Inheritance.randomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    public Object getRandomElement() {
        Random random = new Random();

        return this.remove(random.nextInt(this.size()));
    }

}

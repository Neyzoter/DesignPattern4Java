package cn.neyzoter.designpattern.factory;

/**
 * 工厂模式<br/>
 * 第一步，我们需要选取合适的工厂，<br/>
 * 然后第二步基本上和简单工厂一样。<br/>
 * 不同的工厂生产出来的完全不一样
 * @author Charles Song
 * @date 2020-6-12
 */
public class Factory {
    public static void main (String[] args) {
        // 创建工厂
        FoodFactoryIf factory = new ChineseFoodFactory();
        Food food = factory.makeFood("ChineseFoodA", 100);
        System.out.println(food.getClass().toString());
    }
}

interface FoodFactoryIf {
    Food makeFood(String name, int w);
}

class AmericanFoodFactory implements FoodFactoryIf {
    public Food makeFood (String name, int w) {
        if (name.equals("AmericanFoodA")) {
            return new AmericanFoodA(w);
        } else if (name.equals("AmericanFoodB")) {
            return new AmericanFoodB(w);
        }
        return null;
    }
}

class ChineseFoodFactory implements FoodFactoryIf {
    public Food makeFood (String name, int w) {
        if (name.equals("ChineseFoodA")) {
            return new ChineseFoodA(w);
        } else if (name.equals("ChineseFoodB")) {
            return new ChineseFoodB(w);
        }
        return null;
    }
}

class AmericanFoodA extends Food {
    public AmericanFoodA (int w) {
        weight = w;
    }
}

class AmericanFoodB extends Food {
    public AmericanFoodB (int w) {
        weight = w;
    }
}

class ChineseFoodA extends Food {
    public ChineseFoodA (int w) {
        weight = w;
    }
}

class ChineseFoodB extends Food {
    public ChineseFoodB (int w) {
        weight = w;
    }
}
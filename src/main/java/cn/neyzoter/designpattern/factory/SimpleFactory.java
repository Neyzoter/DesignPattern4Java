package cn.neyzoter.designpattern.factory;

/**
 * 简单工厂模式<br/>
 * 简单工厂模式通常就是这样，<br/>
 * 一个工厂类 XxxFactory，里面有一个静态方法，<br/>
 * 根据我们不同的参数，返回不同的派生自同一个父类<br/>
 * （或实现同一接口）的实例对象。
 * @author Charles Song
 * @date 2020-6-12
 */
public class SimpleFactory {
    public static void main (String[] args) {
        Food food = FoodFactory.makeFood("Egg", 10);
        System.out.println("Egg's weight is " + food.weight);
    }
}

class FoodFactory {
    public static Food makeFood (String name, int w) {
        if (name.equals("Egg")) {
            return new Egg(w);
        } else if (name.equals("Chicken")) {
            return new Chicken(w);
        } else {
            return null;
        }
    }
}

class Food {
    int weight;
}

class Egg extends Food {
    public Egg (int w) {
        weight = w;
    }
}

class Chicken extends Food {
    public Chicken (int w) {
        weight = w;
    }
}
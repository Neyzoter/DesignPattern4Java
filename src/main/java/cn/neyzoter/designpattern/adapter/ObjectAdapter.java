package cn.neyzoter.designpattern.adapter;

/**
 * 类适配器模式
 * @author Charles Song
 * @date 2020-5-22
 */
public class ObjectAdapter implements Pig{
    Cat cat = new Cat();
    public static void main (String[] args) {
        ClassAdapter adapter = new ClassAdapter();
        adapter.run();
        adapter.eat();
        adapter.sleep();
    }
    public void run () {
        cat.run();
    }
    public void eat () {
        cat.eat();
    }
    public void sleep () {
        System.out.println("I am sleeping");
    }
}

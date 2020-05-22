package cn.neyzoter.designpattern.adapter;

/**
 * 类适配器模式
 * @author Charles Song
 * @date 2020-5-22
 */
public class ClassAdapter extends Cat implements Pig {
    public static void main (String[] args) {
        ClassAdapter adapter = new ClassAdapter();
        adapter.run();
        adapter.eat();
        adapter.sleep();
    }
    @Override
    public void run () {
        super.run();
    }
    @Override
    public void eat () {
        super.eat();
    }
    public void sleep () {
        System.out.println("I am sleeping");
    }
}


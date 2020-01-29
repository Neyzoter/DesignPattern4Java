package cn.neyzoter.designpattern.singleton;

/**
 * 嵌套单例模式
 * @author Neyzoter
 * @date 2020-1-29
 */
public class NestedSingletonPattern {
    public NestedSingletonPattern (){}

    /**
     * 嵌套一个Holder类，用于管理单例
     * 嵌套类可以访问外部类的静态属性和静态方法
     */
    private static class Holder {
        private static NestedSingletonPattern instance = new NestedSingletonPattern();
    }

    /**
     * 获取单例
     * @return
     */
    public NestedSingletonPattern getInstance () {
        return Holder.instance;
    }
}

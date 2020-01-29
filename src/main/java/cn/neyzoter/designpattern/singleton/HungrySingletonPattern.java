package cn.neyzoter.designpattern.singleton;


/**
 * 饿汉单例模式
 * Singleton Pattern
 * @author Neyzoter Song
 * @date 2020-1-29
 */
public class HungrySingletonPattern {
    public HungrySingletonPattern() {}

    /**
     * 单例
     */
    private static HungrySingletonPattern instance = new HungrySingletonPattern();

    /**
     * 获取单例
     * @return
     */
    public HungrySingletonPattern getInstance() {
        return instance;
    }
}

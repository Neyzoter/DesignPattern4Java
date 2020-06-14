package cn.neyzoter.designpattern.singleton;

/**
 * 饱汉单例模式
 * Full Singleton Pattern
 * @author Neyzoter Song
 * @date 2020-1-29
 */
public class FullSingletonPattern {
    public static FullSingletonPattern fullSingletonPattern;

    public FullSingletonPattern () {

    }

    /**
     * 获取单例，此处需要使用synchronized，保证多线程安全性
     * @return
     */
    public static synchronized FullSingletonPattern getInstance () {
        if (fullSingletonPattern == null) {
            fullSingletonPattern = new FullSingletonPattern();
        }
        return fullSingletonPattern;
    }
}

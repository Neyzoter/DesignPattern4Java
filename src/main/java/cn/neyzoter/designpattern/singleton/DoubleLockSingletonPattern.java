package cn.neyzoter.designpattern.singleton;

/**
 * 双重锁模式，是对饱汉模式的改进
 * @author Charles Song
 * @date 2020-6-14
 */
public class DoubleLockSingletonPattern {
    public static DoubleLockSingletonPattern doubleLockSingletonPattern;

    public DoubleLockSingletonPattern () {

    }

    /**
     * 获取单例，对饱汉模式的getInstance改进<br/>
     * 防止每次获取单例都要锁住class
     * @return
     */
    public static DoubleLockSingletonPattern getInstance () {
        if (doubleLockSingletonPattern == null) {
            synchronized (DoubleLockSingletonPattern.class) {
                if (doubleLockSingletonPattern == null) {
                    doubleLockSingletonPattern = new DoubleLockSingletonPattern();
                }
            }
        }
        return doubleLockSingletonPattern;
    }
}

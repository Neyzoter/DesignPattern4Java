package cn.neyzoter.designpattern.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 单例模式测试
 * Test Singleton Pattern
 * @author Neyzoter Song
 * @date 2020-1-29
 */
public class SingletonPatternTest {
    public HungrySingletonPattern hungrySingletonPattern1 = new HungrySingletonPattern();
    public HungrySingletonPattern hungrySingletonPattern2 = new HungrySingletonPattern();
    @Test
    public void testSingleton () {
        assertEquals(hungrySingletonPattern1.getInstance(),hungrySingletonPattern2.getInstance());
    }
}

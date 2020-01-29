package cn.neyzoter.designpattern.singleton;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * 测试运行实体
 * @author Neyzoter Song
 * @date 2020-1-29
 */
public class SingletonTestRunner {
    public static void main(String[] args) {
        // 运行上述测试类的测试案例
        Result result = JUnitCore.runClasses(SingletonPatternTest.class);
        for (Failure failure : result.getFailures()) {  //查看测试案例结果
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

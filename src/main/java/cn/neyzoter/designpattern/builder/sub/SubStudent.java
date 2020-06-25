package cn.neyzoter.designpattern.builder.sub;

import cn.neyzoter.designpattern.builder.Student;

/**
 * 测试package-private是否可以被继承
 * @author Charles Song
 * @date 2020-6-25
 */
public class SubStudent { //extends Student {
    public SubStudent (int s, int a) {
//        super(s, a);
//        /**
//         * 请先将age() score() build()设置为package-private<br/>
//         * 子包也不可以访问 package-private
//         */
//        Student st = Student.builder().age(10).score(90).build();
    }
}

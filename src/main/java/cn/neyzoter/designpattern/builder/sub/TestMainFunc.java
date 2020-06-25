package cn.neyzoter.designpattern.builder.sub;

import cn.neyzoter.designpattern.builder.Student;

/**
 * 用于测试package-private
 * @author Charles Song
 * @date 2020-6-25
 */
public class TestMainFunc {
    public static void main (String[] args) {
        /**
         * 请先将age() score() build()设置为package-private<br/>
         * 就算是子包也不可以访问
         */
        Student student = Student.builder().age(10).score(90).build();
    }
}


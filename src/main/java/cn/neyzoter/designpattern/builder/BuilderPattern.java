package cn.neyzoter.designpattern.builder;

import lombok.ToString;


/**
 * 建造者模式
 * @author Charles Song
 * @date 2020-6-25
 */
public class BuilderPattern {
    public static void main (String[] args) {
        Student student1 = Student.builder().age(10).score(90).build();
        Student student2 = Student.builder().build();
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}





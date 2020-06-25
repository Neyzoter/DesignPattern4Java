package cn.neyzoter.designpattern.builder;

import lombok.ToString;

@ToString
public class Student {
    int score;
    int age;
    /**
     * 需要设计成private，防止被外部调用
     * @param s score
     * @param a age
     */
    private Student (int s, int a) {
        score = s;
        age = a;
    }
    public static StudentBuilder builder () {
        return new StudentBuilder();
    }
    public static class StudentBuilder {
        /**
         * 分数，这里不是static，因为static会保存上次设置的数值
         */
        private int score;
        private int age;
        public StudentBuilder score (int s) {
            score = s;
            return this;
        }
        public StudentBuilder age (int a) {
            age = a;
            return this;
        }
        public Student build () {
            if (score < 0) {
                throw new RuntimeException("分数不合法");
            }
            if (age < 0 || age > 100) {
                throw new RuntimeException("年龄不合法");
            }
            return new Student(score, age);
        }
    }
}

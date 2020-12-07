package com.wangyichao.algorithms.bean;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Student implements Comparable<Student> {

    private String name;
    private int score;

    @Override
    public int compareTo(Student student) {
        return this.score - student.score;
    }

}

package com.kpi.fict.vh;

import java.util.ArrayList;
import java.util.List;

public class DefaultObject {
    private final List<Integer> numbers = new ArrayList<>();

    public DefaultObject(List<Integer> numbers){
        this.numbers.addAll(numbers);
    }

    public void addNumber(Integer integer){
        numbers.add(integer);
    }

    public List<Integer> getNumbers(){
        return numbers;
    }
}
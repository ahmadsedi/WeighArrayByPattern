package com.ahmadsedi.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 24/02/2025
 * Time: 14:58
 */

public class EvaluationAccumulator {
    private Integer value = 0;
    private List<Character> accumulated = new ArrayList<>();

    public void addValueAndReset(){
        this.value += 1;
        accumulated = new ArrayList<>();
    }

    public void setValue(Integer value){
        this.value = value;
    }

    public void accumulate(Character character){
        accumulated.add(character);
    }

    public boolean contains(Character ch) {
        return accumulated.contains(ch);
    }

    public boolean containsAll(List<Character> ruleCharList) {
        return accumulated.containsAll(ruleCharList);
    }

    public Integer getValue() {
        return value;
    }

    public List<Character> getAccumulated() {
        return accumulated;
    }
}

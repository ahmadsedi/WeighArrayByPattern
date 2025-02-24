package com.ahmadsedi.array;

import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 24/02/2025
 * Time: 14:57
 */

public class EvaluationCollector implements Collector<Character, EvaluationAccumulator, Integer> {
    private final List<Character> ruleCharList;

    public EvaluationCollector(List<Character> ruleCharList) {
        this.ruleCharList = ruleCharList;
    }

    @Override
    public Supplier<EvaluationAccumulator> supplier() {
        return EvaluationAccumulator::new;
    }

    @Override
    public BiConsumer<EvaluationAccumulator, Character> accumulator() {
        return this::consume;
    }

    private void consume(EvaluationAccumulator accumulator, Character ch){
        if(ruleCharList.contains(ch)&&!accumulator.contains(ch)) {
            accumulator.accumulate(ch);
        }
        if(accumulator.containsAll(ruleCharList)){
            accumulator.addValueAndReset();
        }
    }

    @Override
    public BinaryOperator<EvaluationAccumulator> combiner() {
        return (accumulator1, accumulator2)->{
            EvaluationAccumulator result = new EvaluationAccumulator();
            result.setValue(accumulator1.getValue()+accumulator2.getValue());
            accumulator1.getAccumulated().forEach(result::accumulate);
            accumulator2.getAccumulated().forEach(result::accumulate);
            return result;
        };
    }

    @Override
    public Function<EvaluationAccumulator, Integer> finisher() {
        return EvaluationAccumulator::getValue;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.CONCURRENT, Characteristics.UNORDERED);
    }
}

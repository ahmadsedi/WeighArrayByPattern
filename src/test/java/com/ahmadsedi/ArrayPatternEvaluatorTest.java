package com.ahmadsedi;

import com.ahmadsedi.array.ArrayPatternEvaluator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 24/02/2025
 * Time: 15:22
 */

public class ArrayPatternEvaluatorTest {

    @Test
    void evaluate_givenOneMatch_returnSingleValue(){
        char[] input = {'A', 'D', 'C', 'B', 'M'};
        char[] ruleChars = {'A', 'B', 'C'};
        int result = ArrayPatternEvaluator.evaluate(input, ruleChars);
        Assertions.assertEquals(1, result);
    }

    @Test
    void evaluate_givenTwoMatch_returnDoubleValue(){
        char[] input = {'A', 'D', 'C', 'B', 'M', 'A', 'C', 'B'};
        char[] ruleChars = {'A', 'B', 'C'};
        int result = ArrayPatternEvaluator.evaluate(input, ruleChars);
        Assertions.assertEquals(2, result);
    }

    @Test
    void evaluate_givenNoMatch_returnZeroValue(){
        char[] input = {'A', 'D', 'C', 'W', 'M', 'A', 'Q', 'P'};
        char[] ruleChars = {'A', 'B', 'C'};
        int result = ArrayPatternEvaluator.evaluate(input, ruleChars);
        Assertions.assertEquals(0, result);
    }

    @Test
    void evaluate_givenEmptyArray_returnZeroValue(){
        char[] input = {};
        char[] ruleChars = {'A', 'B', 'C'};
        int result = ArrayPatternEvaluator.evaluate(input, ruleChars);
        Assertions.assertEquals(0, result);
    }
}

package com.ahmadsedi.array;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 24/02/2025
 * Time: 13:08
 */

public class ArrayPatternEvaluator {

    public static int evaluate(char[] array, char[] rulePattern){
        List<Character> ruleCharList = new String(rulePattern).chars().mapToObj(c-> (char) c).collect(Collectors.toList());
        return new String(array).chars().mapToObj(ch-> (char) ch).collect(new EvaluationCollector(ruleCharList));
    }

}

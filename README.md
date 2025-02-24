# Weigh Array Based on a Given Rule
~~~ 
Given the following method:
public static int evaluate(char[] array, char[] ruleChars){
...
}
~~~ 
Implement its body in a way that it returns the repeat number of character combination of ruleChars in array.

## Test Cases
### Scenario 1
~~~ 
char[] input = {'A', 'D', 'C', 'B', 'M'};
char[] ruleChars = {'A', 'B', 'C'};
~~~ 
it must return 1 since 'ABC' only apears one time in array

### Scenario 2
~~~ 
char[] input = {'A', 'D', 'C', 'B', 'M', 'A', 'C', 'B'};
char[] ruleChars = {'A', 'B', 'C'};
~~~ 
it must return 2 since 'ABC' appears two times

### Scenario 3
~~~ 
char[] input = {'A', 'D', 'C', 'W', 'M', 'A', 'Q', 'P'};
char[] ruleChars = {'A', 'B', 'C'};
~~~ 
        
it must return 0 since 'ABC' appears no time!

### Scenario 4
~~~ 
char[] input = {};
char[] ruleChars = {'A', 'B', 'C'};
~~~ 
        
it must return 0 since 'ABC' appears no time!

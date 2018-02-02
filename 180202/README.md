# Algorithms

### ArrayMaxConsecutiveSum
```java
/**
 * Description
 * Given array of integers, find the maximal possible sum of some of its k consecutive elements.
 */
int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int result = 0;
    int sum = 0;

    for(int i=0; i<inputArray.length-k+1; i++) {
        for(int j=0; j<k; j++) {
            sum += inputArray[i+j];
        }

        if(result < sum) {
            result = sum;
        }

        sum = 0;
    }

    return result;
}
```


### DifferentSymbolsNaive
```java
/**
 * Description
 * Given a string, find the number of different characters in it.
 */
int differentSymbolsNaive(String s) {
    char[] chars = s.toCharArray();
    int length = chars.length;
    int equalCount = 0;

    for(int i=0; i<length; i++) { 
        char c = chars[i]; // set the standard
        for(int j=i+1; j<length; j++) {
            // if same >>> count and after this process extract them
            if(c==chars[j]) {
                equalCount++;
                break;
            }
        }
    }

    return length - equalCount;
}
```


### Extract each Xth
```java
/**
 * Description
 * Given array of integers, remove each kth element from it.
 */
int[] extractEachKth(int[] inputArray, int k) {
    int extract = inputArray.length / k;
    int[] newArray = new int[inputArray.length - extract];

    int point = 0;
    
    for(int i=0; i<extract+1; i++) {
        for(int j=point; j<inputArray.length; j++) {
            if(j==((i+1)*k)-1) {
                // restarting index for jumping to there
                point = j+1;
                break;
            }
            // j(InputArray index) - i(number of extracted elements) = NewArray index
            newArray[j-i] = inputArray[j];
        }
    }

    return newArray;
}
```

### FirstDigit
```java
/**
 * Description
 * Find the leftmost digit that occurs in a given string.
 */
char firstDigit(String inputString) {
    // char has its integer ...
    // 0 ~ 9 ; 48 ~ 58
    for(int i=0; i<inputString.length(); i++) {
        if( inputString.charAt(i) >= 48 && inputString.charAt(i) <= 57 ) {
            return inputString.charAt(i);
        }
    }
    return ' ';
}
```

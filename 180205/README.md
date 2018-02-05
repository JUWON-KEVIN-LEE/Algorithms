# Algorithms

### GrowingPlants
```java
/**
 * description
 * Each day a plant is growing by upSpeed meters.
 * Each night that plant's height decreases by downSpeed meters due to the lack of sun heat.
 * Initially, plant is 0 meters tall. We plant the seed at the beginning of a day. We want to know when the height of the plant will reach a certain level.
 */
int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
    int height = 0;
    int days = 0;
    
    while(height <= desiredHeight) {
        height += upSpeed;
        days++;
        if(height >= desiredHeight)
            break;
        height -= downSpeed;
    }
    
    return days;
}
```


### KnapsackLight
```java
/**
 * description
 * 보물 상자를 찾았고 두 개의 아이템이 들어있다. 하지만 당신은 maxW 만큼만 가져갈 수 있다.
 * weight1 에 해당하는 아이템은 value1 의 가치를 가졌고, weight2 는 value2 에 해당하는 가치를 가지고 있다.
 * maxW 내에서 최대한 value 를 구해라.
 */
int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
    if(maxW >= weight1+weight2) {
        return value1+value2;
    } else if(maxW < weight1 && maxW < weight2) {
        return 0;
    } else {
        if(maxW >= weight1 && maxW >= weight2) 
            return (value1 >= value2) ? value1:value2;
        else
            return (maxW >= weight1) ? value1:value2;
    }
}
```


### LongestDigitsPrefix
```java
/**
 * description
 * Given a string, output its longest prefix which contains only digits.
 * [ Example ]
 * For inputString="123aa1", the output should be
 * longestDigitsPrefix(inputString) = "123".
 */
String longestDigitsPrefix(String inputString) {
    String prefix = inputString.split(" ")[0];
    String result = "";

    for(int i=0; i<prefix.length(); i++) {
        char c = prefix.charAt(i);
        if(c >= 48 && c <= 57) {
            result += c;
        } else {
            break;
        }
    }

    return result;
}
```
```kotlin
/**
 * kotlin
 */
fun longestDigitsPrefix(inputString : String) : String {
    return inputString.takeWhile { it.isDigit() }
}
```

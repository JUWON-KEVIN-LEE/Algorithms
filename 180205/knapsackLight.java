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
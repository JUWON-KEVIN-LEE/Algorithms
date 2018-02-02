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
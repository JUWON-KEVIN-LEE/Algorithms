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
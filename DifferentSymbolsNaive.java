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
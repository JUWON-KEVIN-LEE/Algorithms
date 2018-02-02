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
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

/**
 * kotlin
 */
fun longestDigitsPrefix(inputString : String) : String {
    return inputString.takeWhile { it.isDigit() }
}
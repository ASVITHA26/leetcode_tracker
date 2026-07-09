// Last updated: 09/07/2026, 18:21:18
import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int j = i;
            int lineLength = 0;
            while (j < words.length &&
                   lineLength + words[j].length() + (j - i) <= maxWidth) {
                lineLength += words[j].length();
                j++;
            }
            int numWords = j - i;
            int spacesNeeded = maxWidth - lineLength;
            StringBuilder line = new StringBuilder();
            if (j == words.length || numWords == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        line.append(" ");
                        spacesNeeded--;
                    }
                }
                while (spacesNeeded-- > 0) {
                    line.append(" ");
                }
            } else {
                int gaps = numWords - 1;
                int spacePerGap = spacesNeeded / gaps;
                int extraSpaces = spacesNeeded % gaps;
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        int spaces = spacePerGap;
                        if (extraSpaces > 0) {
                            spaces++;
                            extraSpaces--;
                        }
                        while (spaces-- > 0) {
                            line.append(" ");
                        }
                    }
                }
            }
            result.add(line.toString());
            i = j;
        }
        return result;
    }
}
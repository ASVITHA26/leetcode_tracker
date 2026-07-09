// Last updated: 09/07/2026, 18:11:59
1import java.util.*;
2
3class Solution {
4    public List<String> fullJustify(String[] words, int maxWidth) {
5        List<String> result = new ArrayList<>();
6        int i = 0;
7        while (i < words.length) {
8            int j = i;
9            int lineLength = 0;
10            while (j < words.length &&
11                   lineLength + words[j].length() + (j - i) <= maxWidth) {
12                lineLength += words[j].length();
13                j++;
14            }
15            int numWords = j - i;
16            int spacesNeeded = maxWidth - lineLength;
17            StringBuilder line = new StringBuilder();
18            if (j == words.length || numWords == 1) {
19                for (int k = i; k < j; k++) {
20                    line.append(words[k]);
21                    if (k < j - 1) {
22                        line.append(" ");
23                        spacesNeeded--;
24                    }
25                }
26                while (spacesNeeded-- > 0) {
27                    line.append(" ");
28                }
29            } else {
30                int gaps = numWords - 1;
31                int spacePerGap = spacesNeeded / gaps;
32                int extraSpaces = spacesNeeded % gaps;
33                for (int k = i; k < j; k++) {
34                    line.append(words[k]);
35                    if (k < j - 1) {
36                        int spaces = spacePerGap;
37                        if (extraSpaces > 0) {
38                            spaces++;
39                            extraSpaces--;
40                        }
41                        while (spaces-- > 0) {
42                            line.append(" ");
43                        }
44                    }
45                }
46            }
47            result.add(line.toString());
48            i = j;
49        }
50        return result;
51    }
52}
class Solution {
    public int minDistance(String word1, String word2) {
        return minDistanceRecur(word1, word2, word1.length(), word2.length());
    }

    int minDistanceRecur(
        String word1,
        String word2,
        int word1Index,
        int word2Index
    ) {
        if (word1Index == 0) {
            return word2Index;
        }
        if (word2Index == 0) {
            return word1Index;
        }
        if (word1.charAt(word1Index - 1) == word2.charAt(word2Index - 1)) {
            return minDistanceRecur(
                word1,
                word2,
                word1Index - 1,
                word2Index - 1
            );
        } else {
            int insertOperation = minDistanceRecur(
                word1,
                word2,
                word1Index, //word1 mein add hua so uski length same rahegi
                word2Index - 1
            );
            int deleteOperation = minDistanceRecur(
                word1,
                word2,
                word1Index - 1, //word1 se delete kiya so uski length kum hogi
                word2Index
            );
            int replaceOperation = minDistanceRecur(
                word1,
                word2,
                word1Index - 1, //same jaise
                word2Index - 1
            );
            return (
                Math.min(
                    insertOperation,
                    Math.min(deleteOperation, replaceOperation)
                ) +
                1
            );
        }
    }
}

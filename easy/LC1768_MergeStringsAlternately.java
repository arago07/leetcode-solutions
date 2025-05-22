package easy;

class LC1768_MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        String answer = "";
        for (int i = 0 ; i < Math.min(word1.length(), word2.length()) ; i++) {
            answer += word1.charAt(i);
            answer += word2.charAt(i);
        }
        if (word1.length() < word2.length()) {
            answer += word2.substring(word1.length(), word2.length());
        } else if (word1.length() > word2.length()) {
            answer += word1.substring(word2.length(), word1.length());
        }
        return answer;
    }

}
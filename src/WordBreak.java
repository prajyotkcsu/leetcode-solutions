import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static void main(String args[]){
        List<String> words= Arrays.asList("leet","code");
        String word="leetcode";
        boolean output=wordbreak(0,word,Set.copyOf(words));
        System.out.println(output);
    }
    static boolean wordbreak(int start, String word, Set<String> words){
        if(start==word.length()){
            return true;
        }
        for(int end=start+1;end<=word.length();end++){
            if(words.contains(word.substring(start,end)) && wordbreak(end,word,words)){
                return true;
            };
        }
        return false;
    }
}

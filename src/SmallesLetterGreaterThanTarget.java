input={'a','b','f','g'}
target='c'

filter the array for elements greater than the target letter(ascii) 
put these filtered letters into a sorted sorted array
return first element in that array

  class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char[] filtered=new String(letters).chars().filter(ch-> ch>target).sorted().toArray();
    if(filtered.length>0){
        return filtered[0];
    }
    }
}

class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercase_count = 0;
        for(int i = 0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
                uppercase_count++;

        }
        if(uppercase_count == word.length())
            return true;
        else if(uppercase_count == 1 && Character.isUpperCase(word.charAt(0)))
            return true;
        else if(uppercase_count == 0)
            return true;
        return false;
    }
}
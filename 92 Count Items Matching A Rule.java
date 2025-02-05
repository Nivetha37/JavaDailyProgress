/*You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.*/
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int col;
        if(ruleKey .equals("type")) col=0;
        else if(ruleKey.equals("color")) col=1;
        else col=2;

        int count =0;
        for(int i :items){
            if(ruleValue.equals(items.get(i).get(col))) count++;
        }
        return count;
    }
}

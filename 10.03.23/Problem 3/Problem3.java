public class Problem3 {
    public static void main(String[] args) {
        String s = "leetcode";
        int indexs[] = new int[s.length()];
        int index = 0;
        StringBuffer ansstr = new StringBuffer(s);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'|| s.charAt(i) == 'i'
            || s.charAt(i) == 'o'|| s.charAt(i) == 'u'){
                indexs[index] = i;
                index++;
            }
        }
        for(int start = 0,end = index-1;start < end;start++,end--){
            char temp = s.charAt(indexs[start]);
            ansstr.setCharAt(indexs[start], s.charAt(indexs[end]));
            ansstr.setCharAt(indexs[end], temp);
        }
        System.out.println(ansstr);
    }
}

import java.util.HashMap;

public class Problem3 {
    public static void main(String[] args) {
        String str = "abbbcc";
        int d = 2;
        char charArray[] = str.toCharArray();
        int len = charArray.length;
        HashMap<Character, Integer> m = new HashMap<>();
        StringBuffer ele = new StringBuffer("");
        for (int i = 0; i < len; i++) {
            if (!m.containsKey(charArray[i])) {
                int count = 1;
                for (int j = i + 1; j < len; j++) {
                    if (charArray[i] == charArray[j]) {
                        count++;
                    }
                }
                ele.append(charArray[i] + "");
                m.put(charArray[i], count);
            }
        }

        char ch[] = new char[ele.length()];
        int nums[] = new int[ele.length()];
        int index = 0;
        int n = ele.length();
        while(n-- > 0){
            char max = ele.charAt(0);
            for(int i = 1;i < ele.length();i++){
                if(m.get(max) < m.get(ele.charAt(i))){
                    max = ele.charAt(i);
                }
            }
            ch[index] = max;
            nums[index] = m.get(max);
            index++;
            m.put(max, Integer.MIN_VALUE);
        }

        for(int i = 0;i < index;i++){
            System.out.println(ch[i] + " " + nums[i]);
        }
        int size = index;
        if(size >= d){
            for(int i = 0;i < size;i++){
                int flag = 0;
                while(nums[i] != 0){
                    System.out.print(ch[i]);
                    nums[i]--;
                    for(int j = i+1;j+d < size;j++){
                        if(nums[j] != 0){
                            System.out.print(ch[i]);
                            nums[j]--;
                        }
                    }
                }
            }
        }
        else{
            System.out.println(" Cannot be rearranged ");
        }
    }
}

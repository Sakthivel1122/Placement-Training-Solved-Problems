public class Problem2 {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "cdeab";

        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i) - 97]++;
        }
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (arr1[t.charAt(i) - 97] > 0) {
                arr1[t.charAt(i) - 97]--;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}

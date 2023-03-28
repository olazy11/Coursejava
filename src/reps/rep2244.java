package reps;

public class rep2244 {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aabbcde"));
        removeConsecutiveDuplicates("aabbcc");
        removeConsecutiveDuplicates("aabbcca");
        removeConsecutiveDuplicates("aabbccaddda");
    }

    public static String removeConsecutiveDuplicates(String str1) {

        StringBuilder sb = new StringBuilder(str1);
        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) != sb.charAt(i+1)) {
                sb.append(sb.charAt(i));

            }
        }
        return sb.toString();
    }
}





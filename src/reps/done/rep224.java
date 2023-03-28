package reps.done;
/*
*Remove Consecutive duplicates
Write the logic to remove only consecutive duplicates

input ["aabbcde"]-> output["abcde"]

input ["aabbcc"]-> output["abc"]

input ["aabbcca"]-> output["abca"]

input ["aabbccaddda"]-> output["abcada"] */


public class rep224 {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aabbcde"));
        System.out.println(removeConsecutiveDuplicates("aabbcc"));
        System.out.println(removeConsecutiveDuplicates("aabbcca"));
        System.out.println(removeConsecutiveDuplicates("aabbccaddda"));
            }

    public static String removeConsecutiveDuplicates(String str1) {


            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                if (sb.length() == 0 || c != sb.charAt(sb.length() - 1)) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }

    }










package reps.done;

import java.util.Arrays;

/*Format the String:
Write the logic to format the string in the below given format
xxx-xxx-xxx
after each 3 digits ther should be dash("-")
if there are any spaces in the input remove those

input ["00-44   48 555555"]

output ["004-448-555-555"]

input ["00-44   48 555"]

output["004-448-555"]

input ["00-44  #$% 48 55"]

output ["004-448-55"]


* */
public class rep220 {
    public static void main(String[] args) {
        System.out.println(formatString("00-44   48 555555"));
        System.out.println(formatString("00-44   48 555"));
        System.out.println(formatString("00-44  #$% 48 55"));

    }

    public static String formatString(String S) {
        String str = S.replaceAll("[^0-9]", "");
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (i == 3 || i == 7 || i == 11) {
                sb.insert(i, "-");

            }
        }

        return sb.toString();
    }
}










package reps;
/*HTML Elements
Have the function HTMLElements (str) read the str parameter being passed which will be a string of HTML DOM elements and plain text. The elements that will be used are: b, i, em, div, p. For example:

if str is < div>< b>< p>hello world< /p>< /b> < /div>

then this string of DOM elements is nested correctly so your program should return the string true.
If a string is not nested correctly, return the first element encountered where, if changed into a different element, would result in a properly formatted string. If the string is not formatted properly, then it will only be one element that needs to be changed. For example: if str is '< div> < i>hello< /i>world< /b>" then your program should return the string div because if the first < div> element were changed into a < b>, the string would be properly formatted.

Examples
Input: "< div>< div>< b>< /b>< /div>< /p>" Output: div


Input: "< div>abc< /div>< p>< em>< i>test test test< /b>< /em>< /p>"

Output: i
* */
import java.util.LinkedList;/*
public class rep227 {


        public static void main(String[] args) {
            System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
            System.out.println(HTMLElements("<div><div><b></b></div></p>"));
            System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
        }
        public static String HTMLElements(String str){


        }    }
*/

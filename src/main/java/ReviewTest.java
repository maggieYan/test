/**
 * @ClassName ReviewTest.java
 * @Author yanmeichen
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2023年02月17日 15:07:00
 */

/**
 * @ClassName: ReviewTest
 * @Description:
 * @author: yanmeichen
 * @Version:v1.0
 */
public class ReviewTest {
    public static void main(String[] args) {

        System.out.println("test v1");

        /*两个字符串中最长相同子串长度
        S1=hhabcdee  S2=rrabcduu
        */

        String s1 = "abcd";
        String s2 = "qabcd";

        int s1Length = s1.length();
        int s2Length = s2.length();

        int shorterLength = s1Length<s2Length?s1Length:s2Length;
        String langerStr = s1Length<s2Length?s2:s1;
        String shorterStr = s1Length<s2Length?s1:s2;
        String subStr = null;
        String langestSubStr = null;

        System.out.println("两个字符串最短长度=" + shorterLength + "  两个字符串中最长的字符串=" + langerStr
                + ",最短的字符串=" + shorterStr);

        int flag = 0;
        for (int i=0;i<shorterLength;i++){
            for (int begin=0,end=shorterLength-i;end<=shorterLength;begin++,end++){
                subStr = shorterStr.substring(begin, end);
                System.out.println("子串=" + subStr);
                if (langerStr.contains(subStr)){
                    langestSubStr = subStr;
                    System.out.println(langestSubStr);
                    flag = 1;
                }
                if (flag==1){
                    break;
                }
            }
            if (flag==1){
                break;
            }
        }
    }
}

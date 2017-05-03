package casual_idea;

/**
 * Created by Michael Allan on 2017/5/3.
 */
public class MyString {

    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        System.out.println('a'+1);//"a"+1结果为a1,'a'+1结果为98
        //abcdefghijklmnopqrstuvwxyz
        for (char i = 'a'; i <= 'z'; i++) {
            res.append(i);
        }
        String str = res.toString().toUpperCase();//转变为大写

        System.out.println(str);
        for (int i = 0; i < 10; i++) {
            res.append(i);
        }
        System.out.println(res.append(str));
    }
}

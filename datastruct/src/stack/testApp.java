package stack;

public class testApp {


    public static boolean detecation(String val) {
//        初始化栈
        ArrayStack arrayStack = new ArrayStack(10);

        for (int i = 0; i < val.length(); i++) {
            arrayStack.push(val.charAt(i));
        }
        String newval="";
        for (int i = 0; i < val.length(); i++) {
            if (!arrayStack.isEmpty()){
                char pop=(char) arrayStack.pop();
                newval=newval+pop;
            }
        }
        return val.equals(newval);
    }
    public static void main(String[] args) {
//        判断回文串
        System.out.println(detecation("aba"));

    }
}

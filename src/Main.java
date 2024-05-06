import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> pre = new ArrayList<>();
        ArrayList<String> post = new ArrayList<>();
        /*pre.add("f");
        pre.add("g");
        pre.add("s");
        pre.add("b");
        pre.add("a");
        pre.add("d");
        pre.add("x");
        pre.add("h");
        pre.add("c");
        pre.add("l");
        pre.add("i");
        post.add("h");
        post.add("c");
        post.add("b");
        post.add("c");
        post.add("a");
        post.add("g");
        post.add("i");
        post.add("d");
        post.add("x");
        post.add("s");
        post.add("f");*/
        pre.add("f");
        pre.add("b");
        pre.add("g");
        pre.add("a");
        pre.add("h");
        pre.add("d");
        pre.add("c");
        post.add("b");
        post.add("h");
        post.add("d");
        post.add("a");
        post.add("c");
        post.add("g");
        post.add("f");
        Knoten Baum = UtilClass.rekursivBaumBuilder(pre,post);
        String test = "";
    }
}
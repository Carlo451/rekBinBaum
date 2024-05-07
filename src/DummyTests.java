

import java.util.ArrayList;
import java.util.HashMap;

public class DummyTests {


    HashMap<Integer,HashMap<String, ArrayList<String>>> tests = new HashMap<>();
    public DummyTests(){
        tests.put(0,addTestOne());
        tests.put(1,addTestTwo());
        tests.put(2,addTestThree());

    }
    private HashMap<String,ArrayList<String>> addTestOne(){
        HashMap<String,ArrayList<String>> test = new HashMap<>();
        ArrayList<String> pre = new ArrayList<>();
        ArrayList<String> post = new ArrayList<>();
        pre.add("f");
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
        post.add("f");
        test.put("pre",pre);
        test.put("post",post);
        return test;
    }
    private HashMap<String,ArrayList<String>> addTestTwo(){
        HashMap<String,ArrayList<String>> test = new HashMap<>();
        ArrayList<String> pre = new ArrayList<>();
        ArrayList<String> post = new ArrayList<>();
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
        test.put("pre",pre);
        test.put("post",post);
        return test;
    }
    private HashMap<String,ArrayList<String>> addTestThree(){
        HashMap<String,ArrayList<String>> test = new HashMap<>();
        ArrayList<String> pre = new ArrayList<>();
        ArrayList<String> post = new ArrayList<>();
        pre.add("c");
        pre.add("d");
        pre.add("f");
        pre.add("b");
        pre.add("a");
        pre.add("e");
        pre.add("h");
        post.add("d");
        post.add("a");
        post.add("e");
        post.add("b");
        post.add("h");
        post.add("f");
        post.add("c");
        test.put("pre",pre);
        test.put("post",post);
        return test;
    }

    public HashMap<Integer, HashMap<String, ArrayList<String>>> getTests() {
        return tests;
    }

}

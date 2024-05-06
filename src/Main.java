import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DummyTests dummys = new DummyTests();
        HashMap<Integer, HashMap<String, ArrayList<String>>> tests =  dummys.getTests();
        for(int i = 0;i<tests.size();i++ ){
            Knoten Baum = UtilClass.rekursivBaumBuilder(tests.get(i).get("pre"),tests.get(i).get("post"));
            String baumString = Baum.printBinBaum();
            System.out.println(baumString);
        }

        String test = "";
    }
}
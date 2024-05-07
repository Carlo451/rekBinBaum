import java.util.ArrayList;



public abstract class UtilClass {


    static public Knoten rekursivBaumBuilder(ArrayList<String> pre, ArrayList<String> post){
        Knoten linkerKnoten;
        Knoten rechterKnoten;

         String knotenWert = post.getLast();
        if(post.size() == 1){
            linkerKnoten = new Knoten(new Leaf());
            rechterKnoten = new Knoten(new Leaf());
            return new Knoten(linkerKnoten,knotenWert,rechterKnoten);
        }
        ArrayList<String> unterKnoten = new ArrayList<>();
        for(int i = 0;i< post.size()-1;i++){
            unterKnoten.add(post.get(i));
        }
         String teiler = "";
         for(int i = 0; i < pre.size(); i++){
             if(unterKnoten.contains(pre.get(i))){
                 teiler = pre.get(i);
                 break;
             }
         }

         ArrayList<String> links = new ArrayList<>();
         ArrayList<String> rechts = new ArrayList<>();
         int indexTeiler = post.indexOf(teiler);
         for(int i = 0 ; i <= indexTeiler; i++){
            links.add(unterKnoten.get(i));
         }
         for(int i = indexTeiler + 1 ; i < unterKnoten.size(); i++){
             rechts.add(unterKnoten.get(i));
         }
         if(rechts.isEmpty()){
             linkerKnoten = rekursivBaumBuilder(pre,links);
             rechterKnoten = new Knoten(new Leaf());
             return new Knoten(linkerKnoten,knotenWert,rechterKnoten);
         }

         linkerKnoten = rekursivBaumBuilder(pre,links);
         rechterKnoten = rekursivBaumBuilder(pre, rechts);
         return new Knoten(linkerKnoten,knotenWert,rechterKnoten);
    }





    }

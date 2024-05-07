public class Knoten {
    Knoten links;
    Knoten rechts;
    String knotenWert;
    public Knoten(Knoten links,String knotenWert,Knoten rechts){
        this.links = links;
        this.knotenWert = knotenWert;
        this.rechts = rechts;

    }
    public Knoten(Leaf leaf){


    }
    public String printBinBaum(){

         return (knotenWert +"("+getUnterKnoten(links,false)+getUnterKnoten(rechts,true) +")").replaceAll("\\(\\)","");
    }
    protected String getUnterKnoten(Knoten knoten,boolean rechts){
        return knoten.knotenWert == null ?  "": knoten.printBinBaum() + (rechts?"":",");
    }
}

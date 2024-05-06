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
}

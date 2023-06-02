package FEE;

public class Menu {
    String name;
    String explain;
    public Menu (){

    }
    public Menu(String name, String explain){
        this.name = name;
        this.explain = explain;
    }

    public String getName (){ return this.name;}
    public String getExplain(){return  this.explain;}

}

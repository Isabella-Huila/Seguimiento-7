package Model;

public class Ingredient {

    private String name;

    private double weigth;


    public Ingredient(String name, double weigth) {
        this.name = name;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }


    public void Aumentarpeso(double weigth){
        this.weigth += weigth;
    }

    public void DisminuirPeso(double weigth){
       if(weigth <= this.weigth){
           this.weigth -= weigth;
       }else{
           System.out.println("No se puede disminuir el peso");
       }
    }
}

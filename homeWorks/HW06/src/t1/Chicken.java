package t1;

public class Chicken extends NonFlyingBird {
    public Chicken(String feathers, boolean leyEggs, String name) {
        super.setFeathers(feathers);
        super.setLeyEggs(leyEggs);
        super.setName(name);
    }
}

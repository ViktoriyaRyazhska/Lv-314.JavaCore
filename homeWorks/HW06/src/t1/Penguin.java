package t1;

public class Penguin extends NonFlyingBird {
    public Penguin(String feathers, boolean leyEggs, String name) {
        super.setFeathers(feathers);
        super.setLeyEggs(leyEggs);
        super.setName(name);
    }
}

package t1;

public abstract class Bird {
    private String feathers;
    private boolean leyEggs;
    private String name;

    public abstract String fly();

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public boolean isLeyEggs() {
        return leyEggs;
    }

    public void setLeyEggs(boolean leyEggs) {
        this.leyEggs = leyEggs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bird() {}

    public Bird(String feathers, boolean leyEggs, String name) {
        this.feathers = feathers;
        this.leyEggs = leyEggs;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", leyEggs=" + leyEggs +
                ", name='" + name + '\'' +
                '}';
    }
}

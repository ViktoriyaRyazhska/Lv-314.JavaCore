


public class Dog {


        private String name;
        private String breed;
        private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog (String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    Dog dog = new Dog("ali", "chao", 3);
    Dog dog1 = new Dog("sobaka", "simply",5);
    Dog dog2 = new Dog("graf", "kolli", 8);

    public  void main(String[] args) {
        if (dog.age > dog1.age && dog.age > dog2.age){
            System.out.println("The name and the kind of the oldest dog IS " + dog.name + " " + dog.breed);
        }

        if (dog1.age > dog.age && dog1.age > dog2.age){
            System.out.println("The name and the kind of the oldest dog IS " + dog1.name + " " + dog1.breed);
        }

        if (dog2.age > dog.age && dog2.age > dog1.age){
            System.out.println("The name and the kind of the oldest dog IS " + dog2.name + " " + dog2.breed);
        }
    }
}

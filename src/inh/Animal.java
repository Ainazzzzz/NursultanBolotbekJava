package inh;

public class Animal {
    private final String nake;
   private String name;
   private int age;
  public Animal(String nake, String n, int age){
      this.nake = nake;
      this.name=n;
      this.age=age;

  }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNake() {
        return nake;
    }
}

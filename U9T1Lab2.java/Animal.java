public class Animal {

    private String name;
    private boolean isVaccinated;
    private int age;

    public Animal(String name, int age, boolean isVaccinated) {
        this.name=name; this.age=age; this.isVaccinated=isVaccinated;
    }

    public String getName() {return name;} 
    public int getAge() {return age;} 
    public boolean getVaccinated() {return isVaccinated;}

    public void adopt() {System.out.println("Animal has been adopted");}
    public void feed() {System.out.println("Animal has been fed");}

}

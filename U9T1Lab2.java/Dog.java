public class Dog extends Animal {
    
    private boolean hasBeenWalked;

    public Dog(String name, int age, boolean isVaccinated, boolean hasBeenWalked) {
        super(name, age, isVaccinated);
        this.hasBeenWalked=hasBeenWalked;
    }

    public boolean getHasBeenWalked() {return hasBeenWalked;}

    public void walk() {System.out.println("Dog has been walked");}
}

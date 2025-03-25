import java.util.ArrayList;

public class Vet {
    
    private String vetName;
    private ArrayList<Animal> client;

    public Vet (String vetName) {
        this.vetName=vetName;
        client = new ArrayList<Animal>();
    }

    public boolean addClient(Animal potentialClient) {
        if(client.contains(potentialClient)) {
            System.out.println(potentialClient.getName() + " is already a client of " + vetName);
            return false;
        } else {
        System.out.println("Welcome to " + vetName + "'s office, " + potentialClient.getName());
        client.add(potentialClient);
        return true;
        }
    }

    public void printClientList() {
        for (Animal ani : client) {
            System.out.println(ani.getName() + " : " + ani.getClass());
        }
    }
}

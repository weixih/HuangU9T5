import java.util.ArrayList;

public class Vet {
    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name){
        this.name = name;
        clients = new ArrayList<>();
    }

    public void addClient(Animal animal){
        if(clients.indexOf(animal) == -1){
            clients.add(animal);
            System.out.println("Welcome to " + name + "'s office " + animal.getName());
        }else{
            System.out.println(animal.getName() + " is already a client of " + name);
        }
    }


}

import model.Auto;
import model.User;
import services.Userservice;

public class Main {
    public static void main(String[] args) {
        Userservice userService = new Userservice();
        User user = new User("Masha",26);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);
        user.setName("Sasha");
        User user1 = new User("Павел", 30);
        userService.saveUser(user1);
        ford.setUser(user1);
        user1.addAuto(ford);
        userService.updateUser(user);
        //userService.deleteUser(user);

    }
}

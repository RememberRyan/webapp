package model;

import dto.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ryan Alexander on 05/11/2018.
 */
public class UsersStore {

    private static UsersStore usersStore;
    private List<User> users = new ArrayList<>();
    private UsersStore() {

    }

    public static UsersStore getInstance() {
        if (usersStore == null) {
            usersStore = new UsersStore();
            usersStore.addNewUser("Barack","1234");
            usersStore.addNewUser("Donald","4321");
            usersStore.addNewUser("George","3232");
        }
        return usersStore;
    }



    // All users:
    // use map to get all the names of the elements within the array
    public  List<String> getAllUserNames(){
        return users.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }

    // adding a new user to the array
    public void addNewUser(String name, String password) {
        users.add(new User(name, password));
    }
}

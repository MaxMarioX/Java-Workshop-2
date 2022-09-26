package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        User user = new User();

        user.setData("Mariusz Plaskota","mp@mp.pl","aA123456*");
        userDao.Create(user);


    }
}
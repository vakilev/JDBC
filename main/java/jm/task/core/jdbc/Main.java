package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService us = new UserServiceImpl();

        us.createUsersTable();

        us.saveUser("Катя", "Руденко", (byte) 24);
        us.saveUser("имя2", "Фамилия2", (byte) 34);
        us.saveUser("имя3", "Фамилия3", (byte) 44);
        us.saveUser("имя4", "Фамилия4", (byte) 54);

        for (User user : us.getAllUsers()) {
            System.out.println(user);
        }

        System.out.println("--------------------------------");

        us.cleanUsersTable();

        System.out.println("--------------------------------");

        us.dropUsersTable();
    }
}

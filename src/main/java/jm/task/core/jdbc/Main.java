package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getConnection();
        UserService user = new UserServiceImpl();

        user.createUsersTable();

        user.saveUser("Ivan", "Ivanov", (byte) 20);
        user.saveUser("Petr", "Petrov", (byte) 25);
        user.saveUser("Maria", "Nikitina", (byte) 31);
        user.saveUser("Anna", "Popova", (byte) 38);

        user.removeUserById(1);
        System.out.println(user.getAllUsers());
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}

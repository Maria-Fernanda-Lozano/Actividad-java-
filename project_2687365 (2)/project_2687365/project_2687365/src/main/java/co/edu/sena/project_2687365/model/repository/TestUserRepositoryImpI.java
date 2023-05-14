package co.edu.sena.project_2687365.model.repository;

import co.edu.sena.project_2687365.model.User;

import java.sql.SQLException;
import java.sql.SQLOutput;

public class TestUserRepositoryImpI {
    public static void main(String[] args) throws SQLException {
        Repository<User> repository = new UseRepositoryImpI();

        System.out.println("========== saveObj Insert ==========");
        User userInsert = new User();
        userInsert.setUser_fistname("Cesar");
        userInsert.setUser_lastname("Lozano");
        userInsert.setUser_email("Cesarlozano2109@gmail.com");
        userInsert.setUser_password("C3247");
        repository.saveObj(userInsert);
        userInsert.setUser_fistname("Sara");
        userInsert.setUser_lastname("Ruiz");
        userInsert.setUser_email("Sara489@gmail.com");
        userInsert.setUser_password("bts2799");
        repository.saveObj(userInsert);

        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_fistname("Tatiana");
        userUpdate.setUser_lastname("Cañon");
        userUpdate.setUser_email("Tata1104@gmail.com");
        userUpdate.setUser_password("Tata8934");
        repository.saveObj(userInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ==========");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}

package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class UserRepository {

    private final ApiService  apiService;

    private List<User> users = generateUsers();

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        return users;
    }

    public void generateRandomUser() {
        users.add(User.random());
    }

    public void deleteUser(User user) {
        users.remove(user);
    }

    public ApiService getApiService() {
        return apiService;
    }
}

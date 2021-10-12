package modules.user.domain.repository;


import modules.user.domain.User;

public interface UserRepository {

    void saveUser(User user);
}
package modules.user.domain.repository;

import modules.user.domain.Account;

public interface AccountRepository {

    boolean validateAccount(String accountId);
    void save(Account account);

}
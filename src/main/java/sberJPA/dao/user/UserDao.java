package sberJPA.dao.user;

import sberJPA.dao.MainDao;
import sberJPA.model.user.People;

import java.util.List;

public interface UserDao<T extends People> extends MainDao<T> {
    List<T> getUsers(Integer begin, Integer end);

    List<T> getUsersOrderByDESC(Integer begin, Integer end);

    int getCountRows();
}

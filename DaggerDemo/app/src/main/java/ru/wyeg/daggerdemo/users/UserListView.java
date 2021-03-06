package ru.wyeg.daggerdemo.users;

import com.hannesdorfmann.mosby3.mvp.MvpView;

import java.util.List;

import ru.wyeg.data.UserEntity;

/**
 * @author Nikita Olifer.
 */
public interface UserListView extends MvpView {

    void showUsers(List<UserEntity> users);
}

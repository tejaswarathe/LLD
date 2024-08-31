package Splitwise.data;


import Splitwise.models.UserList;

public class Data {
    public static UserList userList = new UserList();

    public static UserList getUserList() {
        return userList;
    }

}

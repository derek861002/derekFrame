package org.derekframe.modules.sys.entity;

/**
 * 描述:
 * User shuaibo
 * Date 2016/5/3
 * Version: V1.0
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private String userType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}

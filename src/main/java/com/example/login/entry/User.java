package com.example.login.entry;

public class User {
    private String username ;
    private String email ;
    private String password ;
    private String uuid ;
    private String phone ;

    public void setUsername(String userName){
        this.username = userName ;
    }
    public String getUsername(){
        return this.username ;
    }

    public void setEmail(String email){
        this.email = email ;
    }
    public String getEmail(){
        return this.email ;
    }

    public void setPassword(String password){
        this.password = password ;
    }
    public String getPassword(){
        return this.password ;
    }

    public void setUuid(String uuid){
        this.uuid = uuid ;
    }
    public String getUuid(){
        return this.uuid ;
    }

    public void setPhone(String phone){
        this.phone = phone ;
    }
    public String getPhone(){
        return this.phone ;
    }

}

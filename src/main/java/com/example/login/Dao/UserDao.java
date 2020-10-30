package com.example.login.Dao;

import com.example.login.entry.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    /*添加用户*/
    @Insert("insert into users (username, phone, email, password, uuid) " +
            "values (#{username}, #{phone}, #{email}, #{password}, #{uuid})")
    void add(User user) ;

    /*查询*/
    //通过用户名查询
    @Select("select * from users where username = #{username}")
    User selectByUsername(String username) ;

    //通过phone查询
    @Select("select * from users where phone = #{phone}")
    User selectByPhone(String phone) ;

    //通过email查询
    @Select("select * from users where email = #{email}")
    User selectByEmail(String email) ;

    //通过uuid查询
    @Select("select * from users where uuid = #{uuid}")
    User selectByUuid(String uuid) ;

    //通过password查询
    @Select("select * from users where password = #{password}")
    User selectByPassword(String password) ;

    //通过用户名、电话、邮箱查询
    @Select("select * from users where username = #{username} or email = #{email} or phone = #{phone}")
    User selectByUser(String username, String email, String phone) ;


}

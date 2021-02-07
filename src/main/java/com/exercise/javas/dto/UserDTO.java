package com.exercise.javas.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Document(collection = "UserInfo")
public class UserDTO implements Serializable {
    @Id
    @Field("id")
    private String id;

    @Field("password")
    private String password;

    @Field("name")
    private String name;

    @Field("email")
    private String email;

    @Field("birthday")
    private String birthday;

    @Field("sex")
    private String sex;

    @Field("phone")
    private String phone;

    private String address;

    @Field("date")
    private String date;

    @Field("userType")
    private String userType;
}

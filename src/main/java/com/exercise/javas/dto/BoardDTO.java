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
@Document(collection = "BoardInfo")
public class BoardDTO implements Serializable {
    @Id
    private String postId;

    @Field("userId")
    private String userId;

    @Field("name")
    private String name;

    @Field("title")
    private String title;

    @Field("content")
    private String content;

    @Field("date")
    private String date;

    @Field("hit")
    private int hit;

    @Field("reviewCnt")
    private int reviewCnt;

    @Field("boardType")
    private String boardType;

}

package com.springprojects.entity;

/* 
Eren created on 19.07.2020 
*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String id;

    @Field(name = "name", type = FieldType.Text)
    private String name;

    @Field(name = "lastname", type = FieldType.Text)
    private String lastname;

    @Field(name = "address", type = FieldType.Text)
    private String address;

    @Field(name = "birthDate", type = FieldType.Date, format = DateFormat.basic_date_time)
    private Date birthDate;
}

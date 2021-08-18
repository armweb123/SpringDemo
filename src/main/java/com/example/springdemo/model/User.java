package com.example.springdemo.model;
import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity//bazai het kapakcvac model e
@Table(name = "user")//te vor  table i het e kapakcvac u anuny

public class User {

    @Id//table entiti id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id het veradarcnelu poxelu hamar
    private int id;
    //@Column (name = "name") en depqum erb chi hamnknum mer haytararac popoxakani anuni het
    private String name;
    private String surname;
    private String email;
    private String password;
}

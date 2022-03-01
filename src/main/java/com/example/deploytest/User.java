package com.example.deploytest;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 유저 Entity(BaseEntity, UserDetails 상속)
 * BaseEntity : 공통적으로 포함되는 entity 요소를 분리
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(length = 5, nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "USR_ID", length = 100, nullable = false, unique = true)
    private String usrId;    //유저 아이디

    @Builder
    public User(String usrId) {
        this.usrId = usrId;
    }
}

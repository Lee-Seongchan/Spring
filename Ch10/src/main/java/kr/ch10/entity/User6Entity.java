package kr.ch10.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USER6")
@SequenceGenerator(
        name = "USER_SEQ_GENERATOR"
        , sequenceName = "SEQ_USER6"
        , initialValue = 1
        , allocationSize = 1
    )
public class User6Entity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
            , generator = "USER_SEQ_GENERATOR"
        )
    private int seq;
    private String name;
    private String gender;
    private int age;
    private String addr;

	
}

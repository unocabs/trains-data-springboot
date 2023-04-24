package com.rgian.trainsproject1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "rgian", name = "titanic")
public class TrainsEntity {
    @Id
    @Column(name="passenger_id", nullable = false)
    private UUID passId;
    @Column(name="survived", nullable = false)
    private Integer survived;
    @Column(name="pclass", nullable = false)
    private Integer pclass;
    @Column(name="pass_name", nullable = false)
    private String passName;
    @Column(name="sex", nullable = false)
    private String sex;
    @Column(name="age", nullable = false)
    private Integer age;
    @Column(name="sibsp", nullable = false)
    private Integer sibsp;
    @Column(name="parch", nullable = false)
    private Integer parch;
    @Column(name="ticket", nullable = false)
    private String ticket;
    @Column(name="fare", nullable = false)
    private Integer fare;
    @Column(name="cabin", nullable = false)
    private String cabin;
    @Column(name="embarked", nullable = false)
    private String embarked;
}

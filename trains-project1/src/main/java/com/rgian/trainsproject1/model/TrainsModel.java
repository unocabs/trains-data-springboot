package com.rgian.trainsproject1.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TrainsModel {
    private Integer survived;
    private Integer pclass;
    private String passName;
    private String sex;
    private Integer age;
    private Integer sibsp;
    private Integer parch;
    private String ticket;
    private Integer fare;
    private String cabin;
    private String embarked;
}

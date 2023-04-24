package com.rgian.trainsproject1.DTO;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TrainsDTO {
    private UUID passId;
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

package com.ruoyi.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class DrivingLicense implements Serializable {
    private static final long serialVersionUID = 611197991672067628L;
    private Long id;
    private String userId;
    private String address;
    private String carType;
    private String birthday;
    private String country;
    private String name;
    private String sex;
    private String startTime;
    private String endTime;
    private String firstTime;
    private String cardNumber;
    private String carPhoto;
    private String registerTime;
    private Integer status;
    private Date addTime;
    private String imgStr;
    private String idCardSide;
}

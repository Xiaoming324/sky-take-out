package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeChangePasswordDTO implements Serializable {

    private Long empId;

    private String newPassword;

    private String oldPassword;
}

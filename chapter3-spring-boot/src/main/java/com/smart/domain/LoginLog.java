package com.smart.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author yangyueming
 */
@Data
public class LoginLog implements Serializable {

    private int loginLogId;
    private int userId;
    private String ip;
    private Date loginDate;
}

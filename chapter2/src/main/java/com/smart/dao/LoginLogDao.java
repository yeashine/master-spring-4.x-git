package com.smart.dao;

import com.smart.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author yangyueming
 */

@Repository
public class LoginLogDao {

    //保存登陆日志SQL
    private final static String INSERT_LOGIN_LOG_SQL = "INSERT INTO t_login_log(user_id,ip,login_datetime) VALUES(?,?,?)";
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog) {
        Object[] args = {loginLog.getUserId(), loginLog.getIp(),
            loginLog.getLoginDate()};
        jdbcTemplate.update(INSERT_LOGIN_LOG_SQL, args);
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
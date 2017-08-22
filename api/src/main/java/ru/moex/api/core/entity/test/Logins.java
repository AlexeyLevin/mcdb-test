package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Arrays;

@Data
@Entity
public class Logins {
    @Id@Column(name = "LOGIN", nullable = false, length = 100)
    private String login;
    @Basic@Column(name = "ROLE_MEMBER", nullable = true, length = 1500)
    private String roleMember;
    @Basic@Column(name = "USER_PASSWORD", nullable = true)
    private byte[] userPassword;
    @Basic@Column(name = "AD_LOGIN", nullable = true, length = 100)
    private String adLogin;
    @Basic@Column(name = "LAST_LOGON", nullable = true)
    private Time lastLogon;

}

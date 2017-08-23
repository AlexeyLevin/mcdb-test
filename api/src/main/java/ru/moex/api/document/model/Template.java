package ru.moex.api.document.model;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

@Data
@Entity
public class Template {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NAME", nullable = false, length = 500)
    private String name;
    @Basic@Column(name = "DESCRIPTION", nullable = true, length = 250)
    private String description;
    @Basic@Column(name = "LAST_EDIT_TIME", nullable = true)
    private Time lastEditTime;
    @Basic@Column(name = "STORE_DATE", nullable = true)
    private Time storeDate;

}

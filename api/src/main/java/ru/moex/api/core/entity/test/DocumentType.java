package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "DOCUMENT_TYPE", schema = "ICDB", catalog = "")
public class DocumentType {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NAME", nullable = false, length = 500)
    private String name;
    @Basic@Column(name = "HELP_DESCRIPTION", nullable = true, length = 4000)
    private String helpDescription;
    @Basic@Column(name = "ACTUAL", nullable = false, precision = 0)
    private boolean actual;
    @Basic@Column(name = "ADMIT", nullable = true, precision = 0)
    private Boolean admit;
    @Basic@Column(name = "CD_SAVE_CLOSE", nullable = true, precision = 0)
    private Boolean cdSaveClose;
    @Basic@Column(name = "PRESENCE", nullable = true, precision = 0)
    private Boolean presence;
    @Basic@Column(name = "PM_PROCCESS_TIME", nullable = true, precision = 0)
    private Long pmProccessTime;

}

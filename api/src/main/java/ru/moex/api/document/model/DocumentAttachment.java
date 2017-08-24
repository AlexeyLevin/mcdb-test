package ru.moex.api.document.model;

import lombok.Data;
import ru.moex.api.permission.model.Employee;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class DocumentAttachment {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NOTE", nullable = true, length = 500)
    private String note;
    @Basic@Column(name = "RTS_FILE_ID", nullable = true, precision = 0)
    private Long rtsFileId;
    @Basic@Column(name = "LAST_EDIT_TIME", nullable = true)
    private LocalDateTime lastEditTime;
    @Basic@Column(name = "STORE_DATE", nullable = true)
    private LocalDateTime storeDate;

    @ManyToOne@JoinColumn(name = "DOCUMENT_ID", referencedColumnName = "ID", nullable = false)
    private Document documentByDocumentId;
    @ManyToOne@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "ID")
    private Employee employeeByEmployeeId;

}

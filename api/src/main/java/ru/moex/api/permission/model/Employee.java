package ru.moex.api.permission.model;

import lombok.Data;
import ru.moex.api.document.model.Document;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "FIO", nullable = false, length = 100)
    private String fio;
    @Basic@Column(name = "ROOM", nullable = true, length = 50)
    private String room;
    @Basic@Column(name = "PHONE", nullable = true, length = 50)
    private String phone;
    @Basic@Column(name = "LOCAL_PHONE", nullable = true, length = 50)
    private String localPhone;
    @Basic@Column(name = "SHORT_NAME", nullable = false, length = 100)
    private String shortName;
    @Basic@Column(name = "EMAIL", nullable = true, length = 100)
    private String email;
    @Basic@Column(name = "UPDATE_CLIENT_FILES", nullable = false, precision = 0)
    private boolean updateClientFiles;
    @Basic@Column(name = "LAST_UPDATE_DATE", nullable = true)
    private LocalDateTime lastUpdateDate;
    @Basic@Column(name = "LAST_UPDATE_ERROR", nullable = true, length = 4000)
    private String lastUpdateError;
    @Basic@Column(name = "POSITION", nullable = true, length = 500)
    private String position;
    @Basic@Column(name = "ID_EXTERNAL_1S", nullable = true, length = 50)
    private String idExternal1S;
    @Basic@Column(name = "ADVANCED_ORGANIZATION_CARD", nullable = true, precision = 0)
    private Boolean advancedOrganizationCard;
    @Basic@Column(name = "FIRED", nullable = true, precision = 0)
    private Boolean fired;
    @Basic@Column(name = "LAST_EDIT_TIME", nullable = true)
    private LocalDateTime lastEditTime;
    @Basic@Column(name = "STORE_DATE", nullable = true)
    private LocalDateTime storeDate;
    @OneToMany(mappedBy = "employeeByEmployeeId",fetch= FetchType.EAGER)
    private Collection<Document> documentsByDocumentId;
}

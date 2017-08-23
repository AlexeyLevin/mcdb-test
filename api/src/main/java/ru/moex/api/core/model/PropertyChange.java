package ru.moex.api.core.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import ru.moex.api.document.model.Document;
import ru.moex.api.permission.model.Employee;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@JsonFormat()
@Data
@Entity
@Table(name = "PROPERTY_CHANGE")
public class PropertyChange {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "OBJECT_ID", nullable = false, precision = 0)
    private long objectId;
    @Basic@Column(name = "NEW_VALUE", nullable = true, length = 4000)
    private String newValue;
    @Basic@Column(name = "STORE_DATE", nullable = false)
    private LocalDateTime storeDate;
    @Basic@Column(name = "EMPLOYEE_COMMENT", nullable = true, length = 4000)
    private String employeeComment;
    @Basic@Column(name = "ACCEPT_DATE", nullable = false)
    private LocalDateTime acceptDate;
    @Basic@Column(name = "DOC_DATE", nullable = true)
    private LocalDateTime docDate;
    @Basic@Column(name = "DOC_NUMBER", nullable = true, length = 50)
    private String docNumber;
    @Basic@Column(name = "DOC_NAME", nullable = true, length = 500)
    private String docName;
    @Basic@Column(name = "DOC_DATE2", nullable = true)
    private LocalDateTime docDate2;
    @Basic@Column(name = "DOC_NUMBER2", nullable = true, length = 50)
    private String docNumber2;
    @Basic@Column(name = "DOC_NAME2", nullable = true, length = 500)
    private String docName2;
    @Basic@Column(name = "EXTRA_INT_VALUE", nullable = true, precision = 0)
    private Long extraIntValue;
    @Basic@Column(name = "EXTRA_FLOAT_VALUE", nullable = true, precision = 0)
    private Double extraFloatValue;
    @Basic@Column(name = "EXTRA_STRING_VALUE", nullable = true, length = 4000)
    private String extraStringValue;
    @Basic@Column(name = "EXTRA_DATE_VALUE", nullable = true)
    private LocalDateTime extraDateValue;
    @Basic@Column(name = "EXTRA_DATETIME_VALUE", nullable = true)
    private LocalDateTime extraDatetimeValue;
    @Basic@Column(name = "EXTRA_BOOL_VALUE", nullable = true, precision = 0)
    private Boolean extraBoolValue;
    @Basic@Column(name = "EXTRA_REFERENCE_VALUE", nullable = true, precision = 0)
    private Long extraReferenceValue;
    @Basic@Column(name = "EXTRA_DATE_VALUE2", nullable = true)
    private LocalDateTime extraDateValue2;
    @Basic@Column(name = "EXTRA_DATE_VALUE3", nullable = true)
    private LocalDateTime extraDateValue3;
    @Basic@Column(name = "EXTRA_DATE_VALUE4", nullable = true)
    private LocalDateTime extraDateValue4;
    @Basic@Column(name = "NEW_VALUE_EXT", nullable = true, length = 4000)
    private String newValueExt;
    @Basic@Column(name = "EXTRA_BOOL_VALUE2", nullable = true, precision = 0)
    private Boolean extraBoolValue2;
    @Basic@Column(name = "LAST_EDIT_TIME", nullable = true)
    private LocalDateTime lastEditTime;
    @ManyToOne@JoinColumn(name = "OBJECT_TYPE", referencedColumnName = "ID", nullable = false)
    private ObjectType objectTypeByObjectType;
    @ManyToOne@JoinColumn(name = "PROPERTY_ID", referencedColumnName = "ID", nullable = false)
    private Property propertyByPropertyId;
    @ManyToOne@JoinColumn(name = "DOCUMENT_ID", referencedColumnName = "ID")
    private Document documentByDocumentId;
    @ManyToOne@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "ID", nullable = false)
    private Employee employeeByEmployeeId;

}

package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;

@Data
@Entity
@Table(name = "PROPERTY_CHANGE", schema = "ICDB", catalog = "")
public class PropertyChange {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "OBJECT_ID", nullable = false, precision = 0)
    private long objectId;
    @Basic@Column(name = "NEW_VALUE", nullable = true, length = 4000)
    private String newValue;
    @Basic@Column(name = "STORE_DATE", nullable = false)
    private Time storeDate;
    @Basic@Column(name = "EMPLOYEE_COMMENT", nullable = true, length = 4000)
    private String employeeComment;
    @Basic@Column(name = "ACCEPT_DATE", nullable = false)
    private Time acceptDate;
    @Basic@Column(name = "DOC_DATE", nullable = true)
    private Time docDate;
    @Basic@Column(name = "DOC_NUMBER", nullable = true, length = 50)
    private String docNumber;
    @Basic@Column(name = "DOC_NAME", nullable = true, length = 500)
    private String docName;
    @Basic@Column(name = "DOC_DATE2", nullable = true)
    private Time docDate2;
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
    private Time extraDateValue;
    @Basic@Column(name = "EXTRA_DATETIME_VALUE", nullable = true)
    private Time extraDatetimeValue;
    @Basic@Column(name = "EXTRA_BOOL_VALUE", nullable = true, precision = 0)
    private Boolean extraBoolValue;
    @Basic@Column(name = "EXTRA_REFERENCE_VALUE", nullable = true, precision = 0)
    private Long extraReferenceValue;
    @Basic@Column(name = "EXTRA_DATE_VALUE2", nullable = true)
    private Time extraDateValue2;
    @Basic@Column(name = "EXTRA_DATE_VALUE3", nullable = true)
    private Time extraDateValue3;
    @Basic@Column(name = "EXTRA_DATE_VALUE4", nullable = true)
    private Time extraDateValue4;
    @Basic@Column(name = "NEW_VALUE_EXT", nullable = true, length = 4000)
    private String newValueExt;
    @Basic@Column(name = "EXTRA_BOOL_VALUE2", nullable = true, precision = 0)
    private Boolean extraBoolValue2;
    @Basic@Column(name = "LAST_EDIT_TIME", nullable = true)
    private Time lastEditTime;
    @ManyToOne@JoinColumn(name = "OBJECT_TYPE", referencedColumnName = "ID", nullable = false)
    private ObjectType objectTypeByObjectType;
    @ManyToOne@JoinColumn(name = "PROPERTY_ID", referencedColumnName = "ID", nullable = false)
    private Property propertyByPropertyId;
    @ManyToOne@JoinColumn(name = "DOCUMENT_ID", referencedColumnName = "ID")
    private Document documentByDocumentId;

}

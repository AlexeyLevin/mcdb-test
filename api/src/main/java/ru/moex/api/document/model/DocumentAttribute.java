package ru.moex.api.document.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import ru.moex.api.core.model.Property;

import javax.persistence.*;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING;

@Data
@Entity
@Table(name = "DOCUMENT_ATTRIBUTE")
//@JsonFormat(shape = STRING ,pattern = "dd-MM-YYYY hh:mm:ss" , timezone="GMT")
public class DocumentAttribute {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "REQUIRED", nullable = true, precision = 0)
    private Boolean required;
    @Basic@Column(name = "AUTOMATIC", nullable = true, precision = 0)
    private Boolean automatic;
    @Basic@Column(name = "EDIT", nullable = true, precision = 0)
    private Boolean edit;
    @Basic@Column(name = "TITLE", nullable = true, length = 150)
    private String title;
    @Basic@Column(name = "ORDER_STATE", nullable = true, precision = 0)
    private Long orderState;
    @Basic@Column(name = "VISIBLE", nullable = false, precision = 0)
    private boolean visible;
    @Basic@Column(name = "OBJECT_REQUEST", nullable = true)
    private String objectRequest;
    @ManyToOne(fetch= FetchType.EAGER)@JoinColumn(name = "DOCUMENT_TYPE", referencedColumnName = "ID", nullable = false)
    private DocumentType documentType;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "PROPERTY", referencedColumnName = "ID", nullable = false)
    private Property property;

}

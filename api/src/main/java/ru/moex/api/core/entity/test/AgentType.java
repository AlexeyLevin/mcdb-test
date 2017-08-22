package ru.moex.api.core.entity.test;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "AGENT_TYPE", schema = "ICDB", catalog = "")
public class AgentType {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "NAME", nullable = true, length = 500)
    private String name;

}

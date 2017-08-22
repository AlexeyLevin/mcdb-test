package ru.moex.api.core.entity.test;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Time;

@Data
@Entity
public class Agent {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "SHORT_NAME", nullable = true, length = 500)
    private String shortName;
    @Basic@Column(name = "OLD_FULL_NAME", nullable = true, length = 500)
    private String oldFullName;
    @Basic@Column(name = "OLD_POSITION", nullable = true, length = 500)
    private String oldPosition;
    @Basic@Column(name = "OLD_TEL", nullable = true, length = 100)
    private String oldTel;
    @Basic@Column(name = "TSID", nullable = true, length = 50)
    private String tsid;
    @Basic@Column(name = "STOCK_LEARN_COMPLETE", nullable = true, precision = 0)
    private Boolean stockLearnComplete;
    @Basic@Column(name = "STOCK_LEARN_COMMENT", nullable = true, length = 500)
    private String stockLearnComment;
    @Basic@Column(name = "DATE_OPENED", nullable = true)
    private Time dateOpened;
    @Basic@Column(name = "FINAL_DATE", nullable = true)
    private Time finalDate;
    @Basic@Column(name = "CURR_DER_DATE_ACCREDITATION", nullable = true)
    private Time currDerDateAccreditation;
    @Basic@Column(name = "CURR_DER_DATE_ACCESS", nullable = true)
    private Time currDerDateAccess;
    @Basic@Column(name = "PERMISSION_FINAL_DATE", nullable = true)
    private Time permissionFinalDate;
    @Basic@Column(name = "CLOSED", nullable = true, precision = 0)
    private Boolean closed;
    @Basic@Column(name = "INTERNET_TRADER", nullable = true, precision = 0)
    private Boolean internetTrader;
    @Basic@Column(name = "NOTE", nullable = true, length = 500)
    private String note;
    @Basic@Column(name = "STOCK_DER_AGENT_TYPE_OLD", nullable = true, precision = 0)
    private Long stockDerAgentTypeOld;
    private Boolean isOperator;
    @Basic@Column(name = "GTA", nullable = true, precision = 0)
    private Boolean gta;
    private Boolean isOperatorVerified;
    @Basic@Column(name = "RTS_EMP_ID", nullable = true, precision = 0)
    private Long rtsEmpId;
    @Basic@Column(name = "TELEFON", nullable = true, length = 100)
    private String telefon;
    private Boolean isClearingIdentifier;
    @Basic@Column(name = "PFD_BEFORE_NAMELESS_ID", nullable = true)
    private Time pfdBeforeNamelessId;
    @Basic@Column(name = "HAS_PERM_BEFORE_NAMELESS_ID", nullable = true, precision = 0)
    private Boolean hasPermBeforeNamelessId;
    @Basic@Column(name = "SERIAL_OVER_VPTS_CONN_TYPE", nullable = true, precision = 0)
    private Long serialOverVptsConnType;
    @Basic@Column(name = "ADDITIONAL_INFORMATION", nullable = true, length = 250)
    private String additionalInformation;
    @Basic@Column(name = "EMPLOYEE_ID", nullable = true, precision = 0)
    private Long employeeId;
    @Basic@Column(name = "STORE_DATE", nullable = true)
    private Time storeDate;
    @Basic@Column(name = "LAST_EDIT_TIME", nullable = true)
    private Time lastEditTime;
    @Basic@Column(name = "SERIAL_OVER_AGENT_TYPE", nullable = true, precision = 0)
    private Long serialOverAgentType;
    @Basic@Column(name = "NO_OFFSYSTEM_TRADE_INSTRUMENT", nullable = true, length = 4000)
    private String noOffsystemTradeInstrument;
    @Basic@Column(name = "OFFSYSTEM_TRADE_INSTRUMENT", nullable = true, length = 4000)
    private String offsystemTradeInstrument;
    @Basic@Column(name = "BR_AUCTION_TRADE_INSTRUMENT", nullable = true, length = 4000)
    private String brAuctionTradeInstrument;
    @Basic@Column(name = "MODE_AOO", nullable = true, precision = 0)
    private Boolean modeAoo;
    @Basic@Column(name = "MODE_BUSL", nullable = true, precision = 0)
    private Boolean modeBusl;
    @Basic@Column(name = "CM_RESTR_ON_ACCOUNT_CODE", nullable = true, precision = 0)
    private Boolean cmRestrOnAccountCode;
    private Boolean isBlocked;
    @Basic@Column(name = "CLIENT_CODE", nullable = true, length = 20)
    private String clientCode;
    private Boolean isSmaIdentifier;
    @Basic@Column(name = "SERV_APP_INSTALLATION_ADDRESS", nullable = true, length = 4000)
    private String servAppInstallationAddress;
    @Basic@Column(name = "IP", nullable = true, length = 2000)
    private String ip;
    @Basic@Column(name = "SOFTWARE_TITLE", nullable = true, length = 500)
    private String softwareTitle;
    @Basic@Column(name = "SOFTWARE_DEVELOPER_TITLE", nullable = true, length = 150)
    private String softwareDeveloperTitle;
    @Basic@Column(name = "INSTRUMENT_RESTRICTION_SELECT", nullable = true, length = 4000)
    private String instrumentRestrictionSelect;
    @Basic@Column(name = "IS_BROAD_FULFIL_TABLE", nullable = true, length = 4000)
    private String isBroadFulfilTable;
    @Basic@Column(name = "OBTAIN_INF_COMMISSION_DATA", nullable = true, length = 4000)
    private String obtainInfCommissionData;
    @Basic@Column(name = "TCA_RESTRICTION_ALLOWED_LIST", nullable = true, length = 4000)
    private String tcaRestrictionAllowedList;
    @Basic@Column(name = "SNILS", nullable = true, length = 2000)
    private String snils;
    @Basic@Column(name = "EMAIL", nullable = true, length = 4000)
    private String email;
    @Basic@Column(name = "TEL_SMS", nullable = true, length = 4000)
    private String telSms;
    @Basic@Column(name = "TEL_NO2", nullable = true, length = 4000)
    private String telNo2;
    private Boolean isElevatorAgent;
    @ManyToOne@JoinColumn(name = "MARKET", referencedColumnName = "ID", nullable = false)
    private Market marketByMarket;
    @ManyToOne@JoinColumn(name = "PARENT_AGENT_ID", referencedColumnName = "ID")
    private Agent agentByParentAgentId;
    @ManyToOne@JoinColumn(name = "AGENT_TYPE", referencedColumnName = "ID")
    private AgentType agentTypeByAgentType;
    @ManyToOne@JoinColumn(name = "MASTER_ID1", referencedColumnName = "ID")
    private Agent agentByMasterId1;
    @ManyToOne@JoinColumn(name = "MASTER_ID2", referencedColumnName = "ID")
    private Agent agentByMasterId2;

    @Basic
    @Column(name = "IS_OPERATOR", nullable = true, precision = 0)
    public Boolean getOperator() {
        return isOperator;
    }

    public void setOperator(Boolean operator) {
        isOperator = operator;
    }

    @Basic
    @Column(name = "IS_OPERATOR_VERIFIED", nullable = true, precision = 0)
    public Boolean getOperatorVerified() {
        return isOperatorVerified;
    }

    public void setOperatorVerified(Boolean operatorVerified) {
        isOperatorVerified = operatorVerified;
    }

    @Basic
    @Column(name = "IS_CLEARING_IDENTIFIER", nullable = true, precision = 0)
    public Boolean getClearingIdentifier() {
        return isClearingIdentifier;
    }

    public void setClearingIdentifier(Boolean clearingIdentifier) {
        isClearingIdentifier = clearingIdentifier;
    }

    @Basic
    @Column(name = "IS_BLOCKED", nullable = true, precision = 0)
    public Boolean getBlocked() {
        return isBlocked;
    }

    public void setBlocked(Boolean blocked) {
        isBlocked = blocked;
    }

    @Basic
    @Column(name = "IS_SMA_IDENTIFIER", nullable = true, precision = 0)
    public Boolean getSmaIdentifier() {
        return isSmaIdentifier;
    }

    public void setSmaIdentifier(Boolean smaIdentifier) {
        isSmaIdentifier = smaIdentifier;
    }

    @Basic
    @Column(name = "IS_ELEVATOR_AGENT", nullable = true, precision = 0)
    public Boolean getElevatorAgent() {
        return isElevatorAgent;
    }

    public void setElevatorAgent(Boolean elevatorAgent) {
        isElevatorAgent = elevatorAgent;
    }

}

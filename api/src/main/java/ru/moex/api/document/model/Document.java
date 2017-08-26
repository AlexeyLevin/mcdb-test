package ru.moex.api.document.model;

import lombok.Data;
import ru.moex.api.permission.model.Employee;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;

@Data
@Entity
@Table
public class Document {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "DATE_BEGIN", nullable = true)
    private LocalDateTime dateBegin;
    @Basic@Column(name = "DATE_END", nullable = true)
    private LocalDateTime dateEnd;
    @Basic@Column(name = "NUMBER_", nullable = true, length = 100)
    private String number;
    @Basic@Column(name = "COUNT", nullable = true, precision = 0)
    private Long count;
    @Basic@Column(name = "NOTE", nullable = true, length = 1500)
    private String note;
    @Basic@Column(name = "DATE_GIVE", nullable = true)
    private LocalDateTime dateGive;
    @Basic@Column(name = "LOCATION", nullable = true, length = 150)
    private String location;
    @Basic@Column(name = "REGISTRATION", nullable = true)
    private LocalDateTime registration;
    @Basic@Column(name = "INTERNAL_NUMBER", nullable = true, precision = 0)
    private Long internalNumber;
    @Basic@Column(name = "INTERNAL_DATE", nullable = true)
    private LocalDateTime internalDate;
    @Basic@Column(name = "COST_SERVICE", nullable = true, precision = 0)
    private Double costService;
    @Basic@Column(name = "COST_EXAMINATION", nullable = true, precision = 0)
    private Double costExamination;
    @Basic@Column(name = "COST_ACCESS_TO_DISPOSITION", nullable = true, precision = 0)
    private Double costAccessToDisposition;
    @Basic@Column(name = "COST_LISTING_INCLUSION", nullable = true, precision = 0)
    private Double costListingInclusion;
    @Basic@Column(name = "COST_SUPPORT_INTO_QUOTED_LIST", nullable = true, precision = 0)
    private Double costSupportIntoQuotedList;
    @Basic@Column(name = "DATE_SENDING_TO_ISSUER", nullable = true)
    private LocalDate dateSendingToIssuer;
    @Basic@Column(name = "DATE_PAYMENT", nullable = true)
    private LocalDate datePayment;
    @Basic@Column(name = "DATE_SERVICE", nullable = true)
    private LocalDateTime dateService;
    @Basic@Column(name = "FIO", nullable = true, length = 500)
    private String fio;
    @Basic@Column(name = "INCOMING_DATE", nullable = true)
    private LocalDate incomingDate;
    @Basic@Column(name = "INCOMING_NUMBER", nullable = true, length = 300)
    private String incomingNumber;
    @Basic@Column(name = "DATE_DECISION", nullable = true)
    private LocalDate dateDecision;
    @Basic@Column(name = "SHORT_CONTENT_DECISION", nullable = true, length = 250)
    private String shortContentDecision;
    @Basic@Column(name = "INITIATOR_SUBJECT", nullable = true, length = 250)
    private String initiatorSubject;
    @Basic@Column(name = "LDAP_NAME", nullable = true, length = 250)
    private String ldapName;
    @Basic@Column(name = "SCOPE_STOCK_MARKET", nullable = true, precision = 0)
    private Boolean scopeStockMarket;
    @Basic@Column(name = "SCOPE_STOCK_DERIVATIVE_MARKET", nullable = true, precision = 0)
    private Boolean scopeStockDerivativeMarket;
    @Basic@Column(name = "SN_ELECTRONIC_KEY", nullable = true, length = 4000)
    private String snElectronicKey;
    @Basic@Column(name = "ADMIT_DATE", nullable = true)
    private LocalDate admitDate;
    @Basic@Column(name = "STORE_DATE", nullable = false)
    private LocalDate storeDate;
    @Basic@Column(name = "E_SIGN_OWNER", nullable = true, length = 500)
    private String eSignOwner;
    @Basic@Column(name = "ACTUAL", nullable = true, precision = 0)
    private Boolean actual;
    @Basic@Column(name = "COUNT_IDENTIFIERS", nullable = true, precision = 0)
    private Long countIdentifiers;
    @Basic@Column(name = "SCOPE_CURRENCY_MARKET", nullable = true, precision = 0)
    private Boolean scopeCurrencyMarket;
    @Basic@Column(name = "SCOPE_CURR_DER_MARKET", nullable = true, precision = 0)
    private Boolean scopeCurrDerMarket;
    @Basic@Column(name = "SETTLEMENT_CODE", nullable = true, length = 4000)
    private String settlementCode;
    @Basic@Column(name = "SCOPE_GOV", nullable = true, precision = 0)
    private Boolean scopeGov;
    @Basic@Column(name = "EXTRA_COMMENT", nullable = true, length = 4000)
    private String extraComment;
    @Basic@Column(name = "SIGNER1_FIO", nullable = true, length = 250)
    private String signer1Fio;
    @Basic@Column(name = "SIGNER1_BEGIN_DATE", nullable = true)
    private LocalDateTime signer1BeginDate;
    @Basic@Column(name = "SIGNER1_END_DATE", nullable = true)
    private LocalDateTime signer1EndDate;
    @Basic@Column(name = "SIGNER2_FIO", nullable = true, length = 250)
    private String signer2Fio;
    @Basic@Column(name = "SIGNER2_BEGIN_DATE", nullable = true)
    private LocalDateTime signer2BeginDate;
    @Basic@Column(name = "SIGNER2_END_DATE", nullable = true)
    private LocalDateTime signer2EndDate;
    @Basic@Column(name = "WORK_SITE_SMA", nullable = true, precision = 0)
    private Boolean workSiteSma;
    @Basic@Column(name = "WORK_SITE_I_STOCK", nullable = true, precision = 0)
    private Boolean workSiteIStock;
    @Basic@Column(name = "WORK_SITE_TI_INTERNET", nullable = true, precision = 0)
    private Boolean workSiteTiInternet;
    @Basic@Column(name = "WORK_SITE_TI_DL", nullable = true, precision = 0)
    private Boolean workSiteTiDl;
    @Basic@Column(name = "GOV_OP_SECOND_MARKET_PAUSE", nullable = true, precision = 0)
    private Boolean govOpSecondMarketPause;
    @Basic@Column(name = "GOV_OP_EDO_PAUSE", nullable = true, precision = 0)
    private Boolean govOpEdoPause;
    @Basic@Column(name = "GOV_OP_ITERDEALER_REPO_PAUSE", nullable = true, precision = 0)
    private Boolean govOpIterdealerRepoPause;
    @Basic@Column(name = "PRESENCE_MICEX", nullable = true, precision = 0)
    private Boolean presenceMicex;
    @Basic@Column(name = "PRESENCE_NCC", nullable = true, precision = 0)
    private Boolean presenceNcc;
    @Basic@Column(name = "SCOPE_MONEY_MARKET", nullable = true, precision = 0)
    private Boolean scopeMoneyMarket;
    @Basic@Column(name = "CURRENCY_INSTRUMENT_TYPES", nullable = true, length = 200)
    private String currencyInstrumentTypes;
    @Basic@Column(name = "SE_DOGOV_ID", nullable = true, precision = 0)
    private Long seDogovId;
    @Basic@Column(name = "REMARK_ABSENT", nullable = true, precision = 0)
    private Boolean remarkAbsent;
    @Basic@Column(name = "NCC_REGISTRY_CODE", nullable = true, length = 12)
    private String nccRegistryCode;
    @Basic@Column(name = "LORO_ACCOUNT", nullable = true, length = 4000)
    private String loroAccount;
    @Basic@Column(name = "TO_DEL", nullable = true, precision = 0)
    private Long toDel;
    @Basic@Column(name = "DATE_GIVE_PAPER", nullable = true)
    private LocalDateTime dateGivePaper;
    @Basic@Column(name = "EVENT_DATE", nullable = true)
    private LocalDateTime eventDate;
    @Basic@Column(name = "DOCUMENT_NAME", nullable = true, length = 500)
    private String documentName;
    @Basic@Column(name = "NOTE_JD", nullable = true, length = 4000)
    private String noteJd;
    @Basic@Column(name = "NOTE_FM", nullable = true, length = 4000)
    private String noteFm;
    @Basic@Column(name = "NOTE_SS", nullable = true, length = 4000)
    private String noteSs;
    @Basic@Column(name = "ACCEPTED", nullable = true, precision = 0)
    private Boolean accepted;
    @Basic@Column(name = "NO_NOTE_CC", nullable = true, precision = 0)
    private Boolean noNoteCc;
    @Basic@Column(name = "NO_NOTE_JD", nullable = true, precision = 0)
    private Boolean noNoteJd;
    @Basic@Column(name = "NO_NOTE_FM", nullable = true, precision = 0)
    private Boolean noNoteFm;
    @Basic@Column(name = "NO_NOTE_SS", nullable = true, precision = 0)
    private Boolean noNoteSs;
    @Basic@Column(name = "NOTE_CC", nullable = true)
    private String noteCc;
    @Basic@Column(name = "NOTE_NCC", nullable = true)
    private String noteNcc;
    @Basic@Column(name = "NO_NOTE_NCC", nullable = true, precision = 0)
    private Boolean noNoteNcc;
    @Basic@Column(name = "TRANSLATE_CC_NOTE_TO_LKU", nullable = true, precision = 0)
    private Boolean translateCcNoteToLku;
    @Basic@Column(name = "TRANSLATE_NCC_NOTE_TO_LKU", nullable = true, precision = 0)
    private Boolean translateNccNoteToLku;
    @Basic@Column(name = "TRANSLATE_JD_NOTE_TO_LKU", nullable = true, precision = 0)
    private Boolean translateJdNoteToLku;
    @Basic@Column(name = "PLACEMENT_VOLUME", nullable = true, precision = 0)
    private Double placementVolume;
    @Basic@Column(name = "REVOCATION_DATE", nullable = true)
    private LocalDateTime revocationDate;
    @Basic@Column(name = "IS_ON_CURRENCY_MRKT", nullable = true, precision = 0)
    private Boolean isOnCurrencyMrkt;
    @Basic@Column(name = "IS_ON_STOCK_MRKT", nullable = true, precision = 0)
    private Boolean isOnStockMrkt;
    @Basic@Column(name = "IS_ON_CURRENCY_DERIVATIVE_MRKT", nullable = true, precision = 0)
    private Boolean isOnCurrencyDerivativeMrkt;
    @Basic@Column(name = "IS_ON_STOCK_DERIVATIVE_MRKT", nullable = true, precision = 0)
    private Boolean isOnStockDerivativeMrkt;
    @Basic@Column(name = "IS_ON_GOVERNMENT_MRKT", nullable = true, precision = 0)
    private Boolean isOnGovernmentMrkt;
    @Basic@Column(name = "IS_IN_CURRENCY_CLEARING", nullable = true, precision = 0)
    private Boolean isInCurrencyClearing;
    @Basic@Column(name = "IS_IN_STOCK_CLEARING", nullable = true, precision = 0)
    private Boolean isInStockClearing;
    @Basic@Column(name = "DATE_GIVE_TO_FSFR", nullable = true, length = 150)
    private String dateGiveToFsfr;
    @Basic@Column(name = "DATE_GIVE_TO_MSE", nullable = true, length = 150)
    private String dateGiveToMse;
    @Basic@Column(name = "PLACEMENT_ADMIT_DATE", nullable = true, length = 150)
    private String placementAdmitDate;
    @Basic@Column(name = "LAST_EDIT_TIME", nullable = true)
    private LocalDateTime lastEditTime;
    @Basic@Column(name = "RTS_DOCUMENT_ID", nullable = true, precision = 0)
    private Long rtsDocumentId;
    @Basic@Column(name = "RTS_NOTE", nullable = true)
    private String rtsNote;
    @Basic@Column(name = "WAS_CREATED_IN_MICEX", nullable = true, precision = 0)
    private Boolean wasCreatedInMicex;
    @Basic@Column(name = "UNIVERSE_DOC_ID", nullable = true, precision = 0)
    private Long universeDocId;
    @Basic@Column(name = "IS_ON_DER_FORTS_MRKT", nullable = true, precision = 0)
    private Boolean isOnDerFortsMrkt;
    @Basic@Column(name = "IS_ON_STOCK_CLASSICA", nullable = true, precision = 0)
    private Boolean isOnStockClassica;
    @Basic@Column(name = "IS_ON_STOCK_STANDARD", nullable = true, precision = 0)
    private Boolean isOnStockStandard;
    @Basic@Column(name = "IS_ON_STOCK_MAIN", nullable = true, precision = 0)
    private Boolean isOnStockMain;
    @Basic@Column(name = "FILE_GATE", nullable = true, precision = 0)
    private Boolean fileGate;
    @Basic@Column(name = "E_CONTRACT_CENTER", nullable = true, precision = 0)
    private Boolean eContractCenter;
    @Basic@Column(name = "IS_ON_MONEY_MRKT", nullable = true, precision = 0)
    private Boolean isOnMoneyMrkt;
    @Basic@Column(name = "IS_ON_COMMODITY_MRKT", nullable = true, precision = 0)
    private Boolean isOnCommodityMrkt;
    @Basic@Column(name = "DATETIME_BEGIN", nullable = true)
    private LocalDateTime datetimeBegin;
    @Basic@Column(name = "ORG_STOPPING_ADM_CAUSE_FORTS", nullable = true, precision = 0)
    private Long orgStoppingAdmCauseForts;
    @Basic@Column(name = "READY_FOR_PUBLICATION", nullable = true, precision = 0)
    private Boolean readyForPublication;
    @Basic@Column(name = "EXIST_ATTACHMENTS", nullable = true, precision = 0)
    private Boolean existAttachments;
    @Basic@Column(name = "IS_FOR_FORTS_STOCK", nullable = true, precision = 0)
    private Boolean isForFortsStock;
    @Basic@Column(name = "IS_FOR_FORTS_MONEY", nullable = true, precision = 0)
    private Boolean isForFortsMoney;
    @Basic@Column(name = "IS_FOR_FORTS_COMMODITY", nullable = true, precision = 0)
    private Boolean isForFortsCommodity;
    @Basic@Column(name = "IS_IN_CLEARING", nullable = true, precision = 0)
    private Boolean isInClearing;
    @Basic@Column(name = "SCOPE_NCC", nullable = true, precision = 0)
    private Boolean scopeNcc;
    @Basic@Column(name = "SKRIN_RECEIPT_DATE", nullable = true)
    private LocalDateTime skrinReceiptDate;
    @Basic@Column(name = "SCOPE_EDO_NSD", nullable = true, precision = 0)
    private Boolean scopeEdoNsd;
    @Basic@Column(name = "IS_OPEN_ENDED", nullable = true, precision = 0)
    private Boolean isOpenEnded;
    @Basic@Column(name = "RC_EXEC_SURNAME", nullable = true, length = 500)
    private String rcExecSurname;
    @Basic@Column(name = "RC_EXEC_FIRSTNAME", nullable = true, length = 500)
    private String rcExecFirstname;
    @Basic@Column(name = "RC_EXEC_PATRONYMIC", nullable = true, length = 500)
    private String rcExecPatronymic;
    @Basic@Column(name = "RC_EXEC_TEL_COUNTRY_CODE", nullable = true, length = 150)
    private String rcExecTelCountryCode;
    @Basic@Column(name = "RC_EXEC_TEL_AREA_CODE", nullable = true, length = 25)
    private String rcExecTelAreaCode;
    @Basic@Column(name = "RC_EXEC_TEL", nullable = true, length = 50)
    private String rcExecTel;
    @Basic@Column(name = "RC_EXEC_INTERNAL_TEL", nullable = true, length = 25)
    private String rcExecInternalTel;
    @Basic@Column(name = "RC_EXEC_TEL_DISPLAY", nullable = true, length = 250)
    private String rcExecTelDisplay;
    @Basic@Column(name = "IS_BROKER_ACCESS_CHANGE", nullable = true, precision = 0)
    private Boolean isBrokerAccessChange;
    @Basic@Column(name = "IS_DEALER_ACCESS_CHANGE", nullable = true, precision = 0)
    private Boolean isDealerAccessChange;
    @Basic@Column(name = "IS_TRUST_ACCESS_CHANGE", nullable = true, precision = 0)
    private Boolean isTrustAccessChange;
    @Basic@Column(name = "CERTIFICATE_SUBJECT", nullable = true, length = 500)
    private String certificateSubject;
    @Basic@Column(name = "IS_ON_MOEX_DERIVATIVE_MARKET", nullable = true, precision = 0)
    private Boolean isOnMoexDerivativeMarket;
    @Basic@Column(name = "IS_ON_SPB_DERIVATIVE_MARKET", nullable = true, precision = 0)
    private Boolean isOnSpbDerivativeMarket;
    @Basic@Column(name = "IS_ON_MEB_DERIVATIVE_MARKET", nullable = true, precision = 0)
    private Boolean isOnMebDerivativeMarket;
    @Basic@Column(name = "HAS_RESTR_ON_TRAD_CLEA_ACCOUNT", nullable = true, precision = 0)
    private Boolean hasRestrOnTradCleaAccount;
    @Basic@Column(name = "IS_IN_MAIN_TRADING_MODE", nullable = true, precision = 0)
    private Boolean isInMainTradingMode;
    @Basic@Column(name = "IS_IN_MAIN_TRADING_MODE_T_PLUS", nullable = true, precision = 0)
    private Boolean isInMainTradingModeTPlus;
    @Basic@Column(name = "HAS_RESTR_ON_COMMISSION", nullable = true, precision = 0)
    private Boolean hasRestrOnCommission;
    @Basic@Column(name = "IS_FOR_ANALYSIS", nullable = true, precision = 0)
    private Boolean isForAnalysis;
    @Basic@Column(name = "IS_FOR_MONITORING", nullable = true, precision = 0)
    private Boolean isForMonitoring;
    @Basic@Column(name = "ACT_AS_CLEARING_MANAGER", nullable = true, precision = 0)
    private Boolean actAsClearingManager;
    @Basic@Column(name = "ACT_AS_CLEARING_OPERATOR", nullable = true, precision = 0)
    private Boolean actAsClearingOperator;
    @Basic@Column(name = "ACT_AS_CLEARING_TRANSFERS", nullable = true, precision = 0)
    private Boolean actAsClearingTransfers;
    @Basic@Column(name = "COUNT_OF_TRADING_AGENTS", nullable = true, precision = 0)
    private Long countOfTradingAgents;
    @Basic@Column(name = "COUNT_OF_ANALYTIC_AGENTS", nullable = true, precision = 0)
    private Long countOfAnalyticAgents;
    @Basic@Column(name = "COUNT_OF_OBSERVATION_AGENTS", nullable = true, precision = 0)
    private Long countOfObservationAgents;
    @Basic@Column(name = "EDGAR_SOURCE_TYPE", nullable = true, length = 500)
    private String edgarSourceType;
    @Basic@Column(name = "IS_BANK_ACCESS_CHANGE", nullable = true, precision = 0)
    private Boolean isBankAccessChange;
    @Basic@Column(name = "IS_FOR_FORTS_COMMODITY2", nullable = true, precision = 0)
    private Boolean isForFortsCommodity2;
    @Basic@Column(name = "ACCOUNT_OMS_SECURE", nullable = true, length = 4000)
    private String accountOmsSecure;
    @Basic@Column(name = "IS_ON_OTC_MRKT", nullable = true, precision = 0)
    private Boolean isOnOtcMrkt;
    @Basic@Column(name = "IS_OMS_CANCELLATION", nullable = true, precision = 0)
    private Boolean isOmsCancellation;
    @Basic@Column(name = "IS_OMS_CLOSED", nullable = true, precision = 0)
    private Boolean isOmsClosed;
    @Basic@Column(name = "IS_GOVERNMENT_CONTRACT", nullable = true, precision = 0)
    private Boolean isGovernmentContract;
    @Basic@Column(name = "INDEX_", nullable = true, length = 50)
    private String index;
    @Basic@Column(name = "BOX", nullable = true, length = 200)
    private String box;
    @Basic@Column(name = "APPLY_BATCH_TARIFF", nullable = true, precision = 0)
    private Boolean applyBatchTariff;
    @Basic@Column(name = "RECOMMENDER", nullable = true, length = 1000)
    private String recommender;
    @Basic@Column(name = "IS_CM_CLEARING_IDENTIFIER", nullable = true, precision = 0)
    private Boolean isCmClearingIdentifier;
    @Basic@Column(name = "CLIENT", nullable = true, length = 500)
    private String client;
    @Basic@Column(name = "HAS_RESTR_ON_SETTLEMENT_CODE", nullable = true, precision = 0)
    private Boolean hasRestrOnSettlementCode;
    @Basic@Column(name = "LORO_ACCOUNT_USD", nullable = true, length = 100)
    private String loroAccountUsd;
    @Basic@Column(name = "NO_OFFSYSTEM_TRADE_INSTRUMENT", nullable = true, length = 4000)
    private String noOffsystemTradeInstrument;
    @Basic@Column(name = "OFFSYSTEM_TRADE_INSTRUMENT", nullable = true, length = 4000)
    private String offsystemTradeInstrument;
    @Basic@Column(name = "BR_AUCTION_TRADE_INSTRUMENT", nullable = true, length = 4000)
    private String brAuctionTradeInstrument;
    @Basic@Column(name = "IS_ON_BR_UNSEC_LOAN", nullable = true, precision = 0)
    private Boolean isOnBrUnsecLoan;
    @Basic@Column(name = "IS_ON_AO", nullable = true, precision = 0)
    private Boolean isOnAo;
    @Basic@Column(name = "DATE_OF_DISCLOSURE", nullable = true)
    private LocalDateTime dateOfDisclosure;
    @Basic@Column(name = "IS_ON_RO", nullable = true, precision = 0)
    private Boolean isOnRo;
    @Basic@Column(name = "CANCEL_RSTR_ON_SETTLEMENT_CODE", nullable = true, precision = 0)
    private Boolean cancelRstrOnSettlementCode;
    @Basic@Column(name = "TR_SYSTEM_CUR_PRECIOUS_METALS", nullable = true, precision = 0)
    private Boolean trSystemCurPreciousMetals;
    @Basic@Column(name = "CL_SYSTEM_CUR_PRECIOUS_METALS", nullable = true, precision = 0)
    private Boolean clSystemCurPreciousMetals;
    @Basic@Column(name = "MICEX_TR_CLR_ACC_NSD_SYSTEMS", nullable = true, precision = 0)
    private Boolean micexTrClrAccNsdSystems;
    @Basic@Column(name = "AGRICULTURAL_PROD_TR_SYSTEM", nullable = true, precision = 0)
    private Boolean agriculturalProdTrSystem;
    @Basic@Column(name = "SETTLEMENT_CODE_BAN", nullable = true, length = 4000)
    private String settlementCodeBan;
    @Basic@Column(name = "IS_BROAD_FULFIL_TABLE", nullable = true, length = 4000)
    private String isBroadFulfilTable;
    @Basic@Column(name = "OTHER_LICENCE_ORGAN", nullable = true, length = 200)
    private String otherLicenceOrgan;
    @Basic@Column(name = "OTHER_LICENCE_TYPE", nullable = true, length = 200)
    private String otherLicenceType;
    @Basic@Column(name = "ACTIVITY_B", nullable = true, precision = 0)
    private Boolean activityB;
    @Basic@Column(name = "ACTIVITY_CLEAR", nullable = true, precision = 0)
    private Boolean activityClear;
    @Basic@Column(name = "ACTIVITY_D", nullable = true, precision = 0)
    private Boolean activityD;
    @Basic@Column(name = "ACTIVITY_DEP", nullable = true, precision = 0)
    private Boolean activityDep;
    @Basic@Column(name = "ACTIVITY_DU", nullable = true, precision = 0)
    private Boolean activityDu;
    @Basic@Column(name = "ACTIVITY_EMI", nullable = true, precision = 0)
    private Boolean activityEmi;
    @Basic@Column(name = "ACTIVITY_F", nullable = true, precision = 0)
    private Boolean activityF;
    @Basic@Column(name = "ACTIVITY_KF", nullable = true, precision = 0)
    private Boolean activityKf;
    @Basic@Column(name = "ACTIVITY_KI", nullable = true, precision = 0)
    private Boolean activityKi;
    @Basic@Column(name = "ACTIVITY_REG", nullable = true, precision = 0)
    private Boolean activityReg;
    @Basic@Column(name = "ACTIVITY_SPEC", nullable = true, precision = 0)
    private Boolean activitySpec;
    @Basic@Column(name = "ACTIVITY_TORG", nullable = true, precision = 0)
    private Boolean activityTorg;
    @Basic@Column(name = "ACTIVITY_U", nullable = true, precision = 0)
    private Boolean activityU;
    @Basic@Column(name = "ATT_DATE", nullable = true)
    private LocalDateTime attDate;
    @Basic@Column(name = "ATT_NUMBER", nullable = true, length = 50)
    private String attNumber;
    @Basic@Column(name = "CANCEL_DATE", nullable = true)
    private LocalDateTime cancelDate;
    @Basic@Column(name = "EKZ_DATE", nullable = true)
    private LocalDateTime ekzDate;
    @Basic@Column(name = "EKZ_NUMBER", nullable = true, length = 50)
    private String ekzNumber;
    @Basic@Column(name = "QUALIFICATION_K", nullable = true, precision = 0)
    private Boolean qualificationK;
    @Basic@Column(name = "QUALIFICATION_R", nullable = true, precision = 0)
    private Boolean qualificationR;
    @Basic@Column(name = "QUALIFICATION_RVS", nullable = true, precision = 0)
    private Boolean qualificationRvs;
    @Basic@Column(name = "QUALIFICATION_S", nullable = true, precision = 0)
    private Boolean qualificationS;
    @Basic@Column(name = "SERIES", nullable = true, length = 50)
    private String series;
    @Basic@Column(name = "PRESENCE_CERTIFICATE", nullable = true, precision = 0)
    private Boolean presenceCertificate;
    @Basic@Column(name = "RC_EXEC_EMAIL", nullable = true, length = 100)
    private String rcExecEmail;
    @Basic@Column(name = "CLIENT_CODE", nullable = true, length = 2000)
    private String clientCode;
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
    @Basic@Column(name = "OBTAIN_INF_COMMISSION_DATA", nullable = true, length = 4000)
    private String obtainInfCommissionData;
    @Basic@Column(name = "CURR_INSTRUMENTS_AND_TRADES", nullable = true, length = 4000)
    private String currInstrumentsAndTrades;
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
    @Basic@Column(name = "SURVEYOR", nullable = true)
    private String surveyor;
    @Basic@Column(name = "RAILWAY_STATION", nullable = true)
    private String railwayStation;
    @Basic@Column(name = "DATE_SECURITY_CHECK", nullable = true)
    private LocalDateTime dateSecurityCheck;
    @Basic@Column(name = "IS_SECURITY_CONCLUSION", nullable = true, precision = 0)
    private Boolean isSecurityConclusion;
    @Basic@Column(name = "OT_NUMBER", nullable = true, length = 1000)
    private String otNumber;
    @Basic@Column(name = "APPLICATION_ORIGINAL", nullable = true, precision = 0)
    private Boolean applicationOriginal;
    @Basic@Column(name = "IP_CLIENT", nullable = true, length = 4000)
    private String ipClient;
    @Basic@Column(name = "IDENTIFIER_LIST", nullable = true, length = 2000)
    private String identifierList;
    @Basic@Column(name = "ACTIVITY_FOREX", nullable = true, precision = 0)
    private Boolean activityForex;
    @Basic@Column(name = "ACTIVITY_PENSION", nullable = true, precision = 0)
    private Boolean activityPension;
    @Basic@Column(name = "IS_ON_BRDM_OR_BRCM", nullable = true, precision = 0)
    private Boolean isOnBrdmOrBrcm;
    @Basic@Column(name = "IS_ON_BRDM", nullable = true, precision = 0)
    private Boolean isOnBrdm;
    @Basic@Column(name = "IS_ON_BRCM", nullable = true, precision = 0)
    private Boolean isOnBrcm;
    @Basic@Column(name = "IS_ON_FTDM", nullable = true, precision = 0)
    private Boolean isOnFtdm;
    @Basic@Column(name = "IS_ON_DEPOSIT_MRKT", nullable = true, precision = 0)
    private Boolean isOnDepositMrkt;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "DOCUMENT_TYPE", referencedColumnName = "ID", nullable = false)
    private DocumentType documentTypeByDocumentType;
    @ManyToOne(fetch=FetchType.EAGER)@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "ID", nullable = false)
    private Employee employeeByEmployeeId;
    @OneToMany(mappedBy = "documentByDocumentId", fetch=FetchType.EAGER)
    private Set<DocumentAttachment> documentAttachmentsById;
    @OneToMany(mappedBy = "documentByDocumentId", fetch=FetchType.EAGER)
    private Collection<DocumentObjectLink> documentObjectLinksById;
}

package ru.moex.api.organization.model;

import lombok.Data;

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
@Table(name = "ORGANIZATION")
public class Organization {
    @Id@Column(name = "ID", nullable = false, precision = 0)
    private long id;
    @Basic@Column(name = "SHORT_NAME", nullable = false, length = 200)
    private String shortName;
    @Basic@Column(name = "FULL_NAME", nullable = true, length = 250)
    private String fullName;
    @Basic@Column(name = "FULL_NAME_ROD", nullable = true, length = 250)
    private String fullNameRod;
    @Basic@Column(name = "MEAN_NAME", nullable = true, length = 250)
    private String meanName;
    @Basic@Column(name = "SHORT_NAME_ENG", nullable = true, length = 200)
    private String shortNameEng;
    @Basic@Column(name = "FULL_NAME_ENG", nullable = true, length = 200)
    private String fullNameEng;
    @Basic@Column(name = "MESTO", nullable = true, length = 1000)
    private String mesto;
    @Basic@Column(name = "POST_ADDR", nullable = true, length = 1000)
    private String postAddr;
    @Basic@Column(name = "FACT_ADDR", nullable = true, length = 1000)
    private String factAddr;
    @Basic@Column(name = "TEL", nullable = true, length = 500)
    private String tel;
    @Basic@Column(name = "FAX", nullable = true, length = 500)
    private String fax;
    @Basic@Column(name = "EMAIL", nullable = true, length = 200)
    private String email;
    @Basic@Column(name = "INTERNET", nullable = true, length = 500)
    private String internet;
    @Basic@Column(name = "INN", nullable = true, length = 40)
    private String inn;
    @Basic@Column(name = "OKPO", nullable = true, length = 10)
    private String okpo;
    @Basic@Column(name = "BIK", nullable = true, length = 20)
    private String bik;
    @Basic@Column(name = "OGRN", nullable = true, length = 50)
    private String ogrn;
    @Basic@Column(name = "REG_DATE", nullable = true)
    private LocalDateTime regDate;
    @Basic@Column(name = "OGRN_DATE", nullable = true)
    private LocalDateTime ogrnDate;
    @Basic@Column(name = "KPP", nullable = true, length = 10)
    private String kpp;
    @Basic@Column(name = "KPP2", nullable = true, length = 10)
    private String kpp2;
    @Basic@Column(name = "OKOGU", nullable = true, length = 50)
    private String okogu;
    @Basic@Column(name = "OKFS", nullable = true, length = 50)
    private String okfs;
    @Basic@Column(name = "BOARD_FIO", nullable = true, length = 100)
    private String boardFio;
    @Basic@Column(name = "BOARD_POSITION", nullable = true, length = 500)
    private String boardPosition;
    @Basic@Column(name = "FPG", nullable = true, length = 900)
    private String fpg;
    @Basic@Column(name = "ASSOCIATION_MEMBERSHIP", nullable = true, length = 1500)
    private String associationMembership;
    @Basic@Column(name = "GCB", nullable = true, length = 500)
    private String gcb;
    @Basic@Column(name = "STAFF_COUNT", nullable = true, precision = 0)
    private Long staffCount;
    @Basic@Column(name = "UT_STOCK", nullable = true, precision = 0)
    private Long utStock;
    @Basic@Column(name = "DECLARATION_ACCEPT_DATE", nullable = true)
    private LocalDateTime declarationAcceptDate;
    @Basic@Column(name = "STOCK_ADMIT_DATE", nullable = true)
    private LocalDateTime stockAdmitDate;
    @Basic@Column(name = "STOCK_ADMIT_PROT_NUMB", nullable = true, precision = 0)
    private Long stockAdmitProtNumb;
    @Basic@Column(name = "STOCK_UNIT_NAME", nullable = true, length = 500)
    private String stockUnitName;
    @Basic@Column(name = "STOCK_UNIT_TEL", nullable = true, length = 500)
    private String stockUnitTel;
    @Basic@Column(name = "STOCK_UNIT_FAX", nullable = true, length = 500)
    private String stockUnitFax;
    @Basic@Column(name = "STOCK_UNIT_EMAIL", nullable = true, length = 100)
    private String stockUnitEmail;
    @Basic@Column(name = "STOCK_UNIT_BOSS_FIO", nullable = true, length = 500)
    private String stockUnitBossFio;
    @Basic@Column(name = "STOCK_UNIT_BOSS_POSITION", nullable = true, length = 500)
    private String stockUnitBossPosition;
    @Basic@Column(name = "STOCK_UNIT_BOSS_TEL", nullable = true, length = 500)
    private String stockUnitBossTel;
    @Basic@Column(name = "STOCK_UNIT_BOSS_FAX", nullable = true, length = 500)
    private String stockUnitBossFax;
    @Basic@Column(name = "STOCK_UNIT_BOSS_EMAIL", nullable = true, length = 100)
    private String stockUnitBossEmail;
    @Basic@Column(name = "EDO_MAIL", nullable = true, length = 200)
    private String edoMail;
    @Basic@Column(name = "STOCK_MARKET_ACCEPT", nullable = true, precision = 0)
    private Boolean stockMarketAccept;
    @Basic@Column(name = "SFR", nullable = true, precision = 0)
    private Long sfr;
    @Basic@Column(name = "SFR_ACCEPT_DATE", nullable = true)
    private LocalDateTime sfrAcceptDate;
    @Basic@Column(name = "SFR_EXCLUDE_DATE", nullable = true)
    private LocalDateTime sfrExcludeDate;
    @Basic@Column(name = "SFR_REJECT_INFO", nullable = true, length = 1000)
    private String sfrRejectInfo;
    @Basic@Column(name = "UT_STOCK_DERIVATIVE", nullable = true, precision = 0)
    private Long utStockDerivative;
    @Basic@Column(name = "STOCK_DER_ADMIT_DATE", nullable = true)
    private LocalDateTime stockDerAdmitDate;
    @Basic@Column(name = "STOCK_DER_ADMIT_PROT", nullable = true, precision = 0)
    private Long stockDerAdmitProt;
    @Basic@Column(name = "SSR", nullable = true, precision = 0)
    private Long ssr;
    @Basic@Column(name = "STOCK_DER_ACCOUNTS", nullable = true, precision = 0)
    private Boolean stockDerAccounts;
    @Basic@Column(name = "BENEFITS", nullable = true, length = 500)
    private String benefits;
    @Basic@Column(name = "STOCK_DER_ADMIT_PAYMENT_SUM", nullable = true, precision = 0)
    private Double stockDerAdmitPaymentSum;
    @Basic@Column(name = "STOCK_DER_ADMIT_PAYMENT_DATE", nullable = true)
    private LocalDateTime stockDerAdmitPaymentDate;
    @Basic@Column(name = "STOCK_DER_AFTER_PAYMENT_SUM", nullable = true, precision = 0)
    private Double stockDerAfterPaymentSum;
    @Basic@Column(name = "STOCK_DER_AFTER_PAYMENT_DATE", nullable = true)
    private LocalDateTime stockDerAfterPaymentDate;
    @Basic@Column(name = "REGISTRY_HOLDER_CONTRACT_NUM", nullable = true, length = 300)
    private String registryHolderContractNum;
    @Basic@Column(name = "REGISTRY_HOLDER_CONTRACT_DATE", nullable = true)
    private LocalDateTime registryHolderContractDate;
    @Basic@Column(name = "REGISTRY_CERTIFICATE_NUMBER", nullable = true, length = 500)
    private String registryCertificateNumber;
    @Basic@Column(name = "VOTE_STOCK_PIE", nullable = true, precision = 0)
    private Double voteStockPie;
    @Basic@Column(name = "VOTE_STOCK_NUMBER", nullable = true, precision = 0)
    private Double voteStockNumber;
    @Basic@Column(name = "STATE_STOCK_PIE", nullable = true, precision = 0)
    private Double stateStockPie;
    @Basic@Column(name = "STATE_STOCK_NUMBER", nullable = true, precision = 0)
    private Double stateStockNumber;
    @Basic@Column(name = "COMMON_STOCK_VOLUME", nullable = true, precision = 0)
    private Double commonStockVolume;
    @Basic@Column(name = "COMMON_STOCK_NUMBER", nullable = true, precision = 0)
    private Double commonStockNumber;
    @Basic@Column(name = "PREF_STOCK_VOLUME", nullable = true, precision = 0)
    private Double prefStockVolume;
    @Basic@Column(name = "PREF_STOCK_NUMBER", nullable = true, precision = 0)
    private Double prefStockNumber;
    @Basic@Column(name = "AUTHORIZED_CAPITAL_VOLUME", nullable = true, precision = 0)
    private Double authorizedCapitalVolume;
    @Basic@Column(name = "AUTHORIZED_CAPITAL_NUMBER", nullable = true, precision = 0)
    private Double authorizedCapitalNumber;
    @Basic@Column(name = "AUTHORIZED_ORGAN", nullable = true, length = 500)
    private String authorizedOrgan;
    @Basic@Column(name = "AUTHORIZED_PERSON_FIO", nullable = true, length = 500)
    private String authorizedPersonFio;
    @Basic@Column(name = "AUTHORIZED_PERSON_POSITION", nullable = true, length = 500)
    private String authorizedPersonPosition;
    @Basic@Column(name = "LISTING_AGENT_DESCRIPTION", nullable = true, length = 4000)
    private String listingAgentDescription;
    @Basic@Column(name = "STOCK_TRADE_ADMIT_DATE", nullable = true)
    private LocalDateTime stockTradeAdmitDate;
    @Basic@Column(name = "STOCK_DER_TRADE_ADMIT_DATE", nullable = true)
    private LocalDateTime stockDerTradeAdmitDate;
    @Basic@Column(name = "STOCK_ADMIT_PAYMENT_SUM", nullable = true, precision = 0)
    private Double stockAdmitPaymentSum;
    @Basic@Column(name = "STOCK_ADMIT_PAYMENT_DATE", nullable = true)
    private LocalDateTime stockAdmitPaymentDate;
    @Basic@Column(name = "CEO_ID", nullable = true, precision = 0)
    private Long ceoId;
    @Basic@Column(name = "FIELDS", nullable = true, length = 4000)
    private String fields;
    @Basic@Column(name = "UT_CURR_DER", nullable = true, precision = 0)
    private Long utCurrDer;
    @Basic@Column(name = "UT_CURRENCY", nullable = true, precision = 0)
    private Long utCurrency;
    @Basic@Column(name = "FPR", nullable = true, precision = 0)
    private Boolean fpr;
    @Basic@Column(name = "CURRENCY_CLEARING", nullable = true, precision = 0)
    private Boolean currencyClearing;
    @Basic@Column(name = "SE_ID", nullable = true, precision = 0)
    private Long seId;
    @Basic@Column(name = "CLEARING_RP_ACCOUNTS_OPEN_DATE", nullable = true)
    private LocalDateTime clearingRpAccountsOpenDate;
    @Basic@Column(name = "REPORTDB_ID", nullable = true, precision = 0)
    private Long reportdbId;
    @Basic@Column(name = "UT_COMMODITY", nullable = true, precision = 0)
    private Long utCommodity;
    @Basic@Column(name = "CURR_DER_TRADE_ADMIT_DATE", nullable = true)
    private LocalDateTime currDerTradeAdmitDate;
    @Basic@Column(name = "CURR_DER_ADMIT_PAYMENT_SUM", nullable = true, precision = 0)
    private Double currDerAdmitPaymentSum;
    @Basic@Column(name = "CURR_DER_ADMIT_PAYMENT_DATE", nullable = true)
    private LocalDateTime currDerAdmitPaymentDate;
    @Basic@Column(name = "OSCAR_ID", nullable = true, precision = 0)
    private Long oscarId;
    @Basic@Column(name = "GOV_TRADE_ADMIT_DATE", nullable = true)
    private LocalDateTime govTradeAdmitDate;
    @Basic@Column(name = "BR_UNSEC_LOAN_TRADE_ADMIT_DATE", nullable = true)
    private LocalDateTime brUnsecLoanTradeAdmitDate;
    @Basic@Column(name = "BR_DEPOSIT_TRADE_ADMIT_DATE", nullable = true)
    private LocalDateTime brDepositTradeAdmitDate;
    @Basic@Column(name = "BR_CREDIT_TRADE_ACCEPT_DATE", nullable = true)
    private LocalDateTime brCreditTradeAcceptDate;
    @Basic@Column(name = "BR_OFFEX_REPO_TRADE_ADMIT_DATE", nullable = true)
    private LocalDateTime brOffexRepoTradeAdmitDate;
    @Basic@Column(name = "VEB_DEPOSIT_TRADE_ADMIT_DATE", nullable = true)
    private LocalDateTime vebDepositTradeAdmitDate;
    @Basic@Column(name = "CURRENCY_MARKET_ACCEPT", nullable = true, precision = 0)
    private Boolean currencyMarketAccept;
    @Basic@Column(name = "GOV_OP_OWN_EXPENSE_ACCEPT", nullable = true, precision = 0)
    private Boolean govOpOwnExpenseAccept;
    @Basic@Column(name = "GOV_OP_INVESTOR_EXPENSE_ACCEPT", nullable = true, precision = 0)
    private Boolean govOpInvestorExpenseAccept;
    @Basic@Column(name = "GOV_OP_INTERDEALER_REPO_ACCEPT", nullable = true, precision = 0)
    private Boolean govOpInterdealerRepoAccept;
    @Basic@Column(name = "GOV_OP_BR_DEALER_REPO_ACCEPT", nullable = true, precision = 0)
    private Boolean govOpBrDealerRepoAccept;
    @Basic@Column(name = "BR_UNSEC_LOAN_MARKET_ACCEPT", nullable = true, precision = 0)
    private Boolean brUnsecLoanMarketAccept;
    @Basic@Column(name = "BR_DEPOSIT_MARKET_ACCEPT", nullable = true, precision = 0)
    private Boolean brDepositMarketAccept;
    @Basic@Column(name = "BR_CREDIT_MARKET_ACCEPT", nullable = true, precision = 0)
    private Boolean brCreditMarketAccept;
    @Basic@Column(name = "VEB_DEPOSIT_MARKET_ACCEPT", nullable = true, precision = 0)
    private Boolean vebDepositMarketAccept;
    @Basic@Column(name = "SAVING_BONDS_MARKET_ACCEPT", nullable = true, precision = 0)
    private Boolean savingBondsMarketAccept;
    @Basic@Column(name = "BR_OFFEX_REPO_MARKET_ACCEPT", nullable = true, precision = 0)
    private Boolean brOffexRepoMarketAccept;
    @Basic@Column(name = "LISTING_AGENT_COMMENT", nullable = true, length = 500)
    private String listingAgentComment;
    @Basic@Column(name = "INFORM_AGENCY_IDENTIFIER", nullable = true, length = 4000)
    private String informAgencyIdentifier;
    @Basic@Column(name = "CURR_DER_ADDITION_INFO", nullable = true, length = 4000)
    private String currDerAdditionInfo;
    @Basic@Column(name = "CB_REGISTRY_NUMBER", nullable = true, length = 10)
    private String cbRegistryNumber;
    @Basic@Column(name = "KIO", nullable = true, length = 10)
    private String kio;
    @Basic@Column(name = "OON_REGISTRY_NUMBER", nullable = true, length = 10)
    private String oonRegistryNumber;
    @Basic@Column(name = "CB_REGISTRY_DATE", nullable = true)
    private LocalDateTime cbRegistryDate;
    @Basic@Column(name = "OON_REGISTRY_DATE", nullable = true)
    private LocalDateTime oonRegistryDate;
    @Basic@Column(name = "NATURAL_MONOPOLY", nullable = true, precision = 0)
    private Boolean naturalMonopoly;
    @Basic@Column(name = "STOCK_MARKET_INFO", nullable = true)
    private String stockMarketInfo;
    @Basic@Column(name = "STOCK_DERIVATIVE_MARKET_INFO", nullable = true)
    private String stockDerivativeMarketInfo;
    @Basic@Column(name = "CURR_DER_MARKET_INFO", nullable = true)
    private String currDerMarketInfo;
    @Basic@Column(name = "CURRENCY_MARKET_INFO", nullable = true)
    private String currencyMarketInfo;
    @Basic@Column(name = "COMMODITY_MARKET_INFO", nullable = true)
    private String commodityMarketInfo;
    @Basic@Column(name = "GOVERNMENTS_MARKET_INFO", nullable = true)
    private String governmentsMarketInfo;
    @Basic@Column(name = "BR_UNSECURED_LOAN_MARKET_INFO", nullable = true)
    private String brUnsecuredLoanMarketInfo;
    @Basic@Column(name = "BR_DEPOSIT_MARKET_INFO", nullable = true)
    private String brDepositMarketInfo;
    @Basic@Column(name = "BR_CREDIT_MARKET_INFO", nullable = true)
    private String brCreditMarketInfo;
    @Basic@Column(name = "OFF_EXCHANGE_REPO_MARKET_INFO", nullable = true)
    private String offExchangeRepoMarketInfo;
    @Basic@Column(name = "VEB_DEPOSIT_MARKET_INFO", nullable = true)
    private String vebDepositMarketInfo;
    @Basic@Column(name = "SAVING_BONDS_MARKET_INFO", nullable = true)
    private String savingBondsMarketInfo;
    @Basic@Column(name = "UT_DOSSIER_DATE", nullable = true)
    private LocalDateTime utDossierDate;
    @Basic@Column(name = "TOP100_CURRENCY", nullable = true, precision = 0)
    private Boolean top100Currency;
    @Basic@Column(name = "REGISTRY_ORGAN", nullable = true, length = 500)
    private String registryOrgan;
    @Basic@Column(name = "RISK_LEVEL", nullable = true, precision = 0)
    private Long riskLevel;
    @Basic@Column(name = "TS_COMPANYID", nullable = true, precision = 0)
    private Long tsCompanyid;
    @Basic@Column(name = "FILIAL_NUM", nullable = true, precision = 0)
    private Long filialNum;
    @Basic@Column(name = "TEL_AREACODE", nullable = true, length = 10)
    private String telAreacode;
    @Basic@Column(name = "FAX_AREACODE", nullable = true, length = 10)
    private String faxAreacode;
    @Basic@Column(name = "BIC_DO_NOT_USE", nullable = true, length = 20)
    private String bicDoNotUse;
    @Basic@Column(name = "SWIFT", nullable = true, length = 50)
    private String swift;
    @Basic@Column(name = "OKATO", nullable = true, length = 20)
    private String okato;
    @Basic@Column(name = "REGISTRY_NUMBER_2002", nullable = true, length = 50)
    private String registryNumber2002;
    @Basic@Column(name = "REGISTRY_ORGAN_2002", nullable = true, length = 250)
    private String registryOrgan2002;
    @Basic@Column(name = "REGISTRY_PLACE", nullable = true, length = 100)
    private String registryPlace;
    @Basic@Column(name = "MAIN_COMMITEE_NAME", nullable = true, length = 100)
    private String mainCommiteeName;
    @Basic@Column(name = "NO_COL_COMMITEE", nullable = true, precision = 0)
    private Boolean noColCommitee;
    @Basic@Column(name = "COL_COMMITEE_NAME", nullable = true, length = 100)
    private String colCommiteeName;
    @Basic@Column(name = "BOARD_FIRSTNAME", nullable = true, length = 100)
    private String boardFirstname;
    @Basic@Column(name = "BOARD_PATRONYMIC", nullable = true, length = 100)
    private String boardPatronymic;
    @Basic@Column(name = "NO_EXECUTIVE_COMMITEE", nullable = true, precision = 0)
    private Boolean noExecutiveCommitee;
    @Basic@Column(name = "EXECUTIVE_COMMITEE_NAME", nullable = true, length = 100)
    private String executiveCommiteeName;
    @Basic@Column(name = "ORGANS_IN_PLACE", nullable = true, precision = 0)
    private Boolean organsInPlace;
    @Basic@Column(name = "ORGANS_PLACE_OTHER", nullable = true, length = 500)
    private String organsPlaceOther;
    @Basic@Column(name = "NO_MOSCOW", nullable = true, precision = 0)
    private Boolean noMoscow;
    @Basic@Column(name = "MOSCOW_ADDR", nullable = true, length = 500)
    private String moscowAddr;
    @Basic@Column(name = "MOSCOW_TEL", nullable = true, length = 100)
    private String moscowTel;
    @Basic@Column(name = "MOSCOW_TEL_AREACODE", nullable = true, length = 10)
    private String moscowTelAreacode;
    @Basic@Column(name = "MOSCOW_BOSS", nullable = true, length = 100)
    private String moscowBoss;
    @Basic@Column(name = "MOSCOW_BOSS_FIRSTNAME", nullable = true, length = 100)
    private String moscowBossFirstname;
    @Basic@Column(name = "MOSCOW_BOSS_PATRONYMIC", nullable = true, length = 100)
    private String moscowBossPatronymic;
    @Basic@Column(name = "AUTH_CAPITAL_VOL", nullable = true, length = 100)
    private String authCapitalVol;
    @Basic@Column(name = "AUTH_CAPITAL_VOLLIT", nullable = true, length = 200)
    private String authCapitalVollit;
    @Basic@Column(name = "FULLY_PAID", nullable = true, precision = 0)
    private Boolean fullyPaid;
    @Basic@Column(name = "UNPAID_AUTH_CAPITAL_VOL", nullable = true, length = 100)
    private String unpaidAuthCapitalVol;
    @Basic@Column(name = "UNPAID_AUTH_CAPITAL_VOLLIT", nullable = true, length = 200)
    private String unpaidAuthCapitalVollit;
    @Basic@Column(name = "NO_INDIRECT_OWNERS", nullable = true, precision = 0)
    private Boolean noIndirectOwners;
    @Basic@Column(name = "NO_NCC_PROFITERS", nullable = true, precision = 0)
    private Boolean noNccProfiters;
    @Basic@Column(name = "CORR_ACC_CORR_COUNTR", nullable = true, length = 1000)
    private String corrAccCorrCountr;
    @Basic@Column(name = "NO_CORR_ACC_CORR_COUNTR", nullable = true, precision = 0)
    private Boolean noCorrAccCorrCountr;
    @Basic@Column(name = "CORR_ACC_OFFSHORE", nullable = true, length = 1000)
    private String corrAccOffshore;
    @Basic@Column(name = "NO_CORR_ACC_OFFSHORE", nullable = true, precision = 0)
    private Boolean noCorrAccOffshore;
    @Basic@Column(name = "CORR_ACC_DRUG", nullable = true, length = 1000)
    private String corrAccDrug;
    @Basic@Column(name = "NO_CORR_ACC_DRUG", nullable = true, precision = 0)
    private Boolean noCorrAccDrug;
    @Basic@Column(name = "NO_SHELL_BANK_ACC", nullable = true, precision = 0)
    private Boolean noShellBankAcc;
    @Basic@Column(name = "AT_CONTROL_EMPLOYEE_F", nullable = true, length = 100)
    private String atControlEmployeeF;
    @Basic@Column(name = "AT_CONTROL_EMPLOYEE_I", nullable = true, length = 100)
    private String atControlEmployeeI;
    @Basic@Column(name = "AT_CONTROL_EMPLOYEE_O", nullable = true, length = 100)
    private String atControlEmployeeO;
    @Basic@Column(name = "AT_CONTROL_RULES", nullable = true, precision = 0)
    private Boolean atControlRules;
    @Basic@Column(name = "AT_CONTROL_RULES_CONTR", nullable = true, precision = 0)
    private Boolean atControlRulesContr;
    @Basic@Column(name = "AT_IDENTIFICATION", nullable = true, precision = 0)
    private Boolean atIdentification;
    @Basic@Column(name = "AT_CONTROL_OF_OPERATION", nullable = true, precision = 0)
    private Boolean atControlOfOperation;
    @Basic@Column(name = "AT_CONTROL_TRAINING", nullable = true, precision = 0)
    private Boolean atControlTraining;
    @Basic@Column(name = "MOSCOW_BOSS_POSITION", nullable = true, length = 100)
    private String moscowBossPosition;
    @Basic@Column(name = "LA_RII_INFO", nullable = true, length = 1000)
    private String laRiiInfo;
    @Basic@Column(name = "LA_PUBLICATION_STATE", nullable = true, precision = 0)
    private Boolean laPublicationState;
    @Basic@Column(name = "LKU_ACCESS_DATE", nullable = true)
    private LocalDateTime lkuAccessDate;
    @Basic@Column(name = "LAST_EDIT_TIME", nullable = true)
    private LocalDateTime lastEditTime;
    @Basic@Column(name = "CC_NP_STATUS", nullable = true, precision = 0)
    private Boolean ccNpStatus;
    @Basic@Column(name = "CC_NP", nullable = true)
    private LocalDateTime ccNp;
    @Basic@Column(name = "FORTS_RF_STATUS", nullable = true, precision = 0)
    private Boolean fortsRfStatus;
    @Basic@Column(name = "FORTS_RF_DATE", nullable = true)
    private LocalDateTime fortsRfDate;
    @Basic@Column(name = "FORTS_SETUP", nullable = true)
    private LocalDateTime fortsSetup;
    @Basic@Column(name = "FORTS_STOCK_DATE", nullable = true)
    private LocalDateTime fortsStockDate;
    @Basic@Column(name = "FORTS_MONEY_DATE", nullable = true)
    private LocalDateTime fortsMoneyDate;
    @Basic@Column(name = "FORTS_COM_DATE", nullable = true)
    private LocalDateTime fortsComDate;
    @Basic@Column(name = "OAO_DATE_NEW", nullable = true)
    private LocalDateTime oaoDateNew;
    @Basic@Column(name = "CLASSIC_MARKET_DATE", nullable = true)
    private LocalDateTime classicMarketDate;
    @Basic@Column(name = "RTS_STD_STATUS", nullable = true, precision = 0)
    private Boolean rtsStdStatus;
    @Basic@Column(name = "RTS_STD_DATE", nullable = true)
    private LocalDateTime rtsStdDate;
    @Basic@Column(name = "MONEY_STATUS", nullable = true, precision = 0)
    private Boolean moneyStatus;
    @Basic@Column(name = "MONEY_SETUP", nullable = true)
    private LocalDateTime moneySetup;
    @Basic@Column(name = "ASP_SIGN", nullable = true)
    private LocalDateTime aspSign;
    @Basic@Column(name = "ASP_SIGN_TC", nullable = true)
    private LocalDateTime aspSignTc;
    @Basic@Column(name = "NDOC", nullable = true, precision = 0)
    private Long ndoc;
    @Basic@Column(name = "RTS_SERT_DATE", nullable = true)
    private LocalDateTime rtsSertDate;
    @Basic@Column(name = "CODE_RF", nullable = true, length = 10)
    private String codeRf;
    @Basic@Column(name = "CODE_RTS", nullable = true, length = 10)
    private String codeRts;
    @Basic@Column(name = "RTS_FIRMID", nullable = true, length = 10)
    private String rtsFirmid;
    @Basic@Column(name = "CC_NP_NUMBER", nullable = true, length = 100)
    private String ccNpNumber;
    @Basic@Column(name = "FORTS_STATUS_OLD", nullable = true, precision = 0)
    private Boolean fortsStatusOld;
    @Basic@Column(name = "FORTS_SETUP_OLD", nullable = true)
    private LocalDateTime fortsSetupOld;
    @Basic@Column(name = "FORTS_STOCK_STATUS_OLD", nullable = true, precision = 0)
    private Boolean fortsStockStatusOld;
    @Basic@Column(name = "FORTS_STOCK_DATE_OLD", nullable = true)
    private LocalDateTime fortsStockDateOld;
    @Basic@Column(name = "FORTS_MONEY_STATUS_OLD", nullable = true, precision = 0)
    private Boolean fortsMoneyStatusOld;
    @Basic@Column(name = "FORTS_MONEY_DATE_OLD", nullable = true)
    private LocalDateTime fortsMoneyDateOld;
    @Basic@Column(name = "FORTS_COM_STATUS_OLD", nullable = true, precision = 0)
    private Boolean fortsComStatusOld;
    @Basic@Column(name = "FORTS_COM_DATE_OLD", nullable = true)
    private LocalDateTime fortsComDateOld;
    @Basic@Column(name = "NO_FIVE_HOLDERS", nullable = true, precision = 0)
    private Boolean noFiveHolders;
    @Basic@Column(name = "STOCK_MAIN_NCC_CLEARING", nullable = true, precision = 0)
    private Boolean stockMainNccClearing;
    @Basic@Column(name = "FT_DEPOSIT_TRADE_ADMIT_DATE", nullable = true)
    private LocalDateTime ftDepositTradeAdmitDate;
    @Basic@Column(name = "FT_DEPOSIT_MARKET_ACCEPT", nullable = true, precision = 0)
    private Boolean ftDepositMarketAccept;
    @Basic@Column(name = "FT_DEPOSIT_MARKET_INFO", nullable = true)
    private String ftDepositMarketInfo;
    @Basic@Column(name = "TIDM", nullable = true, length = 20)
    private String tidm;
    @Basic@Column(name = "DVS_CONTRACT_STATUS", nullable = true, precision = 0)
    private Boolean dvsContractStatus;
    @Basic@Column(name = "SPB_STATUS", nullable = true, precision = 0)
    private Boolean spbStatus;
    @Basic@Column(name = "MEB_STATUS", nullable = true, precision = 0)
    private Boolean mebStatus;
    @Basic@Column(name = "GAZPROM_STATUS", nullable = true, precision = 0)
    private Boolean gazpromStatus;
    @Basic@Column(name = "CIK", nullable = true, length = 20)
    private String cik;
    @Basic@Column(name = "NO_ACC_FOR_NON_CRED_ORG_NEEDED", nullable = true, precision = 0)
    private Boolean noAccForNonCredOrgNeeded;
    @Basic@Column(name = "FORTS_NCC_CLEARING_ACCESS", nullable = true, precision = 0)
    private Long fortsNccClearingAccess;
    @Basic@Column(name = "CLASSICA_NCC_CLEARING_ACCESS", nullable = true, precision = 0)
    private Long classicaNccClearingAccess;
    @Basic@Column(name = "STANDARD_NCC_CLEARING_ACCESS", nullable = true, precision = 0)
    private Long standardNccClearingAccess;
    @Basic@Column(name = "STOCK_MAIN_NCC_CLEARING_ACC", nullable = true, precision = 0)
    private Long stockMainNccClearingAcc;
    @Basic@Column(name = "CURR_NCC_CLEARING_ACCESS", nullable = true, precision = 0)
    private Long currNccClearingAccess;
    @Basic@Column(name = "SPB_NCC_CLEARING_ACCESS", nullable = true, precision = 0)
    private Long spbNccClearingAccess;
    @Basic@Column(name = "GAZPROM_NCC_CLEARING_ACCESS", nullable = true, precision = 0)
    private Long gazpromNccClearingAccess;
    @Basic@Column(name = "MEB_NCC_CLEARING_ACCESS", nullable = true, precision = 0)
    private Long mebNccClearingAccess;
    @Basic@Column(name = "COMMODITY_ADMIT_PAYMENT_SUM", nullable = true, precision = 0)
    private Double commodityAdmitPaymentSum;
    @Basic@Column(name = "COMMODITY_ADMIT_PAYMENT_DATE", nullable = true)
    private LocalDateTime commodityAdmitPaymentDate;
    @Basic@Column(name = "COMMODITY_CONTRACT_NUMBER", nullable = true, length = 20)
    private String commodityContractNumber;
    @Basic@Column(name = "COMMODITY_CONTRACT_DATE", nullable = true)
    private LocalDateTime commodityContractDate;
    @Basic@Column(name = "COMMODITY_ACCESS_DATE", nullable = true)
    private LocalDateTime commodityAccessDate;
    @Basic@Column(name = "REGISTRY_DOC_SERIES", nullable = true, length = 2)
    private String registryDocSeries;
    @Basic@Column(name = "REGISTRY_DOC_NUMBER", nullable = true, length = 10)
    private String registryDocNumber;
    @Basic@Column(name = "AT_CONTROL_EMPLOYEE_POS", nullable = true, length = 250)
    private String atControlEmployeePos;
    @Basic@Column(name = "AT_CONTROL_EMPLOYEE_TEL", nullable = true, length = 100)
    private String atControlEmployeeTel;
    @Basic@Column(name = "AT_CONTROL_EMPLOYEE_EMAIL", nullable = true, length = 100)
    private String atControlEmployeeEmail;
    @Basic@Column(name = "PF_MARKET_ACCEPT", nullable = true, precision = 0)
    private Boolean pfMarketAccept;
    @Basic@Column(name = "PF_MARKET_INFO", nullable = true)
    private String pfMarketInfo;
    @Basic@Column(name = "TEL_NUMBER", nullable = true, length = 25)
    private String telNumber;
    @Basic@Column(name = "TEL_INTERNAL_NUMBER", nullable = true, length = 25)
    private String telInternalNumber;
    @Basic@Column(name = "FAX_NUMBER", nullable = true, length = 25)
    private String faxNumber;
    @Basic@Column(name = "FAX_INTERNAL_NUMBER", nullable = true, length = 25)
    private String faxInternalNumber;
    @Basic@Column(name = "POST_ADDR_INDEX", nullable = true, length = 20)
    private String postAddrIndex;
    @Basic@Column(name = "POST_ADDR_DISTRICT", nullable = true, length = 100)
    private String postAddrDistrict;
    @Basic@Column(name = "POST_ADDR_CITY", nullable = true, length = 100)
    private String postAddrCity;
    @Basic@Column(name = "POST_ADDR_STREET", nullable = true, length = 100)
    private String postAddrStreet;
    @Basic@Column(name = "POST_ADDR_BUILDING", nullable = true, length = 100)
    private String postAddrBuilding;
    @Basic@Column(name = "POST_ADDR_ADDITIONAL", nullable = true, length = 100)
    private String postAddrAdditional;
    @Basic@Column(name = "MOSCOW_TEL_NUMBER", nullable = true, length = 25)
    private String moscowTelNumber;
    @Basic@Column(name = "MOSCOW_TEL_INTERNAL_NUMBER", nullable = true, length = 25)
    private String moscowTelInternalNumber;
    @Basic@Column(name = "STOCK_MARKET_GUARANTEE_FUND", nullable = true, precision = 0)
    private Boolean stockMarketGuaranteeFund;
    @Basic@Column(name = "MMTB_STATUS", nullable = true, precision = 0)
    private Boolean mmtbStatus;
    @Basic@Column(name = "MMTB_DATE", nullable = true)
    private LocalDateTime mmtbDate;
    @Basic@Column(name = "FORTS_MARKET_INFO", nullable = true)
    private String fortsMarketInfo;
    @Basic@Column(name = "MMTB_CODE", nullable = true, length = 5)
    private String mmtbCode;
    @Basic@Column(name = "STOCK_MARKET_CLEARING_INFO", nullable = true)
    private String stockMarketClearingInfo;
    @Basic@Column(name = "CURRENCY_MARKET_CLEARING_INFO", nullable = true)
    private String currencyMarketClearingInfo;
    @Basic@Column(name = "FORTS_MARKET_CLEARING_INFO", nullable = true)
    private String fortsMarketClearingInfo;
    @Basic@Column(name = "MMTB_RESOURCE_HOLDER", nullable = true, precision = 0)
    private Boolean mmtbResourceHolder;
    @Basic@Column(name = "IS_VIP_CLIENT", nullable = true, precision = 0)
    private Boolean isVipClient;
    @Basic@Column(name = "SM_PLACEMENT_FIXED_PLAN", nullable = true, precision = 0)
    private Boolean smPlacementFixedPlan;
    @Basic@Column(name = "FATF_LIST_PARTICIPATION", nullable = true, precision = 0)
    private Boolean fatfListParticipation;
    @Basic@Column(name = "STOCK_ADMIT_PROT", nullable = true, length = 50)
    private String stockAdmitProt;
    @Basic@Column(name = "OTC_DEALER_ACCESS_MODE", nullable = true, precision = 0)
    private Long otcDealerAccessMode;
    @Basic@Column(name = "MM_REPORT_EMAIL", nullable = true, length = 250)
    private String mmReportEmail;
    @Basic@Column(name = "ACCOUNT_OMS_SECURE", nullable = true, precision = 0)
    private Boolean accountOmsSecure;
    @Basic@Column(name = "IS_READY_FOR_FT_MARKET", nullable = true, precision = 0)
    private Boolean isReadyForFtMarket;
    @Basic@Column(name = "NO_BENEFICIARY", nullable = true, precision = 0)
    private Boolean noBeneficiary;
    @Basic@Column(name = "BENEFICIARY_OTHER", nullable = true, length = 4000)
    private String beneficiaryOther;
    @Basic@Column(name = "BUSINESS_REL_NCC_SETTLEMENT", nullable = true, precision = 0)
    private Boolean businessRelNccSettlement;
    @Basic@Column(name = "BUSINESS_REL_NCC_CUR_CONTROL", nullable = true, precision = 0)
    private Boolean businessRelNccCurControl;
    @Basic@Column(name = "BUSINESS_REL_NCC_CLEARING", nullable = true, precision = 0)
    private Boolean businessRelNccClearing;
    @Basic@Column(name = "BUSINESS_REL_NCC_OPERATIONS", nullable = true, precision = 0)
    private Boolean businessRelNccOperations;
    @Basic@Column(name = "BUSINESS_REL_NCC_OTHER", nullable = true, length = 4000)
    private String businessRelNccOther;
    @Basic@Column(name = "BUSINESS_REL_ME_TRADE_ACCESS", nullable = true, precision = 0)
    private Boolean businessRelMeTradeAccess;
    @Basic@Column(name = "BUSINESS_REL_ME_OTHER", nullable = true, length = 4000)
    private String businessRelMeOther;
    @Basic@Column(name = "FINANCIAL_ECONOMIC_ACTIVITY", nullable = true, length = 4000)
    private String financialEconomicActivity;
    @Basic@Column(name = "REPUTATION", nullable = true, length = 4000)
    private String reputation;
    @Basic@Column(name = "CEO_DOC_CONFIRMATION_OLD", nullable = true, length = 4000)
    private String ceoDocConfirmationOld;
    @Basic@Column(name = "BENEFICIARY_GOVERNMENT", nullable = true, precision = 0)
    private Boolean beneficiaryGovernment;
    @Basic@Column(name = "BENEFICIARY_INTERNATIONAL", nullable = true, precision = 0)
    private Boolean beneficiaryInternational;
    @Basic@Column(name = "BENEFICIARY_EMITENT", nullable = true, precision = 0)
    private Boolean beneficiaryEmitent;
    @Basic@Column(name = "COMMODITY_STATUS", nullable = true, precision = 0)
    private Boolean commodityStatus;
    @Basic@Column(name = "OTC_STATUS", nullable = true, precision = 0)
    private Boolean otcStatus;
    @Basic@Column(name = "EDO_UFSH_STATUS", nullable = true, precision = 0)
    private Boolean edoUfshStatus;
    @Basic@Column(name = "EDO_OTC_STATUS", nullable = true, precision = 0)
    private Boolean edoOtcStatus;
    @Basic@Column(name = "BANK_CLIENT_DATE", nullable = true)
    private LocalDateTime bankClientDate;
    @Basic@Column(name = "DKK_CLIENT_DATE", nullable = true)
    private LocalDateTime dkkClientDate;
    @Basic@Column(name = "FILE_GATE_DATE", nullable = true)
    private LocalDateTime fileGateDate;
    @Basic@Column(name = "CED_DATE", nullable = true)
    private LocalDateTime cedDate;
    @Basic@Column(name = "RTS_GATE_DATE", nullable = true)
    private LocalDateTime rtsGateDate;
    @Basic@Column(name = "FORTS_GATE_DATE", nullable = true)
    private LocalDateTime fortsGateDate;
    @Basic@Column(name = "STOCK_ACCESS_PAYMENT_SUM", nullable = true, precision = 0)
    private Double stockAccessPaymentSum;
    @Basic@Column(name = "STOCK_ACCESS_PAYMENT_DATE", nullable = true, precision = 0)
    private Double stockAccessPaymentDate;
    @Basic@Column(name = "MESTO_INDEX", nullable = true, length = 20)
    private String mestoIndex;
    @Basic@Column(name = "MESTO_DISTRICT", nullable = true, length = 100)
    private String mestoDistrict;
    @Basic@Column(name = "MESTO_CITY", nullable = true, length = 100)
    private String mestoCity;
    @Basic@Column(name = "MESTO_LOCALITY", nullable = true, length = 100)
    private String mestoLocality;
    @Basic@Column(name = "MESTO_STREET", nullable = true, length = 100)
    private String mestoStreet;
    @Basic@Column(name = "MESTO_HOUSE", nullable = true, length = 100)
    private String mestoHouse;
    @Basic@Column(name = "MESTO_BUILD", nullable = true, length = 100)
    private String mestoBuild;
    @Basic@Column(name = "MESTO_HOUSING", nullable = true, length = 100)
    private String mestoHousing;
    @Basic@Column(name = "MESTO_APARTMENT", nullable = true, length = 100)
    private String mestoApartment;
    @Basic@Column(name = "MESTO_ADDITIONAL", nullable = true, length = 100)
    private String mestoAdditional;
    @Basic@Column(name = "FACT_ADDR_INDEX", nullable = true, length = 20)
    private String factAddrIndex;
    @Basic@Column(name = "FACT_ADDR_DISTRICT", nullable = true, length = 100)
    private String factAddrDistrict;
    @Basic@Column(name = "FACT_ADDR_CITY", nullable = true, length = 100)
    private String factAddrCity;
    @Basic@Column(name = "FACT_ADDR_LOCALITY", nullable = true, length = 100)
    private String factAddrLocality;
    @Basic@Column(name = "FACT_ADDR_STREET", nullable = true, length = 100)
    private String factAddrStreet;
    @Basic@Column(name = "FACT_ADDR_HOUSE", nullable = true, length = 100)
    private String factAddrHouse;
    @Basic@Column(name = "FACT_ADDR_BUILD", nullable = true, length = 100)
    private String factAddrBuild;
    @Basic@Column(name = "FACT_ADDR_HOUSING", nullable = true, length = 100)
    private String factAddrHousing;
    @Basic@Column(name = "FACT_ADDR_APARTMENT", nullable = true, length = 100)
    private String factAddrApartment;
    @Basic@Column(name = "FACT_ADDR_ADDITIONAL", nullable = true, length = 100)
    private String factAddrAdditional;
    @Basic@Column(name = "POST_ADDR_LOCALITY", nullable = true, length = 100)
    private String postAddrLocality;
    @Basic@Column(name = "POST_ADDR_BUILD", nullable = true, length = 100)
    private String postAddrBuild;
    @Basic@Column(name = "POST_ADDR_HOUSING", nullable = true, length = 100)
    private String postAddrHousing;
    @Basic@Column(name = "POST_ADDR_APARTMENT", nullable = true, length = 100)
    private String postAddrApartment;
    @Basic@Column(name = "BENEFICIARY_NO_ANY_PERSONS", nullable = true, precision = 0)
    private Boolean beneficiaryNoAnyPersons;
    @Basic@Column(name = "OTC_MARKET_INFO", nullable = true)
    private String otcMarketInfo;
    @Basic@Column(name = "OTC_MARKET_CLEARING_INFO", nullable = true)
    private String otcMarketClearingInfo;
    @Basic@Column(name = "IS_MICROFINANCIAL", nullable = true, precision = 0)
    private Boolean isMicrofinancial;
    @Basic@Column(name = "IS_MORTGAGE_AGENT", nullable = true, precision = 0)
    private Boolean isMortgageAgent;
    @Basic@Column(name = "DISCLOSURE_PART_PAGE", nullable = true, length = 200)
    private String disclosurePartPage;
    @Basic@Column(name = "DISCLOSURE_RF_INFO_PAGE", nullable = true, length = 200)
    private String disclosureRfInfoPage;
    @Basic@Column(name = "DISCLOSURE_FOREIGN_INFO_PAGE", nullable = true, length = 500)
    private String disclosureForeignInfoPage;
    @Basic@Column(name = "OKTMO", nullable = true, length = 22)
    private String oktmo;
    @Basic@Column(name = "IS_INTERNATIONAL_FIN_ORG", nullable = true, precision = 0)
    private Boolean isInternationalFinOrg;
    @Basic@Column(name = "AUTHORIZED_CAPITAL_VOLUME_ALL", nullable = true, precision = 0)
    private Boolean authorizedCapitalVolumeAll;
    @Basic@Column(name = "REG_NUM_NONRESIDENT", nullable = true, length = 20)
    private String regNumNonresident;
    @Basic@Column(name = "ISSUER_EMAIL", nullable = true, length = 200)
    private String issuerEmail;
    @Basic@Column(name = "MEB_COMM_STATUS", nullable = true, precision = 0)
    private Boolean mebCommStatus;
    @Basic@Column(name = "MEB_COMM_CODE", nullable = true, length = 5)
    private String mebCommCode;
    @Basic@Column(name = "MEB_COMM_RESOURCE_HOLDER", nullable = true, precision = 0)
    private Boolean mebCommResourceHolder;
    @Basic@Column(name = "STORE_DATE", nullable = true)
    private LocalDateTime storeDate;
    @Basic@Column(name = "INN_NONRESIDENT", nullable = true, length = 40)
    private String innNonresident;
    @Basic@Column(name = "AUTO_PUBLISH_RNS", nullable = true, precision = 0)
    private Boolean autoPublishRns;
    @Basic@Column(name = "HAS_ACCESS_IN_NSD_FILE", nullable = true, precision = 0)
    private Boolean hasAccessInNsdFile;
    @Basic@Column(name = "BUSINESS_REL_NCC_CREDIT", nullable = true, precision = 0)
    private Boolean businessRelNccCredit;
    @Basic@Column(name = "BUSINESS_REL_NCC_DRAG_MET", nullable = true, precision = 0)
    private Boolean businessRelNccDragMet;
    @Basic@Column(name = "CLMN_TOTAL_OPERATIONS", nullable = true, length = 200)
    private String clmnTotalOperations;
    @Basic@Column(name = "CLMN_SUM_OPERATIONS", nullable = true, length = 400)
    private String clmnSumOperations;
    @Basic@Column(name = "CLMN_TOTAL_CASH_OPERATIONS", nullable = true, length = 200)
    private String clmnTotalCashOperations;
    @Basic@Column(name = "CLMN_SUM_CASH_OPERATIONS", nullable = true, length = 400)
    private String clmnSumCashOperations;
    @Basic@Column(name = "CLMN_TOTAL_TRANSFER_OPERATIONS", nullable = true, length = 200)
    private String clmnTotalTransferOperations;
    @Basic@Column(name = "CLMN_SUM_TRANSFER_OPERATIONS", nullable = true, length = 400)
    private String clmnSumTransferOperations;
    @Basic@Column(name = "CLMN_TYPE_AGREEMENTS", nullable = true, length = 1000)
    private String clmnTypeAgreements;
    @Basic@Column(name = "CLMN_PLAN_PAYERS", nullable = true, length = 1000)
    private String clmnPlanPayers;
    @Basic@Column(name = "CLMN_PLAN_RECIEVERS", nullable = true, length = 1000)
    private String clmnPlanRecievers;
    @Basic@Column(name = "AOO_MARKET_ACCEPT", nullable = true, precision = 0)
    private Boolean aooMarketAccept;
    @Basic@Column(name = "AOO_MARKET_INFO", nullable = true)
    private String aooMarketInfo;
    @Basic@Column(name = "ISSUER_CODE", nullable = true, length = 30)
    private String issuerCode;
    @Basic@Column(name = "IS_INCLUDE_LINK", nullable = true, precision = 0)
    private Boolean isIncludeLink;
    @Basic@Column(name = "INFROMATION_WEBSITE", nullable = true, length = 4000)
    private String infromationWebsite;
    @Basic @Column(name = "IS_INCLUDE_DOCS", nullable = true, precision = 0)
    private Boolean isIncludeDocs;
    @Basic@Column(name = "IMPACT_CONTRACT", nullable = true, precision = 0)
    private Boolean impactContract;
    @Basic@Column(name = "REGISTER_EXTRACT", nullable = true, precision = 0)
    private Boolean registerExtract;
    @Basic@Column(name = "SHAREHOLDER_AGREEMENT", nullable = true, precision = 0)
    private Boolean shareholderAgreement;
    @Basic@Column(name = "AFFILIATES_LIST", nullable = true, precision = 0)
    private Boolean affiliatesList;
    @Basic@Column(name = "LIST_OF_BANK_HOLDERS", nullable = true, precision = 0)
    private Boolean listOfBankHolders;
    @Basic@Column(name = "LIST_OF_BANK_HOLDING_COMPANY", nullable = true, precision = 0)
    private Boolean listOfBankHoldingCompany;
    @Basic@Column(name = "LIST_OF_COMPANY_MEMBERS", nullable = true, precision = 0)
    private Boolean listOfCompanyMembers;
    @Basic@Column(name = "CERTIFICATE_OF_INCORPORATION", nullable = true, precision = 0)
    private Boolean certificateOfIncorporation;
    @Basic@Column(name = "OTHER_ACCEPT_DOCS", nullable = true, precision = 0)
    private Boolean otherAcceptDocs;
    @Basic@Column(name = "CERTIFICATE_OF_SHAREHOLDERS", nullable = true, precision = 0)
    private Boolean certificateOfShareholders;
    @Basic@Column(name = "EXTRACT_FROM_TRADE_REGISTER", nullable = true, precision = 0)
    private Boolean extractFromTradeRegister;
    @Basic@Column(name = "EXTRACT_OR_COPY_FROM_REGISTER", nullable = true, precision = 0)
    private Boolean extractOrCopyFromRegister;
    @Basic@Column(name = "UNPAID_STOCK_CERTIFICATES", nullable = true, precision = 0)
    private Boolean unpaidStockCertificates;
    @Basic@Column(name = "HAS_COMMON_SOURCE_LINK", nullable = true, precision = 0)
    private Boolean hasCommonSourceLink;
    @Basic@Column(name = "COMMON_SOURCE_LINK", nullable = true, length = 4000)
    private String commonSourceLink;
    @Basic@Column(name = "TSED_MB_STATUS", nullable = true, precision = 0)
    private Boolean tsedMbStatus;
    @Basic@Column(name = "MOEX_BOARD_QUOTING_MODE", nullable = true, precision = 0)
    private Boolean moexBoardQuotingMode;
    @Basic@Column(name = "MOEX_BOARD_VIEW_MODE", nullable = true, precision = 0)
    private Boolean moexBoardViewMode;
    @Basic@Column(name = "PRELEI", nullable = true, length = 100)
    private String prelei;
    @Basic@Column(name = "NO_PRELEI", nullable = true, precision = 0)
    private Boolean noPrelei;
    @Basic@Column(name = "NO_SWIFT", nullable = true, precision = 0)
    private Boolean noSwift;
    @Basic@Column(name = "CLMN_TOTAL_OPERATIONS_WEEK", nullable = true, length = 1000)
    private String clmnTotalOperationsWeek;
    @Basic@Column(name = "CLMN_SUM_OPERATIONS_WEEK", nullable = true, length = 1000)
    private String clmnSumOperationsWeek;
    @Basic@Column(name = "CLMN_TOTAL_CASH_OPER_WEEK", nullable = true, length = 1000)
    private String clmnTotalCashOperWeek;
    @Basic@Column(name = "CLMN_SUM_CASH_OPER_WEEK", nullable = true, length = 1000)
    private String clmnSumCashOperWeek;
    @Basic@Column(name = "CLMN_TOTAL_TRANSFER_OPER_WEEK", nullable = true, length = 1000)
    private String clmnTotalTransferOperWeek;
    @Basic@Column(name = "CLMN_SUM_TRANSFER_OPER_WEEK", nullable = true, length = 1000)
    private String clmnSumTransferOperWeek;
    @Basic@Column(name = "CLMN_TYPE_AGREEMENTS_WEEK", nullable = true, length = 1000)
    private String clmnTypeAgreementsWeek;
    @Basic@Column(name = "CLMN_PLAN_PAYERS_WEEK", nullable = true, length = 1000)
    private String clmnPlanPayersWeek;
    @Basic@Column(name = "CLMN_PLAN_RECIEVERS_WEEK", nullable = true, length = 1000)
    private String clmnPlanRecieversWeek;
    @Basic@Column(name = "CLMN_TOTAL_OPERATIONS_MONTH", nullable = true, length = 1000)
    private String clmnTotalOperationsMonth;
    @Basic@Column(name = "CLMN_SUM_OPERATIONS_MONTH", nullable = true, length = 1000)
    private String clmnSumOperationsMonth;
    @Basic@Column(name = "CLMN_TOTAL_CASH_OPER_MONTH", nullable = true, length = 1000)
    private String clmnTotalCashOperMonth;
    @Basic@Column(name = "CLMN_SUM_CASH_OPERATIONS_MONTH", nullable = true, length = 1000)
    private String clmnSumCashOperationsMonth;
    @Basic@Column(name = "CLMN_TOTAL_TRANSFER_OPER_MONTH", nullable = true, length = 1000)
    private String clmnTotalTransferOperMonth;
    @Basic@Column(name = "CLMN_SUM_TRANSFER_OPER_MONTH", nullable = true, length = 1000)
    private String clmnSumTransferOperMonth;
    @Basic@Column(name = "CLMN_TYPE_AGREEMENTS_MONTH", nullable = true, length = 1000)
    private String clmnTypeAgreementsMonth;
    @Basic@Column(name = "CLMN_PLAN_PAYERS_MONTH", nullable = true, length = 1000)
    private String clmnPlanPayersMonth;
    @Basic@Column(name = "CLMN_PLAN_RECIEVERS_MONTH", nullable = true, length = 1000)
    private String clmnPlanRecieversMonth;
    @Basic@Column(name = "CLMN_TOTAL_OPERATIONS_QUART", nullable = true, length = 1000)
    private String clmnTotalOperationsQuart;
    @Basic@Column(name = "CLMN_SUM_OPERATIONS_QUART", nullable = true, length = 1000)
    private String clmnSumOperationsQuart;
    @Basic@Column(name = "CLMN_TOTAL_CASH_OPER_QUART", nullable = true, length = 1000)
    private String clmnTotalCashOperQuart;
    @Basic@Column(name = "CLMN_SUM_CASH_OPERATIONS_QUART", nullable = true, length = 1000)
    private String clmnSumCashOperationsQuart;
    @Basic@Column(name = "CLMN_TOTAL_TRANSFER_OPER_QUART", nullable = true, length = 1000)
    private String clmnTotalTransferOperQuart;
    @Basic@Column(name = "CLMN_SUM_TRANSFER_OPER_QUART", nullable = true, length = 1000)
    private String clmnSumTransferOperQuart;
    @Basic@Column(name = "CLMN_TYPE_AGREEMENTS_QUART", nullable = true, length = 1000)
    private String clmnTypeAgreementsQuart;
    @Basic@Column(name = "CLMN_PLAN_PAYERS_QUART", nullable = true, length = 1000)
    private String clmnPlanPayersQuart;
    @Basic@Column(name = "CLMN_PLAN_RECIEVERS_QUART", nullable = true, length = 1000)
    private String clmnPlanRecieversQuart;
    @Basic@Column(name = "CLMN_TOTAL_OPERATIONS_YEAR", nullable = true, length = 1000)
    private String clmnTotalOperationsYear;
    @Basic@Column(name = "CLMN_SUM_OPERATIONS_YEAR", nullable = true, length = 1000)
    private String clmnSumOperationsYear;
    @Basic@Column(name = "CLMN_TOTAL_CASH_OPER_YEAR", nullable = true, length = 1000)
    private String clmnTotalCashOperYear;
    @Basic@Column(name = "CLMN_SUM_CASH_OPERATIONS_YEAR", nullable = true, length = 1000)
    private String clmnSumCashOperationsYear;
    @Basic@Column(name = "CLMN_TOTAL_TRANSFER_OPER_YEAR", nullable = true, length = 1000)
    private String clmnTotalTransferOperYear;
    @Basic@Column(name = "CLMN_SUM_TRANSFER_OPER_YEAR", nullable = true, length = 1000)
    private String clmnSumTransferOperYear;
    @Basic@Column(name = "CLMN_TYPE_AGREEMENTS_YEAR", nullable = true, length = 1000)
    private String clmnTypeAgreementsYear;
    @Basic@Column(name = "CLMN_PLAN_PAYERS_YEAR", nullable = true, length = 1000)
    private String clmnPlanPayersYear;
    @Basic@Column(name = "CLMN_PLAN_RECIEVERS_YEAR", nullable = true, length = 1000)
    private String clmnPlanRecieversYear;
    @Basic@Column(name = "ITCONTACT_SURNAME", nullable = true, length = 500)
    private String itcontactSurname;
    @Basic@Column(name = "ITCONTACT_NAME", nullable = true, length = 500)
    private String itcontactName;
    @Basic@Column(name = "ITCONTACT_PATRONYMIC", nullable = true, length = 500)
    private String itcontactPatronymic;
    @Basic@Column(name = "ITCONTACT_POSITION", nullable = true, length = 1000)
    private String itcontactPosition;
    @Basic@Column(name = "ITCONTACT_PHONE", nullable = true, length = 250)
    private String itcontactPhone;
    @Basic@Column(name = "ITCONTACT_EMAIL", nullable = true, length = 500)
    private String itcontactEmail;
    @Basic@Column(name = "UNICODE", nullable = true, length = 50)
    private String unicode;
    @Basic@Column(name = "SHORT_NAME_TC", nullable = true, length = 100)
    private String shortNameTc;
    @Basic@Column(name = "GUARANTEE_FUND_SIZE_CM", nullable = true, precision = 0)
    private Double guaranteeFundSizeCm;
    @Basic@Column(name = "FORTS_MARKET_GUARANTEE_FUND", nullable = true, precision = 0)
    private Boolean fortsMarketGuaranteeFund;
    @Basic@Column(name = "CURRENCY_MARKET_GUARANTEE_FUND", nullable = true, precision = 0)
    private Boolean currencyMarketGuaranteeFund;
    @Basic@Column(name = "GUARANTEE_FUND_SIZE_SM", nullable = true, precision = 0)
    private Double guaranteeFundSizeSm;
    @Basic@Column(name = "GUARANTEE_FUND_SIZE_FORTS", nullable = true, precision = 0)
    private Double guaranteeFundSizeForts;
    @Basic@Column(name = "CROSS_TRADES_CM", nullable = true, precision = 0)
    private Boolean crossTradesCm;
    @Basic@Column(name = "CROSS_TRADES_CURR_FORTS", nullable = true, precision = 0)
    private Boolean crossTradesCurrForts;
    @Basic@Column(name = "CURR_MARKET_TRADE_INSTRUMENT", nullable = true, length = 4000)
    private String currMarketTradeInstrument;
    @Basic@Column(name = "CROSS_TRADES_OTC", nullable = true, precision = 0)
    private Boolean crossTradesOtc;
    @Basic@Column(name = "IMPORT_DATE", nullable = true)
    private LocalDateTime importDate;
    @Basic@Column(name = "BULLETIN_SHORT_NAME_RU", nullable = true, length = 600)
    private String bulletinShortNameRu;
    @Basic@Column(name = "BULLETIN_SHORT_NAME_EN", nullable = true, length = 600)
    private String bulletinShortNameEn;
    @Basic@Column(name = "CRM_GUID", nullable = true, length = 200)
    private String crmGuid;
    @Basic@Column(name = "CROP_ACCESS_MODE_DATE", nullable = true)
    private LocalDateTime cropAccessModeDate;
    @Basic@Column(name = "CROP_NCC_ACCESS_MODE_DATE", nullable = true)
    private LocalDateTime cropNccAccessModeDate;
    @Basic@Column(name = "CROP_MARKET_GUARANTEE_FUND", nullable = true, precision = 0)
    private Boolean cropMarketGuaranteeFund;
    @Basic@Column(name = "GUARANTEE_FUND_SIZE_CROP", nullable = true, precision = 0)
    private Double guaranteeFundSizeCrop;
    @Basic@Column(name = "BENEFICIARY_FOREIGN_EMITENT", nullable = true, precision = 0)
    private Boolean beneficiaryForeignEmitent;
    @Basic@Column(name = "CHIEF_ACCOUNTANT_SURNAME", nullable = true, length = 500)
    private String chiefAccountantSurname;
    @Basic@Column(name = "CHIEF_ACCOUNTANT_NAME", nullable = true, length = 500)
    private String chiefAccountantName;
    @Basic@Column(name = "CHIEF_ACCOUNTANT_PATRONYMIC", nullable = true, length = 500)
    private String chiefAccountantPatronymic;
    @Basic@Column(name = "FULL_NAME_TC", nullable = true, length = 120)
    private String fullNameTc;
    @Basic@Column(name = "FULL_NAME_ENG_TC", nullable = true, length = 120)
    private String fullNameEngTc;
    @Basic@Column(name = "SHORT_NAME_ENG_TC", nullable = true, length = 30)
    private String shortNameEngTc;
    @Basic@Column(name = "GCBONDS", nullable = true, precision = 0)
    private Boolean gcbonds;
    @Basic@Column(name = "GCCOLLATERAL", nullable = true, precision = 0)
    private Boolean gccollateral;
    @Basic@Column(name = "GCSHARES", nullable = true, precision = 0)
    private Boolean gcshares;
    @Basic@Column(name = "GCSOVEREIGN", nullable = true, precision = 0)
    private Boolean gcsovereign;
    @Basic@Column(name = "IS_WEB_CLEARING", nullable = true, precision = 0)
    private Boolean isWebClearing;
    @Basic@Column(name = "IS_STATE_OWNED_COMPANY", nullable = true, precision = 0)
    private Boolean isStateOwnedCompany;
    @Basic@Column(name = "IS_PRIVATE_PARTNER", nullable = true, precision = 0)
    private Boolean isPrivatePartner;
    @Basic@Column(name = "IS_SPECIALIZED_COMPANY", nullable = true, precision = 0)
    private Boolean isSpecializedCompany;
    @Basic@Column(name = "INTERFAX_FININSTID", nullable = true, precision = 0)
    private Long interfaxFininstid;
    @Basic@Column(name = "MP_PARTICIPATION_MB_TECH", nullable = true, precision = 0)
    private Boolean mpParticipationMbTech;
    @Basic@Column(name = "MP_PARTICIPATION_EXCHANGE", nullable = true, precision = 0)
    private Boolean mpParticipationExchange;
    @Basic@Column(name = "CREDIT_ORGANIZATION", nullable = true, precision = 0)
    private Boolean creditOrganization;
    @Basic@Column(name = "FIRST_LEVEL_STOCK", nullable = true, precision = 0)
    private Boolean firstLevelStock;
    @Basic@Column(name = "FIRST_LEVEL_STOCK_CONTROL", nullable = true, precision = 0)
    private Boolean firstLevelStockControl;
    @Basic@Column(name = "IS_RATING", nullable = true, precision = 0)
    private Boolean isRating;
    @Basic@Column(name = "GOS_COMPANY", nullable = true, precision = 0)
    private Boolean gosCompany;
    @Basic@Column(name = "GOS_CORPORATION_CONTROL", nullable = true, precision = 0)
    private Boolean gosCorporationControl;
    @Basic@Column(name = "GOS_CONTROL", nullable = true, precision = 0)
    private Boolean gosControl;
    @Basic@Column(name = "UK_AMOUNT_BIG", nullable = true, precision = 0)
    private Boolean ukAmountBig;
    @Basic@Column(name = "CROP_MARKET_CLEARING_INFO", nullable = true)
    private String cropMarketClearingInfo;
    @Basic@Column(name = "CROP_MARKET_INFO", nullable = true)
    private String cropMarketInfo;
    @Basic@Column(name = "DEPOSIT_TRADE_ADMIT_DATE", nullable = true)
    private LocalDateTime depositTradeAdmitDate;
    @Basic@Column(name = "IS_DEPOSIT_CLEARING", nullable = true, precision = 0)
    private Boolean isDepositClearing;
    @ManyToOne@JoinColumn(name = "STOCK_REGIONAL_ID", referencedColumnName = "ID")
    private Organization organizationByStockRegionalId;
    @ManyToOne@JoinColumn(name = "CLEARING_MEMBER_ID", referencedColumnName = "ID")
    private Organization organizationByClearingMemberId;
    @ManyToOne@JoinColumn(name = "STOCK_DER_REGIONAL_ID", referencedColumnName = "ID")
    private Organization organizationByStockDerRegionalId;
    @ManyToOne@JoinColumn(name = "REGISTRY_HOLDER_ID", referencedColumnName = "ID")
    private Organization organizationByRegistryHolderId;
}

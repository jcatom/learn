package cc.jml1024.learn.api.dto;

import java.math.BigDecimal;
import java.util.Date;

public class UserOrderInfoDTO {
    private Long id;

    private String userId;

    private String stationId;

    private String betNumber;

    private Date betTime;

    private String betMoney;

    private String betIssue;

    private String gameId;

    private String betResult;

    private String betMulti;

    private Integer terminalCorrectCount;

    private String tickSn;

    private String timeStamp;

    private String macCode;

    private String correctStatus;

    private Date correctTime;

    private Integer correctCount;

    private BigDecimal agencyRate;

    private BigDecimal percentage;

    private String employeeId;

    private String accountOrderId;

    private String accountType;

    private String multiIssue;

    private Long channelId;

    private String settlementType;

    private String orderId;

    private Boolean printTicketType;

    private Boolean printTicketStatus;

    private Boolean awardStatus;

    private BigDecimal totalPrize;

    private BigDecimal totalTax;

    private String betVirtualStationId;

    private String printVirtualStationId;

    private Date printTime;

    private String from;

    private String payType;

    private String ticketStat;

    private Date cancelTime;

    private String expiryWay;

    private String maintainId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    public String getBetNumber() {
        return betNumber;
    }

    public void setBetNumber(String betNumber) {
        this.betNumber = betNumber == null ? null : betNumber.trim();
    }

    public Date getBetTime() {
        return betTime;
    }

    public void setBetTime(Date betTime) {
        this.betTime = betTime;
    }

    public String getBetMoney() {
        return betMoney;
    }

    public void setBetMoney(String betMoney) {
        this.betMoney = betMoney == null ? null : betMoney.trim();
    }

    public String getBetIssue() {
        return betIssue;
    }

    public void setBetIssue(String betIssue) {
        this.betIssue = betIssue == null ? null : betIssue.trim();
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId == null ? null : gameId.trim();
    }

    public String getBetResult() {
        return betResult;
    }

    public void setBetResult(String betResult) {
        this.betResult = betResult == null ? null : betResult.trim();
    }

    public String getBetMulti() {
        return betMulti;
    }

    public void setBetMulti(String betMulti) {
        this.betMulti = betMulti == null ? null : betMulti.trim();
    }

    public Integer getTerminalCorrectCount() {
        return terminalCorrectCount;
    }

    public void setTerminalCorrectCount(Integer terminalCorrectCount) {
        this.terminalCorrectCount = terminalCorrectCount;
    }

    public String getTickSn() {
        return tickSn;
    }

    public void setTickSn(String tickSn) {
        this.tickSn = tickSn == null ? null : tickSn.trim();
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp == null ? null : timeStamp.trim();
    }

    public String getMacCode() {
        return macCode;
    }

    public void setMacCode(String macCode) {
        this.macCode = macCode == null ? null : macCode.trim();
    }

    public String getCorrectStatus() {
        return correctStatus;
    }

    public void setCorrectStatus(String correctStatus) {
        this.correctStatus = correctStatus == null ? null : correctStatus.trim();
    }

    public Date getCorrectTime() {
        return correctTime;
    }

    public void setCorrectTime(Date correctTime) {
        this.correctTime = correctTime;
    }

    public Integer getCorrectCount() {
        return correctCount;
    }

    public void setCorrectCount(Integer correctCount) {
        this.correctCount = correctCount;
    }

    public BigDecimal getAgencyRate() {
        return agencyRate;
    }

    public void setAgencyRate(BigDecimal agencyRate) {
        this.agencyRate = agencyRate;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getAccountOrderId() {
        return accountOrderId;
    }

    public void setAccountOrderId(String accountOrderId) {
        this.accountOrderId = accountOrderId == null ? null : accountOrderId.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getMultiIssue() {
        return multiIssue;
    }

    public void setMultiIssue(String multiIssue) {
        this.multiIssue = multiIssue == null ? null : multiIssue.trim();
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType == null ? null : settlementType.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Boolean getPrintTicketType() {
        return printTicketType;
    }

    public void setPrintTicketType(Boolean printTicketType) {
        this.printTicketType = printTicketType;
    }

    public Boolean getPrintTicketStatus() {
        return printTicketStatus;
    }

    public void setPrintTicketStatus(Boolean printTicketStatus) {
        this.printTicketStatus = printTicketStatus;
    }

    public Boolean getAwardStatus() {
        return awardStatus;
    }

    public void setAwardStatus(Boolean awardStatus) {
        this.awardStatus = awardStatus;
    }

    public BigDecimal getTotalPrize() {
        return totalPrize;
    }

    public void setTotalPrize(BigDecimal totalPrize) {
        this.totalPrize = totalPrize;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public String getBetVirtualStationId() {
        return betVirtualStationId;
    }

    public void setBetVirtualStationId(String betVirtualStationId) {
        this.betVirtualStationId = betVirtualStationId == null ? null : betVirtualStationId.trim();
    }

    public String getPrintVirtualStationId() {
        return printVirtualStationId;
    }

    public void setPrintVirtualStationId(String printVirtualStationId) {
        this.printVirtualStationId = printVirtualStationId == null ? null : printVirtualStationId.trim();
    }

    public Date getPrintTime() {
        return printTime;
    }

    public void setPrintTime(Date printTime) {
        this.printTime = printTime;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getTicketStat() {
        return ticketStat;
    }

    public void setTicketStat(String ticketStat) {
        this.ticketStat = ticketStat == null ? null : ticketStat.trim();
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getExpiryWay() {
        return expiryWay;
    }

    public void setExpiryWay(String expiryWay) {
        this.expiryWay = expiryWay == null ? null : expiryWay.trim();
    }

    public String getMaintainId() {
        return maintainId;
    }

    public void setMaintainId(String maintainId) {
        this.maintainId = maintainId == null ? null : maintainId.trim();
    }

}

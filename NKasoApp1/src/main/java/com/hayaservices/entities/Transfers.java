package com.hayaservices.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity @Table (name = "transfers")
@Setter @Getter

public class Transfers {

	@Id  @Column (name = "TRANSFER_ID")
	private int transferId;
	@Column (name = "TRANSFER_TYPE")
	private String transferType;
	@Column (name = "SENDER_NAME")
	private String senderName;
	@Column (name = "RECEIVER_NAME")
	private String receiverName;
	@Column (name = "TRANSFER_AMOUNT")
	private Double transferAmount;
	@Column (name = "REMAINING_BALANCE")
	private Double remainingBalance;
	@Column (name = "TRANSFER_DATE")
	private Date transferDate;
	@Column (name = "COUNTRY_FROM")
	private String countryFrom;
	@Column (name = "COUNTRY_TO")
	private String countryTo;
   @Column (name = "COMMISSION")
	private Double commission;

	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    private Clients  client;
	
	
	public int getTransferId() {
		return transferId;
	}
	public void setTransferId(int transferId) {
		this.transferId = transferId;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public Double getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(Double transferAmount) {
		this.transferAmount = transferAmount;
	}
	public Double getRemainingBalance() {
		return remainingBalance;
	}
	public void setRemainingBalance(Double remainingBalance) {
		this.remainingBalance = remainingBalance;
	}
	public Date getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}
	public String getCountryFrom() {
		return countryFrom;
	}
	public void setCountryFrom(String countryFrom) {
		this.countryFrom = countryFrom;
	}
	public String getCountryTo() {
		return countryTo;
	}
	public void setCountryTo(String countryTo) {
		this.countryTo = countryTo;
	}
	public Double getCommission() {
		return commission;
	}
	public void setCommission(Double commission) {
		this.commission = commission;
	}

}

package com.cg.banking.beans;

public class Transaction {
	private int transactionId;
	private float amount;
	private String transactionType;
	private long AccountInit;
	private long AccountFinal;
	
	public Transaction()
	{
		
	}
	public Transaction(int transactionId , float amount , String transactionType)
	{
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionType = transactionType;
		
	}
	public Transaction(float amount, String transactionType)
	{
		super();
		this.amount = amount;
		this.transactionType = transactionType;
	}
	
	public Transaction(float amount2, String transactionType, long accountNo) {
		this.amount = amount2;
		this.transactionType = transactionType;
		this.AccountInit = AccountInit ; 
	}
	public long getAccountInit() {
		return AccountInit;
	}
	public void setAccountInit(long accountInit) {
		AccountInit = accountInit;
	}
	public long getAccountFinal() {
		return AccountFinal;
	}
	public void setAccountFinal(long accountFinal) {
		AccountFinal = accountFinal;
	}
	
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	
	public int getTransactionId()
	{
		return 0;
	}
}

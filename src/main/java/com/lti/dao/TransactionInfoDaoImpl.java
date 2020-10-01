package com.lti.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.model.TransactionInfo;



@Repository
public class TransactionInfoDaoImpl implements TransactionInfoDao {

	EntityManager entityManager=null;
	
	public TransactionInfoDaoImpl() {
		
	}
	
	@Override
	public List<TransactionInfo> readAllTransactionsByAccountNumber(String accountNumber) {
		String jpql="Select t from TransactionInfo t where t.accountInfo.accountNumber=:accountNumber";
		TypedQuery<TransactionInfo> tQuery=entityManager.createQuery(jpql, TransactionInfo.class);
		List<TransactionInfo> transactionInfos=tQuery.getResultList();
		return transactionInfos;
	}

	@Override
	public List<TransactionInfo> readTransactionsBetweenDate(String accountNumber, Date startDate, Date endDate) {
		
		return null;
	}

	@Override
	public void createTransaction(TransactionInfo transactionInfo) {
		entityManager.persist(transactionInfo);
		
	}

}

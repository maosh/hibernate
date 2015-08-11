package com.maosh;

import java.sql.Timestamp;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;

@Entity
@Table(name = "t_msg_info")
public class MsgInfoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@ManyToOne(targetEntity = UserBean.class, fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "userId", unique = false)
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getMsgId() {
		return msgId;
	}

	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getCommentedCount() {
		return commentedCount;
	}

	public void setCommentedCount(int commentedCount) {
		this.commentedCount = commentedCount;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public int getTransferredCount() {
		return TransferredCount;
	}

	public void setTransferredCount(int transferredCount) {
		TransferredCount = transferredCount;
	}

	public int getTransferCount() {
		return TransferCount;
	}

	public void setTransferCount(int transferCount) {
		TransferCount = transferCount;
	}

	public Timestamp getTs() {
		return ts;
	}

	public void setTs(Timestamp ts) {
		this.ts = ts;
	}

	int userId;

	int msgId;
	String content;
	int type;
	int commentedCount;
	int commentCount;
	int TransferredCount;
	int TransferCount;
	Timestamp ts;

}

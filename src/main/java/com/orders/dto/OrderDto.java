package com.orders.dto;


import lombok.Data;

import java.time.LocalDate;
@Data
public class OrderDto {
    private Long oid;
    private LocalDate date;
    private String orderStatus;
    private String orderForm;
	public Long getOid() {
		return oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderForm() {
		return orderForm;
	}
	public void setOrderForm(String orderForm) {
		this.orderForm = orderForm;
	}
    
    
}

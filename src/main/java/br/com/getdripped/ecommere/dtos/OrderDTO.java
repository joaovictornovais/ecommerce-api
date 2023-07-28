package br.com.getdripped.ecommere.dtos;

import java.time.Instant;
import java.util.Objects;

import org.springframework.beans.BeanUtils;

import br.com.getdripped.ecommere.entities.Order;
import br.com.getdripped.ecommere.entities.User;
import br.com.getdripped.ecommere.enums.OrderStatus;

public class OrderDTO {
	
	private Long id;
	private Instant moment;
	private User client;
	private Integer orderStatus;
	
	public OrderDTO() {}

	public OrderDTO(Long id, Instant moment, OrderStatus orderStatus, User client) {
		this.id = id;
		this.moment = moment;
		this.client = client;
	}
	
	public OrderDTO(Order order) {
		BeanUtils.copyProperties(order, this);
	}

	public OrderStatus getOrderStatus() {
		return OrderStatus.valueOf(orderStatus);
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		if (orderStatus != null) this.orderStatus = orderStatus.getCode();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDTO other = (OrderDTO) obj;
		return Objects.equals(id, other.id);
	}
}

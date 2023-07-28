package br.com.getdripped.ecommere.dtos;

import java.time.Instant;
import java.util.Objects;

import org.springframework.beans.BeanUtils;

import br.com.getdripped.ecommere.entities.Order;
import br.com.getdripped.ecommere.entities.User;

public class OrderDTO {
	
	private Long id;
	private Instant moment;
	private User client;
	
	public OrderDTO() {}

	public OrderDTO(Long id, Instant moment) {
		this.id = id;
		this.moment = moment;
	}
	
	public OrderDTO(Order order) {
		BeanUtils.copyProperties(order, this);
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

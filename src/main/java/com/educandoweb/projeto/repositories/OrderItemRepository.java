package com.educandoweb.projeto.repositories;





import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projeto.entities.OrderItem;
import com.educandoweb.projeto.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {





}

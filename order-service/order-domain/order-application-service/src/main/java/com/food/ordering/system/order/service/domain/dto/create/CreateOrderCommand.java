package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreateOrderCommand {
    @NonNull
    private final UUID customerId;
    @NonNull
    private final UUID restaurantId;
    @NonNull
    private final List<OrderItem> items;
    @NonNull
    private final OrderAddress address;
}

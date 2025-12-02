package com.fpl.edu.shoeStore.payments.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Payment {

    private Integer paymentId;
    private Integer orderId;
    private Integer payerId;
    private String paymentMethod;
    private LocalDateTime paymentDate;
    private BigDecimal amount;
    private String status;
    private String transactionCode;
    private LocalDateTime createdAt;

}

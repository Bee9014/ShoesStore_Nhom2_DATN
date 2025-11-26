package com.fpl.edu.shoeStore.payments.dto.request;

import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentDTORequest {
    private int orderId;
    private String paymentMethod;
    private BigDecimal amount;
    private String transactionCode;
}

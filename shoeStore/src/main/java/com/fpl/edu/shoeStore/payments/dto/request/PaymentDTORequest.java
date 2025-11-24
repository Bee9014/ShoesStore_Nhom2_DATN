package com.fpl.edu.shoeStore.payments.dto.request;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

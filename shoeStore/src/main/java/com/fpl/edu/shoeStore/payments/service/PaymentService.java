package com.fpl.edu.shoeStore.payments.service;

import com.fpl.edu.shoeStore.common.PageResponse;
import com.fpl.edu.shoeStore.payments.dto.request.PaymentDTORequest;
import com.fpl.edu.shoeStore.payments.dto.response.PaymentDTOResponse;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface PaymentService {

    PageResponse<PaymentDTOResponse> findAllPaged(
            Integer paymentId,
            Integer orderId,
            Integer payerId,
            String paymentMethod,
            LocalDateTime paymentDate,
            String status,
            BigDecimal amount,
            String transactionCode,
            int page,
            int size
    );

    PaymentDTOResponse createPayment(PaymentDTORequest request);

    PaymentDTOResponse updatePayment(Integer id, PaymentDTORequest request);

    int deletePayment(Integer id);

    PaymentDTOResponse findById(Integer id);

    PaymentDTOResponse findByCode(String transactionCode);
}

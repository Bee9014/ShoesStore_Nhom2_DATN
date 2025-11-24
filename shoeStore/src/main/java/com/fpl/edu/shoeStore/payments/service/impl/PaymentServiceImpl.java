package com.fpl.edu.shoeStore.payments.service.impl;

import com.fpl.edu.shoeStore.common.PageResponse;
import com.fpl.edu.shoeStore.payments.convert.PaymentConverter;
import com.fpl.edu.shoeStore.payments.dto.request.PaymentDTORequest;
import com.fpl.edu.shoeStore.payments.dto.response.PaymentDTOResponse;
import com.fpl.edu.shoeStore.payments.entity.Payment;
import com.fpl.edu.shoeStore.payments.mapper.PaymentMapper;
import com.fpl.edu.shoeStore.payments.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentMapper paymentMapper;


    @Override
    public PageResponse<PaymentDTOResponse> findAllPaged(Integer paymentId, Integer orderId, Integer payerId, String paymentMethod, LocalDateTime paymentDate, BigDecimal amount, String transactionCode, int page, int size) {
        return null;
    }

    @Override
    @Transactional
    public PaymentDTOResponse createPayment(PaymentDTORequest request) {
        return null;
    }

    @Override
    @Transactional
    public PaymentDTOResponse updatePayment(Integer id, PaymentDTORequest request) {

        return null;
    }

    @Override
    @Transactional
    public int deletePayment(Integer id) {
        return 0;
    }

    @Override
    public PaymentDTOResponse findById(Integer id) {
        return null;
    }

    @Override
    public PaymentDTOResponse findByCode(String transactionCode) {
        return null;
    }
}

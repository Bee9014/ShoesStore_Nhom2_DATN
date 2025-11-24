package com.fpl.edu.shoeStore.voucher.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Voucher {

    private int voucherID;
    private String code;
    private String description;
    private String discountType;
    private String discountValue;
    private int maxUses;
    private int usedCount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Boolean isActive;
    private LocalDateTime createdAt;
}

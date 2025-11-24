package com.fpl.edu.shoeStore.voucher.dto.response;


import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class VoucherDTOResponse {

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

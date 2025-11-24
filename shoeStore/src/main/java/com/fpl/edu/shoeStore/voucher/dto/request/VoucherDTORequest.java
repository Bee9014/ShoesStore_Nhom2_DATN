package com.fpl.edu.shoeStore.voucher.dto.request;


import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class VoucherDTORequest {

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

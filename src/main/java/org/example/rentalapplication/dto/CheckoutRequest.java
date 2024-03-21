package org.example.rentalapplication.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.crypto.Data;


@Getter
@Setter
@ToString
public class CheckoutRequest {
    private String toolCode;

    private long dayCount;

    private double discountPercent;

    private Data checkoutDate;
}

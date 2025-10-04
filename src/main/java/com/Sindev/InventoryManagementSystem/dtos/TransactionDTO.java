package com.Sindev.InventoryManagementSystem.dtos;

import com.Sindev.InventoryManagementSystem.enums.TransactionStatus;
import com.Sindev.InventoryManagementSystem.enums.TransactionType;
import com.Sindev.InventoryManagementSystem.models.Product;
import com.Sindev.InventoryManagementSystem.models.Supplier;
import com.Sindev.InventoryManagementSystem.models.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDTO {

    private Long id;

    private Integer totalProducts;

    private BigDecimal totalPrice;


    private TransactionType transactionType; // pruchase, sale, return


    private TransactionStatus status; //pending, completed, processing

    private String description;
    private String note;

    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    private ProductDTO product;

    private UserDTO user;

    private SupplierDTO supplier;


}
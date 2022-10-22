package com.orcas.model.account;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Orcas
 * @date 2022/10/22
 */
@Data
public class Address implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * string
     * <hex>
     */
    private String address;
}

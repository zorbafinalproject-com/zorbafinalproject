package com.zorbaFinalProject.Entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @NotNull
    @NotBlank
    private int custId;

    @Column(name = "custName")
    private String custName;

}

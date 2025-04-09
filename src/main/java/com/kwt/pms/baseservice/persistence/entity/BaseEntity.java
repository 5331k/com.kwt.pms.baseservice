/**
 * Author: Safdar Khan
 * Date: 09/04/2025
 */

package com.kwt.pms.baseservice.persistence.entity;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

import java.sql.Timestamp;

@MappedSuperclass
@Data
public class BaseEntity {

    private String createdUser;
    private String modifiedUser;
    private Timestamp tsCreated;
    private Timestamp tsChanged;

    @PrePersist
    protected void onCreate() {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        this.tsCreated = now;
        this.tsChanged = now;
    }

    @PreUpdate
    protected void onUpdate() {
        this.tsChanged = new Timestamp(System.currentTimeMillis());
    }

}

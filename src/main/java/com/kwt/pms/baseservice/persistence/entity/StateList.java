/**
 * Author: Safdar Khan
 * Date: 09/04/2025
 */
package com.kwt.pms.baseservice.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Entity
@Table(name = "state_list", schema = "base")
public class StateList extends BaseEntity {

    @Id
    private String stateName;
    private String abbr;
    private String details;
}

/**
 * Author: Safdar Khan
 * Date: 09/04/2025
 */
package com.kwt.pms.baseservice.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Entity
@Table(name = "zipcode_list", schema = "base")
public class ZipcodeList extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "zipcode_id_seq")
    @SequenceGenerator(name = "zipcode_id_seq", sequenceName = "zipcode_zipcode_id_seq", allocationSize = 1)
    private Long zipcodeId;
    private Long cityId;
    private String zipcodeName;
    private String alias;
    private String details;
}

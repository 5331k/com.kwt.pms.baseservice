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
@Table(name = "city_list", schema = "base")
public class CityList extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_id_seq")
    @SequenceGenerator(name = "city_id_seq", sequenceName = "city_city_id_seq", allocationSize = 1)
    private Long cityId;
    private String stateName;
    private String cityName;
    private String alias;
    private String details;
}

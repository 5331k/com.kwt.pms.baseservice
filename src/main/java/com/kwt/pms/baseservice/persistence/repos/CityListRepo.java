/**
 * Author: Safdar Khan
 * Date: 09/04/2025
 */

package com.kwt.pms.baseservice.persistence.repos;

import com.kwt.pms.baseservice.persistence.entity.CityList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityListRepo extends JpaRepository<CityList,Long> {
    List<CityList> findByStateName(String stateName);
}

/**
 * Author: Safdar Khan
 * Date: 09/04/2025
 */

package com.kwt.pms.baseservice.persistence.repos;

import com.kwt.pms.baseservice.persistence.entity.StateList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateListRepo extends JpaRepository<StateList,String> {

}

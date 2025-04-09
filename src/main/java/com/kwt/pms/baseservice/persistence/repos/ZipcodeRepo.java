package com.kwt.pms.baseservice.persistence.repos;

import com.kwt.pms.baseservice.persistence.entity.ZipcodeList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZipcodeRepo extends JpaRepository<ZipcodeList,Long> {

    List<ZipcodeList> findByCityId(Long cityId);
}

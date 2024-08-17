package com.sangjin.myselectshop.repository;

import com.sangjin.myselectshop.entity.ApiUseTime;
import com.sangjin.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApiUseTimeRepository extends JpaRepository<ApiUseTime, Long> {
    Optional<ApiUseTime> findByUser(User user);
}

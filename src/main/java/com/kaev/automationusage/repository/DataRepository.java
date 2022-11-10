package com.kaev.automationusage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaev.automationusage.model.Data;

public interface DataRepository extends JpaRepository<Data, Long>{

}

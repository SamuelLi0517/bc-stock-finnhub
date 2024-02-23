package com.venturenix.bcstockfinnhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.venturenix.bcstockfinnhub.entity.QuoteEntity;

public interface QuoteRepo extends JpaRepository<QuoteEntity, Long>{

  

  
}

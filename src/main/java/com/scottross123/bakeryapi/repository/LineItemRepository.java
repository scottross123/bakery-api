package com.scottross123.bakeryapi.repository;

import com.scottross123.bakeryapi.model.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineItemRepository extends JpaRepository<LineItem, Long> { }

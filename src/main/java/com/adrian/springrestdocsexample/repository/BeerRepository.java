package com.adrian.springrestdocsexample.repository;

import com.adrian.springrestdocsexample.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}

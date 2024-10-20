package com.albab.repository;

import com.albab.entity.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RuleRepository extends JpaRepository<Node, Long> {
}

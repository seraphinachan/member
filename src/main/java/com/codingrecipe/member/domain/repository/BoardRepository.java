package com.codingrecipe.member.domain.repository;

import com.codingrecipe.member.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}

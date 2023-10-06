package kr.ch10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ch10.entity.User2Entity;
import kr.ch10.entity.User4Entity;
import kr.ch10.entity.User6Entity;

@Repository
public interface User6Repository extends JpaRepository<User6Entity, Integer>{

}

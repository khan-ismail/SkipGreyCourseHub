package com.skipgrey.skipgreycoursehub.repository;

import com.skipgrey.skipgreycoursehub.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}

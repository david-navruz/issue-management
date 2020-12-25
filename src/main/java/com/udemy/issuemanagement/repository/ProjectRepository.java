package com.udemy.issuemanagement.repository;

import com.udemy.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

    List<Project> getAllProjectByCode(String projectCode);

    List<Project> getAllProjectByCodeAndIdNotNull(String projectCode);

    List<Project> getAllProjectByCodeAndProjectNameContains(String projectCode, String projectName);

    Page<Project> findAll(Pageable pageable);

    List<Project> findAll(Sort sort);




}

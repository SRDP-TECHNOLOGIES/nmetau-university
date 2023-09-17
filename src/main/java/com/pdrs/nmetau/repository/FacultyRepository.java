package com.pdrs.nmetau.repository;

import com.pdrs.nmetau.model.Faculty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FacultyRepository extends CrudRepository<Faculty, Integer> {
}

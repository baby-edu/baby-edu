package com.hayfar.baby_education.repositories;

import com.hayfar.baby_education.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalsRepository extends JpaRepository<Animal, Long> {
    /*@Query( value = "select * from bills  where payment=false and user_id= :userId" ,nativeQuery = true)
    List<Bill> findAllFalseByUserId(@Param("userId") Long userId);

    @Query(value = "select * from bills where user_id= :userId", nativeQuery = true)
    List<Bill> findBillOwnUser(@Param("userId") Long userId);*/

}

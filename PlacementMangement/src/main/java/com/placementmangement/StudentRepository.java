package com.placementmangement;

import org.springframework.data.jpa.repository.JpaRepository;

/*JPARepository is exists in Spring Data JPA dependencies and it contains
 * all the CRUD operation of spring JPA
 */
public interface StudentRepository extends JpaRepository<Student, Integer>{

}

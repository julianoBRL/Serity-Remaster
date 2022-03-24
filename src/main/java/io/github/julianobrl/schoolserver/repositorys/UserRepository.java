package io.github.julianobrl.schoolserver.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import io.github.julianobrl.schoolserver.entitys.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>{
	
	Optional<User> findByUsername(String username);
	
}

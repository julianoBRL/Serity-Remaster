package io.github.julianobrl.schoolserver.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import io.github.julianobrl.schoolserver.entitys.Bimester;

@Repository
public interface BimesterRepository extends JpaRepository<Bimester, Long>, JpaSpecificationExecutor<Bimester> {}

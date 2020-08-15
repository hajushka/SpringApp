package lv.ksenija_java.springProject.repository;

import lv.ksenija_java.springProject.Model.UserAndRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAndRolesRepository extends JpaRepository <UserAndRole, Long> {
}

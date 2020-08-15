package lv.ksenija_java.springProject.Controller;

import lv.ksenija_java.springProject.Model.UserAndRole;
import lv.ksenija_java.springProject.repository.UserAndRolesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserAndRolesRepository userAndRolesRepository;

    public UserController(UserAndRolesRepository userAndRolesRepository) {
        this.userAndRolesRepository = userAndRolesRepository;
    }

    @GetMapping("/users")
    public List<UserAndRole> allUsers() {
        return userAndRolesRepository.findAll();
    }

    @PostMapping("/users")
    UserAndRole newUser(@RequestBody UserAndRole newUser) {
        return userAndRolesRepository.save(newUser);
    }

    @PutMapping("/users/{id}")
    UserAndRole updateUser(@RequestBody UserAndRole newUser, @PathVariable Long id) {
        return userAndRolesRepository.findById(id)
                .map(
                        userAndRole -> {
                            userAndRole.setUserName(newUser.getUserName());
                            userAndRole.setRole(newUser.getRole());
                            return userAndRolesRepository.save(userAndRole);
                        }
                ).orElseGet(
                        () -> {
                            newUser.setId(id);
                            return userAndRolesRepository.save(newUser);
                        }
                );
    }

   // @Override
    public String toString(Long id, String username, String role) {
        return "UserAndRole{" +
                "id=" + id +
                ", username= " + username + ", role= " + role + "}";
    }
}


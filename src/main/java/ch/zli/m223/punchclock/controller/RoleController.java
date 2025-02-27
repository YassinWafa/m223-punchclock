package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Role;
import ch.zli.m223.punchclock.repository.RoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private RoleRepository roleRepository;

    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    /** Mapping to create a new role, accessible via POST /roles requiring name and id
     * @author Yassin Wafa
     */
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createRole(@RequestBody Role role) {

    }


}

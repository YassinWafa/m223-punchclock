package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Role;
import ch.zli.m223.punchclock.repository.RoleRepository;
import org.jvnet.hk2.annotations.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(Role role) {
        return roleRepository.saveAndFlush(role);
    }

    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    public Optional<Role> findById(long id) {
        return roleRepository.findById(id);
    }

    public void deleteRole(long id) {
        roleRepository.deleteById(id);
    }

    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }
}

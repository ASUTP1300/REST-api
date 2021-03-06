package home.springboot2.web.service;


import home.springboot2.web.DTO.UserDto;
import home.springboot2.web.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    public Set<Role> getRoleByName(List<String> listStringRoles);

    public List<String> getNamesRole(List<Role> listRoles);

    public Set<Role> getRoles(UserDto userDto);
}

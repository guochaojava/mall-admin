package com.barista.mall.dao;

import com.barista.mall.dto.RoleQuery;
import com.barista.mall.model.Role;
import com.barista.mall.vo.RoleVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    List<Role> selectByAdminId(Long id);

    List<Role> listNoPages();

    List<RoleVO> list(RoleQuery query);

    boolean add(Role role);

    void addPermissions(Map<String, Object> map);

    int deletebyRoleId(Long id);

    int updateRolePermission(Map<String, Object> map);

    int delete(Long[] id);
}
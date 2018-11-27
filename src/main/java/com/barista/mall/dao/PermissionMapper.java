package com.barista.mall.dao;

import com.barista.mall.dto.PermissionQuery;
import com.barista.mall.model.Permission;
import com.barista.mall.vo.PermissionVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    Permission selectByPrimaryKey(Integer id);

    List<Permission> listNoPages();

    List<PermissionVO> list(PermissionQuery query);

    boolean add(Permission permission);

    boolean update(Permission permission);

    int delete(Long[] id);

    int deletePermissionIdInUsedRole(Long[] id);
}
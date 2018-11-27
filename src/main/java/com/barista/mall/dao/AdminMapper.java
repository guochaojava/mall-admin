package com.barista.mall.dao;

import com.barista.mall.dto.AdminQuery;
import com.barista.mall.model.Admin;
import com.barista.mall.vo.AdminVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {
    Admin selectByPrimaryKey(Long id);

    Admin selectByLoginName(String loginName);

    List<AdminVO> list(AdminQuery query);

    int deleteById(Long[] id);

    int updateStatusById(Long[] id);

    void updateLastLoginTimeByLoginName(@Param("loginName") String userName, @Param("lastLoginTime") Long timestamp);

    boolean add(Admin admin);

    void addRole(Admin admin);

    void update(Admin admin);

    void updateRole(Admin admin);

    int info(Admin admin);

    int delete(Long[] id);
}
package com.fpl.edu.shoeStore.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.fpl.edu.shoeStore.user.entity.User;

@Mapper
public interface UserMapper {

    // --- CRUD CƠ BẢN ---

    List<User> findAll();

    User findById(@Param("id") Integer id);


    User findByPhone(@Param("phone") String phone);

    User findByUsername(@Param("username") String username);

    int insert(User user);

    int update(User user);

 
    int deleteById(@Param("id") Integer id);

    // --- TÌM KIẾM & PHÂN TRANG (Map với file XML) ---

    List<User> findAllPaged(
            @Param("userId") Integer userId,
            @Param("username") String username,
            @Param("fullName") String fullName,  
            @Param("email") String email,
            @Param("phone") String phone,       
            @Param("roleId") Integer roleId,
            @Param("status") String status,      
            @Param("offset") int offset,
            @Param("size") int size
    );

    long countAll(
            @Param("userId") Integer userId,
            @Param("username") String username,
            @Param("fullName") String fullName,
            @Param("email") String email,
            @Param("phone") String phone,
            @Param("roleId") Integer roleId,
            @Param("status") String status
    );

    // --- VALIDATION ---




}

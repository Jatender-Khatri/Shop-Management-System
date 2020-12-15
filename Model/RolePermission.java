/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.model;



/**
 *
 * @author Jatendar
 */
public class RolePermission {
    private Integer rolePermissionId;
    private Role role;
    private Permission permission;

    public Integer getId() {
        return rolePermissionId;
    }

    public void setId(Integer rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission1) {
        this.permission = permission1;
    }
    
    
}

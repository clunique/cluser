package com.cluser.dao.model;

public class TPermission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.id
     *
     * @mbggenerated Mon Dec 12 10:02:28 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.permission_name
     *
     * @mbggenerated Mon Dec 12 10:02:28 CST 2016
     */
    private String permissionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.display_name
     *
     * @mbggenerated Mon Dec 12 10:02:28 CST 2016
     */
    private String displayName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.id
     *
     * @return the value of t_permission.id
     *
     * @mbggenerated Mon Dec 12 10:02:28 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.id
     *
     * @param id the value for t_permission.id
     *
     * @mbggenerated Mon Dec 12 10:02:28 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.permission_name
     *
     * @return the value of t_permission.permission_name
     *
     * @mbggenerated Mon Dec 12 10:02:28 CST 2016
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.permission_name
     *
     * @param permissionName the value for t_permission.permission_name
     *
     * @mbggenerated Mon Dec 12 10:02:28 CST 2016
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.display_name
     *
     * @return the value of t_permission.display_name
     *
     * @mbggenerated Mon Dec 12 10:02:28 CST 2016
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.display_name
     *
     * @param displayName the value for t_permission.display_name
     *
     * @mbggenerated Mon Dec 12 10:02:28 CST 2016
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }
}
package src.main.java.com.example.basicconfiguration.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户
 * @TableName user
 */
@Data
public class User implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 头像
     */
    private Long avatarId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态：1启用、0禁用
     */
    private Integer enabled;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户名
     */
    private String username;

    /**
     * 部门id
     */
    private Long deptId;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 岗位名称
     */
    private Long jobId;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 0女1男
     */
    private Integer sex;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 0正常1删除
     */
    private Integer isDel;

    /**
     * 工号
     */
    private String number;

    /**
     * 员工姓名
     */
    private String realName;

    /**
     * 数据权限
     */
    private String dataScope;

    /**
     * 门店数据权限
     */
    private String storeDataScope;

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    public Long getId() {
        return id;
    }

    /**
     * ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 头像
     */
    public Long getAvatarId() {
        return avatarId;
    }

    /**
     * 头像
     */
    public void setAvatarId(Long avatarId) {
        this.avatarId = avatarId;
    }

    /**
     * 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 状态：1启用、0禁用
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * 状态：1启用、0禁用
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 部门id
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 部门id
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 岗位名称
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * 岗位名称
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 0女1男
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 0女1男
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 0正常1删除
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * 0正常1删除
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    /**
     * 工号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 工号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 员工姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 员工姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 数据权限
     */
    public String getDataScope() {
        return dataScope;
    }

    /**
     * 数据权限
     */
    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    /**
     * 门店数据权限
     */
    public String getStoreDataScope() {
        return storeDataScope;
    }

    /**
     * 门店数据权限
     */
    public void setStoreDataScope(String storeDataScope) {
        this.storeDataScope = storeDataScope;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAvatarId() == null ? other.getAvatarId() == null : this.getAvatarId().equals(other.getAvatarId()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getJobId() == null ? other.getJobId() == null : this.getJobId().equals(other.getJobId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getDataScope() == null ? other.getDataScope() == null : this.getDataScope().equals(other.getDataScope()))
            && (this.getStoreDataScope() == null ? other.getStoreDataScope() == null : this.getStoreDataScope().equals(other.getStoreDataScope()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAvatarId() == null) ? 0 : getAvatarId().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getJobId() == null) ? 0 : getJobId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getDataScope() == null) ? 0 : getDataScope().hashCode());
        result = prime * result + ((getStoreDataScope() == null) ? 0 : getStoreDataScope().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", avatarId=").append(avatarId);
        sb.append(", email=").append(email);
        sb.append(", enabled=").append(enabled);
        sb.append(", password=").append(password);
        sb.append(", username=").append(username);
        sb.append(", deptId=").append(deptId);
        sb.append(", phone=").append(phone);
        sb.append(", jobId=").append(jobId);
        sb.append(", createTime=").append(createTime);
        sb.append(", nickName=").append(nickName);
        sb.append(", sex=").append(sex);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDel=").append(isDel);
        sb.append(", number=").append(number);
        sb.append(", realName=").append(realName);
        sb.append(", dataScope=").append(dataScope);
        sb.append(", storeDataScope=").append(storeDataScope);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
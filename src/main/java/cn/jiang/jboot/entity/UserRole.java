package cn.jiang.jboot.entity;

import cn.jiang.jboot.base.JbootBaseEntity;
import cn.jiang.jboot.base.JbootBaseEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author jiang
 */
@Data
@Entity
@Table(name = "t_user_role")
@TableName("t_user_role")
public class UserRole extends JbootBaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户唯一id")
    private String userId;

    @ApiModelProperty(value = "角色唯一id")
    private String roleId;

    @Transient
    @TableField(exist=false)
    @ApiModelProperty(value = "角色名")
    private String roleName;
}

package cn.ripple.entity;


import cn.ripple.enums.DataStatusEnum;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "r_user")
@TableName("r_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名")
    @Column(unique = true, nullable = false)
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "手机")
    private String mobile;

    @ApiModelProperty(value = "邮件")
    private String email;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "0女 1男 2保密")
    private Integer sex;

    @ApiModelProperty(value = "状态 默认0正常 -1拉黑")
    private Integer status = DataStatusEnum.ENABLED.getValue();

}

package com.ev.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户信息")
public class User {

    @ApiModelProperty("账号")
    public String username;
    @ApiModelProperty("密码")
    public String password;

}

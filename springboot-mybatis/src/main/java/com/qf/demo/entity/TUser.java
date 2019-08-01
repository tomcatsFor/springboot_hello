package com.qf.demo.entity;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@EqualsAndHashCode
@Data
public class TUser {
    private Integer id;
    @NotNull(message = "名字不能为空")
    private String username;
    @NotNull(message = "密码不能为空")
    private String password;
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号格式错误")
    @NotBlank(message = "手机号码不能为空")
    private String phone;
    @Pattern(regexp = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$ ",message = "邮箱格式错误")
    private String email;
    @Min(value = 18,message = "最小年龄为18")
    private Integer age;


}
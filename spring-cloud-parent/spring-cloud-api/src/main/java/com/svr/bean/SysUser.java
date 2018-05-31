package com.svr.bean;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor     // 全参构造器
@NoArgsConstructor      // 无参构造器
@Data                   // 自定生成getter和setter...
@Accessors(chain=true)  // 可以链式调用自动生成的模板方法
public class SysUser implements Serializable {
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Integer id;

  
    private String userName;

   
    private String passWord;

    /**
     * 是否启用
     */
   
    private Integer userEnable;

}
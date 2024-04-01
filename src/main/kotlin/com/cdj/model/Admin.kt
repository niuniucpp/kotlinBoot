package com.cdj.model

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId

data class Admin(@TableId(type = IdType.AUTO) val id: Int,
                 val username: String,
                 val password: String)

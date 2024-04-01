package com.cdj.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.cdj.model.Admin

interface AdminMapper : BaseMapper<Admin>{

    /**
     * 支持高级查询
     */
    fun queryadmin(info: Admin): List<Admin>

}
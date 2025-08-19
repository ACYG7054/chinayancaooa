package org.example.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.model.system.SysUser;

public interface SysUserService extends IService<SysUser> {
    void updateStatus(Long id, Integer status);

}
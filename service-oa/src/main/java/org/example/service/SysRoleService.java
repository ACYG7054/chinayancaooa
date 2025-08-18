package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.model.system.SysRole;
import org.example.vo.system.AssginRoleVo;

import java.util.List;
import java.util.Map;

public interface SysRoleService extends IService<SysRole> {
    /**
     * 根据用户获取角色数据
     * @param userId
     * @return
     */
    Map<String, Object> findRoleByUserId(Long userId);

    /**
     * 分配角色
     * @param assginRoleVo
     */
    void doAssign(AssginRoleVo assginRoleVo);
}
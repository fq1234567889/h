package com.github.kotlin711.h.manager.service.impl;

import com.github.kotlin711.h.manager.entity.Admin;
import com.github.kotlin711.h.manager.mapper.AdminMapper;
import com.github.kotlin711.h.manager.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author crying711
 * @since 2022-02-26
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}

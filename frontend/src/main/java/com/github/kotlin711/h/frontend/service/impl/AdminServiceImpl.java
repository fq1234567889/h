package com.github.kotlin711.h.frontend.service.impl;

import com.github.kotlin711.h.frontend.entity.Admin;
import com.github.kotlin711.h.frontend.mapper.AdminMapper;
import com.github.kotlin711.h.frontend.service.IAdminService;
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

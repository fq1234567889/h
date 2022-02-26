package com.github.kotlin711.h.frontend.service.impl;

import com.github.kotlin711.h.model.entity.Video;
import com.github.kotlin711.h.frontend.mapper.VideoMapper;
import com.github.kotlin711.h.frontend.service.IVideoService;
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
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements IVideoService {

}

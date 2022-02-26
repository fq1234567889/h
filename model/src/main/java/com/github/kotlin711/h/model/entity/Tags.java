package com.github.kotlin711.h.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author crying711
 * @since 2022-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Tags implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String tagName;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;


}

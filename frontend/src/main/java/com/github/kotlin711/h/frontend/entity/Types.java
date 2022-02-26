package com.github.kotlin711.h.frontend.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class Types implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private LocalDateTime createTime;


}

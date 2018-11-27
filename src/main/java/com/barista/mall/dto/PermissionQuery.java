package com.barista.mall.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author guochao
 * @since 1.0.0
 */
@Setter
@Getter
public class PermissionQuery extends BaseQuery {
    private String name;
}
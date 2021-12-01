package com.demo.admin.repository.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author wanglingfeng
 * @date Created in 2021/12/1
 */
@Data
@Builder
public class User {

    private long id;

    private String name;
}

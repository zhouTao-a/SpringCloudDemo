package com.cyscm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zhoutao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassRoom {

    private int id;
    private String name;
    private List<User> userList;
}

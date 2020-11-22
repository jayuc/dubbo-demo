package top.jayu.api.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Org implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String parentId;
    private String name;
    private String code;
    private String address;
}

package com.cme.education.bean.base;

import lombok.Data;
import java.io.Serializable;

@Data
public class Parameter implements Serializable {
    private int parameter_id;
    private int parameter_type_id;
    private String _parameter_name;
    private int show_index;
    private String description;
    private int parent_id;
    private String note_state;
    private String parameter_code;
    private String smallType;
}

package com.cme.education.bean.base;

import lombok.Data;
import java.io.Serializable;

@Data
public class ParameterType implements Serializable {
    private int parameter_type_id;
    private String parameter_name;
    private int parent_id;
    private int show_index;
    private String note_state;
}

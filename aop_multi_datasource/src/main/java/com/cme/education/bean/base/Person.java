package com.cme.education.bean.base;

import com.cme.education.bean.BaseDomin;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class Person extends BaseDomin implements Serializable {
    private String com_person_id;

    private String cert_id;

    private String person_name;

    private String sex;

    private Date birthday;

    private int nation;

    private int party;

    private String university;

    private String telephone;

    private String mobile;

    private String mmail;

    private int clause;

    private int spec;

    private Date job_date;

    private int mducation;

    private int megree;

    private String prof_cert_id;

    private int hospital_duty;

    private String photo;

    private int person_type;

    private String remark;

    private String dept_id;

    private Date add_time;

    private int note_state;

    private String title_id;

    private Date msg_end_time;

    private int organization_state;

    private String kj_code;

    private String unit_other;

    private String dept_other;
}

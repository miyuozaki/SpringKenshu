package jp.co.kensyu.form.employee;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import jp.co.kensyu.validator.annotation.Memo;

public class EmployeeListForm {
	@NotEmpty
    private String name;
	@NotNull
	@Min(18)
    private Integer age;
	@Memo(50)
    private String memo;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
}
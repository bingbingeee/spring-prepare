package com.meta.springprepare.memo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Memo {
    private String username;
    private String contents;
    private String title;
    private Date createAt;
    private Date updateAt;

    public void writeMemo(){

    }
}

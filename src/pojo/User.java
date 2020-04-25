package pojo;

import java.sql.Timestamp;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/4/2510:41
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class User {
    private int uid;
    private String uname;
    private String pwd;
    private Timestamp time;
    private String id_num;
    private String name1;
    private double money;

    public Timestamp getTime() {
        return time;
    }
    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getId_num() {
        return id_num;
    }
    public void setId_num(String id_num) {
        this.id_num = id_num;
    }
    public String getName1() {
        return name1;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }


    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
        result = prime * result + uid;
        result = prime * result + ((uname == null) ? 0 : uname.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (pwd == null) {
            if (other.pwd != null)
                return false;
        } else if (!pwd.equals(other.pwd))
            return false;
        if (uid != other.uid)
            return false;
        if (uname == null) {
            if (other.uname != null)
                return false;
        } else if (!uname.equals(other.uname))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "User [uid=" + uid + ", uname=" + uname + ", pwd=" + pwd + ", getUid()=" + getUid() + ", getUname()="
                + getUname() + ", getPwd()=" + getPwd() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
                + ", toString()=" + super.toString() + "]";
    }
    public User(int uid, String uname, String pwd) {
        super();
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
    }
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
}

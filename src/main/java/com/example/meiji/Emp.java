package com.example.meiji;

public class Emp {

    private String empID;

    private String name;

    private String namePinyin;

    private String hiragana;

    private String kaTaGaNa;

    private String sex;

    private String tall;

    private String weight;

    private String tel;

    private String work;

    private String blacklist;
    private String username;
    private String password;

    Emp(String empID,
        String name,
        String namePinyin,
        String hiragana,
        String kaTaGaNa,
        String sex,
        String tall,
        String weight,
        String tel,
        String work,
        String blacklist,
        String username,
        String password) {
        this.empID = empID;
        this.name = name;
        this.namePinyin = namePinyin;
        this.hiragana = hiragana;
        this.kaTaGaNa = kaTaGaNa;
        this.sex = sex;
        this.tall = tall;
        this.weight = weight;
        this.tel = tel;
        this.work = work;
        this.blacklist = blacklist;
        this.username = username;
        this.password = password;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

    public String getNamePinyin() {
        return namePinyin;
    }

    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    public String getHiragana() {
        return hiragana;
    }

    public void setHiragana(String hiragana) {
        this.hiragana = hiragana;
    }

    public String getKaTaGaNa() {
        return kaTaGaNa;
    }

    public void setKaTaGaNa(String kaTaGaNa) {
        this.kaTaGaNa = kaTaGaNa;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTall() {
        return tall;
    }

    public void setTall(String tall) {
        this.tall = tall;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.weight = work;
    }

    public String getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(String blacklist) {
        this.weight = blacklist;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

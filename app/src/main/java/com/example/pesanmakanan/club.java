package com.example.pesanmakanan;

public class club {
    String name, detail;
    int logo;

    public club(String name, String detail, int logo) {
        this.name = name;
        this.detail = detail;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}

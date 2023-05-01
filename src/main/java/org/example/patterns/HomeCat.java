package org.example.patterns;


import lombok.ToString;

import java.util.Date;
@ToString
// similar to setBean, but more flexible
public class HomeCat {
    private final int id;
    private final String owner_id;
    private String name;
    private Date birthday;
    private Color color;


    public HomeCat(int id, String owner_id) {
        this.id = id;
        this.owner_id = owner_id;
    }

    public HomeCat(Builder builder) {
        this.id = builder.id;
        this.owner_id = builder.owner_id;
        this.birthday = builder.birthday;
        this.color = builder.color;
        this.name = builder.name;
    }

    //pulic的静态内部类
    public static class Builder {
        private final int id;
        private final String owner_id;
        private String name;
        private Date birthday;
        private Color color;

        public Builder(int id, String owner_id) {
            this.id = id;
            this.owner_id = owner_id;
        }

        public Builder name(String val) {
            this.name = val;
            return this;
        }

        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Builder birthday(Date val) {
            this.birthday = val;
            return this;
        }

        public HomeCat build() {
            return new HomeCat(this);
        }
    }

    public static void main(String[] args) {
        HomeCat hc = new Builder(123, "Alice").name("Bob").birthday(new Date()).color(Color.BLACK).build();
        System.out.println(hc.toString());
    }
}

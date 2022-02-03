package com.company;

public class Main {

    public static void main(String[] args) {



        Balyk balyk = new Balyk();
        balyk.setJashaganJeri("Танч океан");
        balyk.setTuru("Форель");
        balyk.setJyr((byte)11);
        System.out.println(balyk.getTuru() + " " + balyk.getJashaganJeri() + " " + balyk.getJyr()+"% майы бар");

        Popugai popugai = new Popugai();
        popugai.setAty("Какапо");
        popugai.setButu((byte)2);
        popugai.setJash((byte)80);
        popugai.setUn("Адамды кайталайт");
        System.out.println(popugai.getAty()+" " + popugai.getButu()+" буту бар" + popugai.getUn()+" " + popugai.getJash()+"жаш");

        Myshyk myshyk = new Myshyk();
        myshyk.setAty("Маруся");
        myshyk.setButu((byte)4);
        myshyk.setJash((byte)5);
        myshyk.setUn("мяу-мяу");
        myshyk.setColor("күрөң");
        System.out.println(myshyk.getAty()+" " + myshyk.getUn() +" " + myshyk.getJash()+" жашта " +myshyk.getButu()+" буту бар " +myshyk.getColor()+" түстө");

        Dog dog = new Dog();
        dog.setAty("Бэм");
        dog.setUn("гав-гав");
        dog.setButu((byte) 4);
        dog.setColor("ак");
        dog.setJash((byte) 2);
        System.out.println(dog.getAty()+" " + dog.getUn() +" " + dog.getJash() +" жашта " + dog.getColor()+" " + dog.getButu()+" буту бар");

    }
}

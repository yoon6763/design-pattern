package uknowlab.designpattern4java.decorator;

import uknowlab.designpattern4java.decorator.beverage.*;
import uknowlab.designpattern4java.decorator.condiment.ExtraShot;
import uknowlab.designpattern4java.decorator.condiment.JavaChip;
import uknowlab.designpattern4java.decorator.condiment.Whip;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Beverage 에소프레소 = new Espresso();
        System.out.println(에소프레소.getDescription() + " " + 에소프레소.cost() + "원");

        Beverage 아메리카노 = new Americano();
        아메리카노 = new ExtraShot(아메리카노); // 아메리카노 샷 추가!
        아메리카노 = new ExtraShot(아메리카노); // 아메리카노 또 샷 추가! 더블 샷!
        System.out.println(아메리카노.getDescription() + " " + 아메리카노.cost() + "원");

        Beverage 카페라떼 = new CafeLatte();
        카페라떼 = new Whip(카페라떼); // 카페라떼에 휘핑 추가!
        카페라떼 = new JavaChip(카페라떼); // 카페라떼에 자바칩 추가!
        System.out.println(카페라떼.getDescription() + " " + 카페라떼.cost() + "원");

        Beverage 유자차 = new CitronTee();
        유자차 = new Whip(유자차); // 유자차에 휘핑 추가!...???
        System.out.println(유자차.getDescription() + " " + 유자차.cost() + "원");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
}
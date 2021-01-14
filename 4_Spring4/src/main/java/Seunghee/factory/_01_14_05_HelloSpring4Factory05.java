package Seunghee.factory;
import Seunghee._interface._01_14_05_HelloSpring4Interface05;
import Seunghee.bean._01_14_05_HelloSpring4Bean05Eng;
import Seunghee.bean._01_14_05_HelloSpring4Bean05Jpn;
import Seunghee.bean._01_14_05_HelloSpring4Bean05Kor;

public class _01_14_05_HelloSpring4Factory05 {

    public static _01_14_05_HelloSpring4Interface05 create(String type) {
        _01_14_05_HelloSpring4Interface05 bean05 = null;

        if (type.equalsIgnoreCase("Kor"))
            bean05 = new _01_14_05_HelloSpring4Bean05Kor();
        else if (type.equalsIgnoreCase("Eng"))
            bean05 = new _01_14_05_HelloSpring4Bean05Eng();
        else if (type.equalsIgnoreCase("Jpn"))
            bean05 = new _01_14_05_HelloSpring4Bean05Jpn();

        return bean05;
    }
}

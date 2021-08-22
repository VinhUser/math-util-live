/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Vinh
 */
//ta viết cái class để cung cấp tiện ích cho nơi khác xài
//khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta ko cần nhớ cái gì
//cho riêng ta, hàm static giuos làm điều này
public class MathUtil {
    public static long giaiThua(int a){
        if(a < 0 || a > 20){
            throw new IllegalArgumentException("Invalid argument, n must be bet");
        }
        if(a > 0){
            return a*giaiThua(a - 1);
        }
        return 1;
    }
}

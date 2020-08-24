package com.exercise.Shape;
abstract class Shape 
{
    String name;
    double length, width, height; 
    double radius;
    abstract double area();  // 求面積
    abstract double perimeter();  // 求周長

 // abstract class中也可以有建構方法, 但必須在子類別中被呼叫
 
 // 四邊形的建構方法
     public Shape(double length, double width, String name){  
          this.length = length;  
          this.width = width;  
          this.name = name;  
     }
    
  // 三角形的建構方法
     public Shape(String name, double width, double height){ 
          this.height = height;  
          this.width = width;  
          this.name = name;  
     }

}
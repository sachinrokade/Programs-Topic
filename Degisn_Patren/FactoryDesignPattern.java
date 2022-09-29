package com.example.DP;

interface Computer{

   String ram();
   String cpu();
}

class Lap implements Computer{

  String cpu;
  String ram;
  String name;
 public Lap(String ram,String cpu,String name){

  this.cpu=cpu;
  this.ram=ram;
  this.name=name;
 }

 @Override
 public String ram() {
  return ram;
 }

 @Override
 public String cpu() {
  return cpu;
 }

 public String getName() {
  return name;
 }

 @Override
 public String toString() {
  return "Lap{" +
          "cpu='" + cpu + '\'' +
          ", ram='" + ram + '\'' +
          ", name='" + name + '\'' +
          '}';
 }
}


class Server implements Computer{

 String cpu;
 String ram;
 String name;
 public Server(String ram,String cpu,String name){

  this.cpu=cpu;
  this.name=name;
  this.ram=ram;
 }

 @Override
 public String ram() {
  return ram;
 }

 @Override
 public String cpu() {
  return cpu;
 }

 public String getName() {
  return name;
 }

 @Override
 public String toString() {
  return "Server{" +
          "cpu='" + cpu + '\'' +
          ", ram='" + ram + '\'' +
          ", name='" + name + '\'' +
          '}';
 }
}

class FactoryDesign{

 public static Computer getComputerFactory(String device){

      if(device.equals("Lap"))
       return new Lap("8gb","i7","Laptop");

  if(device.equals("Server"))
   return new Server("128gb","i7","Server");

  return null;
 }
}





public class FactoryDesignPattern {

 public static void main(String[] args) {

  Computer fact=FactoryDesign.getComputerFactory("Lap");
  Computer fact1=FactoryDesign.getComputerFactory("Server");

  System.out.println(fact.toString());
  System.out.println(fact1.toString());

 }

}

package ru.job4j.calculate;

/**
* Класс для вывода на консоль надписи "Hello World".
* @author Alexander Tsakharias
* @ since 04.05.2019
* @ version 1
*/
public class Calculate {
	
	/**
	* Main
	* @param args - args.
	*/
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	/**
	* Method echo.
	* @param name Your name.
	* @return Echo plus your name.
	*/
	public String echo(String name) {
		return "Echo, echo, echo : " + name;
	}
}
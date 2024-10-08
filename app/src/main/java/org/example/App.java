/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.example.classes.Man;
import org.example.classes.Person;
import org.example.classes.PersonInvocationHandler;

import java.lang.reflect.Proxy;

public class App {

    public static void main(String[] args) {
        Man mohan = new Man("mohan", 30, "delhi", "india"); // obj creation
        ClassLoader mohanClassLoader = mohan.getClass().getClassLoader();
        Class[] interfaces = mohan.getClass().getInterfaces();
        Person proxyMohan = (Person) Proxy.newProxyInstance(mohanClassLoader,interfaces, new PersonInvocationHandler(mohan)); // a proxy for the Person Interface & invoking method through proxy
        proxyMohan.introduce(mohan.getName());

    }
}

package org.example.classes;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonInvocationHandler implements InvocationHandler {

    private Person person;

    public PersonInvocationHandler(Person person) {
        this.person = person;
    }


// This class implements InvocationHandler, a key component for dynamic proxies in Java.
// It intercepts method calls on the proxy instance and defines custom behavior for those calls.
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("Before method: " + method.getName());
        Object result = method.invoke(person, args); // Invoke the actual method
        System.out.println("After method: " + method.getName());
        return result;
    }
}

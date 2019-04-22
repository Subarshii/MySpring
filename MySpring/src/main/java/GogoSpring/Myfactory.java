package GogoSpring;


import javax.validation.groups.Default;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


import static GogoSpring.MytimeStart.endTime;
import static GogoSpring.MytimeStart.startTime;
import static GogoSpring.MytimeStart.duration;

public interface Myfactory {

   static Object  createService(Object realObject) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                Method method1 = realObject.getClass().getMethod(method.getName(), method.getParameterTypes());
                if (method1.getAnnotation(MytimeStart.class) != null) {

                    System.out.println("MyTime Start = " + startTime);
                }

                Object result = method.invoke(realObject, args);
                System.out.println("My Time End = " + endTime);
                System.out.println("Duration = " + duration);
                return result;
            }
        };

        ClassLoader classLoader = realObject.getClass().getClassLoader();
        Class[] classes = realObject.getClass().getInterfaces();
        Object time = Proxy.newProxyInstance(classLoader, classes, handler);
        return time;
    }
}

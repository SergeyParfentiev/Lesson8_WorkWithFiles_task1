package Reflection.task8;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Byblik272 on 21/1/2016.
 */
public class ApplicationManagerLauncher {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        ApplicationManager am = new ApplicationManager();

        am.checkPresentAnnotation(Bird.class);
        am.checkPresentAnnotation(Dog.class);
        am.checkPresentAnnotation(Cat.class);
    }
}

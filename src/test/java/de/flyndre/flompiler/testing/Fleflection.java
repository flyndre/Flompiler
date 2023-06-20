package de.flyndre.flompiler.testing;

import de.flyndre.flompiler.TestConstants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Reflection utils used to test the Flompiler.
 * @author David Maier
 */
public class Fleflection {

    /**
     * Creates an instance of the given class.
     * @param inputFileFolder the folder in which the class' class file lays
     * @param inputClassName the name of the class (not the class file!)
     * @return an instance of the class
     */
    public static Object getReflectionInstance(String inputFileFolder, String inputClassName) {
        try {
            File inputFolder = new File( TestConstants.RESOURCES_ROOT + inputFileFolder);
            URLClassLoader classLoader = new URLClassLoader(
                    new URL[]{ inputFolder.toURI().toURL() },
                    Thread.currentThread().getContextClassLoader()
            );
            Class<?> clazz = Class.forName(inputClassName, true, classLoader);
            return clazz.getDeclaredConstructor().newInstance();
        } catch (MalformedURLException e) {
            throw new RuntimeException("The folder path is malformed.", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("There is no class with name " + inputClassName + ".", e);
        } catch (InstantiationException e) {
            throw new RuntimeException("The given class cannot be instanced (is abstract).", e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("The given class cannot be instanced (constructor is not public).", e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("The given class cannot be instanced (no matching constructor).", e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException("The given class cannot be instanced (its constructor threw an exception).", e);
        }
    }

}

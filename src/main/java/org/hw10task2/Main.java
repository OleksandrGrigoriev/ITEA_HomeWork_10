package org.hw10task2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> editor = Editor.class;
        Class<?> notePad = NotePad.class;
        Class<?> textEditor = TextEditor.class;

        Annotation[] editorAnnotations = editor.getAnnotations();
        Annotation[] textEditorAnnotations = textEditor.getAnnotations();
        Annotation[] classAnnotations = notePad.getAnnotations();

        System.out.println("Class " + editor.getName() + " annotations: ");
        for (Annotation annotation:editorAnnotations) {
            System.out.println(annotation);
        }
        System.out.println();
        System.out.println("Class " + textEditor.getName() + " annotations: ");
        for (Annotation annotation:textEditorAnnotations) {
            System.out.println(annotation);
        }
        System.out.println();
        System.out.println("Class " + notePad.getName() + " annotations: ");
        for (Annotation annotation:classAnnotations) {
            System.out.println(annotation);
        }
        System.out.println();

        Method[] methodsOfTextEditor = TextEditor.class.getDeclaredMethods();
        System.out.println("Annotations of TextEditor methods:");
        for (Method method: methodsOfTextEditor) {
            Annotation[] annotationsOfCurrentMethod = method.getDeclaredAnnotations();
            if (annotationsOfCurrentMethod.length != 0) {
                System.out.println("Annotation of " + method + " method: ");
                for (Annotation annotation : annotationsOfCurrentMethod) {
                    System.out.println(annotation);
                }
            }
        }

    }
}

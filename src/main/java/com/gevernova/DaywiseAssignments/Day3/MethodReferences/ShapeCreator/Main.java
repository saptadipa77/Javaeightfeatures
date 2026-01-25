package com.gevernova.DaywiseAssignments.Day3.MethodReferences.ShapeCreator;

public class Main {
    public static void main(String[] args) {

        // 1. Create an instance of the ShapeCreator interface
        // using an anonymous inner class
        ShapeCreator factory = new ShapeCreator() {
            @Override
            public RectangleClass create() {
                // The logic for "creating" is inside this method
                return new RectangleClass();
            }
        };

        // 2. Use a method reference to that specific instance's 'create' method
        // Pattern: instanceName::methodName
        ShapeCreator constructorRef = factory::create;

        // 3. Trigger the creation
        System.out.println("Calling the method reference...");
        RectangleClass myRect = constructorRef.create();
    }
}


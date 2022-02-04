package org.Lesson22;

public class Main {
    public static void main(String[] args) {
        BuilderExample builderExample = BuilderExample
                .getBuilder()
                .setName("Polina")
                .setStatus(25L)
                .build();
        System.out.println(builderExample.getName() + builderExample.getStatus());

        BuilderExample builderExample1 =
                BuilderExample
                        .getBuilder()
                        .setName("Anna")
                        .setAge(20).
                        setStatus(20L)
                        .build();
        System.out.println(builderExample1.getName() + builderExample1.getAge() + builderExample1.getStatus());

        BuilderExample builderExample2 = BuilderExample
                .getBuilder()
                .setSome("cat")
                .build();
        builderExample2
                .getSome()
                .printCat();

    }

}

package org.Lesson22;

public class BuilderExample {
    private String name;
    private int age;
    private Long status;
    private Some some;

    private BuilderExample(){
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public Long getStatus() {
        return status;
    }

    public Some getSome() {
        return some;
    }

    public static Builder getBuilder(){
        return new BuilderExample().new Builder();
    }

    public class Builder{
        private Builder(){

        }
        public Builder setName(String secondName){
            name = secondName;
            return this;
        }
        public Builder setAge(int secondAge){
            age = secondAge;
            return this;
        }
        public Builder setStatus(Long secondStatus){
            status = secondStatus;
            return this;
        }

        public Builder setSome(String cat){
            some = new Some(cat);
            return this;
        }
        public BuilderExample build(){
            return BuilderExample.this;
        }
    }

}










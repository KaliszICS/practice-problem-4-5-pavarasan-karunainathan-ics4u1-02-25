class Student{
    String name;
    int age;
    String studentNumber;

    /**
     * Constructor of the Student class
     * @param _name The name of the Student
     * @param _age The age of the Student
     * @param _studentNumber The student number of the Student
     */
    public Student(String _name, int _age, String _studentNumber){
        name = _name;
        age = _age;
        studentNumber = _studentNumber;
    }

    /**
     * Gets the name of the Student
     * @return The name of the Student
     */
    public String getName(){return name;}

    /**
     * Gets the age of the Student
     * @return The age of the Student
     */
    public int getAge(){return age;}

    /**
     * Gets the student number of the Student
     * @return The student number of the Student
     */
    public String getStudentNumber(){return studentNumber;}
    
    /**
     * Overrides the toString method of Student
     * @return The name, age - student number formatted
     */
    @Override
    public String toString(){
        return name + ", " + String.valueOf(age) + " - " + String.valueOf(studentNumber);
    }

    /**
     * Overrides the equals method of Student
     * @param other The other Object to measure to
     * @return If the Student is equal to the other Object
     */
    @Override
    public boolean equals(Object other){
        if(other instanceof Student){
            Student otherStudent = (Student)other;
            return otherStudent.studentNumber == studentNumber;
        }else{
            return false;
        }
    }
}
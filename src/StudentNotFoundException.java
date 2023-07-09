package org.geneation.excercises;

public class StudentNotFoundException
    extends Exception
{

    public StudentNotFoundException( )
    {
        super( "Student not found!" );
    }
}

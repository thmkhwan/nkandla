package com.bbd;

public class PersonTypeEnums 
{
    enum personType{
        President(0), Lawyer(1), Architect(2), Other(3);

        personType(int r)   {
            rank = r;
        }

        int rank;

    }
}
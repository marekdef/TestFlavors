package marekdef.pl.mylibrary;/*
* Copyright (C) TomTom International B.V., 2015
* All rights reserved.
*/

public class Library implements ILibrary {

    @Override
    public String getFlavor() {
        return "release";
    }
}
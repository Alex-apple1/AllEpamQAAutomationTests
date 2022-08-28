package com.epam.tc.hw7;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.tc.hw7.pages.Homepage;
import com.epam.tc.hw7.pages.MetalsAndColorsPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JdiSite {
    public static Homepage homePage;

    public static MetalsAndColorsPage metalsAndColorsPage;
}

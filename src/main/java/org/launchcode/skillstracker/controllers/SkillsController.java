package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("favLanguages")
public class SkillsController {

    @PostMapping
    public String displayPage(@RequestParam String name,
                              @RequestParam String firstFav,
                              @RequestParam String secondFav,
                              @RequestParam String thirdFav) {

        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1><br>" +
                        "<h2>We have a few skills we would like to learn. Here is the list</h2>" +
                            "<ol>" +
                                "<li>" + firstFav + "</li>" +
                                "<li>" + secondFav + "</li>" +
                                "<li>" + thirdFav + "</li>" +
                            "</ol>" +
                    "</body>" +
                "</html>";

    }
    @GetMapping("form")
    public String chooseLanguagesForm() {
        return "<form action='/favLanguages' method='post'>" +
                    "<label for='nameSelect'>Name:</label>" +
                    "<br><input type='text' name='name' id='nameSelect'><br>" +
                    "<label for='favoriteLanguage'>My favorite language:</label><br>" +
                    "<select name='firstFav' id='favoriteLanguage'>" +
                            "<option value='java'>Java</option>" +
                            "<option value='javaScript'>JavaScript</option>" +
                            "<option value='python'>Python</option>" +
                    "</select>" +
                    "<br><label for='secondFavoriteLanguage'>My second favorite language:</label><br>" +
                    "<select name='secondFav' id='secondFavoriteLanguage'>" +
                        "<option value='java'>Java</option>" +
                        "<option value='javaScript'>JavaScript</option>" +
                        "<option value='python'>Python</option>" +
                    "</select>" +
                    "<br><label for='thirdFavoriteLanguage'>My third favorite language:</label><br>" +
                    "<select name='thirdFav' id='thirdFavoriteLanguage'>" +
                        "<option value='java'>Java</option>" +
                        "<option value='javaScript'>JavaScript</option>" +
                        "<option value='python'>Python</option>" +
                    "</select>" +
                    "<br><input type='submit' value='Submit'>" +
                "</form>" ;

    }


}

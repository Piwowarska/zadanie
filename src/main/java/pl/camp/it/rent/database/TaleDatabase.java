package pl.camp.it.rent.database;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.camp.it.rent.model.Tale;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaleDatabase {
    private final List<Tale> tales=new ArrayList<>();

    public TaleDatabase() {
        this.tales.add(
                new Tale("Raya i ostatni smok",
                         "Antonina Żbikowska, Katarzyna Dąbrowska, Monika Szomko, Pola Pietrzak, Pola Piłat, Teresa Zdanowska",
                         "księżniczka, odwaga, podróże, poszukiwania, potwory, smoki, Wojna"));
        this.tales.add(
                new Tale("Vaiana: Skarb Oceanu",
                         "Igor Kwiatkowski, Maciej Maleńczuk, Piotr Grabowski, Weronika Bochat-Piotrowska",
                         "ocean, odwaga, przygoda, wyspa"));
        this.tales.add(
                new Tale("Coco",
                         "Agata Kulesza, Bartosz Opania, Ewa Szykulska, Maciej Stuhr, Michał Rosiński, Tomasz Błasiak",
                         "czary, duchy, magia, muzyka, zmarli"));
        this.tales.add(
                new Tale("Mulan",
                         "Jerzy Bończak, Jerzy Stuhr, Jolanta Fraszyńska, Maciej Molęda, Marek Bocianiak, Robert Rozmus, Tomasz Marzecki",
                         "przebranie, wojownicy"));
        this.tales.add(
                new Tale("Kraina lodu",
                         "Alan Tudyk, Anna Cieślak, Bożena Furczyk, Czesław Mozil, Elżbieta Gaertner, Grzegorz Kwiecień, Idina Menzel, Jacek Król, Janusz R. Nowicki, Jonathan Groff, Josh Gad, Kristen Bell, Krzysztof Dracz, Lidia Sadowa, Milogost Reczek, Paweł Ciołkosz, Santino Fontana, Stefan Knothe",
                         "magia, przygoda, przyjaźń, zima"));

    }

    public List<Tale> getTales() {
        return tales;
    }
}


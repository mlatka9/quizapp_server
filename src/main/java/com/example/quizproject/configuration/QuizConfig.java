package com.example.quizproject.configuration;


import com.example.quizproject.quizquestion.QuizQuestion;
import com.example.quizproject.quizquestion.QuizQuestionRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.core.io.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * Configuration class used to insert data to database
 *
 * it create QuizQuestion and insert them to database using
 * default method provided by JPA
 *
 */
@Configuration
public class QuizConfig {

    @Bean
    CommandLineRunner commandLineRunner(QuizQuestionRepository quizQuestionRepository, @Value("classpath:questions.csv") Resource resource) {
        return args -> {

            List<QuizQuestion> list = new ArrayList<>();
            list.add(new QuizQuestion(
                    "Ile jest 2+2?", 3, List.of("2", "1", "0", "4"), "matematyka"));
            list.add(new QuizQuestion(
                    "Ile jest 23*2?", 0, List.of("46", "48", "49", "42"), "matematyka"));
            list.add(new QuizQuestion(
                    "Jaki jest wzór na pole kwadratu?", 0, List.of("a^2", "a^3", "a+b", "(a+b)^2"), "matematyka"));
            list.add(new QuizQuestion(
                    "Ile jest 2+2*2?", 1, List.of("8", "6", "16", "4"), "matematyka"));
            list.add(new QuizQuestion(
                    "6 kwadransów to", 0, List.of("90 minut", "45 minut", "2 godziny", "godzina"), "matematyka"));
            list.add(new QuizQuestion(
                    "15% z 80 to", 1, List.of("8", "12", "21", "16"), "matematyka"));
            list.add(new QuizQuestion(
                    "240% z 25 to", 3, List.of("15", "70", "55", "60"), "matematyka"));
            list.add(new QuizQuestion(
                    "Który ułamek NIE odpowiada ułamkowi ⅜?", 2, List.of("6/16", "9/24", "15/32", "0,375"), "matematyka"));
            list.add(new QuizQuestion(
                    "y = 5x - 2  zaznacz wzór funkcji równoległej do tej podanej", 1, List.of("y=10x+2", "y=5x+5", "y=4x-5", "y=-5x-2"), "matematyka"));
            list.add(new QuizQuestion(
                    "X po obniżce o 15 % jest równy 850 ", 1, List.of("x=865", "x=1000", "x=850,15", "x=977,50"), "matematyka"));
            list.add(new QuizQuestion(
                    "Jak wygląda Twierdzenie Pitagorasa?", 3, List.of("a²+b²=c⁴", "a²+b³=c", "a³+b³=c³", "a²+b²=c²"), "matematyka"));
            list.add(new QuizQuestion(
                    "Jaki jest wzór na obietość sześcianu?", 1, List.of("a^2", "a^3", "a+b", "(a+b)^2"), "matematyka"));
            list.add(new QuizQuestion(
                    "Graniastosłup ma 18 krawędzi. Ile wierzchołków ma ten graniastosłup?", 2, List.of("18", "6", "12", "36"), "matematyka"));
            list.add(new QuizQuestion(
                    "Największą liczbą całkowitą spełniającą nierówność (4+x)2<(x−4)(x+4) jest", 2, List.of("-5", "-4", "-3", "-2"), "matematyka"));
            list.add(new QuizQuestion(
                    "W trójkącie prostokątnym dwa dłuższe boki mają długości 5–√ i 3. Obwód tego trójkąta jest równy", 3, List.of("√30", "5√5", "√15", "5+√5"), "matematyka"));
            list.add(new QuizQuestion(
                    "W trapezie równoramiennym, który nie jest równoległobokiem, kąty przy ramieniu różnią się o 50∘. Kąt przy krótszej podstawie tego trapezu jest równy", 2, List.of("125°", "130°", "115°", "65°"), "matematyka"));
            list.add(new QuizQuestion(
                    "Długość promienia r okręgu opisanego na kwadracie jest równa 23–√. Długość boku tego kwadratu ma wartość:", 0, List.of("2√6", "4√3", "4√6", "2√3"), "matematyka"));
            list.add(new QuizQuestion(
                    "Obwody dwóch trójkątów podobnych, których pola pozostają w stosunku 1:4, mogą być równe", 3, List.of("18 i 144", "2 i 10", "4 i 12", "7 i 28"), "matematyka"));
            list.add(new QuizQuestion(
                    "W rombie bok i krótsza przekątna mają taką samą długość, równą a. Wówczas dłuższa przekątna ma długość:", 2, List.of("a√2", "2a", "a√3", "a√6"), "matematyka"));
            list.add(new QuizQuestion(
                    "W równoległoboku kąt rozwarty jest cztery razy większy od kąta ostrego . Zatem kąt ostry ma:", 0, List.of("36", "45", "60", "30"), "matematyka"));

            ///////////////////////////////

            list.add(new QuizQuestion(
                    "Jakim symbolem oznaczamy siłę?", 0, List.of("F", "M", "P", "S"), "fizyka"));
            list.add(new QuizQuestion(
                    "każdej akcji towarzyszy reakcja, jest to która zasada dynamiki", 0, List.of("3", "4", "1", "2"), "fizyka"));
            list.add(new QuizQuestion(
                    "p = m*v , to", 0, List.of("pęd", "prędkość", "moc", "przyśpieszenie"), "fizyka"));
            list.add(new QuizQuestion(
                    "Jaka jest podstawowa jednostka natężenia prądu elektrycznego?", 1, List.of("volt", "amper", "niuton", "sekunda"), "fizyka"));
            list.add(new QuizQuestion(
                    "Teoria względności został napisana przez", 1, List.of("Tesla", "Einstein", "Newton", "Bohr"), "fizyka"));
            list.add(new QuizQuestion(
                    "Prawo powszechnego ciążenia to", 1, List.of("tarcie", "grawitacja", "indukcja magnetyczna", "ciężar"), "fizyka"));
            list.add(new QuizQuestion(
                    "kierunek, zwrot i moduł, tyczy sie", 1, List.of("pracy", "wektora", "prędkości światła", "indukcją"), "fizyka"));
            list.add(new QuizQuestion(
                    "Z czym związane jest prawo Ohma?", 2, List.of("grawitacją", "prędkość światła", "natężeniem prądu", "teorią strun"), "fizyka"));
            list.add(new QuizQuestion(
                    "Podaj jednostkę mocy", 2, List.of("1S", "1N", "1W", "1M"), "fizyka"));
            list.add(new QuizQuestion(
                    "Jeżeli autobus gwałtownie ruszy osoba w nim stojąca pochyli się:", 2, List.of("do przodu", "nie pochyli się", "do tyłu", "na bok"), "fizyka"));
            list.add(new QuizQuestion(
                    "JOd czego NIE zależy siła tarcia kinetycznego", 2, List.of("żadna z odpowiedzi nie jest poprawna", "wartości siły dociskającej ciała do siebie", "pola powierzchni styku ciał", "rodzaju powierzchni ciał trących o siebie "), "fizyka"));
            list.add(new QuizQuestion(
                    "Od czego nie zależy siła oporu powietrza", 3, List.of("szybkości", "kształtu", "wielkości", "masy"), "fizyka"));
            list.add(new QuizQuestion(
                    "Om(Ω) to jednostka", 3, List.of("natężenia", "czasu", "szybkości", "rezystancji"), "fizyka"));
            list.add(new QuizQuestion(
                    "Zero absolutne to:", 3, List.of("temperatura zamarzania wody", "stan naelektryzowania neutralnego", "Najniższa z temperatur zanotowana na ziemi", "Najniższa z możliwych temperatur"), "fizyka"));
            list.add(new QuizQuestion(
                    "Jednostką masy NIE jest", 3, List.of("1kg", "1t", "1g", "1l"), "fizyka"));


            ////////////////////////////////////

            list.add(new QuizQuestion(
                    " Ile województw mamy obecnie?", 0, List.of("16", "17", "15", "21"), "geografia"));
            list.add(new QuizQuestion(
                    " Ile państw sąsiaduje z naszym krajem?", 2, List.of("3", "6", "7", "8"), "geografia"));
            list.add(new QuizQuestion(
                    "W jakim kraju leży Normandia?", 0, List.of("Francja", "Wielka Brytania", "Niemczech", "USA"), "geografia"));
            list.add(new QuizQuestion(
                    "Góra Kościuszki znajduje się w", 2, List.of("USA", "Polsce", "Australii", "Rosji"), "geografia"));
            list.add(new QuizQuestion(
                    "Mount Everest ma wysokość", 1, List.of("8 260 m", "8 849 m", "8 999 m", "8 551m"), "geografia"));
            list.add(new QuizQuestion(
                    "Najwyższy wodospad na świecie to:", 1, List.of("Wiktorii", "Salto Angel", "Niagara", "Tugela Falls"), "geografia"));
            list.add(new QuizQuestion(
                    "Gdzie znajduje się Pacanów:", 3, List.of("województwie małopolskim", "województwie łódzkim", "województwie śląskim", "województwie świętokrzyskim"), "geografia"));
            list.add(new QuizQuestion(
                    "Najwyższe drzewa na świecie to:", 3, List.of("Eukaliptusy", "Klony", "Jodły kaukaskie", "Sekwoje"), "geografia"));
            list.add(new QuizQuestion(
                    "Polska ma najdłuższą granicę z:", 1, List.of("Niamcami", "Republiką Czeską", "Białorusą", "Ukrainą"), "geografia"));
            list.add(new QuizQuestion(
                    "Przylądek Igielny znajduje się w:", 0, List.of("Afryce", "Australii", "Azji", "Ameryce Południowej"), "geografia"));
            list.add(new QuizQuestion(
                    "Największą wyspą świata jest:", 3, List.of("Madagaskar", "Borneo", "Nowa Gwinea", "Grenlandia"), "geografia"));
            list.add(new QuizQuestion(
                    "Lajkonik to jedno ze skojarzeń z", 2, List.of("Warszawa", "Szczecin", "Kraków", "Gdańsk"), "geografia"));
            list.add(new QuizQuestion(
                    "Pustynia Gobi leży w:", 0, List.of("Azji", "Afryce", "Australii", "Ameryce Południowej"), "geografia"));
            list.add(new QuizQuestion(
                    "Jezioro Loch Ness znajduje się w", 3, List.of("Francji", "Anglii", "Szwajcarii", "Szkocji"), "geografia"));
            list.add(new QuizQuestion(
                    "Jezioro Wiktorii to największe jezioro:", 2, List.of("Australii", "Azji", "Afryki", "Ameryki Południowej"), "geografia"));
            list.add(new QuizQuestion(
                    "Oficjalna nazwa Australii to:", 1, List.of("Republika Australii", "Związek Australijski", "Królestwo Australii", "Republika Federalna Australii"), "geografia"));
            list.add(new QuizQuestion(
                    "Pampa to kraina geograficzna położona w:", 0, List.of("Ameryce Południowej", "Europie", "Afryce", "Azji"), "geografia"));
            list.add(new QuizQuestion(
                    "Najwyższą górą w Afryce jest:", 1, List.of("Góra Stanleya", "Kilimandżaro", "Mount Speke", "Kenia"), "geografia"));
            list.add(new QuizQuestion(
                    "Babia Góra to jeden ze szczytów:", 2, List.of("Pieniny", "Tatr", "Beskidów Zachodnich", "Beskidów Małych"), "geografia"));
            list.add(new QuizQuestion(
                    "Ile stacji badawczych ma Polska na Antarktydzie?", 3, List.of("3", "0", "2", "1"), "geografia"));
            list.add(new QuizQuestion(
                    "Najdłuższy rynek Europy znajduje się w:", 0, List.of("Pułtusku", "Toruniu", "Gdańsku", "Krakowie"), "geografia"));


            ///////////////////////////////////////
            quizQuestionRepository.saveAll(list);
        };
    }
}

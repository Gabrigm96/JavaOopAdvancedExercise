package JavaAdvanced_1;

import java.util.*;

public class Ex3Collection {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Complete the function that removes any duplicates by using a set
     * then recreates a new list of unique items
     * <p>
     * You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        Set<String> listCorrected = new HashSet<>();
        listCorrected.addAll(list);
        list = new ArrayList<>();
        list.addAll(listCorrected);
        System.out.println(list);

        // Your code here

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     * the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        toSet(list); //<-- uncomment
        toSet(set); //<-- uncomment
        System.out.println(toSet(list));
        System.out.println(toSet(set));
    }
    // Write your method for exercise 2 here

    public static Set<String> toSet(Collection<String> fruit) {
        Set<String> fruits = new HashSet<>();
        fruits.addAll(fruit);

        return fruits;

    }


    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();


        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println(wordCount);

        // Your code here
        }

        /**
         * 4: Answer the following questions
         *
         *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
         *    and explain why you chose that data structure.
         *
         *    1 - You want to store the students in order of their arrival
         *    Answer:  list, in quanto dobbiamo mantenere un ordine(linkedList forse sarebbe più accurato in questo caso)
         *
         *    2 - You want to store the students in a class and their grades
         *    Answer: map, in quanto potremmo avere in questo caso una chiave classe e il relativo valore che potrebbe essere un double per il voto.
         *
         *    3 - You want to store the countries in the world in order of age
         *    Answer: set, perchè avremo in questo caso degli elementi unici come i paesi del mondo(un treeSet sarebbe più accurato secondo me)
         *
         *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
         *    Answer: map, perchè avremo una chiave di tipo stringa per il prodotto e un valore di tipo double per il prezzo corrispondente
         *
         *    5 - You want to store the employees at a company in the order you added them
         *    Answer:  list, perchè bisogna mantenere l'ordine di inserimento(linkedList mi sembra più accurata, in quanto è possibile accedere a tutti gli elementi ed iterare su di essi senza
         *    il rischio di spostare gli elementi come nelle arrayList)
         *
         *    6 - You want to store the cities in a particular state, along with their populations.
         *    Answer: map, perchè qui avremo una chiave rappresentante lo stato, e un valore rappresentante la popolazione
         *
         *    7 - You want to store the books in a library, along with their authors and publication dates.
         *    Answer: qui utilizzeremo una map che abbia come chiave la stringa inerente al titolo del libro, e per passare più valori ad essa si dovrebbe creare una classe e il relativo
         *    costruttore . Così facendo utilizzeremo la classe come tipo nella nostra mappa e passeremo più valori insieme tramite il costruttore alla nostra chiave.
         *
         *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
         *    Answer: mi verrebbe da dire map, avendo una chiave che potrebbe essere il professore e il valore che potrebbe essere il corso offerto dall'università. Mi viene però da pensare
         *    che se un professore facesse più di un corso, il suo valore verrebbe sovrascritto, in quanto non è possibile duplicare due chiavi e quindi il secondo valore andrà a sovrascrivere il primo.
         *
         *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
         *    Answer: si potrebbe fare una map che utilizzi una classe per passare più valori alla chiave tramite la creazione di un oggetto i cui parametri verranno passati da un costruttore.
         *
         *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
         *    Answer: stessa soluzione del 9, una map che vada a prendere da una classe più valori da associare alla chiave tramite costruttore. ESEMPIO:
         *    creo classe prenotazioniEasyJet
         *    creo mappa con chiave di tipo stringa voliDisponibili e uso la classe appena creata come tipo
         *    aggiungo valori alla mappa inserendo tramite costruttore  le destinazioni e gli orari di partenza
         *
         *
         *   11 - You want to store the articles on a news website, along with their titles and publication dates.
         *    Answer: stessa soluzione del 10 quindi classe da impostare e successivamente map coi relativi valori
         *
         *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
         *    Answer: anche qui stessa soluzione vista poc'anzi
         */

    }



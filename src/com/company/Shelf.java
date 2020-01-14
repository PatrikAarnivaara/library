package com.company;

import java.util.ArrayList;

public class Shelf {

    public ArrayList<Book> books = new ArrayList<>();


    void createBooksForLibrary(){
        books.add(new Book("The Defenders", "Philip K Dick", "The Defenders is a 1953 science fiction novelette by American author Philip K. Dick.", Category.FICTION, true));
        books.add(new Book("Frankenstein", "Mary Shelley", "When Victor Frankenstein, a brilliant scientist, tries to create life in his laboratory, " + "\n" + " the result is an ugly monster.", Category.FICTION, true));
        books.add(new Book("Dracula", "Bram Stoker", "Count Dracula, the legendary vampire who is Lord of the Undead," + "\n" + " departs from his castle in Transylvania and arrives in London, " + "\n" + " where he begins claiming new victims.", Category.FICTION, true));
        books.add(new Book("The Invisible Man", "H. G. Wells", "When a brilliant scientist discovers an invisibility formula, " + "\n" + " he turns to a life of crime- stealing and terrorizing the public.", Category.FICTION, true));
        books.add(new Book("Knife", "Jo Nesbo", "When Harry wakes up the morning after a blackout, " + "\n" + " drunken night with blood that's clearly not his own on his hands, " + "\n" + " it's only the very beginning of what will be a waking nightmare the likes of which even he could never have imagined.", Category.CRIME, true));
        books.add(new Book("Noir: A Novel", "Christopher Moore", "It’s not every afternoon that an enigmatic, comely blonde named Stilton (like the cheese) walks into the scruffy gin joint where Sammy \"Two Toes\" Tiffin tends bar.", Category.CRIME, true));
        books.add(new Book("Gutshot Straight: A Novel", "Lou Berney", "Berney is “all in”—sure to win a fervent following with the story of “Shake” Bouchon, fresh out of prison and on the straight and narrow path…after maybe just one last job.", Category.CRIME, true));
        books.add(new Book("The Road to Gandolfo: A Novel", "Robert Ludlum", "Under house arrest in Peking with a case against him pending in Washington, this looks like the end of Mac’s illustrious career. ", Category.CRIME, true));
        books.add(new Book("Fahrenheit 451", "Ray Bradbury", "Guy Montag is a fireman. In his world, where television rules and literature is on the brink of extinction, firemen start fires rather than put them out.", Category.FICTION, true));
        books.add(new Book("Rule of Capture", "Christopher Brown", "Defeated in a devastating war with China and ravaged by climate change, America is on the brink of a bloody civil war. ", Category.HISTORY, true));
        books.add(new Book("Witch Hunt", "Gregg Jarret", "How did a small group of powerful intelligence officials convince tens of millions of Americans that the president is a traitor, without a shred of evidence?", Category.HISTORY, true));
        books.add(new Book("The Book", "Stephane Mallarme", "This legendary, unfinished project is now translated into English for the first time.", Category.LITERATURE, true));
        books.add(new Book("Family Record", "Patrick Modiano", "An enthralling reflection on the ways that family history influences identity, from the 2014 Nobel laureate for literature.", Category.LITERATURE, true));
        books.add(new Book("Beloved", "Toni Morrison", "Staring unflinchingly into the abyss of slavery, this spellbinding novel transforms history into a story as powerful as Exodus and as intimate as a lullaby.", Category.LITERATURE, true));
        books.add(new Book("A Brief History of Time", "Stephen Hawkins", "Published more than two decades ago to great critical acclaim and commercial success, A Brief History of Time has become a landmark volume in science writing.", Category.SCIENCE, true));
        books.add(new Book("A Short History of Nearly Everything", "Bill Bryson", "One of the world’s most beloved and bestselling writers takes his ultimate journey -- into the most intriguing and intractable questions that science seeks to answer.", Category.SCIENCE, true));
        books.add(new Book("The Age of AI", "Jason Thacker", "Alexa, how is AI changing our world? We interact with artificial intelligence, or AI, nearly every moment of the day without knowing it.", Category.SCIENCE, true));
    }

    private void addNewBooks(){
        //books.add(new Book());
    }

    void showAllBooks() {
        for (Book book : books) {
            book.getInfo();
        }
    }




}

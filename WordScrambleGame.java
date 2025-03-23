import java.util.*;

public class WordScrambleGame {
    private static final Map<String, List<String>> categories = new HashMap<>();

    static {
        categories.put("Fruits", Arrays.asList("apple", "banana", "cherry", "grape", "orange", "pear", "pineapple", "mango", "papaya", "peach", "strawberry", "blueberry", "raspberry", "blackberry", "watermelon", "cantaloupe", "kiwi", "plum", "apricot", "fig", "pomegranate", "coconut", "lime", "lemon", "tangerine", "date", "guava", "dragonfruit", "lychee", "cranberry"));
        categories.put("Vegetables", Arrays.asList("carrot", "broccoli", "tomato", "potato", "onion", "cabbage", "spinach", "cucumber", "pumpkin", "beetroot", "garlic", "ginger", "lettuce", "cauliflower", "peas", "eggplant", "radish", "zucchini", "asparagus", "celery", "turnip", "bell pepper", "mushroom", "chili", "corn", "leek", "sweet potato", "bitter melon", "okra", "brussels sprouts"));
        categories.put("Jobs", Arrays.asList("doctor", "engineer", "teacher", "lawyer", "scientist", "nurse", "chef", "pilot", "policeman", "firefighter", "artist", "musician", "dentist", "architect", "mechanic", "electrician", "plumber", "journalist", "photographer", "writer", "actor", "director", "designer", "entrepreneur", "psychologist", "economist", "accountant", "soldier", "astronaut", "programmer"));
        categories.put("Countries", Arrays.asList("cambodia", "thailand", "vietnam", "malaysia", "indonesia", "philippines", "singapore", "laos", "myanmar", "china", "japan", "korea", "india", "pakistan", "bangladesh", "nepal", "bhutan", "sri lanka", "maldives", "australia", "new zealand", "canada", "usa", "mexico", "brazil", "argentina", "chile", "peru", "colombia", "venezuela"));
        categories.put("Animals", Arrays.asList("cat", "dog", "fox", "lion", "bear", "wolf", "tiger", "zebra", "giraffe", "elephant", "rabbit", "deer", "panda", "cheetah", "hippo", "kangaroo", "dolphin", "whale", "shark", "octopus", "penguin", "squirrel", "koala", "buffalo", "owl", "parrot", "crocodile", "monkey", "horse", "goat"));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Word Scramble Game!");
        System.out.println("There are 5 categories you can choose from:");
        System.out.println("1. Fruits\n2. Vegetables\n3. Jobs\n4. Countries\n5. Animals");
    }
}


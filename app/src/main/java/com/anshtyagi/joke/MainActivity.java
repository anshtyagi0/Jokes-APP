package com.anshtyagi.joke;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String[] jokes = {
            "Why don't scientists trust atoms? Because they make up everything!",
            "Why did the scarecrow win an award? Because he was outstanding in his field!",
            "Why don't skeletons fight each other? They don't have the guts.",
            "What do you call fake spaghetti? An impasta!",
            "Why did the bicycle fall over? Because it was two-tired!",
            "How does a penguin build its house? Igloos it together!",
            "Why don’t some couples go to the gym? Because some relationships don’t work out!",
            "Why did the math book look sad? It had too many problems!",
            "Why can't your nose be 12 inches long? Because then it would be a foot!",
            "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
            "Why are elevator jokes so good? They work on so many levels!",
            "What do you call cheese that isn't yours? Nacho cheese!",
            "Why did the computer go to the doctor? It had a virus!",
            "Why did the tomato turn red? Because it saw the salad dressing!",
            "What do you call a can opener that doesn't work? A can't opener!",
            "Why don’t oysters share their pearls? Because they’re shellfish!",
            "Why was the math book sad? Too many problems!",
            "Why did the cookie go to the doctor? It was feeling crumby!",
            "Why couldn’t the leopard play hide and seek? Because he was always spotted!",
            "Why did the coffee file a police report? It got mugged!",
            "Why don’t programmers like nature? It has too many bugs!",
            "Why did the broom get a promotion? It swept the competition!",
            "Why did the banana go to the doctor? It wasn’t peeling well!",
            "Why can’t your hand be 12 inches long? Because then it would be a foot!",
            "Why did the student eat his homework? Because his teacher said it was a piece of cake!",
            "Why don’t vampires attack Taylor Swift? Because she has bad blood!",
            "What’s a pirate’s favorite letter? You’d think it’s R, but it’s the C!",
            "Why did the man put his money in the blender? He wanted to make some liquid assets!",
            "What do you call an alligator in a vest? An investigator!",
            "Why was the cat sitting on the computer? To keep an eye on the mouse!",
            "Why did the physics book go to the party? Because it had potential!",
            "Why do cows have hooves instead of feet? Because they lactose!",
            "Why don’t seagulls fly over the bay? Because then they’d be bagels!",
            "Why did the chicken join a band? Because it had the drumsticks!",
            "What’s orange and sounds like a parrot? A carrot!",
            "Why did the fish blush? Because it saw the ocean’s bottom!",
            "What’s brown and sticky? A stick!",
            "Why did the teddy bear say no to dessert? Because it was stuffed!",
            "Why don’t skeletons go to parties? They have no body to dance with!",
            "What do you call a boomerang that doesn’t come back? A stick!",
            "Why was the belt arrested? For holding up pants!",
            "What do you call a dog magician? A labracadabrador!",
            "Why did the man run around his bed? To catch up on his sleep!",
            "What do you call a bear with no teeth? A gummy bear!",
            "Why don’t eggs tell jokes? They’d crack each other up!",
            "What do you call a snowman with a six-pack? An abdominal snowman!",
            "Why don’t trees use computers? They log out too often!",
            "Why do fish live in salt water? Because pepper makes them sneeze!",
            "What do you call a fish with no eyes? Fsh!",
            "What do you call an elephant that doesn’t matter? An irrelephant!",
            "What’s a vampire’s favorite fruit? A blood orange!",
            "Why was the broom late? It swept in!",
            "Why don’t ants get sick? They have tiny ant-bodies!",
            "Why did the cookie cry? Because its father was a wafer so long!",
            "Why do cows wear bells? Because their horns don’t work!",
            "Why did the frog take the bus? His car was toad!",
            "Why did the melon jump into the lake? It wanted to be a watermelon!",
            "Why do bananas never get lonely? Because they hang out in bunches!",
            "Why was the clock arrested? It was ticked off!",
            "What do you call a pile of cats? A meowtain!",
            "Why was the math book sad? It had too many problems!",
            "What do you call a fake noodle? An impasta!",
            "Why don’t sharks like fast food? Because they can’t catch it!",
            "Why don’t ducks tell jokes while flying? They would quack up!",
            "Why was the tomato blushing? It saw the salad dressing!",
            "Why do seagulls fly over the sea? If they flew over the bay, they’d be bagels!",
            "Why don’t skeletons fight? They don’t have the guts!",
            "Why do cows have hooves? Because they lactose!",
            "Why was the broom late? It swept in!",
            "Why did the melon jump into the lake? It wanted to be a watermelon!",
            "Why did the belt go to jail? It held up a pair of pants!",
            "Why don’t fish play basketball? They are scared of getting dunked!"
    }; // Add jokes here manually in your code later

    private TextView jokeTextView;
    private Button jokeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jokeTextView = findViewById(R.id.jokeTextView);
        jokeButton = findViewById(R.id.jokeButton);

        jokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jokes.length == 0) {
                    jokeTextView.setText("Please add jokes to the array.");
                } else {
                    Random random = new Random();
                    int index = random.nextInt(jokes.length);
                    jokeTextView.setText(jokes[index]);
                }
            }
        });
    }
}
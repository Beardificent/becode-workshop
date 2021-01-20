# Fun with Android

## Requirements

- an IDE (to write Java in), I recommend [IntelliJ Idea](https://www.jetbrains.com/idea/download/).

  For this workshop you could also install [Android Studio](https://www.developer.android.com/studio) and that way you
  won't have to worry about your sdk.
- imagination

###### Install IntellJ Idea

https://www.jetbrains.com/idea/download/
   <pre>sudo snap install intellij-idea-ultimate --classic</pre>    
   <p>You do not need to install Java to run IntelliJ IDEA, because JetBrains Runtime is bundled with the IDE (based on JRE 11).  
   However, to develop Java applications, a standalone JDK is required.</p>

<blockquote>What follows is a quick sum up from IntelliJ’s own guide, in my own words to keep it simple.  
<p></p><a>https://www.jetbrains.com</a><p></blockquote>

1. Launch your IDE.

2. Start a new project. What kind? Android. <quote>Does it make a difference?</quote>  
   <quote>Yes.</quote>

<quote>In an ideal situation, IntelliJ will detect your lack of SDK configuration and will ask you to download
it.</quote>
   <p>If not:</p>

<p>Set up your SDK</p>
<p><a>https://www.jetbrains.com/help/idea/sdk.html</a></p>  
3. <p>If it did ask; Options should be preselected, or select the components that you want, I’m not your boss.</p>
<p>Look for AndroidEmulator, Android SDK Build-Tools, Android SDK Platform, Android SDK Platform-Tools, if those and others are selected, you’re good to go!</p>
4. <p>Verify what you just done.</p>
5. <p>Finish.</p>
6. <p>We’re going to start with an Empty Activity, all the rest contain way too much basic set up. We need almost none.</p>
<p>Well, none, that’s why it’s called Empty. But it’s gonna have something. So…!isEmpty.</p>
7. <p>Name that thang! </p>
<p>Language: Java</p>
<p>Minimum SDK API: Look for one that has 100% coverage. Icecream Sandwich should do.</p>
8. <p>Realise that Icecream Sandwich is an actual API version, I believe it’s starts at 15. </p>
9. <p>Setting up JDK</p>
<pre>FILE => PROJECT STRUCTURE => PLATFORM SETTINGS</pre>

<p>Check if JDK 11 is selected, if not download the right sdk at PROJECT STRUCTURE and click on the Add New SDK button, a + sign. </p>
10. <pre>SETTINGS => PREFERENCES → Build, Execution, … → Build Tools → Gradle</pre>
<p>Select 11.04ish at GradleJVM option.</p>
11. <p>This should be it regarding setting up IntelliJ Idea. You’re done. </p>

###### To run an app on your Android phone

<img src="https://raw.githubusercontent.com/Beardificent/java-android-workshop/master/assets/androidPhoneStep1.png"></img>

# Project : Text Adventure Game on Android

###### Let's get you started with your GUI .

<p>For those that have just configured their IDE, will probably already have an empty activity on screen</p>
<p> For those that didn't, jump skooch over to src/main/java and add a new empty activity (as you would do any other filetype)</p>

<p>In your xml file, create your GUI layout. This is your view.</p> 

<blockquote>
What does your game need? A start screen and an actual game screen maybe? Maybe a press start button? 
<p>Can't find the .xml? Try src/main/res/layout</p>

<p>In general, all start screens need to be nice, so check out's xml style options. creating your own drawables to get   
a custom button effect would be nice!</p>
</blockquote>

<p> Press play to see your design </p>

<p> Do you have a button? Sweet, then lets kick it, head over to your .Java</p>

<p>You'll need to create function that returns nothing and gets View view passed as arguments.
This function will declare and create a new Intent which takes this class and your other class as parameters.
Call upon startActivity and pass in your 2nd class as parameters.</p>



<p>Once this is done, you should be able to go from screen 1 to screen 2.</p>

<p> all good and well but now what ehj?</p>

###### # creating your play screen

EXAMPLES ONLY - GO WILD

<p> Same as before, create the look of your game screen, now, I'd say think gameboy, then again who am I?</p>
<p> but imagine one anyway, create a screen and some actionbuttons. we'll be making a text-adventure game so a TextView might be handy!</p>

<p> Once you've done that, head on over to your .java file (this is all taking place in 2ndscreen.xml or 2ndscreen.java)</p>
<p> Time to initialise your elements from your .xml above the onCreate function.</p>
<p> We'll be using these variables inside onCreate. Similar to getElementById(), were're going to use findViewById() to 'link' our xml elements to our java. And we'll pass the id of the element as argument</p>

###### # displaying content

EXAMPLES ONLY - GO WILD

<p> Create a java class, this will serve as your narrative.</p>
<p> In the constructor you'll need to pass the gameboy class and name it. (don't forget to declare it) constructor will return that class.</p>
<p> Check back in your previous class that you've instantiated this class. (probably not, that's why i'm telling you too, <b>this</b> is a hint)</p>

<p>To set up a good place to start, start with a function that is void and call it groundZero, start, beginning, ...</p>
<p>This groundZero function will contain your entire first screen; text, actions, whatever you can squeeze into it. We're going to take it easy.</p>

<p>To replace text in a text view one would type (assuming 2nd class name is flup):</p>
<pre>flup.TextView.setText("flop");</pre>

<p>Same applies to action buttons.</p>

<pre>flup.button1.setText("Take rubber duck")</pre>
<pre>flup.button2.setText("Don't take rubber duck")</pre>

blockquote>Assuming you have two buttons, below where you declared your 2nd screen in the java class, declare 2 other
string variables.
<b>BACK</b> and <b>FORWARD</b> and then return to groundZero</blockquote>

<p> set FORWARD equal to "forward" and BACK equal to "back" in your function, this will be your actions.</p>

<p><b>Don't forget to call on this function in your gameboy</b></p>

###### # going places

EXAMPLES ONLY - GO WILD

<p>Under your groundZero function, create a new function, which returns nothing, and call it forward.</p>
<p> This function will pretty much be a copy paste of groundZero but with different actions and or text, event.</p>

<p>It could look like:</p>

<pre>   
        Awake = true;
        squaresTravelled++;
        flup.ImageView.setImageResource(R.drawable.forwardView);
        flup.TextView.setText("You went forward.");
        flup.button1.setText("Go back");
        flup.button2.setText("Forward");</pre>
<p>You could also add more actions on a certain square or less actions, find an item, battle an enemy</p>

<p>scroll up and under your constructor you should create a void function that takes a string called location (eg)</p>
<p>using that string you'll create conditionals that'll look whether a string is "forward" or "back", if it's "forward" call upon forward();</p>

<p>In your 2nd screen, create a function for each of your buttons (under the onCreate function), you should pass your views as parameter.
these functions should call on the java class variable, which calls on the locationfunction in the class with the right direction passed as arg.
</p>

<pre>
function
groundZeroClassVar.location(groundZeroClassVar.forward);

function
groundZeroClassVar.location(groundZeroClassVar.back);</pre>



<p>You should have enough info to play around with this project, if not, holla!</p>


##### some hints

[Android Layout Docs](https://developer.android.com/guide/topics/ui/declaring-layout)

[Android Starting a New Activity](https://developer.android.com/training/basics/firstapp/starting-activity#java)

[Android Drawables](https://developer.android.com/reference/android/graphics/drawable/Drawable)
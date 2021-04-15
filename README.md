# Android Basic Nanodegree #

## Project 6, The Quiz #

### About The Project ###
The Quiz is based on Millwall Football Club. It has 10 questions, of which 2 are EditText, 2 CheckBox, and 6 RadioGroups. There is also an EditText for the username. There are currently no known errors. __Known issues__ are listed below.
Completed on Monday the 12 - April - 2021
### Built with ###
- Android SDK
- Java

## Use of photo ##
The photo, the Millwall logo is free to use and taken from Wikimedia.
- From Wikimedia Commons, the free media repository
- Author: StewartWhite99
- Source: https://commons.wikimedia.org/wiki/File:Milwall_Crest.svg

## Known Issues ##

### Layouts ###
The layouts used are the old method, LinearLayout instead of the newer constraintlayout.

### Variables ###
Global variables have been used when local ones shold of been.

### API Level 17 Needed ###
To run correctly the app needs to be on API 17. The app should of run with API level 15.

Below is the code causing the issue. It cand be found in;
- styles.xml
- At the bottom in file,
- photo_details_style **style**
- The code `  <item name="android:textAlignment">center</item> `

## Usage ##
In the Udacity courses, you are **required** to reference and link all and any code you use. This includes this code.

## License ##
Creative Commons Zero v1.0 Universal

# android-app-team-17
android-app-team-17 created by GitHub Classroom

------------------------------------------------------------------------------------------------------------------------------
User story 5|by Joseph Longo|iteration #1: The main focus for this iteration, for me atleast, was really nailing down the majority of the Profile Creator. Because none of our currently operational activities within the app call upon teh data stored within the user's profile, I made the decision to allow that data to just sit within the activity that it was entered in. The data entry fields, during this first iteration, allow the user to enter in their desired information and then the app records it as entered. In further iterations this infromation will be tied to a profile class that will be passed around the activities and affect each subsequent activity differently. The framework for these classes have been made, but have very little implementation as of right now. For this iteration, I've made the decision to remove the upload schedule functionality from the profile screen due to the fact that the level of programming required to make that specific function work, will be better used in a later iteration. Other than that, I feel as though the troubles that I hit were just from my misunderstanding of how android studio works, however that will be fixed with practice. The basic framework of the user story is up and running effectively and cleanly. The UI, for the most part looks very clean, and is efficient in both gathering and handling information. In the next iterations these screens shouldn't change much aesthetically, but will have slight background changes such as more intricate user-data handling, and camera/image uploading features. 

------------------------------------------------------------------------------------------------------------------------------
User story 8|by Rodolfo Tinoco|iteration #1: My purpose of this iteration was to be know how to use a chat box, mainly because this way we would be able to know how to "link" or communicate, two accounts, and what we would need to do this. Found out that firebase is very useful of this, but since I was not familiar with it at all, or with android studio, it took me a while to learn from the internet, blogs and tutorials how to do this, after doing several unsuccessful tries, I finally was able to do a chat, where if it was your first time, the firebase would record your profile with an username and a password, and it will take you to a group chat, and if it was not you first time, it would only ask for your password. However I didn't add this to the git repository, and a really time came about because I couldn't upload a google-services.json file that you need to work with the firebase, so, after changing something on the .gitignore, in git hub, I could push it and so, every time someones pulls if form the main repository, it would be downloaded. That was kind of very hard. So, all of this will ultimately help to the creation of profiles and to save its information.


------------------------------------------------------------------------------------------------------------------------------
User Story 3 | by Yonathan Mekonnen | iteration #1: My goal with this first iteration was to get the basic implementations of what each scenario down. In working on personal preferences I had to create 3 different pages for the three different preferences our users could choose from. A page for the preferred time a group would want to meet, one for the preferred location, and one for the preferred day of the week. Starting from the homescreen the user will see the 3 buttons. The last button closest to the bottom will take them to the preferred time page. From there after choosing the time to meet and pressing the button next to that time they will be sent to the preferred meeting location page. After choosing that location and pressing the button corresponding to it they will be sent to the preferred meeting day time. After choosing the time they would like to meet and pressing the corresponding button they will be sent back to the home screen. For this iteration I have choose to not store the data when the user is picking their preferred settings. I found the most difficult part of working with android studio was honestly getting used to how it worked. I am familiar with java but there was certain code that was unfamiliar to me. After learning more about studio the transition wasn't too difficult and I found it rather enjoyable. All in all the UI works perfectly fine and the code is very precise. 
------------------------------------------------------------------------------------------------------------------------------
User Story 4 | by Yeri Kim | Iteration #1: The purpose of this iteration was to implement the foundations of our app, namely user stories that were critical to the app, that the other stories build off of. So, we divided chose the most basic parts of our app and delegated the work amongst ourselves. For User Story #4, I had to create a home screen for the app which featured buttons that lead to other user stories/activities. These included the "Find a Time," "Messages," "Profile," "Preferences," "Calendar," "Directory," "Alarms," and "Settings." Each of these buttons would open up a relevant page. Some of those pages were addressed in this iteration (like the profile, preferences, and messages pages), but the others have not been addressed and were left as empty acivities that will be addressed in future iterations. The UI of the home screen and the rest of the app has yet to be addressed aesthetic appeal, but I hope that is something we can work on in the next iteration as well. Overall, I found the process of navigating through Android Studio, gitHub, and terminal to have a certain learning curve, but after learning the basics, working on this iteration was not so bad. A lot of it was just learning the IDE, learning how to create tests (which turned out to be very simple), and so on. I think in future iterations, where we start to implement sensor-related capabilities and more specific functions, we will face some challenges, but this current iteration was not so difficult.
______________________________________________________________________________________________________________________________
User Story 6 | Yonathan Mekonnen | Iteration #2: The purpose of this iteration was to implement some key settings into our app like the use of an alarm and color preferences to give the user more personal preferences. For user story #6 I worked on creating the background color preferences and the night mode setting. Startining from the home screen if the user looks to the bottom of the screen they will see four buttons. Each button contains a different color and by pressing the button with the corelating color they prefer the background screen will become that color. I not only implemented this for the homescreen but also for the scheduale creator screen. I tried to implement this feature on pages that were made for the user to personally create themselves. If you go on the profile creator page I there implemented the night mode feature. If you scroll to the bottom of the page you will see a button thats text reads "nightmode". By pressing that button the screen will become more dim. Due to this being the second iteration the process was much easier and felt more familiar than the first time I worked on android studio. The only thing that gave me a bit of difficulty was creating the unit test but after researching how to create them properly that also went fairly smooth. 

------------------------------------------------------------------------------------------------------------------------------
User story 10|by Rodolfo Tinoco|iteration #2: In this iteration I planned on implemented an alarm system, where you cna choose the time, and you will set tha alarm. After a while I learned about it, I finally decided to implement two different ways of alarms. ONE, just a regular alarm, where you choose the time from a "timePicker", then you use its input and in the main activity you use the Alarm manager (thank god for that), and put the info from the timepicker there, however, before you have to use the "calendar", because the alarm manager requires its input in certain format, once that is saved, you have to create another java class, it can any name, this will recieve the alarm triger, here is what is going to happen every time the alarm is trigered. TWO, I also made other kind of alarm, a kind of countdown alarm, here I take the input, and just multiply its vaalue so it can be in the correct from (becasue AlarmManager uses miliseconds), and then just use that value, this part uses the same reciever as the other alarm, therefore, both alarms do the same thing once activated. I encountered some problems doing this, but I guess the most notorious one was how to checke if my alarm worked. Because even if it didn't triggered any error, to see if it worked, everytime I had to run it, set the alarm ad waited for it to activated, and it took a while. At first, it even seemed like it didn't worked, it took me a while to reaize it it worked, it wa just that the emulator was so slow, that it took forever to activate it. Other than that, I also had some complications, but at the end I overcame all problems.

------------------------------------------------------------------------------------------------------------------------------
Back-end code clean-up|by Joseph Longo|iteration #2: Because we only did 3 User stories for this iteration I went ahead and cleaned up the code from the first iteration. One of the problems that we faced towards the tail end of iteration 1 was saving profile information for the user and transferring that data between the different services on the app. For this iteration I laid down the framework for the data transfer so that when we finally implement all of the services in the final iteration of the app we will be able to call upon the users data from everywhere on the app. One of the problems that I faced was with the Bundles and the Intents causing app crashes when data there was no data being sent. The work around that I came up with was to pass in empty valued "phantom" information into the profile class when the app is activated from the homescreen so that when the app builds the profile screen it doesnt hit that part of the code and immediately crash when it tries to Bundle the intent's extra information. In my opinion this is a bit of a sloppy work around, and is something I'm actually going to try and fix before we even start on iteration 3. Other than cleaning up stuff like that from iteration 1 I helped trouble shoot some of the unit tests and ran the checkstyle once all of the code was submitted. The checkstyle process was so long and tedious that now I find myself thinking about it whenever I code something from scratch, for example when I was helping write a unit test I found myself thinking "not enough white space before that '{' I better add it or the checkstyle wont pass." Its actually kind of crazy how quickly you pick up on stuff like that. 
------------------------------------------------------------------------------------------------------------------------------
User Story  | by Yeri Kim | Iteration #2: In this iteration I implemented an activity that allowed the user to set the time zone that they're in. We realized early on that this was an important feature, as people might be traveling long distances to meeting times or they might be holding virtual meetings. So, I set up an activity page where users are able to select the time zone they're in out of any of the 39 time zones in the world. I had written code to calculate the times between the group members so that this could be taken into consideration for finding the meeting time, however, I realized that this needed to be configured in the FindTime acitivity so that it can be displayed. However, have not addressed this user story yet so it will be reserved for the next iteration. I ended up making two activity classes for the time differences, because I had two ideas (one where the time difference is inputed as a checkbox, and the other where the time difference is inputed as a button) in case one doesn't work out or one is easier, but I kept both b/c it'll depend on what we do for the FindTime activity. I set up the xml layout for one of the classes for future use, and I set up the xml for the other one that I'm using for this iteration and wrote code for it. Figuring out unit tests was kind of a learning curve. I'm not sure if I figured it out right, I had errors that I could not resolve, but my group members helped.

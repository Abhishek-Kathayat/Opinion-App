# Opinion System ![GitHub contributors](https://img.shields.io/github/contributors/Abhishek-Kathayat/TEKSystem-Hackathon)

### Introduction
This project "Opinion System" focuses on creating a system to help people give their opinion and discuss about a particular topic of Science, Technology, Politics, Education etc. The App provides the people a platform to give suggestions and raise concerns regarding topics of national and international interests. <br/>
Any user can start a new topic to discuss and others can give their suggestions or raise concerns. <br/>
This project here has been implemented in three parts :<br/>
<ul>
  <li>Front End</li>
  <li>Back End</li>
  <li>Emotion and Genre Analysis</li>
  <li>Sentimental Analysis</li>
</ul><br/>
<b>This is a work in progress and you may encounter problems like app crashing or not responding properly</b></br>

### FrontEnd
The Front End part has been implemented as an Android App. The main reason for choosing Android App over other front ends was that Android apps are easily accessible to people, and giving your opinion is just a click away. The Android app also provides the user with the option to rasie a topic other than just giving their opinions.<br/>
Shown below are the screenshots of the app showing the different layout of the app :<br/> <br/>

&nbsp; &nbsp; &nbsp; &nbsp; <img src="https://github.com/Abhishek-Kathayat/TEKSystem-Hackathon/blob/master/Screen%20Shots/Screenshot_20190811-214343.png" width="250" height="440"/> &nbsp; &nbsp; &nbsp; &nbsp; <img src="https://github.com/Abhishek-Kathayat/TEKSystem-Hackathon/blob/master/Screen%20Shots/Screenshot_20190811-214401.png" width="250" height="440"/> <br/> <br/>

&nbsp; &nbsp; &nbsp; &nbsp; <img src="https://github.com/Abhishek-Kathayat/TEKSystem-Hackathon/blob/master/Screen%20Shots/Screenshot_20190811-214953.png" width="250" height="440"/> &nbsp; &nbsp; &nbsp; &nbsp; <img src="https://github.com/Abhishek-Kathayat/TEKSystem-Hackathon/blob/master/Screen%20Shots/Screenshot_20190811-214423.png" width="250" height="440"/> <br/> <br/>

The content in the screenshots shown above has been loaded using a test API created in Django by me and uses SQLite database for storage of data. Due to some technical issues the original API in PHP was not used and content loading was shown using the Django Rest API. To run the app the following steps needs to be followed : <br/>
<ul>
  <li>Click <a href="https://github.com/Abhishek-Kathayat/TEKSystem-Hackathon.git">here</a>  to clone the project.</li><br/>
  <li>Once the project has been cloned put the Front End and the Backend-Test folder under your working directory.</li><br/>
  <li>Using Android Studio open the project Front End folder.</li><br/>
  <li>Once Android Studio loads the project onto the IDE the dependency will be installed.</li><br/>
  <li>In the mean time to start the localhost server open the Anaconda Prompt and move inside opinionappbackend folder inside Backend-Test folder.</li><br/>
  <li>Make sure you have Django-Admin, Django, Django-Rest-Framework dependencies installed along with other dependencies.</li><br/>
  <li>To run the server type the following command in the Anaconda prompt : <br/>
    &nbsp; &nbsp; &nbsp; &nbsp; <b>python manage.py runserver</b></li><br/>
  <li>Connect your phone to desktop/laptop with USB Debugging mode switched on.</li><br/>
  <li>To access localhost server content in your phone run the following command in a seperate new command prompt window : <br/>
    &nbsp; &nbsp; &nbsp; &nbsp; <b>adb reverse tcp:<<i>port number</i>> tcp:<<i>port number</i>></b> <br/>
    &nbsp; &nbsp; &nbsp; &nbsp; For Ex : <b>adb reverse tcp:8000 tcp:8000 </b> </li><br/>
  <li>Once daemon started successfully run the Android app using Android Studio.</li><br/>
  <li>The App should run properly. </li><br/>
</ul>
<br/>

### Emotion and Genre Analysis
The Emotion and genre analysis has been implemented in Python using Machine learning techniques.The dataset i have worked on is TWITTER dataset for emotion detection and BBC dataset for genre detection.The code begins by fetching the fetching the comment made by user from database and then sending it to the python script.
Shown below are the screenshots of the script and output showing the different stages :<br/>

<li>Firstly i fetched the data from the database in the text format.I used python mysql library to fetch the data.</li>
<br/>
<img src="emotion and genre analysis/snapshots/ss3.PNG" width="400" height="250"/> <br/> <br/>
<li>Then i downloaded the required dataset and analysed and converted the output labels into integer value using python script.Integer values are easy to handle as compared to text</li><br/>
<img src="emotion and genre analysis/snapshots/ss1.PNG" width="400" height="250"/> <br/> <br/>
<img src="emotion and genre analysis/snapshots/ss2.PNG" width="400" height="250"/> <br/> <br/>


  




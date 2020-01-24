# Opinion System 
![GitHub contributors](https://img.shields.io/github/contributors/Abhishek-Kathayat/TEKSystem-Hackathon)
![Forks](https://img.shields.io/github/forks/Abhishek-Kathayat/Opinion-App?style=social)

### Introduction
This project "Opinion System" focuses on creating a system to help people give their opinion and discuss about a particular topic of Science, Technology, Politics, Education etc. The App provides the people a platform to give suggestions and raise concerns regarding topics of national and international interests. <br/>
Any user can start a new topic to discuss and others can give their suggestions or raise concerns. <br/>

The Front End part has been implemented as an Android App. The main reason for choosing Android App over other front ends was that Android apps are easily accessible to people, and giving your opinion is just a click away. The Android app also provides the user with the option to rasie a topic other than just giving their opinions.<br/>
Shown below are the screenshots of the app showing the different layout of the app :<br/> <br/>

&nbsp; &nbsp; &nbsp; &nbsp; <img src="https://github.com/Abhishek-Kathayat/TEKSystem-Hackathon/blob/master/Screen%20Shots/Screenshot_20190811-214343.png" width="250" height="440"/> &nbsp; &nbsp; &nbsp; &nbsp; <img src="https://github.com/Abhishek-Kathayat/TEKSystem-Hackathon/blob/master/Screen%20Shots/Screenshot_20190811-214401.png" width="250" height="440"/> <br/> <br/>

&nbsp; &nbsp; &nbsp; &nbsp; <img src="https://github.com/Abhishek-Kathayat/TEKSystem-Hackathon/blob/master/Screen%20Shots/Screenshot_20190812-120441.png" width="250" height="440"/> &nbsp; &nbsp; &nbsp; &nbsp; <img src="https://github.com/Abhishek-Kathayat/TEKSystem-Hackathon/blob/master/Screen%20Shots/Screenshot_20190811-214423.png" width="250" height="440"/> <br/> <br/>

The backend of the application as been implemented in Django. The main reason for choosing Django framework for backend development is that django is easier as well as faster for development as compared to other frameworks.<br/>

To run the app the following steps needs to be followed : <br/>
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

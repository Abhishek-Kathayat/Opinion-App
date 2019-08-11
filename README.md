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
<img src="emotion and genre analysis/snapshots/ss1.PNG" width="400" height="250"/> &nbsp; &nbsp; &nbsp; &nbsp;<img src="emotion and genre analysis/snapshots/ss2.PNG" width="400" height="250"/> <br/> <br/>

<li> Data Visualization - I used the matplotlib library to visulize the frequency of occurence of each label and identify if any pattern exists.</li><br/>
<img src="emotion and genre analysis/snapshots/ss4.PNG" width="400" height="250"/><br/><br/>

<li>Model Training - Rather than training the data in classical way.I have used the concept of Stacking where in 1st level I have used Models like Random Forest Classifier,Decision Tree Classifier,K Nearest Classifier and combined their result obtained using Logistic Classifier.This helps us to improve the accuracy of result obtained.</li><br/><br/>

<li>Hyperparameter Tuning-In every ML model we have certain parameter whose value need to be correclty tuned for optimised result.If we do not tune the parameter it may lead to overfitting or underfitting.So i have used RandomizedSearchCV to tune parameters of every model.</li><br/><br/>

<li>KFold Validation-In every ML project we have three types of sets-test,train and validation.The benefits of having a validation set is that is backpropagates to tune in the parameters.So i have used KFold validation which divide the train set into k valid sets.</li><br/><br/>

<img src="emotion and genre analysis/snapshots/ss6.PNG" width="350" height="150"/>&nbsp; &nbsp; &nbsp; &nbsp;
<img src="emotion and genre analysis/snapshots/ss7.PNG" width="350" height="150"/><br/><br/>
<img src="emotion and genre analysis/snapshots/ss8.PNG" width="350" height="150"/>&nbsp; &nbsp; &nbsp; &nbsp;
<img src="emotion and genre analysis/snapshots/ss9.PNG" width="350" height="150"/><br/><br/>
<img src="emotion and genre analysis/snapshots/ss10.PNG" width="350" height="150"/><br/><br/>

<li>Result - The analysis of result is very important.I plotted the confusion matrix for better analysis of the result.</li><br/>
<img src="emotion and genre analysis/snapshots/ss5.PNG" width="350" height="350"/><br/><br/>

### Sentiment Analysis

Sentiment Analysis is a field of Natural Language
 Processing (NLP) that builds models that try to 
identify and classify attributes of the expression
e.g.:<br/>
Polarity: if the speaker expresses a positive or 
negative opinion<br/>
Subject: the thing that is being talked about
Opinion holder: the person, or entity that expresses the opinion.
It was implemented using the concepts of machine learning.
The task was divided in three steps:
1. Preprocessing:
  1. Tokenization:Tokenization is a step which splits longer strings of text into smaller pieces, or tokens. Larger chunks of text can be tokenized into sentences, sentences can be tokenized into words, etc.
  2. Filtering Stop Words: A stop word is a commonly used word (such as “the”, “a”, “an”, “in”) that a search engine has been programmed to   ignore, both when indexing entries for searching 
and when retrieving them as the result of a search query.
2. Model Learning:I used Naive Bayes classifier as a model due to its 
ability to overpower highly sophisticated classification
algorithms.
3. Model Validation:Our model provided us with an accuracy
of about 70%.


  




# SwagLabs_Assignment
This project is part of my Appium learning.  
For my tests, I used Sauce Labs demo app on Android OS. This app is open source, 


***
#### 👨🏻‍💻 Technology :
- Programming language - **Java**
- Automation framework - **Appium**
- Testing framework - **TestNG**  
- Project management tool - **Maven**  


***
### Tests:
- **Login functionality**  
  **S1:** Login using valid credentials should succeed  
  **S2:** Login using invalid credentials should fail    

- **Cart functionality**  
  **S1:** Add Any Item to the cart and validate that Title and price of the Item at Home page equals the item and price at the cart  
  **S2:** Validate Removing Items from the cart and validate that the cart is empty   

- **Complete Order**  
  **S1:** Online Ordering and complete the flow from adding element to cart till the checkout, Also Validate the price and success purchase.
  
***


### 📜 Instructions:
#### Appium instalation on Windows OS
You can learn how to install Appium step by step here: https://www.youtube.com/watch?v=KiWIb0HhwRw  
Anyway, here's the resume:
- Install Java, Maven and Node/Npm
- Install Appium through Node: `npm i -g appium@next`. If you don't get the latest version, try `npm install --location=global appium@latest`. You can check the version running `appium -v`
- Install Appium Android uiautomator2 driver: `appium driver install uiautomator2`. Feel free to install the drivers you want
- Install Android Studio and create a virtual device
- Configure Android Path in your environment variables.
  - ANDROID_HOME: root android sdk directory
  - PATH: ANDROID_HOME + the following paths = platform-tools, tools, platforms, build-tools  
  - Check it for a visual explanation (PT-BR): https://youtu.be/yuKlc-a5z5k?si=7E9sJydltJ9_9Bqe&t=73
- Install Appium doctor: `npm install -g appium-doctor`. Run it: `appium-doctor --android`  
  - Check the "manual fixes needed" and fix them
- If Appium Doctor tells you apkanalyzer.bat is not found, maybe it exists, but you need to rename it putting .bat at the end of the file name. This was my case. Probable apkanalyzer location: C:\Users\YOUR_USER_NAME\AppData\Local\Android\Sdk\tools\bin
- Install Appium inspector or run it on the web: https://inspector.appiumpro.com/
- Configure the Appium Inspector. Below is the image of my configuration:

<img width="808" alt="image" src="https://github.com/Onkartayde21/SwagLabs_Assignment/assets/97312809/970e0148-8d19-4c6a-b847-2a7174158046">


- To know the device's name, first you need to run the device. Then run this command on cmd: `adb devices`
- Run `adb shell dumpsys window | find "mCurrentFocus"` to see the app package name and the app activity that is currently on focus in your device
- Run `adb shell getprop ro.build.version.release` to see the android version of the device. You can check the version in the Android Studio also

Uff, now everything seems good, right? Time to run the tests!

#### Executing the tests:
- Run `appium` command. If you're executing Appium inspector on the web, run `appium --allow-cors`
- Launch your virtual device
- Run appium inspector
- Finally, execute the tests! 😀
  

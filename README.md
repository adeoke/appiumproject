# Appium Test example

This is an example project showcasing appium automation.

# What you need to install

Note that the following instructions are applicable to a mac operating system.

## For Android
Java (for use of uiautomationviewer I have installed java 8.0.402-zulu, using sdkman)
Android Studio (I have used hedgehog)
Node (I have tested this using node v21.6.2)
npm (I have tested with npm version 10.2.4)
Appium Server (I have tested with version 2.5.1)

## Installations
Note that for the tooling above Java was installed via sdkman, android studio was from the download
link, node was installed from brew and appium server was installed by npm (sudo npm install -g appium).

## Bash or Zsh, or shell of choice

Depending on the shell that you are using you will need to update your scripts to include something similar
to the following:

```shell
export JAVA_HOME=$(/usr/libexec/java_home)
export MAVEN_HOME=/usr/local/Cellar/maven/3.8.5/libexec
export M2=$MAVEN_HOME/bin
export ANDROID_HOME=/Users/USERNAME/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/platform-tools
export PATH=$PATH:$ANDROID_HOME/tools
export PATH=$PATH:$ANDROID_HOME/tools/bin
export PATH=$PATH:$ANDROID_HOME/emulator
```

In my case I have a zsh shell (you can check your shell by typing echo $SHELL on your terminal to verify),
I updated my ~.zshrc to include these exports.

# Appium drivers

In order for the appium server to communicate with the desired platform, e.g., iOS or Android, appium needs
a driver. You can check the list of drivers by inputting the following into the terminal:

```shell
appium driver list 

✔ Listing available drivers
- uiautomator2 [not installed]
- xcuitest [not installed]
- mac2 [not installed]
- espresso [not installed]
- safari [not installed]
- gecko [not installed]
- chromium [not installed]
```

The output will show what is available and what is installed already as seen above.
For Android you will want to install UiAutomator2 and for iOS this will be XCUITest.

For example, install uiautomator2 by typing the following:

```shell
appium driver install uiautomator2
```

# running the test against an emulator

navigate to the following location :

```shell
/Users/USERNAME/Library/Android/sdk && ./emulator/emulator -list-avds
```

Which will return the list of emulators. One you have the name of the emulator you want then 
run it by the following:

```shell
emulator -avd NAME_OF_DEVICE
```


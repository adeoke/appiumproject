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


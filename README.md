# Android Utilities

AndroidUtilities contain set of helper classes that i frequently used in most of my projects.


### [LogUtilities.java](https://github.com/VamsiSmart/Android-Utilities/blob/master/app/src/main/java/com/vamsi/androidutilities/utils/LogUtilities.java)

We use Log prints more often in our code when we debug but when our project is ready to release then we have to delete all our logs. but using 
LogUtilities will automatically avoid log prints in release mode.

**Example Usage**
```
//This will only prints in debug mode
LogUtilities.v(TAG,simple_log_message);  
```

### [PrefUtilities.java](https://github.com/VamsiSmart/Android-Utilities/blob/master/app/src/main/java/com/vamsi/androidutilities/utils/PrefUtilities.java)
PrefUtilities is a simple class which makes it easy to save and retrieve all SharedPreferences.


Example usage

**Add this two methods to PrefUtilities.java**
```
public void saveUserName(String username){
    preferences.edit().putString(context.getString(R.string.pref_key_user_name),username).apply();
}

public String getUserName(){
    return preferences.getString(context.getString(R.string.pref_key_user_name),"");
}

```

**When you save username**
```
PrefUtilities.with(context).saveUserName("user name");
```

**You can retrive username at any ware in the project as**
```
String userName = PrefUtilities.with(context).getUserName();
```


### [DeviceUtilities.java](https://github.com/VamsiSmart/Android-Utilities/blob/master/app/src/main/java/com/vamsi/androidutilities/utils/DeviceUtilities.java)
DeviceUtilities contains some most commonly user methods few examples are

**isOnline**
```
// this will return true if user has active internet connection.
if(DeviceUtilities.isOnline(context)){
    //user is online
} else {
    // user is offline
}
```

**hasPermission**
```
// this will always return true for SDK version below 6.0 
if(DeviceUtilities.hasPermission(Manifest.permission.READ_CONTACTS,context)){
    //App can read contacts
} else {
    // Ask for permission
}
```


### Note:
Please note that there is nothing magical in this repository and everything here may well known to you. But this simple classes helps my development life little bit easier. 


### Usage:
You can simply cope any utility classes to your projected. And give me a star if they are useful to you. 





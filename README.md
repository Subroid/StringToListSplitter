# StringToListSplitter
This simple library splits the string(text) by given string(text) and returns the result as list.

# How to

Step 1. Add the JitPack repository to your build file

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency
  
 dependencies {
	        implementation 'com.github.subrud:StringToListSplitter:0.0.1.0'
	}
  
  # Usage
  
  List<String> splitStringListByComma = StringToListSplitter.splitIt(stringToBeSplit, ",");
  
  List<String> splitStringListByFullstop = StringToListSplitter.splitIt(stringToBeSplit, ".");
  
  List<String> splitStringListByLetterA = StringToListSplitter.splitIt(stringToBeSplit, "a");
  
  List<String> splitStringListByWord = StringToListSplitter.splitIt(stringToBeSplit, "word");
  
  

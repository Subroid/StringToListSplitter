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
	        
		implementation 'com.github.Subroid:StringToListSplitter:0.0.1.1'
	
	}
  
  # Usage
  
    List<String> splitStringToListByComma = StringToListSplitter.splitIt(stringToBeSplit, ",");
  
    List<String> splitStringToListByFullstop = StringToListSplitter.splitIt(stringToBeSplit, ".");
  
    List<String> splitStringToListByLetterA = StringToListSplitter.splitIt(stringToBeSplit, "a");
  
    List<String> splitStringToListByWord = StringToListSplitter.splitIt(stringToBeSplit, "word");
  
  

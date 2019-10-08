package com.subrlibr.stringtolistsplitter;

import java.util.ArrayList;
import java.util.List;

public class StringToListSplitter {

    public static List<String> splitIt(String stringToBeSplit, String stringAsSplitPoint) {
        List<String> listSplitString = new ArrayList<>();
        if (stringToBeSplit.contains(stringAsSplitPoint)) {
            String[] stringsSplit = stringToBeSplit.split(stringAsSplitPoint);
            for (int i = 0; i < stringsSplit.length; i++) {
                listSplitString.add(stringsSplit[i]);
            }
        }
        return listSplitString;
    }
}

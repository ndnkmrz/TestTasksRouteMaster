package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class PatternMatch {
    private String[] listOfRecords;
    private String pattern;

    public String[] getListOfRecords() {
        return listOfRecords;
    }

    public String getPattern() {
        return pattern;
    }

    public void setListOfRecords(String[] listOfRecords) {
        this.listOfRecords = listOfRecords;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public PatternMatch(String[] listOfRecords, String pattern) {
        this.listOfRecords = listOfRecords;
        this.pattern = pattern;
    }

    private static String[] append(String[] arr, String element)
    {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);
        return list.toArray(new String[0]);
    }

    public String[] matchPattern(){
        //AB-D3 2-4 AB??2?
        //0. Проходим по элементам списка listOfRecords;
        //1. Нужно удалить пробелы и черточки из элемента
        //1.5 Проверяем, точно ли 6 символов в элементе
        //2. Цикл с 0 по 5 элемент. Там, где нет вопросика, сравниваем с паттерном.
        //3. Если все сравнения успешны, добавляем в конечный список
        String[] resultArray = new String[] {};
        for (var checkString : listOfRecords) {
            int i = 0;
            boolean result = true;
            for(var element: pattern.toCharArray()){
                while(checkString.charAt(i) == '-' || checkString.charAt(i) == ' '){
                    i++;
                }
                if(element != '?'){
                    result = element == checkString.charAt(i);
                    if(!result){
                        break;
                    }
                }
                i++;
            }
            if (result) {
                resultArray = append(resultArray, checkString);
            }
        }
        return resultArray;
    }

}

package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
//        matchBenchmark("Vodafone,STOCK,10|Vodafone,BOND,10|Google,STOCK,15:Vodafone,STOCK,15|Vodafone,BOND,10|Google,STOCK,10");
        matchBenchmark("Vodafone,STOCK,10|Google,STOCK,15:Vodafone,STOCK,15|Vodafone,BOND,10|Google,STOCK,10");
    }



    public static HashMap<String,Integer> getPort(String Assets)
    {
        String [] AssetArray = Assets.split("\\|");
        HashMap<String,Integer> port = new HashMap<String,Integer>();

        for (String asset : AssetArray)
        {
            String [] shareData = asset.split(",");
            port.put(shareData[0]+", "+shareData[1],
                    Integer.parseInt(shareData[2]));
        }
        return port;
    }


    public static void matchBenchmark(String input) {
        ArrayList<String> resultantString= new ArrayList<String>();
        ArrayList<String> sortedHashKey= new ArrayList<String>();

        String[] Stage = input.split(":");

        HashMap<String, Integer> InitialPort = getPort(Stage[0]);
        HashMap<String, Integer> CurrentPort = getPort(Stage[1]);

        //get an array of benchmark keys
        CurrentPort.forEach((bench, benchVal)->{
            sortedHashKey.add(bench);
        });
        //sort the arraylist
        Collections.sort(sortedHashKey);

        sortedHashKey.forEach((bench)-> {

            int benchVal= CurrentPort.get(bench);
            //check if portfolio contains key from benchmark
            if(InitialPort.containsKey(bench)){
                int portVal= InitialPort.get(bench);
                //compare values
                if(benchVal> portVal){
                    int result= benchVal-portVal;
                    String intString= Integer.toString(result);
                    String tempResult= "BUY, "+bench+", "+intString;

                    //add item to resultant string
                    resultantString.add(tempResult);
                }
                else if(benchVal< portVal) {
                    int result= Math.abs(benchVal-portVal);
                    String intString= Integer.toString(result);
                    String tempResult= "SELL, "+bench+", "+intString;

                    //add item to resultant string
                    resultantString.add(tempResult);
                }
            }
            else{
                System.out.println("ajibola");
                String intString= Integer.toString(benchVal);
                String tempResult= "BUY, "+bench+", "+intString;

                //add item to resultant string
                resultantString.add(tempResult);
            }
        } );

        //print out elements line by line
        resultantString.forEach(res->{
            System.out.println(res);
        });
    }

}

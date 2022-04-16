package com.company;


public class CommandLineArg {

    public static void main(String[] args) {
        int sum = 0;
        int invalid = 0;

        for (int I = 0; I < args.length; I++) {
            try {
                sum += Integer.parseInt(args[I]);
            } catch (NumberFormatException e) {
                invalid++;
            }
        }
        System.out.println (sum);

    }

    }


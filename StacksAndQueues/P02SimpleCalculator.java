package StacksandQueues;

import java.util.*;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Deque<String>stack=new ArrayDeque<>();

        String expressions= scanner.nextLine();
        String[]expressionsParts=expressions.split(" ");
        List<String> partsList=Arrays.asList(expressionsParts);

        Collections.reverse(partsList);

        for (String part:partsList){
            stack.push(part);
        }

            while (stack.size() > 1) {
                int first = Integer.parseInt(stack.pop());
                String op = stack.pop();
                int second = Integer.parseInt(stack.pop());

                int result;
                switch (op) {
                    case "+": result = first + second;
                    break;
                    case "-": result = first - second;
                    break;
                    default:
                        System.out.println("Unknown operation " + op);
                        return;
                }

                stack.push("" + result);
            }

            System.out.println(stack.peek());
        }
    }


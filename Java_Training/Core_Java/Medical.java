package Core_Java;

import java.util.Stack;

public class Medical {
    public static void main(String[] args) {
        Stack<String> medical = new Stack<>();

        medical.push("Patient_Name : Prathima");
        medical.push("Age: 21");
        medical.push("Location: Anantapur");
        medical.push("Mobile: 916006535");
        medical.push("Disease: Fever");
        medical.push("Token_Fee: 210");

        System.out.println("Patient Details: " + medical);
    }

}

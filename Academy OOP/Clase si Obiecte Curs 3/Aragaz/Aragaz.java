public class Aragaz {


    boolean isGasConnected;
    boolean eyeOneIsList;
    boolean eyeTwoIsList;
    boolean eyeThreeIsList;
    boolean eyeFourIsList;

    public void coupleGas() {
        if (isGasConnected) {
            System.out.println("Gazul este deja conectat");
        } else {
            isGasConnected = true;
            System.out.println("Gazul a fost conectat");
        }

    }

    public void decoupleGas() {
        if (isGasConnected) {
            isGasConnected = false;
            System.out.println("Gazul a fost decuplat");
        } else {
            System.out.println("Gazul deja este deconectat");
        }


    }

    public void pressFistEyeButton() {
        if (eyeOneIsList) {
            System.out.println("Ochiul 1 a fost stins");
            eyeTwoIsList = false;
        } else {
            if (isGasConnected) {
                System.out.println("Oachiul 1 a fost Aprins");
                eyeOneIsList = true;
                securityCheck();
            } else {
                System.out.println("Gazul nu este conectat");
            }
        }
    }


    public void pressSecondEyeButton() {

        if (eyeTwoIsList) {
            System.out.println("Ochiul 2 a fost stins");
            eyeTwoIsList = false;
        } else {
            if (isGasConnected) {
                System.out.println("Ochiul 2 a fost Aprins");
                eyeTwoIsList = true;
                securityCheck();

            } else {
                System.out.println("Gazul nu este conectat");
            }
        }
    }


        public void pressThirdEyeButton(){
            if (eyeThreeIsList){
                System.out.println("Ochiul 3 a fost stins");
                eyeThreeIsList = false;
            } else {
                if (isGasConnected) {
                    System.out.println("Oachiul 3 a fost Aprins");
                    eyeOneIsList = true;
                    securityCheck();
                } else {
                    System.out.println("Gazul nu este conectat");
                }
            }
        }


            public void pressForthEyeButton () {

                if (eyeFourIsList) {
                    System.out.println("Ochiul 4 a fost stins");
                    eyeFourIsList = false;
                } else {
                    if (isGasConnected) {
                        System.out.println("Oachiul 4 a fost Aprins");
                        eyeFourIsList = true;
                        securityCheck();
                    } else {
                        System.out.println("Gazul nu este conectat");
                    }
                }
            }

            public void securityCheck () {

                if (eyeOneIsList && eyeTwoIsList && eyeThreeIsList && eyeFourIsList) {
                    System.out.println("WARNING.Am stins aragazul si am decuplat gazul");
                    eyeOneIsList = false;
                    eyeTwoIsList = false;
                    eyeThreeIsList = false;
                    eyeFourIsList = false;
                    decoupleGas();
                }
            }
        }


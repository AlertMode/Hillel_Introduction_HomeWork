class Detector {

    public boolean notZero(int probableZero) {

        boolean checker = false;

        if(probableZero != 0) {
            checker = true;
        }
        return checker;
    }

    public boolean evenChecker(int anyNumber) {

        boolean evenNumber = true;

        if((anyNumber % 2) == 0) {
            evenNumber = true;
        } else {
            evenNumber = false;
        }
        return evenNumber;
    }
}

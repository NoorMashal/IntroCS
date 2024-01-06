/**
 *
 * HeartTransplant class
 *
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 */
public class HeartTransplant {

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null.
     */
    public HeartTransplant() {

        // WRITE YOUR CODE HERE

        this.patients = null;

        this.survivabilityByAge = null;

        this.survivabilityByCause = null;
    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() {

        // WRITE YOUR CODE HERE
        return patients;
     }

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {
        // WRITE YOUR CODE HERE
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {
        // WRITE YOUR CODE HERE
        return survivabilityByCause;
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     *
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format:
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     *
     *    Each line refers to one Patient, all values are integers.
     *
     */
    public void readPatients (int numberOfLines) {
        // WRITE YOUR CODE HERE
        patients = new Patient[numberOfLines];

        for (int i = 0; i < numberOfLines && StdIn.hasNextLine(); i++) {
          int id, ethnicity, gender, age, cause, urgency, stateOfHealth;
          id = StdIn.readInt();
          ethnicity = StdIn.readInt();
          gender = StdIn.readInt();
          age = StdIn.readInt();
          cause = StdIn.readInt();
          urgency = StdIn.readInt();
          stateOfHealth = StdIn.readInt();

          patients[i] = new Patient(id, ethnicity, gender, age, cause, urgency, stateOfHealth);
        }

    }

    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     *
     * 2) Reads from the command line file to populate the object.
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     *
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     *
     */
    public void readSurvivabilityByAge (int numberOfLines) {
        // WRITE YOUR CODE HERE

        survivabilityByAge = new SurvivabilityByAge();

        int age, years;
        double rate;

        for (int i = 0; i < numberOfLines; i++) {
          age = StdIn.readInt();
          years = StdIn.readInt();
          rate = StdIn.readDouble();


          survivabilityByAge.addData(age,years,rate);
        }





    }

    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     *
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an
     *    integer and StdIn.readDouble() to read a double.
     *
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     *
     */
    public void readSurvivabilityByCause (int numberOfLines) {
        // WRITE YOUR CODE HERE

        survivabilityByCause = new SurvivabilityByCause();

        int cause, years;
        double rate;

        for (int i = 0; i < numberOfLines; i++) {
          cause = StdIn.readInt();
          years = StdIn.readInt();
          rate = StdIn.readDouble();


          survivabilityByCause.addData(cause,years,rate);
        }
    }

    /*
     * Returns a Patient array containing the patients,
     * from the patients array, that have age above the parameter age.
     *
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     *
     * Return null if there is no Patient with age above the
     * parameter age.
     */
    public Patient[] getPatientsWithAgeAbove(int age) {
        // WRITE YOUR CODE HERE

        int count = 0;

        for (int i = 0; i < patients.length; i++){
          if(patients[i].getAge()>= age){
          count++;
          }
        }
        if(count == 0){
          return null;
        }

        int index = 0;

        Patient[] patientsWithAgeAbove = new Patient[count];
        for(int i = 0; i < patients.length; i++)
        {
          if(patients[i].getAge()>= age){
            patientsWithAgeAbove[index] = patients[i];
            index++;
          }
        }
        return patientsWithAgeAbove;
      }

    /*
     * Returns a Patient array containing the patients, from the patients array,
     * that have the heart condition cause equal to the parameter cause.
     *
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     *
     * Return null if there is no Patient with the heart condition cause
     * equal to the parameter cause.
     */
    public Patient[] getPatientsByHeartConditionCause(int cause) {

      int count = 0;

      for (int i = 0; i < patients.length; i++){
        if(patients[i].getCause()== cause){
        count++;
        }
      }
      if(count == 0){
        return null;
      }

      int index = 0;

      Patient[] patientsWithHeartConditionCause = new Patient[count];
      for(int i = 0; i < patients.length; i++)
      {
        if(patients[i].getCause()== cause){
          patientsWithHeartConditionCause[index] = patients[i];
          index++;
        }
      }
      return patientsWithHeartConditionCause;
    }

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     *
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     *
     * Return null if there is no Patient with the state of health
     * equal to the parameter state.
     */
    public Patient[] getPatientsByUrgency(int urgency) {

        // WRITE YOUR CODE HERE
        int count = 0;

        for (int i = 0; i < patients.length; i++){
          if(patients[i].getUrgency()== urgency){
          count++;
          }
        }
        if(count == 0){
          return null;
        }

        int index = 0;

        Patient[] patientsWithUrgency = new Patient[count];
        for(int i = 0; i < patients.length; i++)
        {
          if(patients[i].getUrgency()== urgency){
            patientsWithUrgency[index] = patients[i];
            index++;
          }
        }
        return patientsWithUrgency;
    }

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     *
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     *
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     *
     * There is no correct solution, you may come up with any
     * function to find the patient with the highest potential
     * for survivability after the transplant.
     */
    public Patient getPatientForTransplant () {
      // WRITE YOUR CODE HERE
      int highestUrgency = 0;
      int highestSurvivability = 0;
      int survivabilityRate, survivabilityAge, survivabilityCause;
      int count = 0;

      for (int i = 0; i < patients.length; i++){
        if (patients[i].getUrgency() > highestUrgency && patients[i].getNeedHeart() == true){
          highestUrgency = patients[i].getUrgency();
        }
      }

      for (int i = 0; i < patients.length; i++){
        if (patients[i].getUrgency() == highestUrgency && patients[i].getNeedHeart() == true){
          count++;
        }
      }

      Patient[] patientsUrgency = new Patient[count];
      int index = 0;

      for (int i = 0; i < patients.length; i++){
        if (patients[i].getUrgency() == highestUrgency && patients[i].getNeedHeart() == true){
          patientsUrgency[index] = patients[i];
          index++;
        }
      }

    patientsUrgency[0].setNeedHeart(false);
  	return patientsUrgency[0];
    }
}

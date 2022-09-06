public class App {
    public static void main(String[] args) throws Exception {

      Student Me = new Student();

      Me.surname = "Catapang";
      Me.firstName = "Gabriel";
      Me.middleInitial = 'M';
      Me.dateOfBirth = "April 14, 2004";
      Me.studentNumber = 2022104812;
      Me.studentemailaddress = "catapanggm@students.national-u.edu.ph";
      Me.IamAwesome = true;
      Me.sayMysurname();
      Me.sayMyfirstName();
      Me.sayMymiddleInitial();
      Me.sayMydateofBirth();
      Me.sayMystudentNumber();
      Me.sayMystudentemailaddress();
      Me.sayIamAwesome();
    }
}

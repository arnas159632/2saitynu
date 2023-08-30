package lt.viko.eif.adrevinskas.courses.client;

public class Main {
    public static void main(String[] args) {
        UserDataCheckService service = new UserDataCheckService();
        UserDataCheck port = service.getUserDataCheckSoap11();
        GetUserDataCheckRequest request = new GetUserDataCheckRequest();
        request.setId(1);
        GetUserDataCheckResponse response = port.getUserDataCheck(request);

        UserDataCheck_Type userDataCheck = response.getCheck();
        System.out.println("Has active courses: " + userDataCheck.amountCourses());
        System.out.println("Has active teachers: " + userDataCheck.bolTeacher());
        System.out.println("All Courses Price: " + userDataCheck.getPrice());
        if(userDataCheck.amountCourses()) System.out.println("Amount of Courses: " + userDataCheck.getAmountOfCourses());
        if(userDataCheck.bolTeacher()) System.out.println("Amount of teachers: " + userDataCheck.getAmountOfTeachers());
    }

}
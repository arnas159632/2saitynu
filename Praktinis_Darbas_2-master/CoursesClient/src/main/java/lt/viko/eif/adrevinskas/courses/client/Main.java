package lt.viko.eif.adrevinskas.courses.client;

public class Main {
    public static void main(String[] args) {
        UserDataCheckService service = new UserDataCheckService();
        UserDataCheck port = service.getUserDataCheckSoap11();
        GetUserDataCheckRequest request = new GetUserDataCheckRequest();
        request.setId(1);
        GetUserDataCheckResponse response = port.getUserDataCheck(request);

        UserDataCheck_Type userDataCheck = response.getCheck();
        System.out.println("Has dedicated server: " + userDataCheck.isHasDedicatedServers());
        System.out.println("Has cloud server: " + userDataCheck.isHasCloudServers());
        System.out.println("All Courses Price: " + userDataCheck.getPrice());
        if(userDataCheck.isHasDedicatedServers()) System.out.println("Amount of Courses: " + userDataCheck.getAmountOfDedicatedServers());
        if(userDataCheck.isHasCloudServers()) System.out.println("Amount of cloud servers: " + userDataCheck.getAmountOfCloudServers());
    }

}
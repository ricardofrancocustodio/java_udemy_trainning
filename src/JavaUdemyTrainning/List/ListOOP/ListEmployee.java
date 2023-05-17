    package JavaUdemyTrainning.List.ListOOP;

    import java.util.ArrayList;

    public class ListEmployee {

        private ArrayList<Integer> listEmployeeId;
        private ArrayList<String> listEmployeeName;
        private ArrayList<Double> listEmployeeSalary;

        public ListEmployee(){

        }

        public ListEmployee(ArrayList<Integer> listEmployeeId, ArrayList<String> listEmployeeName, ArrayList<Double> listEmployeeSalary){
            this.listEmployeeId = listEmployeeId;
            this.listEmployeeName = listEmployeeName;
            this.listEmployeeSalary = listEmployeeSalary;
        }

        public Integer getIdToIncreaseSalary(ArrayList<Integer> listEmployeeId, Integer Id){
            return listEmployeeId.stream().filter(i -> i.equals(Id)).findFirst().orElse(null);
        }

        public Double salaryRaise(Double salary, Double percentage){
            return salary + ((salary / 100) * percentage);
        }


        @Override
        public String toString() {
            return
                    "ListEmployeeArray{" +
                                "id=" + listEmployeeId +
                                ", name=" + listEmployeeName +
                                ", salary=" + listEmployeeSalary  +
                                "}";


        }


    }


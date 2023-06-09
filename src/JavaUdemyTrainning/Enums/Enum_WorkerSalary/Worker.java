    package JavaUdemyTrainning.Enums.Enum_WorkerSalary;

    import java.util.ArrayList;
    import java.util.Calendar;
    import java.util.List;

    public class Worker {
        private String _name;
        private Double _baseSalary;
        private WorkerLevel _workerLevel;
        private Department _department;
        private final List<HourContract> _contracts = new ArrayList<>();


        public Worker(){}

        public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department department){
            this._name = name;
            this._workerLevel = workerLevel;
            this._baseSalary = baseSalary;
            this._department = department;
        }

        public void addContract(HourContract hourContract){
            this._contracts.add(hourContract);
        }

        public void removeContract(HourContract hourContract){
            this._contracts.remove(hourContract);
        }

        public Double income(Integer month, Integer year){
            Double sum = 0.0;
            Calendar calendar = Calendar.getInstance();

            for(HourContract el : _contracts){
                calendar.setTime(el.get_date());
                int calendar_month = calendar.get(Calendar.MONTH) +1;
                int calendar_year = calendar.get(Calendar.YEAR) ;

                if((calendar_month == month) && (calendar_year == year)){
                     sum += el.totalValue();
                }
            }
            return this._baseSalary + sum ;
        }

        public String get_name() {
            return _name;
        }

        public void set_name(String _name) {
            this._name = _name;
        }

        public WorkerLevel get_workerLevel() {
            return _workerLevel;
        }

        public void set_workerLevel(WorkerLevel _workerLevel) {
            this._workerLevel = _workerLevel;
        }

        public Department get_department() { return _department; }

        public void set_department(Department _department) { this._department = _department; }

        public Double get_baseSalary() {
            return _baseSalary;
        }

        public void set_baseSalary(Double _baseSalary) {
            this._baseSalary = _baseSalary;
        }



    }

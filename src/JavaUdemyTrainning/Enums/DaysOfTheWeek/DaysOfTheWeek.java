package JavaUdemyTrainning.Enums.DaysOfTheWeek;

public class DaysOfTheWeek {

    DOW_List[] dowList = DOW_List.values();

    public DaysOfTheWeek(){}

    public String getNextDayOfTheWeek(String day) {
        String res = "";

        for (int i = 0; i < dowList.length - 1; i++) {
            if (day.equals("SATURDAY")) {
                res = dowList[0].toString();

            } else if (day.equals(dowList[i].toString())) {
                res = dowList[i + 1].toString();
            }
        }

        return res;

    }
}

// for (DOW_List d: DOW_List.values()){
//         if(day.equals(d.toString())){
//         res = d.toString() + 1;
//         }
//         }
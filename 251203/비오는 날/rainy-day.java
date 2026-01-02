import java.util.*;

class WeatherReport implements Comparable<WeatherReport>{
    String date;
    String day;
    String weather;

    public WeatherReport(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    @Override
    public int compareTo(WeatherReport wr) {
        return this.date.compareTo(wr.date);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        WeatherReport[] wr = new WeatherReport[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            wr[i] = new WeatherReport(date, day, weather);
        }
        Arrays.sort(wr);

        // 비오는날 찾기
        for(int i = 0; i < n; i++) {
            if(wr[i].weather.equals("Rain")) {
                System.out.print(wr[i].date + " " + wr[i].day + " " + wr[i].weather);
                break;
            }
        }
    }
}
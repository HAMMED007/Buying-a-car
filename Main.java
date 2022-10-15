public class Main {
    public static void main(String[] args) {



        System.out.println(BuyCar.nbMonths(2000,8000,1000,1.5)[0]);
        System.out.println(BuyCar.nbMonths(2000,8000,1000,1.5)[1]);

    }

    public class BuyCar {

        public static int[] nbMonths(double startPriceOld, double startPriceNew, double savingPerMonth, double percentLossByMonth) {


            double totalSavings = 0;

            int month = 0;

            while (startPriceNew - startPriceOld > totalSavings){
                month ++;
                if(month % 2 == 0){

                    percentLossByMonth = percentLossByMonth + 0.5;
                }
                startPriceOld = startPriceOld - (startPriceOld * percentLossByMonth / 100);
                startPriceNew = startPriceNew - (startPriceNew * percentLossByMonth / 100);
                totalSavings = totalSavings +  savingPerMonth;



            }
            int result = (int) Math.round(startPriceOld - startPriceNew + totalSavings);

            return new int[]{month,result};
        }
    }

}
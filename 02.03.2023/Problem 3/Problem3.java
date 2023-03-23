class Eb {
    int size = 10;
    int customerNo[] = new int[size];
    String customerName[] = new String[size];
    float prevReading[] = new float[size];
    float currReading[] = new float[size];
    String type[] = new String[size];
    float billAmount[] = new float[size];
    int count = 0;

    public void putDetails(int custNo, String name, float prev, float curr, String typ) {
        Eb obj = new Eb();
        customerNo[count] = custNo;
        customerName[count] = name;
        prevReading[count] = prev;
        currReading[count] = curr;
        type[count] = typ;
        float units = currReading[count];
        if (typ == "domestic") {
            float cost = 0;
            if (units <= 100){
                cost += units;
            }
            else if (units >= 101 && units <= 200){
                cost += 100 + ((units - 100)*2.5);
            }
            else if (units >= 201 && units <= 500){
                cost += 100 + (200 * 2.5) + ((units - 200)*4);
            }
            else{
                cost += 100 + (200 * 2.5) + (300 * 4) + ((units - 500) * 6);
            }
            billAmount[count] = cost;
            
        } else {
            billAmount[count] = units;
        }
        count++;
    }

    public void getAllDetails() {
        for (int i = 0; i < count; i++) {
            System.out.println("Customer No: " + customerNo[i]);
            System.out.println("customer Name: " + customerName[i]);
            System.out.println("Previous month reading: " + prevReading[i]);
            System.out.println("Current month reading: " + currReading[i]);
            System.out.println("Type: " + type[i]);
            System.out.println("Bill Amount: " + billAmount[i]);
            System.out.println();
        }
    }
    public void getDeatil(int custNo){
        
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Eb obj = new Eb();
        obj.putDetails(1, "Spidy", 100, 110, "domestic");
        obj.putDetails(2, "Iron Man", 201020, 201010, "domestic");
        obj.getAllDetails();
    }
}

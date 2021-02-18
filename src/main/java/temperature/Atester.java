package temperature;

public class Atester {
private Conversion conversion ;

    public Atester(Conversion conversion) {
        this.conversion = conversion;
    }

    public double convertit(double temperature,String sens ) throws Exception {

        if (sens.equals("F2C")){
          return  conversion.convF2C(temperature);
        }

        else if (sens.equals("C2F")){
           return  conversion.convC2F(temperature);
        }

        else {
            throw new Exception("conversion pas possible");
        }

    }
}

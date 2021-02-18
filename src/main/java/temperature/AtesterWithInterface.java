package temperature;

public class AtesterWithInterface {
    private IConversion conv ;

    public AtesterWithInterface(IConversion conv) {
        this.conv = conv;
    }

    public double convertit(double temperature,String sens ) throws Exception {

        if (sens.equals("F2C")){
            return  conv.convF2C(temperature);
        }
        else if (sens.equals("C2F")){
            return  conv.convC2F(temperature);
        }

        else {
            throw new Exception("conversion pas possible");
        }

    }
}

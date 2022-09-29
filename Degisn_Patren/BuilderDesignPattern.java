package com.example.DP;

class ComputerDP{

    String ram;
    String cpu;
    String gp;
    String ssd;

    private ComputerDP(ComputerBuilder cb){
        ram=cb.ram;
        cpu=cb.cpu;
        gp=cb.gp;
        ssd=cb.ssd;
    }
    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGp() {
        return gp;
    }

    public String getSsd() {
        return ssd;
    }

    public static class ComputerBuilder{
        String ram;
        String cpu;
        String gp;
        String ssd;

        public ComputerBuilder(String ram,String cpu){
            this.ram=ram;
            this.cpu=cpu;
        }

        public ComputerBuilder setGp(String gp) {
            this.gp = gp;
            return this;
        }

        public ComputerBuilder setSsd(String ssd) {
            this.ssd = ssd;
            return this;
        }
        public ComputerDP build(){
            return new ComputerDP(this);
        }
    }

    @Override
    public String toString() {
        return "ComputerDP{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gp='" + gp + '\'' +
                ", ssd='" + ssd + '\'' +
                '}';
    }
}
public class BuilderDesignPattern {
    public static void main(String[] args) {
        ComputerDP dp=new ComputerDP.ComputerBuilder("16GB","i7").setGp("Yes").setSsd("Yes").build();
        ComputerDP dp1=new ComputerDP.ComputerBuilder("16GB","i7").build();

        System.out.println("Full Object "+dp.toString());
        System.out.println("Object "+dp1.toString());
    }
}
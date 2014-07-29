package pl.altkom.jpr.maven.testabc.adapter;


public class DivX implements Kompressor {

    private boolean useSuper = false;

    @Override
    public void komresuj() {

        System.out.println("Kompresuej divx");

    }

    @Override
    public void wyswietl() {
        // TODO Auto-generated method stub

    }

    @Override
    public void dekompresuj() {
        // TODO Auto-generated method stub

    }

    public boolean isUseSuper() {
        return useSuper;
    }

    public void setUseSuper(boolean useSuper) {
        this.useSuper = useSuper;
    }

}

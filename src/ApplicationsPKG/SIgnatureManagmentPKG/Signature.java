package ApplicationsPKG.SIgnatureManagmentPKG;

import ApplicationsPKG.ClientData.Client;

import java.util.ArrayList;
import java.util.List;


public abstract class Signature {
    protected Client client;
    protected TYPE_MONTHY_PLAN typeMonthyPlan;
    protected List<String> listSignatures;

    public Signature() {
        listSignatures = new ArrayList<>();
    }

    //Colect signatures and archive it in a List
    public void signatureAssignement(String signature){
        listSignatures.add(signature);
    }

}

import proxy.Operation;
import proxy.Releve;
import proxy.ReleveService;
import proxy.ReleveWS;

import javax.sound.midi.Soundbank;
import java.util.List;

public class ClientSOAP {
    public static void main(String[] args) {
        ReleveService stub= new ReleveWS().getReleveServicePort();
        Releve releve = stub.consulerRelever("1425398742368844");
        System.out.println("----------------------Relevé----------------");
        System.out.println("Rib: "+releve.getRib());
        System.out.println("DateRelevé: "+releve.getDateReleve());
        System.out.println("Solde: "+releve.getSolde());
        List<Operation> operations =releve.getOperation();
        System.out.println("        ----------Opérations--------        ");
        for(int i=0; i<operations.size(); i++){
            System.out.println("Opéartion N° "+(i+1)+":");
            System.out.println("\tType: "+operations.get(i).getType());
            System.out.println("\tDate: "+operations.get(i).getDate());
            System.out.println("\tMontant: "+operations.get(i).getMontant());
            System.out.println("\tDescription: "+operations.get(i).getDescription());
        }

    }
}

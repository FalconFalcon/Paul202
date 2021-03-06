package api ;

import treasureHunt.TreasureHunt;
import org.restlet.*;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;



public class TreasureHuntServer extends Application {

    public static void main(String[] args) throws Exception {   
        Component server = new Component() ;
        server.getServers().add(Protocol.HTTP, 8081) ;
        server.getDefaultHost().attach(new TreasureHuntServer()) ;
        server.start();
        TreasureHunt treasureHunt = new TreasureHunt();
    }
    
    @Override
    public Restlet createInboundRoot() {    
        Router router = new Router(getContext()) ;
        router.attach("/treasureHunt/{param}", TreasureHuntResource.class);        
        return router;
    }
}


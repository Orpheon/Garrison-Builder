
package com.ganggarrison.garrisonbuilder.testentitytypes;

import com.ganggarrison.garrisonbuilder.entitytypesources.EntityTypeSource;
import com.ganggarrison.garrisonbuilder.gamemap.EntityType;
import java.awt.Image;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.imageio.ImageIO;
import org.openide.util.Exceptions;

/**
 *
 * @author cspotcode
 */
public class TestEntityTypesSource implements EntityTypeSource {

    @Override
    public EntityType[] getEntityTypes() {
        // build a set of dummy entities for testing
        Set<EntityType> types = new HashSet<EntityType>();
        
        EntityType t1 = new EntityType("testEnt1");
        Image i;
        try {
            i = ImageIO.read(getClass().getResourceAsStream("defaultEntMapImage.png"));
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex); // TODO properly handle this
            return new EntityType[] {};
        }
        t1.setMapImage(i);
        t1.setPalletteImage(i);
        types.add(t1);
        EntityType t2 = new EntityType("testEnt2");
        t2.setMapImage(i);
        t2.setPalletteImage(i);
        types.add(t2);
        
        return types.toArray(new EntityType[] {});
    }
    
}

package org.econfortin.ocejwsdstudy.enthuware.test1.q15;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*
 * Note that if a SIB refers to a SEI, the only JSR-181 annotations that are allowed on a SIB are:
 * - @WebService;
 * - @HandlerChain;
 * Note that @MTOM, and @Addressing are also allowed on a SIB.
 */
@WebService//(endpointInterface = "GifService")
public class GifServiceImpl implements GifService {
    @Override
    public Image getGifImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));
        } catch (IOException e) {
        }
        return img;
    }
}

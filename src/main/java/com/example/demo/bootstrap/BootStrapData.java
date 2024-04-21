package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (partRepository.count() == 0 && productRepository.count() == 0) {

            OutsourcedPart outsourcedBody = new OutsourcedPart();
            outsourcedBody.setCompanyName("BodyLab");
            outsourcedBody.setName("Body");
            outsourcedBody.setInv(5);
            outsourcedBody.setPrice(100.0);
            outsourcedBody.setMinInv(1);
            outsourcedBody.setMaxInv(50);

            OutsourcedPart outsourcedBridge = new OutsourcedPart();
            outsourcedBridge.setCompanyName("BridgeBrilliance");
            outsourcedBridge.setName("Bridge");
            outsourcedBridge.setInv(7);
            outsourcedBridge.setPrice(30.0);
            outsourcedBridge.setMinInv(1);
            outsourcedBridge.setMaxInv(50);

            OutsourcedPart outsourcedPaint = new OutsourcedPart();
            outsourcedPaint.setCompanyName("Picasso");
            outsourcedPaint.setName("Paint");
            outsourcedPaint.setInv(10);
            outsourcedPaint.setPrice(50.0);
            outsourcedPaint.setMinInv(1);
            outsourcedPaint.setMaxInv(50);

            OutsourcedPart outsourcedNeck = new OutsourcedPart();
            outsourcedNeck.setCompanyName("Customs-R-us");
            outsourcedNeck.setName("Neck");
            outsourcedNeck.setInv(3);
            outsourcedNeck.setPrice(40.0);
            outsourcedNeck.setMinInv(1);
            outsourcedNeck.setMaxInv(50);

            OutsourcedPart outsourcedPickup = new OutsourcedPart();
            outsourcedPickup.setCompanyName("Pick-N-Play");
            outsourcedPickup.setName("Pick-up");
            outsourcedPickup.setInv(5);
            outsourcedPickup.setPrice(25.0);
            outsourcedPickup.setMinInv(1);
            outsourcedPickup.setMaxInv(50);

            outsourcedPartRepository.save(outsourcedBody);
            outsourcedPartRepository.save(outsourcedBridge);
            outsourcedPartRepository.save(outsourcedPaint);
            outsourcedPartRepository.save(outsourcedNeck);
            outsourcedPartRepository.save(outsourcedPickup);

            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                System.out.println(part.getName()+" "+part.getCompanyName());

            Product electric = new Product("Electric Guitar", 600.0, 15);
            Product acoustic = new Product("Acoustic Guitar", 400.0, 10);
            Product bass = new Product("Bass Guitar", 300.0, 10);
            Product semi = new Product("Semi-Hollowbody Guitar", 500.0, 10);
            Product custom = new Product("Custom Guitar", 800.0, 4);

            productRepository.save(electric);
            productRepository.save(acoustic);
            productRepository.save(bass);
            productRepository.save(semi);
            productRepository.save(custom);
        }

        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products "+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts "+partRepository.count());
        System.out.println(partRepository.findAll());


                       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("My Guitar Shop");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

    }
}

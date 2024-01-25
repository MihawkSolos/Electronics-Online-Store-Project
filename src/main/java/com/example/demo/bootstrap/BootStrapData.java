package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

            long partsCount = partRepository.count();
            long productsCount = productRepository.count();

                if(partsCount == 0) {

                    OutsourcedPart part1 = new OutsourcedPart();
                    part1.setCompanyName("My Electronics Shop");
                    part1.setName("Microcontrollers");
                    part1.setInv(36);
                    part1.setPrice(5.0);
                    part1.setId(1L);
                    outsourcedPartRepository.save(part1);

                    OutsourcedPart part2 = new OutsourcedPart();
                    part2.setName("Resistors");
                    part2.setInv(74);
                    part2.setPrice(20.0);
                    part2.setId(2L);
                    outsourcedPartRepository.save(part2);

                    OutsourcedPart part3 = new OutsourcedPart();
                    part3.setName("Capacitors");
                    part3.setInv(55);
                    part3.setPrice(10.0);
                    part3.setId(3L);
                    outsourcedPartRepository.save(part3);

                    OutsourcedPart part4 = new OutsourcedPart();
                    part4.setName("LEDs");
                    part4.setInv(41);
                    part4.setPrice(15.0);
                    part4.setId(4L);
                    outsourcedPartRepository.save(part4);

                    OutsourcedPart part5 = new OutsourcedPart();
                    part5.setName("Transistors");
                    part5.setInv(62);
                    part5.setPrice(50.0);
                    part5.setId(5L);
                    outsourcedPartRepository.save(part5);

                }


        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Microcontrollers")){thePart=part;}
            else if(part.getName().equals("Resistors")){thePart=part;}
            else if(part.getName().equals("Capacitors")){thePart=part;}
            else if(part.getName().equals("LEDs")){thePart=part;}
            else if(part.getName().equals("Transistors")){thePart=part;}
        }

        System.out.println(thePart.getCompanyName());
        //

        List<OutsourcedPart> outsourcedParts_2=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        if(productsCount == 0) {
            Product laptop = new Product("Laptop", 500.0, 15);
            productRepository.save(laptop);
            Product smartphone = new Product("Smartphone", 700.0, 6);
            productRepository.save(smartphone);
            Product digitalCamera = new Product("Digital Camera", 100.0, 22);
            productRepository.save(digitalCamera);
            Product smartwatch = new Product("Smartwatch", 250.0, 9);
            productRepository.save(smartwatch);
            Product theaterSystem = new Product("Home Theater System", 1000.0, 5);
            productRepository.save(theaterSystem);
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}

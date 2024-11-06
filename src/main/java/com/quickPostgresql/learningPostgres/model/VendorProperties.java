package com.quickPostgresql.learningPostgres.model;


import jakarta.persistence.*;
import lombok.ToString;


import java.util.UUID;


@Entity
@Table(name = "new_vendor_details")
@ToString
// this model class will connect with postman or serve the user requests
public class VendorProperties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "roll_id", unique = true)
    private UUID rollId;

    @Column(name = "address_details", columnDefinition = "jsonb")
//    private Map<String, String> address_details;
    private Address addressDetails;

    public VendorProperties(long id, String name, String contactNumber, UUID rollId, Address addressDetails) {
        this.id = id;
        this.name= name;
        this.contactNumber= contactNumber;
        this.rollId= rollId;
//        System.out.println("address " + addressDetails);
//        System.out.println("nope=> "+ addressDetails);
        this.addressDetails = addressDetails;
    }

    public VendorProperties() {
        this.rollId= UUID.randomUUID();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public UUID getRollId() {
        return rollId;
    }

    public void setRollId(UUID rollId) {
        this.rollId = rollId;
    }

    public Address getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(Address addressDetails) {
        System.out.println("Adress is here => " + addressDetails);
        this.addressDetails = addressDetails;
    }






}

package com.jio.party.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "account_ref")
public class AccountRef {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "db_id")
    private String dbId;

    // TMF id: reference to the account in its own service — required per spec
    @NotBlank
    private String id;

    private String href;
    private String name;
    private String description;

    @Column(name = "at_referred_type")
    private String atReferredType;

    @Column(name = "at_base_type")
    private String atBaseType;

    @Column(name = "at_schema_location")
    private String atSchemaLocation;

    @Column(name = "at_type")
    private String atType;

    public String getDbId() { return dbId; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getHref() { return href; }
    public void setHref(String href) { this.href = href; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getAtReferredType() { return atReferredType; }
    public void setAtReferredType(String atReferredType) { this.atReferredType = atReferredType; }

    public String getAtBaseType() { return atBaseType; }
    public void setAtBaseType(String atBaseType) { this.atBaseType = atBaseType; }

    public String getAtSchemaLocation() { return atSchemaLocation; }
    public void setAtSchemaLocation(String atSchemaLocation) { this.atSchemaLocation = atSchemaLocation; }

    public String getAtType() { return atType; }
    public void setAtType(String atType) { this.atType = atType; }
}

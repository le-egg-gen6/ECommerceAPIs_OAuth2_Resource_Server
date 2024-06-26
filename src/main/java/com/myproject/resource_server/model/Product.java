package com.myproject.resource_server.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"productCategory", "productVariantList"})
public class Product extends BaseModel {

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory productCategory;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProductVariant> productVariantList;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @Column(name = "long_desc", columnDefinition = "TEXT")
    private String longDesc;

    @Column(name = "date_created", insertable = false)
    private Date dateCreated;

    @Column(name = "last_updated", insertable = false, columnDefinition = "TIMESTAMP")
    private Date lastUpdated;

    @Column(name = "unlimited")
    private Integer unlimited;

}


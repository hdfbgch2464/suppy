package com.zjjzfy.pojo;

import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "tb_repository")
public class TbRepository implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repository.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repository.supply_org_id
     *
     * @mbggenerated
     */
    private Integer supplyOrgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repository.product_id
     *
     * @mbggenerated
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repository.quantity
     *
     * @mbggenerated
     */
    private Integer quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repository.quantity_total
     *
     * @mbggenerated
     */
    private Integer quantityTotal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repository.supplier_id
     *
     * @mbggenerated
     */
    private Integer supplierId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_repository
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repository.ID
     *
     * @return the value of tb_repository.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repository.ID
     *
     * @param id the value for tb_repository.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repository.supply_org_id
     *
     * @return the value of tb_repository.supply_org_id
     *
     * @mbggenerated
     */
    public Integer getSupplyOrgId() {
        return supplyOrgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repository.supply_org_id
     *
     * @param supplyOrgId the value for tb_repository.supply_org_id
     *
     * @mbggenerated
     */
    public void setSupplyOrgId(Integer supplyOrgId) {
        this.supplyOrgId = supplyOrgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repository.product_id
     *
     * @return the value of tb_repository.product_id
     *
     * @mbggenerated
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repository.product_id
     *
     * @param productId the value for tb_repository.product_id
     *
     * @mbggenerated
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repository.quantity
     *
     * @return the value of tb_repository.quantity
     *
     * @mbggenerated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repository.quantity
     *
     * @param quantity the value for tb_repository.quantity
     *
     * @mbggenerated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repository.quantity_total
     *
     * @return the value of tb_repository.quantity_total
     *
     * @mbggenerated
     */
    public Integer getQuantityTotal() {
        return quantityTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repository.quantity_total
     *
     * @param quantityTotal the value for tb_repository.quantity_total
     *
     * @mbggenerated
     */
    public void setQuantityTotal(Integer quantityTotal) {
        this.quantityTotal = quantityTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repository.supplier_id
     *
     * @return the value of tb_repository.supplier_id
     *
     * @mbggenerated
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repository.supplier_id
     *
     * @param supplierId the value for tb_repository.supplier_id
     *
     * @mbggenerated
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_repository
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", supplyOrgId=").append(supplyOrgId);
        sb.append(", productId=").append(productId);
        sb.append(", quantity=").append(quantity);
        sb.append(", quantityTotal=").append(quantityTotal);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
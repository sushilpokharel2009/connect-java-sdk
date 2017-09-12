/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.Address;
import com.squareup.connect.models.Refund;
import com.squareup.connect.models.Tender;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a transaction processed with Square, either with the Connect API or with Square Point of Sale.  The &#x60;tenders&#x60; field of this object lists all methods of payment used to pay in the transaction.
 */
@ApiModel(description = "Represents a transaction processed with Square, either with the Connect API or with Square Point of Sale.  The `tenders` field of this object lists all methods of payment used to pay in the transaction.")

public class Transaction {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("location_id")
  private String locationId = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("tenders")
  private List<Tender> tenders = new ArrayList<Tender>();

  @JsonProperty("refunds")
  private List<Refund> refunds = new ArrayList<Refund>();

  @JsonProperty("reference_id")
  private String referenceId = null;

  /**
   * The Square product that processed the transaction.
   */
  public enum ProductEnum {
    REGISTER("REGISTER"),
    
    EXTERNAL_API("EXTERNAL_API"),
    
    BILLING("BILLING"),
    
    APPOINTMENTS("APPOINTMENTS"),
    
    INVOICES("INVOICES"),
    
    ONLINE_STORE("ONLINE_STORE"),
    
    PAYROLL("PAYROLL"),
    
    OTHER("OTHER");

    private String value;

    ProductEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProductEnum fromValue(String text) {
      for (ProductEnum b : ProductEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("product")
  private ProductEnum product = null;

  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("shipping_address")
  private Address shippingAddress = null;

  @JsonProperty("order_id")
  private String orderId = null;

  public Transaction id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The transaction's unique ID, issued by Square payments servers.
   * @return id
  **/
  @ApiModelProperty(value = "The transaction's unique ID, issued by Square payments servers.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Transaction locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The ID of the transaction's associated location.
   * @return locationId
  **/
  @ApiModelProperty(value = "The ID of the transaction's associated location.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Transaction createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the transaction was created, in RFC 3339 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the transaction was created, in RFC 3339 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Transaction tenders(List<Tender> tenders) {
    this.tenders = tenders;
    return this;
  }

  public Transaction addTendersItem(Tender tendersItem) {
    this.tenders.add(tendersItem);
    return this;
  }

   /**
   * The tenders used to pay in the transaction.
   * @return tenders
  **/
  @ApiModelProperty(value = "The tenders used to pay in the transaction.")
  public List<Tender> getTenders() {
    return tenders;
  }

  public void setTenders(List<Tender> tenders) {
    this.tenders = tenders;
  }

  public Transaction refunds(List<Refund> refunds) {
    this.refunds = refunds;
    return this;
  }

  public Transaction addRefundsItem(Refund refundsItem) {
    this.refunds.add(refundsItem);
    return this;
  }

   /**
   * Refunds that have been applied to any tender in the transaction.
   * @return refunds
  **/
  @ApiModelProperty(value = "Refunds that have been applied to any tender in the transaction.")
  public List<Refund> getRefunds() {
    return refunds;
  }

  public void setRefunds(List<Refund> refunds) {
    this.refunds = refunds;
  }

  public Transaction referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * If the transaction was created with the [Charge](#endpoint-charge) endpoint, this value is the same as the value provided for the `reference_id` parameter in the request to that endpoint. Otherwise, it is not set.
   * @return referenceId
  **/
  @ApiModelProperty(value = "If the transaction was created with the [Charge](#endpoint-charge) endpoint, this value is the same as the value provided for the `reference_id` parameter in the request to that endpoint. Otherwise, it is not set.")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public Transaction product(ProductEnum product) {
    this.product = product;
    return this;
  }

   /**
   * The Square product that processed the transaction.
   * @return product
  **/
  @ApiModelProperty(value = "The Square product that processed the transaction.")
  public ProductEnum getProduct() {
    return product;
  }

  public void setProduct(ProductEnum product) {
    this.product = product;
  }

  public Transaction clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * If the transaction was created in the Square Point of Sale app, this value is the ID generated for the transaction by Square Point of Sale.  This ID has no relationship to the transaction's canonical `id`, which is generated by Square's backend servers. This value is generated for bookkeeping purposes, in case the transaction cannot immediately be completed (for example, if the transaction is processed in offline mode).  It is not currently possible with the Connect API to perform a transaction lookup by this value.
   * @return clientId
  **/
  @ApiModelProperty(value = "If the transaction was created in the Square Point of Sale app, this value is the ID generated for the transaction by Square Point of Sale.  This ID has no relationship to the transaction's canonical `id`, which is generated by Square's backend servers. This value is generated for bookkeeping purposes, in case the transaction cannot immediately be completed (for example, if the transaction is processed in offline mode).  It is not currently possible with the Connect API to perform a transaction lookup by this value.")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Transaction shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * The shipping address provided in the request, if any.
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "The shipping address provided in the request, if any.")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Transaction orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The order_id is an identifier for the order associated with this transaction, if any.
   * @return orderId
  **/
  @ApiModelProperty(value = "The order_id is an identifier for the order associated with this transaction, if any.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.locationId, transaction.locationId) &&
        Objects.equals(this.createdAt, transaction.createdAt) &&
        Objects.equals(this.tenders, transaction.tenders) &&
        Objects.equals(this.refunds, transaction.refunds) &&
        Objects.equals(this.referenceId, transaction.referenceId) &&
        Objects.equals(this.product, transaction.product) &&
        Objects.equals(this.clientId, transaction.clientId) &&
        Objects.equals(this.shippingAddress, transaction.shippingAddress) &&
        Objects.equals(this.orderId, transaction.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locationId, createdAt, tenders, refunds, referenceId, product, clientId, shippingAddress, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    tenders: ").append(toIndentedString(tenders)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}


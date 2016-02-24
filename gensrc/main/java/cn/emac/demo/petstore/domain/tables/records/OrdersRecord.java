/**
 * This class is generated by jOOQ
 */
package cn.emac.demo.petstore.domain.tables.records;


import cn.emac.demo.petstore.domain.tables.Orders;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Date;


/**
 * Cadastro de pedidos
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrdersRecord extends UpdatableRecordImpl<OrdersRecord> {

	private static final long serialVersionUID = 1122829454;

	/**
	 * Setter for <code>jpetstore.orders.orderid</code>.
	 */
	public OrdersRecord setOrderid(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.orderid</code>.
	 */
	public Integer getOrderid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>jpetstore.orders.userid</code>.
	 */
	public OrdersRecord setUserid(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.userid</code>.
	 */
	public String getUserid() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>jpetstore.orders.orderdate</code>.
	 */
	public OrdersRecord setOrderdate(Date value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.orderdate</code>.
	 */
	public Date getOrderdate() {
		return (Date) getValue(2);
	}

	/**
	 * Setter for <code>jpetstore.orders.shipaddr1</code>.
	 */
	public OrdersRecord setShipaddr1(String value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.shipaddr1</code>.
	 */
	public String getShipaddr1() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>jpetstore.orders.shipaddr2</code>.
	 */
	public OrdersRecord setShipaddr2(String value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.shipaddr2</code>.
	 */
	public String getShipaddr2() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>jpetstore.orders.shipcity</code>.
	 */
	public OrdersRecord setShipcity(String value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.shipcity</code>.
	 */
	public String getShipcity() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>jpetstore.orders.shipstate</code>.
	 */
	public OrdersRecord setShipstate(String value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.shipstate</code>.
	 */
	public String getShipstate() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>jpetstore.orders.shipzip</code>.
	 */
	public OrdersRecord setShipzip(String value) {
		setValue(7, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.shipzip</code>.
	 */
	public String getShipzip() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>jpetstore.orders.shipcountry</code>.
	 */
	public OrdersRecord setShipcountry(String value) {
		setValue(8, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.shipcountry</code>.
	 */
	public String getShipcountry() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>jpetstore.orders.billaddr1</code>.
	 */
	public OrdersRecord setBilladdr1(String value) {
		setValue(9, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.billaddr1</code>.
	 */
	public String getBilladdr1() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>jpetstore.orders.billaddr2</code>.
	 */
	public OrdersRecord setBilladdr2(String value) {
		setValue(10, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.billaddr2</code>.
	 */
	public String getBilladdr2() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>jpetstore.orders.billcity</code>.
	 */
	public OrdersRecord setBillcity(String value) {
		setValue(11, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.billcity</code>.
	 */
	public String getBillcity() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>jpetstore.orders.billstate</code>.
	 */
	public OrdersRecord setBillstate(String value) {
		setValue(12, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.billstate</code>.
	 */
	public String getBillstate() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>jpetstore.orders.billzip</code>.
	 */
	public OrdersRecord setBillzip(String value) {
		setValue(13, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.billzip</code>.
	 */
	public String getBillzip() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>jpetstore.orders.billcountry</code>.
	 */
	public OrdersRecord setBillcountry(String value) {
		setValue(14, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.billcountry</code>.
	 */
	public String getBillcountry() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>jpetstore.orders.courier</code>.
	 */
	public OrdersRecord setCourier(String value) {
		setValue(15, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.courier</code>.
	 */
	public String getCourier() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>jpetstore.orders.totalprice</code>.
	 */
	public OrdersRecord setTotalprice(BigDecimal value) {
		setValue(16, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.totalprice</code>.
	 */
	public BigDecimal getTotalprice() {
		return (BigDecimal) getValue(16);
	}

	/**
	 * Setter for <code>jpetstore.orders.billtofirstname</code>.
	 */
	public OrdersRecord setBilltofirstname(String value) {
		setValue(17, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.billtofirstname</code>.
	 */
	public String getBilltofirstname() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>jpetstore.orders.billtolastname</code>.
	 */
	public OrdersRecord setBilltolastname(String value) {
		setValue(18, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.billtolastname</code>.
	 */
	public String getBilltolastname() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>jpetstore.orders.shiptofirstname</code>.
	 */
	public OrdersRecord setShiptofirstname(String value) {
		setValue(19, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.shiptofirstname</code>.
	 */
	public String getShiptofirstname() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>jpetstore.orders.shiptolastname</code>.
	 */
	public OrdersRecord setShiptolastname(String value) {
		setValue(20, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.shiptolastname</code>.
	 */
	public String getShiptolastname() {
		return (String) getValue(20);
	}

	/**
	 * Setter for <code>jpetstore.orders.creditcard</code>.
	 */
	public OrdersRecord setCreditcard(String value) {
		setValue(21, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.creditcard</code>.
	 */
	public String getCreditcard() {
		return (String) getValue(21);
	}

	/**
	 * Setter for <code>jpetstore.orders.exprdate</code>.
	 */
	public OrdersRecord setExprdate(String value) {
		setValue(22, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.exprdate</code>.
	 */
	public String getExprdate() {
		return (String) getValue(22);
	}

	/**
	 * Setter for <code>jpetstore.orders.cardtype</code>.
	 */
	public OrdersRecord setCardtype(String value) {
		setValue(23, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.cardtype</code>.
	 */
	public String getCardtype() {
		return (String) getValue(23);
	}

	/**
	 * Setter for <code>jpetstore.orders.locale</code>.
	 */
	public OrdersRecord setLocale(String value) {
		setValue(24, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.orders.locale</code>.
	 */
	public String getLocale() {
		return (String) getValue(24);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached OrdersRecord
	 */
	public OrdersRecord() {
		super(Orders.ORDERS);
	}

	/**
	 * Create a detached, initialised OrdersRecord
	 */
	public OrdersRecord(Integer orderid, String userid, Date orderdate, String shipaddr1, String shipaddr2, String shipcity, String shipstate, String shipzip, String shipcountry, String billaddr1, String billaddr2, String billcity, String billstate, String billzip, String billcountry, String courier, BigDecimal totalprice, String billtofirstname, String billtolastname, String shiptofirstname, String shiptolastname, String creditcard, String exprdate, String cardtype, String locale) {
		super(Orders.ORDERS);

		setValue(0, orderid);
		setValue(1, userid);
		setValue(2, orderdate);
		setValue(3, shipaddr1);
		setValue(4, shipaddr2);
		setValue(5, shipcity);
		setValue(6, shipstate);
		setValue(7, shipzip);
		setValue(8, shipcountry);
		setValue(9, billaddr1);
		setValue(10, billaddr2);
		setValue(11, billcity);
		setValue(12, billstate);
		setValue(13, billzip);
		setValue(14, billcountry);
		setValue(15, courier);
		setValue(16, totalprice);
		setValue(17, billtofirstname);
		setValue(18, billtolastname);
		setValue(19, shiptofirstname);
		setValue(20, shiptolastname);
		setValue(21, creditcard);
		setValue(22, exprdate);
		setValue(23, cardtype);
		setValue(24, locale);
	}
}
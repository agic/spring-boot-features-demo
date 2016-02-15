/**
 * This class is generated by jOOQ
 */
package cn.emac.demo.petstore.domain.jpetstore.tables.records;


import cn.emac.demo.petstore.domain.jpetstore.tables.Lineitem;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Line Item
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LineitemRecord extends UpdatableRecordImpl<LineitemRecord> implements Record5<Integer, Integer, String, Integer, BigDecimal> {

	private static final long serialVersionUID = -2003085557;

	/**
	 * Setter for <code>jpetstore.lineitem.orderid</code>.
	 */
	public void setOrderid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>jpetstore.lineitem.orderid</code>.
	 */
	public Integer getOrderid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>jpetstore.lineitem.linenum</code>.
	 */
	public void setLinenum(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>jpetstore.lineitem.linenum</code>.
	 */
	public Integer getLinenum() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>jpetstore.lineitem.itemid</code>.
	 */
	public void setItemid(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>jpetstore.lineitem.itemid</code>.
	 */
	public String getItemid() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>jpetstore.lineitem.quantity</code>.
	 */
	public void setQuantity(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>jpetstore.lineitem.quantity</code>.
	 */
	public Integer getQuantity() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>jpetstore.lineitem.unitprice</code>.
	 */
	public void setUnitprice(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>jpetstore.lineitem.unitprice</code>.
	 */
	public BigDecimal getUnitprice() {
		return (BigDecimal) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Integer, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, String, Integer, BigDecimal> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, String, Integer, BigDecimal> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Lineitem.LINEITEM.ORDERID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Lineitem.LINEITEM.LINENUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Lineitem.LINEITEM.ITEMID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Lineitem.LINEITEM.QUANTITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return Lineitem.LINEITEM.UNITPRICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getOrderid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getLinenum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getItemid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getQuantity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getUnitprice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineitemRecord value1(Integer value) {
		setOrderid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineitemRecord value2(Integer value) {
		setLinenum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineitemRecord value3(String value) {
		setItemid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineitemRecord value4(Integer value) {
		setQuantity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineitemRecord value5(BigDecimal value) {
		setUnitprice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LineitemRecord values(Integer value1, Integer value2, String value3, Integer value4, BigDecimal value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached LineitemRecord
	 */
	public LineitemRecord() {
		super(Lineitem.LINEITEM);
	}

	/**
	 * Create a detached, initialised LineitemRecord
	 */
	public LineitemRecord(Integer orderid, Integer linenum, String itemid, Integer quantity, BigDecimal unitprice) {
		super(Lineitem.LINEITEM);

		setValue(0, orderid);
		setValue(1, linenum);
		setValue(2, itemid);
		setValue(3, quantity);
		setValue(4, unitprice);
	}
}
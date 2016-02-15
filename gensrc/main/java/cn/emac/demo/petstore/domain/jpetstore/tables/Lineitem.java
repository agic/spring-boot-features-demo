/**
 * This class is generated by jOOQ
 */
package cn.emac.demo.petstore.domain.jpetstore.tables;


import cn.emac.demo.petstore.domain.jpetstore.Jpetstore;
import cn.emac.demo.petstore.domain.jpetstore.Keys;
import cn.emac.demo.petstore.domain.jpetstore.tables.records.LineitemRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Lineitem extends TableImpl<LineitemRecord> {

	private static final long serialVersionUID = -789671693;

	/**
	 * The reference instance of <code>jpetstore.lineitem</code>
	 */
	public static final Lineitem LINEITEM = new Lineitem();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<LineitemRecord> getRecordType() {
		return LineitemRecord.class;
	}

	/**
	 * The column <code>jpetstore.lineitem.orderid</code>.
	 */
	public final TableField<LineitemRecord, Integer> ORDERID = createField("orderid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jpetstore.lineitem.linenum</code>.
	 */
	public final TableField<LineitemRecord, Integer> LINENUM = createField("linenum", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jpetstore.lineitem.itemid</code>.
	 */
	public final TableField<LineitemRecord, String> ITEMID = createField("itemid", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

	/**
	 * The column <code>jpetstore.lineitem.quantity</code>.
	 */
	public final TableField<LineitemRecord, Integer> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jpetstore.lineitem.unitprice</code>.
	 */
	public final TableField<LineitemRecord, BigDecimal> UNITPRICE = createField("unitprice", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this, "");

	/**
	 * Create a <code>jpetstore.lineitem</code> table reference
	 */
	public Lineitem() {
		this("lineitem", null);
	}

	/**
	 * Create an aliased <code>jpetstore.lineitem</code> table reference
	 */
	public Lineitem(String alias) {
		this(alias, LINEITEM);
	}

	private Lineitem(String alias, Table<LineitemRecord> aliased) {
		this(alias, aliased, null);
	}

	private Lineitem(String alias, Table<LineitemRecord> aliased, Field<?>[] parameters) {
		super(alias, Jpetstore.JPETSTORE, aliased, parameters, "Line Item");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<LineitemRecord> getPrimaryKey() {
		return Keys.KEY_LINEITEM_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<LineitemRecord>> getKeys() {
		return Arrays.<UniqueKey<LineitemRecord>>asList(Keys.KEY_LINEITEM_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Lineitem as(String alias) {
		return new Lineitem(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Lineitem rename(String name) {
		return new Lineitem(name, null);
	}
}
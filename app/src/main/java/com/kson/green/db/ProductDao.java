package com.kson.green.db;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import com.kson.green.entity.Product;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PRODUCT".
*/
public class ProductDao extends AbstractDao<Product, Long> {

    public static final String TABLENAME = "PRODUCT";

    /**
     * Properties of entity Product.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property BusinessId = new Property(1, Long.class, "businessId", false, "BUSINESS_ID");
        public final static Property CommodityId = new Property(2, String.class, "commodityId", false, "COMMODITY_ID");
        public final static Property Count = new Property(3, String.class, "count", false, "COUNT");
        public final static Property Pic = new Property(4, String.class, "pic", false, "PIC");
        public final static Property Price = new Property(5, String.class, "price", false, "PRICE");
        public final static Property CommodityName = new Property(6, String.class, "commodityName", false, "COMMODITY_NAME");
    }

    private Query<Product> cartEntity_ShoppingCartListQuery;

    public ProductDao(DaoConfig config) {
        super(config);
    }
    
    public ProductDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PRODUCT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"BUSINESS_ID\" INTEGER," + // 1: businessId
                "\"COMMODITY_ID\" TEXT," + // 2: commodityId
                "\"COUNT\" TEXT," + // 3: count
                "\"PIC\" TEXT," + // 4: pic
                "\"PRICE\" TEXT," + // 5: price
                "\"COMMODITY_NAME\" TEXT);"); // 6: commodityName
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PRODUCT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Product entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long businessId = entity.getBusinessId();
        if (businessId != null) {
            stmt.bindLong(2, businessId);
        }
 
        String commodityId = entity.getCommodityId();
        if (commodityId != null) {
            stmt.bindString(3, commodityId);
        }
 
        String count = entity.getCount();
        if (count != null) {
            stmt.bindString(4, count);
        }
 
        String pic = entity.getPic();
        if (pic != null) {
            stmt.bindString(5, pic);
        }
 
        String price = entity.getPrice();
        if (price != null) {
            stmt.bindString(6, price);
        }
 
        String commodityName = entity.getCommodityName();
        if (commodityName != null) {
            stmt.bindString(7, commodityName);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Product entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long businessId = entity.getBusinessId();
        if (businessId != null) {
            stmt.bindLong(2, businessId);
        }
 
        String commodityId = entity.getCommodityId();
        if (commodityId != null) {
            stmt.bindString(3, commodityId);
        }
 
        String count = entity.getCount();
        if (count != null) {
            stmt.bindString(4, count);
        }
 
        String pic = entity.getPic();
        if (pic != null) {
            stmt.bindString(5, pic);
        }
 
        String price = entity.getPrice();
        if (price != null) {
            stmt.bindString(6, price);
        }
 
        String commodityName = entity.getCommodityName();
        if (commodityName != null) {
            stmt.bindString(7, commodityName);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Product readEntity(Cursor cursor, int offset) {
        Product entity = new Product( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // businessId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // commodityId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // count
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // pic
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // price
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // commodityName
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Product entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBusinessId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setCommodityId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCount(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPic(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPrice(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCommodityName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Product entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Product entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Product entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "shoppingCartList" to-many relationship of CartEntity. */
    public List<Product> _queryCartEntity_ShoppingCartList(Long businessId) {
        synchronized (this) {
            if (cartEntity_ShoppingCartListQuery == null) {
                QueryBuilder<Product> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.BusinessId.eq(null));
                cartEntity_ShoppingCartListQuery = queryBuilder.build();
            }
        }
        Query<Product> query = cartEntity_ShoppingCartListQuery.forCurrentThread();
        query.setParameter(0, businessId);
        return query.list();
    }

}

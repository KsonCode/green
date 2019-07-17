package com.kson.green.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.kson.green.entity.CartEntity;
import com.kson.green.entity.Product;

import com.kson.green.db.CartEntityDao;
import com.kson.green.db.ProductDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig cartEntityDaoConfig;
    private final DaoConfig productDaoConfig;

    private final CartEntityDao cartEntityDao;
    private final ProductDao productDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        cartEntityDaoConfig = daoConfigMap.get(CartEntityDao.class).clone();
        cartEntityDaoConfig.initIdentityScope(type);

        productDaoConfig = daoConfigMap.get(ProductDao.class).clone();
        productDaoConfig.initIdentityScope(type);

        cartEntityDao = new CartEntityDao(cartEntityDaoConfig, this);
        productDao = new ProductDao(productDaoConfig, this);

        registerDao(CartEntity.class, cartEntityDao);
        registerDao(Product.class, productDao);
    }
    
    public void clear() {
        cartEntityDaoConfig.clearIdentityScope();
        productDaoConfig.clearIdentityScope();
    }

    public CartEntityDao getCartEntityDao() {
        return cartEntityDao;
    }

    public ProductDao getProductDao() {
        return productDao;
    }

}

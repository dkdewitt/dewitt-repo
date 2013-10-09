package com.stuffsystem.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER) //default
//@TransactionManagement(TransactionManagementType.BEAN) // to manage it here
public class InventoryServiceBean { 

    @PersistenceContext(unitName = "primary")
    private EntityManager em;

    // ctor
    public InventoryServiceBean() {
    }

    ///// Get the item details if you only have an item ID.
    //@TransactionAttribute(TransactionAttributeType.SUPPORTS)
    //public Item getBookDetails(Long itemId) {
    //    //Item item = em.find(Item.class, itemId);
    //    Query q = em.createQuery("select i from Item i where i.id = " + itemID);
    //    List<Item> results = q.getResultList();
    //    Item item = null;
    //    if(results != null && results.size() > 0) {
    //        item = results.get(0);
    //    }
    //    return item;
    //}
}


package com.stuffsystem.test;

import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.transaction.UserTransaction;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.stuffsystem.service.InventoryServiceBean;

@RunWith(Arquillian.class)
public class InventoryServiceBeanTest {

    @EJB
    private InventoryServiceBean bean;

    @PersistenceContext(unitName = "primary")
    private EntityManager em;

//    @Inject
//    private UserTransaction userTrans;

    @Inject
    private Logger log;

    @Deployment
    public static WebArchive createDeployment()
    {
        return ShrinkWrap.create(WebArchive.class, "test.war")
            .addClasses(
                // (non-ejb stuff)
                //com.stuffsystem.controller.MemberController.class,
                //com.stuffsystem.rest.JaxRsActivator.class,
                //com.stuffsystem.rest.MemberResourceRESTService.class,
                //com.stuffsystem.rest.InventoryRESTService.class,
                //com.stuffsystem.util.WebResources.class,

                //com.stuffsystem.data.MemberListProducer.class,
                //com.stuffsystem.data.MemberRepository.class,
                //com.stuffsystem.model.Member.class,
                //com.stuffsystem.service.MemberRegistration.class,
                com.stuffsystem.service.InventoryServiceBean.class,
                //com.stuffsystem.util.GenericMap.class,
                com.stuffsystem.util.Resources.class,
                com.stuffsystem.util.Defs.class,
                com.stuffsystem.util.pr.class,
                //com.stuffsystem.util.CommonUtil.class,

                // shouldn't need to add the test classes themselves.
                com.stuffsystem.test.InventoryServiceBeanTest.class
                //com.stuffsystem.test.MemberRegistrationTest.class
            )
            .addAsResource("META-INF/test-persistence.xml", "META-INF/persistence.xml")
            .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
            //.addAsManifestResource("META-INF/persistence.xml", "persistence.xml")
            //.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
            // Deploy our test datasource
            .addAsWebInfResource("test-ds.xml");
    }

    @Test
    public void testIsDeployed()
    {
        Assert.assertNotNull(bean);
    }

    @Before
    // todo duplicated amongst all tests - put in separate test bean
    public void init()
    {
        //TestHelper.initTestDB(em, actionBean);
    }

//   @Test 
//   public void testPersistence() throws Exception
//   {
//       // check that the item does not yet exist
//       {
//           Query q = 
//               em.createQuery("select t from Item t where t.description = '"+description+ "'");
//           List<Item> results = q.getResultList();
//           assertEquals(results.size(), 0);
//       }
//
//       // insert the item
//       Item item = new Item();
//       item.setDescription(description);
//
//       userTrans.begin();
//       try {
//           em.persist(item);
//           userTrans.commit();
//       } catch (Exception e) {
//           userTrans.rollback();
//           fail("already a item with description"+item.getDescription());
//       }
//
//       // check that the entity was persisted
//       {
//           Query q = 
//               em.createQuery("select t from Item t where t.description = '"+description+ "'");
//           List<Item> results = q.getResultList();
//           assertEquals(results.size(), 1);
//           assertEquals(results.get(0).getDescription(), item.getDescription());
//       }
//   }

//   @Test 
//   public void testGetItemDetails() throws Exception
//   {
//       // add isbn 6
//       testAddItem();
//
//       // must have found the item.  get the id.
//       Long id = actionBean.getIdForDescription(someDescription);
//       assertTrue(id >= 0);
//
//       // get the item details based on ID
//       assertTrue(id >= 0);
//       Item item = impl.getItemDetails(id);
//
//       // test the result
//       assertNotNull(item);
//       assertEquals(item.getDescription(), someDescription);
//       // etc.
//   }
}


package com.videovixx.data;

import junit.framework.Assert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.videovixx.model.Video;

@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback = false)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/spring-hibernate.xml")
public class AbstractHibernateRepoTest extends AbstractHibernateRepo<Video>{
	@Autowired 
	private static SessionFactory sessionFactory;
	
	private static Video video,video1;
	
	public AbstractHibernateRepoTest() 
	{
		super(Video.class);
	}
	
	@Before
	public static void setUp ()
	{
		video = new Video();
		video.setId("xyz");
		video.setName("Video Name");
		video.setSrc("Source");
		video.setThumbnail("Thumbnail");
		
		video1 = new Video ();
		video1.setId("xyz");
		video1.setName("Video Name");
		video.setSrc("Source");
		video.setThumbnail("Thumbnail");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(video);
		session.save(video1);
		session.getTransaction().commit();
	}
	
	
	@Test(expected = NullPointerException.class)
	@Transactional
	public void testNullPointExceptionSaveMethod ()
	{
		save(null);
	}
	
	@Test
	@Transactional
	@Rollback(true)
	public void testSaveMethod ()
	{	
		Video video = new Video();
		video.setId("1234");
		video.setName("Video Name");
		video.setSrc("Source");
		video.setThumbnail("Thumbnail");
		
		String id = (String) save(video);
		Assert.assertEquals(video.getId(), id);
	}
	
	@Test(expected = NullPointerException.class)
	@Transactional
	public void testNullPointExceptionfindByIdMethod() 
	{
		findById(null);
	}
	
	@Test
	@Transactional
	public void testFindByIdMethod ()
	{
		Video result = findById(video.getId());
		Assert.assertEquals(video, result);
	}
	
	@Test(expected = NullPointerException.class)
	@Transactional
	public void testNullPointExceptionDeleteMethod ()
	{
		delete(null);
	}
	
	@Test
	@Transactional
	public void testDeleteMethod ()
	{
		delete(video1);
		Video video = (Video) sessionFactory.getCurrentSession().get(Video.class, video1.getId());
		Assert.assertNull(video);
	}
	
	@Test(expected = NullPointerException.class)
	@Transactional
	public void testNullPointExceptionUpdateMethod ()
	{
		update(null);
	}
	
	@Test
	@Transactional
	public void testUpdateMethod ()
	{
		video.setName("New Video Name");
		update(video);
		
		Video result = (Video) sessionFactory.getCurrentSession().get(Video.class,video.getId());
		Assert.assertEquals(video.getName(), result.getName());
	}
}

package linklike



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Link)
class LinkTests {
	
	@Before
	void setup(){
		
	}

    @Test
	void testCreateLink() {
       def link = new Link(title:'Test link',url:'www.google.com',vote:0)
	   
	   assert link.title == 'Test link'
	   assert link.url == 'www.google.com'
	   assert link.vote == 0
    }
	
	@Test
	void testVoteLink(){
		def link = new Link(title:'Test vote',url:'www.google.com',vote:0)
		
		link.voteLink();
		
		assert link.vote == 1
	}

	
}

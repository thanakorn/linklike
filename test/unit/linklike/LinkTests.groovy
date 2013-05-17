package linklike

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Link)
class LinkTests {
	
	private Link link
	
	@Before
	void setup(){
		link = new Link(title:'Test link',url:'www.google.com',vote:0)
	}

    @Test
	void testCreateLink() {
	   assert link.title == 'Test link'
	   assert link.url == 'www.google.com'
	   assert link.vote == 0
    }
	
	@Test
	void testVoteLink(){
		link.voteLink();
		assert link.vote == 1
	}
	
	@Test
	void testConsecutiveVote(){
		link.voteLink()
		link.voteLink()
		assert link.vote == 2
		link.voteLink()
		assert link.vote == 3
	}
	
}

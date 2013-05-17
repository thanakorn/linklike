package linklike



import grails.test.mixin.*
import org.junit.*
import grails.test.mixin.domain.DomainClassUnitTestMixin

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(LinkController)
@TestMixin(DomainClassUnitTestMixin)
@Mock([Link])
class LinkControllerTests {

    void testCreateLink(){
		params.title = "Create"
		params.url = "www.google.com"
		
		controller.create()
		
		assert Link.count == 1
	}
	
	void testVoteLink(){
		def link = new Link(title:'Test vote',url:'www.google.com',vote:0)
		link.save()
		params.id = '1'
		controller.vote()
		assert Link.findById(1).vote == 1
	}
	
}

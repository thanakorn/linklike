package linklike

class LinkController {

    def index() { 
        def links = Link.findAll()
        [ links: links ]
    }

    def create() {
        def link = new Link(title: params.title, url: params.url, vote: 0)
        link.save()
        redirect(action: "index")
    }
	
	def vote(){
		def link = Link.findById(params.id)
		link.voteLink()
		link.save()
		redirect(action: "index")
	}
}

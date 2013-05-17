package linklike

class Link {
	
    String title
    String url
	Integer vote
    
    static constraints = {
    }
	
	void voteLink(){
		this.vote++
	}
}

package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String array[]= {"bi+ch","biatch","big black","big breasts","big knockers","big tits","bigtits","bimbo","bimbos","bint",
			"birdlock","bitch","bitch tit","bitchass","bitched","bitcher","bitchers","bitches","bitching","bitchin","bitchtits" ,
			
					"bitchy","bloodclaat","bloody","blow me"};

	public boolean checkBlog(Blog blog) {
		
		if((checkBlogTitle(blog))||(checkBlogDescription(blog))) {
			return false;
		}
		return true;
	}
	
	public boolean checkBlogTitle(Blog blog) {
		
		 String title=blog.getBlogTitle();
		 for(int i=0;i<array.length;i++) {
			 if(title.equalsIgnoreCase(array[i])) {
				 return true;
				 
			 }
		}
		return false;
	}


	public boolean checkBlogDescription(Blog blog) {
		
		String description=blog.getBlogDescription();
		for(int i=0;i<array.length;i++)
			{
			if(description.equalsIgnoreCase(array[i]))
				return true;
		}
	     return false;
	}


	
	
	
	
}
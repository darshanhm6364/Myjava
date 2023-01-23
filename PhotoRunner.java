class PhotoRunner{
   public static void main(String[] args){
   
   
   
      System.out.println("photo method started");
   System.out.println(Photo.size);
   System.out.println(Photo.pixel);
   System.out.println(Photo.coloured);
   System.out.println(Photo.type);
   System.out.println(Photo.clear);
   System.out.println("photo method ended");
   
     Photo.size=85;
	 Photo.pixel=70.00;
	 Photo.coloured="pink";
	 Photo.type="stamp";
	 Photo.clear="cleared photo";
	 
	 
	 System.out.println("size of the photo "+Photo.size);
	 System.out.println("pixel of the photo"+Photo.pixel);
	 System.out.println("colered of the photo "+Photo.coloured);
	 System.out.println("type of the photo "+Photo.type);
	 System.out.println("clear of the photo "+Photo.clear);
   
   }


}
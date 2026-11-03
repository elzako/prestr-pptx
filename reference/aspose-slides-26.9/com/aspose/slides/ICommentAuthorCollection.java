package com.aspose.slides;

public interface ICommentAuthorCollection extends IGenericCollection<ICommentAuthor> {
   ICommentAuthor get_Item(int var1);

   ICommentAuthor addAuthor(String var1, String var2);

   ICommentAuthor[] toArray();

   ICommentAuthor[] findByName(String var1);

   ICommentAuthor[] findByNameAndInitials(String var1, String var2);

   void removeAt(int var1);

   void remove(ICommentAuthor var1);

   void clear();
}

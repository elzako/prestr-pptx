package com.aspose.slides;

import java.awt.geom.Point2D.Float;
import java.util.Date;

public interface ICommentCollection extends IGenericCollection<IComment> {
   IComment get_Item(int var1);

   IComment addComment(String var1, ISlide var2, Float var3, Date var4);

   IModernComment addModernComment(String var1, ISlide var2, IShape var3, Float var4, Date var5);

   IComment insertComment(int var1, String var2, ISlide var3, Float var4, Date var5);

   IModernComment insertModernComment(int var1, String var2, ISlide var3, IShape var4, Float var5, Date var6);

   IComment[] toArray();

   IComment[] toArray(int var1, int var2);

   void removeAt(int var1);

   void remove(IComment var1);

   void clear();
}

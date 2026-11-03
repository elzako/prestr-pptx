package com.aspose.slides;

import java.awt.geom.Point2D.Float;
import java.util.Date;

public interface IComment {
   String getText();

   void setText(String var1);

   Date getCreatedTime();

   void setCreatedTime(Date var1);

   ISlide getSlide();

   ICommentAuthor getAuthor();

   Float getPosition();

   void setPosition(Float var1);

   void remove();

   IComment getParentComment();

   void setParentComment(IComment var1);
}

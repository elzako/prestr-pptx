package com.aspose.slides;

public interface IModernComment extends IComment {
   IShape getShape();

   int getTextSelectionStart();

   void setTextSelectionStart(int var1);

   int getTextSelectionLength();

   void setTextSelectionLength(int var1);

   byte getStatus();

   void setStatus(byte var1);
}

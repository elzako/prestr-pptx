package com.aspose.slides;

public interface ICommandEffect extends IBehavior {
   byte getType();

   void setType(byte var1);

   String getCommandString();

   void setCommandString(String var1);

   IShape getShapeTarget();

   void setShapeTarget(IShape var1);
}

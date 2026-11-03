package com.aspose.slides;

public interface IMathBox extends IMathElement {
   IMathElement getBase();

   boolean getOperatorEmulator();

   void setOperatorEmulator(boolean var1);

   boolean getNoBreak();

   void setNoBreak(boolean var1);

   boolean getDifferential();

   void setDifferential(boolean var1);

   boolean getAlignmentPoint();

   void setAlignmentPoint(boolean var1);

   byte getExplicitBreak();

   void setExplicitBreak(byte var1);
}

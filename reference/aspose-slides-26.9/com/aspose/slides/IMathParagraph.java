package com.aspose.slides;

import java.io.OutputStream;

public interface IMathParagraph extends IMathBlockCollection {
   int getJustification();

   void setJustification(int var1);

   void writeAsMathMl(OutputStream var1);

   String toLatex();
}

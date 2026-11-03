package com.aspose.slides;

import java.io.OutputStream;

public interface IMathBlock extends IMathElement, IMathElementCollection {
   IMathDelimiter delimit(char var1);

   IMathDelimiter enclose(char var1, char var2, char var3);

   IMathBlock joinBlock(IMathBlock var1);

   void writeAsMathMl(OutputStream var1);
}

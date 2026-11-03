package com.aspose.slides;

public interface IMathDelimiter extends IMathElement {
   IMathElementCollection getArguments();

   char getBeginningCharacter();

   void setBeginningCharacter(char var1);

   char getSeparatorCharacter();

   void setSeparatorCharacter(char var1);

   char getEndingCharacter();

   void setEndingCharacter(char var1);

   boolean getGrowToMatchOperandHeight();

   void setGrowToMatchOperandHeight(boolean var1);

   int getDelimiterShape();

   void setDelimiterShape(int var1);

   IMathDelimiter delimit(char var1);
}

package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.exceptions.ArgumentNullException;

public final class MathDelimiter extends MathElementBase implements IMathDelimiter, q8r {
   private char u3;
   private char a6;
   private char u9;
   private boolean h0;
   private int c8;
   private IMathElementCollection t2;
   final s7u n5;

   @Override
   public final IMathElementCollection getArguments() {
      return this.t2;
   }

   @Override
   public final char getBeginningCharacter() {
      return this.u3;
   }

   @Override
   public final void setBeginningCharacter(char value) {
      this.u3 = value;
   }

   @Override
   public final char getSeparatorCharacter() {
      return this.a6;
   }

   @Override
   public final void setSeparatorCharacter(char value) {
      this.a6 = value;
   }

   @Override
   public final char getEndingCharacter() {
      return this.u9;
   }

   @Override
   public final void setEndingCharacter(char value) {
      this.u9 = value;
   }

   @Override
   public final boolean getGrowToMatchOperandHeight() {
      return this.h0;
   }

   @Override
   public final void setGrowToMatchOperandHeight(boolean value) {
      this.h0 = value;
   }

   @Override
   public final int getDelimiterShape() {
      return this.c8;
   }

   @Override
   public final void setDelimiterShape(int value) {
      this.c8 = value;
   }

   public MathDelimiter(IMathElement element) {
      this();
      if (element != null && ((MathElementBase)element).Y_()) {
         this.t2 = new o3q((IGenericEnumerable<IMathElement>)element);
      } else {
         this.t2 = new o3q();
         this.t2.add(element);
      }
   }

   MathDelimiter(IGenericEnumerable<IMathElement> mathElements, Object dummy) {
      this();
      if (mathElements == null) {
         throw new ArgumentNullException("mathElements");
      }

      this.t2 = new o3q(mathElements);
   }

   private MathDelimiter() {
      this.setBeginningCharacter('(');
      this.setSeparatorCharacter('|');
      this.setEndingCharacter(')');
      this.setGrowToMatchOperandHeight(true);
      this.setDelimiterShape(0);
      this.n5 = new s7u();
   }

   @Override
   public final IMathDelimiter delimit(char separatorCharacter) {
      this.setSeparatorCharacter(separatorCharacter);
      return this;
   }

   @Override
   public IMathDelimiter enclose(char beginningCharacter, char endingCharacter) {
      if (this.getBeginningCharacter() == 0 && this.getEndingCharacter() == 0) {
         this.setBeginningCharacter(beginningCharacter);
         this.setEndingCharacter(endingCharacter);
         return this;
      } else {
         return super.enclose(beginningCharacter, endingCharacter);
      }
   }

   @Override
   public final IMathElement[] getChildren() {
      if (this.getArguments().getCount() == 0) {
         return k5;
      }

      IMathElement[] var1 = new IMathElement[this.getArguments().getCount()];
      this.getArguments().copyTo(var1, 0);
      return var1;
   }

   final boolean l6() {
      return this.getBeginningCharacter() == '('
         && this.getSeparatorCharacter() == '|'
         && this.getEndingCharacter() == ')'
         && this.getGrowToMatchOperandHeight()
         && this.getDelimiterShape() == 0
         && this.n5.n5();
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }

   @Override
   public final s7u getControlCharacterProperties() {
      return this.n5;
   }
}

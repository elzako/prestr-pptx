package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class MathematicalText extends MathElementBase implements IMathematicalText {
   private z4a n5 = new z4a();
   private final PortionFormat u3;
   private String a6;

   @Override
   public final String getValue() {
      return this.a6;
   }

   @Override
   public final void setValue(String value) {
      this.a6 = value;
   }

   @Override
   public final IPortionFormat getFormat() {
      return this.u3;
   }

   @Override
   public final IMathElement[] getChildren() {
      return k5;
   }

   static int n5(IPortionFormat var0) {
      if (var0 == null) {
         return 0;
      } else if (var0.getFontBold() == 1 && var0.getFontItalic() == 1) {
         return 4;
      } else if (var0.getFontBold() == 1) {
         return 2;
      } else {
         return var0.getFontItalic() == 1 ? 3 : 1;
      }
   }

   public MathematicalText() {
      this(com.aspose.slides.ms.System.d1.n5);
   }

   public MathematicalText(char mathSymbol) {
      this(com.aspose.slides.ms.System.d1.n5(mathSymbol, 1));
   }

   public MathematicalText(String mathText) {
      if (mathText == null) {
         throw new ArgumentNullException("mathText");
      }

      this.a6 = mathText;
      this.u3 = new PortionFormat();
   }

   public MathematicalText(String mathText, IPortionFormat portionFormat) {
      if (mathText == null) {
         throw new ArgumentNullException("mathText");
      }

      if (portionFormat == null) {
         throw new ArgumentNullException("portionFormat");
      }

      this.u3 = (PortionFormat)portionFormat;
      this.a6 = mathText;
   }

   final z4a l6() {
      return this.n5;
   }

   final void n5(z4a var1) {
      this.n5 = var1;
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }
}

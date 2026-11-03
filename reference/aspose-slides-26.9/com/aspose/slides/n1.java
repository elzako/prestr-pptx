package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;

class n1 implements y9i {
   private static final IGenericDictionary<Integer, String> n5 = new Dictionary<>();
   private final int l6;
   private final y9i k5;

   public final int n5() {
      return this.l6;
   }

   public final y9i l6() {
      return this.k5;
   }

   public n1(int var1, y9i var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   @Override
   public final x5r n5(t8 var1) {
      x5r var2 = this.l6().n5(var1).u3();
      double var3 = var2.k5(var1);
      switch (this.n5()) {
         case 1:
            return new x5r(-var3);
         case 5:
            return new x5r(var3 / 100.0);
         default:
            String var5 = "Unknown unary operator '{0}' is encountered.";
            throw new CellUnsupportedDataException(
               com.aspose.slides.ms.System.d1.n5(
                  "Unknown unary operator '{0}' is encountered.", new Object[]{com.aspose.slides.ms.System.s3.n5(j3.class, this.n5())}
               )
            );
      }
   }

   @Override
   public final String n5(y9w var1) {
      String var2 = n5.get_Item(this.n5());
      return com.aspose.slides.ms.System.d1.n5(this.k5(),new Object[]{ var2, this.l6().n5(var1)});
   }

   @Override
   public String toString() {
      String var1 = n5.get_Item(this.n5());
      return com.aspose.slides.ms.System.d1.n5(this.k5(),new Object[]{ var1, this.l6()});
   }

   private String k5() {
      switch (this.n5()) {
         case 1:
            return "{0}{1}";
         case 5:
            return "{1}{0}";
         default:
            String var1 = "Unknown unary operator '{0}' is encountered.";
            throw new CellUnsupportedDataException(
               com.aspose.slides.ms.System.d1.n5(
                  "Unknown unary operator '{0}' is encountered.", new Object[]{com.aspose.slides.ms.System.s3.n5(j3.class, this.n5())}
               )
            );
      }
   }

   static {
      n5.addItem(1, "-");
      n5.addItem(5, "%");
   }
}

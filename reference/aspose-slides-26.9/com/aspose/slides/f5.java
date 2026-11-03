package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;

class f5 implements y9i {
   private static final IGenericDictionary<Integer, String> n5 = new Dictionary<>();
   private final int l6;
   private final y9i k5;
   private final y9i u3;

   public final int n5() {
      return this.l6;
   }

   public final y9i l6() {
      return this.k5;
   }

   public final y9i k5() {
      return this.u3;
   }

   public f5(int var1, y9i var2, y9i var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
   }

   @Override
   public final x5r n5(t8 var1) {
      x5r var2 = this.l6().n5(var1).u3();
      double var3 = var2.k5(var1);
      x5r var5 = this.k5().n5(var1).u3();
      double var6 = var5.k5(var1);
      switch (this.n5()) {
         case 0:
            return new x5r(var3 + var6);
         case 1:
            return new x5r(var3 - var6);
         case 2:
            return new x5r(var3 * var6);
         case 3:
            if (var6 == 0.0) {
               throw new c1h("#DIV/0!");
            }

            return new x5r(var3 / var6);
         case 4:
            if (var3 == 0.0 && var6 == 0.0) {
               throw new c1h("#NUM!");
            }

            return new x5r(com.aspose.slides.ms.System.q1.a6(var3, var6));
         default:
            String var8 = "Unknown binary operator '{0}' is encountered.";
            throw new CellUnsupportedDataException(
               com.aspose.slides.ms.System.d1.n5(
                  "Unknown binary operator '{0}' is encountered.", new Object[]{com.aspose.slides.ms.System.s3.n5(j3.class, this.n5())}
               )
            );
      }
   }

   @Override
   public final String n5(y9w var1) {
      return com.aspose.slides.ms.System.d1.n5("{0} {1} {2}",new Object[]{ this.l6().n5(var1), n5.get_Item(this.n5()), this.k5().n5(var1)});
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("{0} {1} {2}",new Object[]{ this.l6(), n5.get_Item(this.n5()), this.k5()});
   }

   static {
      n5.addItem(0, "+");
      n5.addItem(1, "-");
      n5.addItem(2, "*");
      n5.addItem(3, "/");
      n5.addItem(4, "^");
   }
}

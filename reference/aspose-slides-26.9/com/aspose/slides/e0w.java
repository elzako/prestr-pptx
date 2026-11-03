package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.InvalidOperationException;

class e0w implements y9i {
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

   public e0w(int var1, y9i var2, y9i var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
   }

   @Override
   public final x5r n5(t8 var1) {
      x5r var2 = this.l6().n5(var1).u3();
      x5r var3 = this.k5().n5(var1).u3();
      y7q var4 = new y7q(var1);
      x5r var5 = var4.n5(var2.u3(), var3.u3()).u3();
      if (var5.l6() != 1) {
         String var6 = "A comparison operation is failed for operands: '{0}', '{1}'.";
         throw new InvalidOperationException(com.aspose.slides.ms.System.d1.n5(var6,new Object[]{ var2.n5().toString(), var3.n5().toString()}));
      }

      double var7 = com.aspose.slides.internal.v6g.k5.u3(var5.n5(), double.class);
      boolean var9 = false;
      switch (this.n5()) {
         case 0:
            var9 = var7 == 0.0;
            break;
         case 1:
            var9 = var7 != 0.0;
            break;
         case 2:
            var9 = var7 < 0.0;
            break;
         case 3:
            var9 = var7 < 1.0;
            break;
         case 4:
            var9 = var7 > 0.0;
            break;
         case 5:
            var9 = var7 > -1.0;
            break;
         default:
            String var10 = "Unknown comparison operator '{0}' is encountered.";
            throw new CellUnsupportedDataException(
               com.aspose.slides.ms.System.d1.n5(
                  "Unknown comparison operator '{0}' is encountered.", new Object[]{com.aspose.slides.ms.System.s3.n5(d3c.class, this.n5())}
               )
            );
      }

      return new x5r(var9);
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
      n5.addItem(0, "=");
      n5.addItem(1, "<>");
      n5.addItem(2, "<");
      n5.addItem(3, "<=");
      n5.addItem(4, ">");
      n5.addItem(5, ">=");
   }
}

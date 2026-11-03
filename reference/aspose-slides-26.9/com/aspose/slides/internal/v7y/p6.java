package com.aspose.slides.internal.v7y;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import java.util.Comparator;

public final class p6 implements Comparator {
   private int n5;
   private int l6;
   private com.aspose.slides.internal.x7n.l6 k5;
   private int u3;

   public p6(int var1, int var2, String var3, int var4) {
      if (var3 == null) {
         this.k5 = com.aspose.slides.internal.r5t.t2.n5().u9();
      } else {
         try {
            this.k5 = new com.aspose.slides.internal.x7n.l6(var3);
         } catch (ArgumentException var6) {
            throw var6;
         }
      }

      if (var1 == 2) {
         if (var2 == 2) {
            var2 = 1;
         } else if (var2 == 1) {
            var2 = 2;
         }
      }

      this.n5 = var1;
      this.l6 = var2;
      this.u3 = var4;
   }

   @Override
   public final int compare(Object x, Object y) {
      switch (this.u3) {
         case 1:
            String var3 = com.aspose.slides.ms.System.z3.t9(x, this.k5);
            String var4 = com.aspose.slides.ms.System.z3.t9(y, this.k5);
            int var10 = com.aspose.slides.ms.System.d1.n5(var3, var4, this.l6 != 0, this.k5);
            if (var10 == 0 && this.l6 != 0) {
               var10 = com.aspose.slides.ms.System.d1.n5(var3, var4, false, this.k5);
               return this.l6 == 2 ? var10 : -var10;
            }

            return this.n5 == 1 ? var10 : -var10;
         case 2:
            double var6 = com.aspose.slides.ms.System.Xml.f4.n5(x);
            double var8 = com.aspose.slides.ms.System.Xml.f4.n5(y);
            int var5 = com.aspose.slides.ms.System.d2.n5(var6, var8);
            return this.n5 == 1 ? var5 : -var5;
         default:
            throw new InvalidOperationException(com.aspose.slides.ms.System.Xml.v3.n5("Operation is not valid due to the current state of the object."));
      }
   }
}

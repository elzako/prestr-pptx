package com.aspose.slides.internal.t4;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.h0.h0;
import com.aspose.slides.internal.k7.k5;
import com.aspose.slides.internal.k7.n3;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.q0.e2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class l6 extends n5 {
   private final int n5;
   private final k5 l6;
   private final IGenericList<n3> k5;

   public l6(int var1, k5 var2, IGenericList<n3> var3) {
      super((byte)1);
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public final int n5() {
      return this.n5;
   }

   public final k5 l6() {
      return this.l6;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("linear-gradient(");
      String var2 = d1.n5;
      switch (this.n5()) {
         case 0:
            var2 = "tl";
            break;
         case 1:
            var2 = "tr";
            break;
         case 2:
            var2 = "bl";
            break;
         case 3:
            var2 = "br";
            break;
         case 4:
            if (this.l6() != null) {
               float var3 = 0.0F;
               switch (this.l6().h0().n5()) {
                  case 10:
                     var3 = this.l6().h0().l6();
                     break;
                  case 11:
                     var3 = (float)(this.l6().h0().l6() * 180.0 / Math.PI);
                     break;
                  case 12:
                     var3 = (float)(this.l6().h0().l6() / 0.9);
               }

               var2 = n1.n5(var3, h0.n5);
            }
      }

      var1.n5(var2);
      IGenericEnumerator var8 = this.k5.iterator();

      try {
         while (var8.hasNext()) {
            n3 var4 = (n3)var8.next();
            var1.n5(", #{0}",new Object[]{ a3.n5(var4.h0().h0(), "X4")});
            if (var4.c8() != null && var4.c8().n5() == 1) {
               var1.n5(e2.n5, " {0}",new Object[]{ n1.n5(var4.c8().l6() / 100.0F, h0.n5)});
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      var1.n5(")");
      return var1.toString();
   }
}

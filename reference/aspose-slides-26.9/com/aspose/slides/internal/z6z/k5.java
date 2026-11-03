package com.aspose.slides.internal.z6z;

import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.g7.d3;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class k5 extends u3 {
   private final com.aspose.slides.internal.l2.u3 n5;
   private com.aspose.slides.internal.l2.u9 l6;
   private n3 k5;

   public k5(com.aspose.slides.internal.l2.u3 var1) {
      super("/Resources");
      this.n5 = var1;
   }

   @Override
   public String n5(i1 var1) {
      String var2 = super.n5(var1);
      this.l6.u9().n5("http://schemas.microsoft.com/xps/2005/06/required-resource", var2, false);
      return var2;
   }

   @Override
   public s7 n5(byte[] var1, com.aspose.slides.internal.s5.c8 var2) {
      s7 var3 = super.n5(var1, var2);
      this.l6.u9().n5("http://schemas.microsoft.com/xps/2005/06/required-resource", var3.n5(), false);
      return var3;
   }

   @Override
   public void n5() {
      for (KeyValuePair var2 : this.a6()) {
         this.n5.l6().n5(com.aspose.slides.internal.z6z.t2.n5((d3)var2.getValue(), (String)var2.getKey()));
      }

      Dictionary$ValueCollection$Enumerator var7 = this.h0().getValues().iterator();

      try {
         while (var7.hasNext()) {
            s7 var8 = (s7)var7.next();
            com.aspose.slides.internal.l2.u9 var3 = n5(var8);
            this.n5.l6().n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }
   }

   public final void n5(int var1) {
      com.aspose.slides.internal.l2.u9 var2 = new com.aspose.slides.internal.l2.u9(
         d1.n5("/Documents/1/Pages/{0}.fpage", new Object[]{var1}), "application/vnd.ms-package.xps-fixedpage+xml"
      );
      this.n5.l6().n5(var2);
      this.l6 = var2;
   }

   private static com.aspose.slides.internal.l2.u9 n5(s7 var0) {
      int var1 = com.aspose.slides.internal.k4d.a6.l6(var0.k5());
      com.aspose.slides.internal.l2.u9 var2 = new com.aspose.slides.internal.l2.u9(var0.n5(), l6(var1));
      var2.u3().write(var0.k5(), 0, var0.k5().length);
      return var2;
   }

   private static String l6(int var0) {
      switch (var0) {
         case 4:
            return "image/jpeg";
         case 5:
            return "image/png";
         case 6:
         case 7:
         default:
            throw new InvalidOperationException("Unexpected image type.");
         case 8:
            return "image/tiff";
      }
   }

   public final com.aspose.slides.internal.l2.u9 l6() {
      return this.l6;
   }

   public final n3 k5() {
      return this.k5;
   }

   public final void n5(n3 var1) {
      this.k5 = var1;
   }
}

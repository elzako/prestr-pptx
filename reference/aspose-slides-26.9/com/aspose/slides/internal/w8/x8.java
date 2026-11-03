package com.aspose.slides.internal.w8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class x8 extends s7 {
   private com.aspose.slides.internal.j3.j5 n5;

   public x8(com.aspose.slides.internal.j3.j5 var1) {
      this.n5 = var1;
   }

   @Override
   public int n5() {
      return this.n5.n5();
   }

   @Override
   public IGenericEnumerator<com.aspose.slides.internal.j3.z8> iterator() {
      return this.n5.iterator();
   }

   @Override
   public com.aspose.slides.internal.f5.r4 n5(String var1) {
      return n5(var1, this.n5);
   }

   public static com.aspose.slides.internal.f5.r4 n5(String var0, com.aspose.slides.internal.j3.j5 var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.j3.z8 var3 = (com.aspose.slides.internal.j3.z8)var2.next();
            com.aspose.slides.internal.j3.k5 var4 = var3.A_().l6("ID");
            if (var4 != null && var4.k5() != null && d1.u3(var4.k5(), var0, (short)5)) {
               return (com.aspose.slides.internal.f5.r4)var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var14 = var1.iterator();

      try {
         while (var14.hasNext()) {
            com.aspose.slides.internal.j3.z8 var15 = (com.aspose.slides.internal.j3.z8)var14.next();
            com.aspose.slides.internal.j3.k5 var5 = var15.A_().l6("NAME");
            if (var5 != null && var5.k5() != null && d1.u3(var5.k5(), var0, (short)5)) {
               return (com.aspose.slides.internal.f5.r4)var15;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      return null;
   }

   @Override
   public com.aspose.slides.internal.j3.z8 n5(int var1) {
      return this.n5.n5(var1);
   }
}

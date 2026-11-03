package com.aspose.slides.internal.w8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class v3 extends s7 {
   private final com.aspose.slides.internal.j3.j5 n5;

   public v3(v8 var1, com.aspose.slides.internal.j3.j5 var2) {
      this.n5 = var2;
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
      return n5(this.n5, var1);
   }

   public static com.aspose.slides.internal.f5.r4 n5(com.aspose.slides.internal.j3.j5 var0, String var1) {
      if (var0 == null) {
         return null;
      }

      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            w2 var3 = (w2)var2.next();
            String var4 = var3.u3("ID");
            if (var4 != null && d1.u3(var4, var1, (short)5)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var14 = var0.iterator();

      try {
         while (var14.hasNext()) {
            w2 var15 = (w2)var14.next();
            String var5 = var15.u3("NAME");
            if (var5 != null && d1.u3(var5, var1, (short)5)) {
               return var15;
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

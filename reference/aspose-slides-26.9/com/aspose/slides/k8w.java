package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

class k8w implements IDisposable {
   private final com.aspose.slides.internal.e5a.d2 n5;
   private final com.aspose.slides.internal.z0k.e2[] l6;
   private final List<com.aspose.slides.internal.z0k.m3> k5;
   private final int u3;
   private final int a6;

   public k8w(com.aspose.slides.internal.e5a.d2 var1, int var2, int var3) {
      if (var3 <= var2) {
         throw new ArgumentException();
      }

      this.n5 = var1;
      this.u3 = var2;
      this.a6 = var3;
      int var4 = var3 - var2;
      this.l6 = new com.aspose.slides.internal.z0k.e2[var4];
      this.k5 = new List<>(var4);
      this.k5();
   }

   private void k5() {
      for (int var1 = 0; var1 < this.l6.length; var1++) {
         this.l6[var1] = new com.aspose.slides.internal.z0k.e2();
      }
   }

   public final com.aspose.slides.internal.e5a.d2 n5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.z0k.e2 n5(int var1) {
      return this.l6[var1 - this.u3];
   }

   public final List<com.aspose.slides.internal.z0k.m3> l6() {
      return this.k5;
   }

   @Override
   public final void dispose() {
      for (com.aspose.slides.internal.z0k.e2 var4 : this.l6) {
         var4.dispose();
      }

      List$Enumerator var8 = this.k5.iterator();

      try {
         while (var8.hasNext()) {
            com.aspose.slides.internal.z0k.m3 var9 = (com.aspose.slides.internal.z0k.m3)var8.next();
            var9.dispose();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      this.n5.dispose();
   }
}

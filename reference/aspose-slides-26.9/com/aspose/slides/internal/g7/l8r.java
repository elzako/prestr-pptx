package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class l8r extends c5q {
   private List<p6w> l6 = new List<>();
   private List<p6w> k5 = new List<>();
   private List<p6w> u3 = new List<>();
   private List<y9r> a6 = new List<>();

   public l8r(long var1, int var3) {
      super(var1, var3);
   }

   @Override
   public void n5(f3c var1) {
      if (var1.n5() != ((this.n5 & 4294967295L) + 2L & 4294967295L)) {
         var1.n5((this.n5 & 4294967295L) + 2L & 4294967295L);
      }

      List var2 = l6(var1);
      List var3 = l6(var1);
      List var4 = l6(var1);
      int var5 = var1.n3() & 65535;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = var1.n3();
         int var8 = var1.n3();
         this.a6.addItem(new y9r(var7, var8));
      }

      List$Enumerator var24 = var2.iterator();

      try {
         while (var24.hasNext()) {
            int var25 = com.aspose.slides.internal.v6g.k5.u3(var24.next(), int.class);
            p6w var27 = new p6w(this.n5 & 4294967295L, var25 & 65535);
            n5(var27, var1);
            this.l6.addItem(var27);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
            var24.dispose();
         }
      }

      List$Enumerator var26 = var3.iterator();

      try {
         while (var26.hasNext()) {
            int var28 = com.aspose.slides.internal.v6g.k5.u3(var26.next(), int.class);
            p6w var9 = new p6w(this.n5 & 4294967295L, var28 & 65535);
            n5(var9, var1);
            this.k5.addItem(var9);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
            var26.dispose();
         }
      }

      List$Enumerator var29 = var4.iterator();

      try {
         while (var29.hasNext()) {
            int var30 = com.aspose.slides.internal.v6g.k5.u3(var29.next(), int.class);
            p6w var10 = new p6w(this.n5 & 4294967295L, var30 & 65535);
            n5(var10, var1);
            this.u3.addItem(var10);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var29, IDisposable.class)) {
            var29.dispose();
         }
      }
   }
}

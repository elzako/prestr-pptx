package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public final class u6 implements k7 {
   private List<u6$n5> n5 = new List<>();
   private u6$n5 l6;
   private int k5;

   public u6(com.aspose.slides.internal.o9b.l6 var1, int var2) {
      this(var1, var2, 32);
   }

   public u6(com.aspose.slides.internal.o9b.l6 var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("texture");
      }

      this.k5 = var2;
      u6$n5 var4 = new u6$n5(var1);
      this.n5.addItem(var4);
      this.l6 = var4;
      if (var3 > 0) {
         this.n5();
      }
   }

   @Override
   public final void beginRender() {
      if (this.n5 != null && this.n5.size() != 0) {
         List$Enumerator var1 = this.n5.iterator();

         try {
            while (var1.hasNext()) {
               u6$n5 var2 = (u6$n5)var1.next();
               var2.n5();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      } else {
         throw new NullReferenceException("texture");
      }
   }

   @Override
   public final void endRender() {
      if (this.n5 != null && this.n5.size() != 0) {
         List$Enumerator var1 = this.n5.iterator();

         try {
            while (var1.hasNext()) {
               u6$n5 var2 = (u6$n5)var1.next();
               var2.n5((byte[])null);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      } else {
         throw new NullReferenceException("texture");
      }
   }

   @Override
   public final void getPixel(float u, float v, g7[] color) {
      int var4 = this.l6.l6().e2();
      int var5 = this.l6.l6().h0();
      switch (this.k5) {
         case 0:
         default:
            u = u < 0.0F ? u % 1.0F + 1.0F : u % 1.0F;
            v = v < 0.0F ? v % 1.0F + 1.0F : v % 1.0F;
            break;
         case 1:
            u = u < 0.0F
               ? (com.aspose.slides.internal.v6g.k5.u3(u, 13) % 2 == 0 ? -u % 1.0F : 1.0F + u % 1.0F)
               : (com.aspose.slides.internal.v6g.k5.u3(u, 13) % 2 == 0 ? u % 1.0F : 1.0F - u % 1.0F);
            v = v < 0.0F
               ? (com.aspose.slides.internal.v6g.k5.u3(v, 13) % 2 == 0 ? -v % 1.0F : 1.0F + v % 1.0F)
               : (com.aspose.slides.internal.v6g.k5.u3(v, 13) % 2 == 0 ? v % 1.0F : 1.0F - v % 1.0F);
            break;
         case 2:
            u = u < 0.0F ? 0.0F : (u > 1.0F ? 1.0F : u);
            v = v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
      }

      int var6 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(u * (var4 - 1)), 14);
      int var7 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(v * (var5 - 1)), 14);
      int var8 = 4 * (var6 + var7 * var4);
      color[0] = new g7(
         (this.l6.k5()[var8] & 0xFF) / 255.0F,
         (this.l6.k5()[var8 + 1] & 0xFF) / 255.0F,
         (this.l6.k5()[var8 + 2] & 0xFF) / 255.0F,
         (this.l6.k5()[var8 + 3] & 0xFF) / 255.0F
      );
   }

   private void n5() {
      if (this.n5 != null && this.n5.size() != 0) {
         u6$n5 var1 = this.n5.get_Item(0);
         com.aspose.slides.internal.o9b.l6 var2 = var1.l6();

         while (var1.l6().e2() > 64 && var1.l6().h0() > 64) {
            int var3 = var1.l6().e2() / 2;
            int var4 = var1.l6().h0() / 2;
            com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(var3, var4, 2498570);
            com.aspose.slides.internal.o9b.z1 var6 = com.aspose.slides.internal.o9b.z1.n5(var5);

            try {
               var6.l6(2);
               var6.k5(7);
               var6.a6(4);
               var6.n5(1);
               var6.n5(var2, new com.aspose.slides.internal.o9b.y2(0, 0, var3, var4));
            } finally {
               if (var6 != null) {
                  var6.dispose();
               }
            }

            var1 = new u6$n5(var5);
            this.n5.addItem(var1);
         }
      } else {
         throw new NullReferenceException("texture");
      }
   }

   @Override
   public final void updateCurrentLevel(float approximateSize) {
      this.l6 = null;
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            u6$n5 var3 = (u6$n5)var2.next();
            this.l6 = var3;
            if (approximateSize >= var3.u3()) {
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}

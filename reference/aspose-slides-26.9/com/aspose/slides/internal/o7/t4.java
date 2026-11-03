package com.aspose.slides.internal.o7;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.y2;

public class t4 extends com.aspose.slides.internal.k6.z3 {
   private final com.aspose.slides.internal.k6.n5 n5 = new m3(this);

   @Override
   public com.aspose.slides.internal.k6.n5 n5() {
      return this.n5;
   }

   @Override
   public void n5(com.aspose.slides.internal.x3.a6 var1) {
      com.aspose.slides.internal.o9b.z1 var2 = var1.n5();
      com.aspose.slides.internal.o9b.u3 var3 = (com.aspose.slides.internal.o9b.u3)var1.h0().deepClone();
      com.aspose.slides.internal.x4g.s7 var4 = var1.s7();
      if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.x4g.n3.class)) {
         this.n5(var2, (com.aspose.slides.internal.x4g.n3)var3, var4, var1.l6().n5().a6());
      } else if (var1.s7().t4()) {
         a0 var5 = new a0(var1.s7());
         var1.<com.aspose.slides.internal.o9b.z1>n5().n5(var1.h0(), var5);
      } else {
         var2.n5(var3, var4);
      }
   }

   private void n5(com.aspose.slides.internal.o9b.z1 var1, com.aspose.slides.internal.x4g.n3 var2, com.aspose.slides.internal.x4g.s7 var3, f2 var4) {
      com.aspose.slides.internal.x4g.m1 var5 = var1.m1().u9();
      com.aspose.slides.internal.o9b.l6 var6 = null;
      com.aspose.slides.internal.z0k.e2 var7 = null;

      try {
         com.aspose.slides.internal.x4g.m1 var8 = new com.aspose.slides.internal.x4g.m1(var4.l6(), 0.0F, 0.0F, var4.k5(), 0.0F, 0.0F);

         try {
            var1.l6(var8);
            com.aspose.slides.internal.x4g.s7 var9 = (com.aspose.slides.internal.x4g.s7)var3.deepClone();

            try {
               var9.l6(var5);
               com.aspose.slides.internal.x4g.m1 var10 = var8.u9();

               try {
                  var10.h0();
                  var9.l6(var10);
               } finally {
                  if (var10 != null) {
                     var10.dispose();
                  }
               }

               var6 = n5(var2, 24);
               u6 var11 = new u6(var6, 0);

               try {
                  var1.n5(var11, var9);
               } finally {
                  if (var11 != null) {
                     var11.dispose();
                  }
               }
            } finally {
               if (var9 != null) {
                  var9.dispose();
               }
            }
         } finally {
            if (var8 != null) {
               var8.dispose();
            }
         }
      } finally {
         var1.l6(var5);
         var5.dispose();
         if (var6 != null) {
            var6.dispose();
         }

         if (var7 != null) {
            var7.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.x4g.n3 var0, int var1) {
      if (var0 == null) {
         throw new ArgumentNullException("hatch");
      }

      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(var1, var1, 2498570);
      com.aspose.slides.internal.o9b.z1 var3 = com.aspose.slides.internal.o9b.z1.n5(var2);

      try {
         var3.n5(var0.h0().o8());
         var3.l6(var0, new y2(0, 0, var1, var1));
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      return var2;
   }
}

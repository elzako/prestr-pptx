package com.aspose.slides.internal.w9s;

import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.t9;
import com.aspose.slides.internal.b5j.u9;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.b5j.y4;
import com.aspose.slides.internal.d0e.c8;
import com.aspose.slides.internal.d0e.s7;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.internal.d8v.a6;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class k5 {
   private final com.aspose.slides.internal.b5j.u3 l6;
   private final u9 k5;
   private x8 u3;
   private final n3 a6;
   private final t9 u9;
   private k5 h0;
   private final int c8 = 1;
   public String n5;

   public k5() {
      this(new com.aspose.slides.internal.b5j.l6());
   }

   public k5(com.aspose.slides.internal.b5j.u3 var1) {
      this.l6 = var1;
      this.u3 = new x8();
      this.k5 = new u9();
      this.a6 = new n3();
      this.u9 = new t9(this.a6);
   }

   public k5(com.aspose.slides.internal.b5j.u3 var1, k5 var2) {
      this(var1);
      this.h0 = var2;
   }

   public final e2 n5(String var1) {
      return this.n5(var1, 0, 0);
   }

   public final e2 n5(String var1, float var2) {
      return this.n5(var1, 0, 0, var2);
   }

   public final e2 n5(String var1, int var2, int var3) {
      return this.n5(var1, var2, var3, 1.0F);
   }

   public final e2 n5(String var1, int var2, int var3, float var4) {
      s7 var5 = this.l6(var1);
      return this.n5(var1, var5, var2, var3, var4);
   }

   public final e2 n5(String var1, s7 var2, int var3, int var4, float var5) {
      this.n5 = var1;
      this.k5(var1);
      a6 var6 = var2.n5();
      if (var6 == null) {
         return null;
      }

      f2 var7 = var6.n5(this.a6, new f2(this.a6.k5(var3), this.a6.k5(var4))).c8().a6();
      f2 var8 = com.aspose.slides.internal.k4d.a6.n5(var7.l6() * var5, var7.k5() * var5).a6();
      l6 var9 = new l6(
         1, com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var8.l6()), 14), com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var8.k5()), 14)
      );

      try {
         com.aspose.slides.internal.l5.u9 var10 = com.aspose.slides.internal.l5.u9.n5(var9);

         try {
            var10.k5(2);
            var10.l6(2);
            var10.n5(new m1(var8.l6() / var7.l6(), 0.0F, 0.0F, var8.k5() / var7.k5(), 0.0F, 0.0F));
            u3 var11 = new u3(var10, this, this.u3, this.a6, this.k5, this.u9, this.l6);
            var11.l6(var2.u9, var7.a6(), null);
         } finally {
            if (var10 != null) {
               var10.dispose();
            }
         }

         e2 var20 = new e2();
         var9.a_(var20);
         var20.seek(0L, 0);
         return var20;
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }
   }

   private void k5(String var1) {
      for (k5 var2 = this.h0; var2 != null; var2 = var2.h0) {
         if (d1.u3(var2.n5, var1, (short)5)) {
            throw new c8("External resources loading cycle detected.");
         }
      }
   }

   public final s7 l6(String var1) {
      this.u3 = new x8();
      s7 var2 = com.aspose.slides.internal.n1n.l6.n5(var1);
      t2 var3 = var2.u9;
      y4.n5(var3, this.u3, this.l6);
      y4.n5(var3, this.u3);
      com.aspose.slides.internal.f5n.k5.n5(var3);
      y4.n5(var3, this.l6, this.k5);
      return var2;
   }
}

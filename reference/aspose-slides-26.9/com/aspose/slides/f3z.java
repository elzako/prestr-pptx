package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Arrays;

class f3z {
   private com.aspose.slides.internal.x1.x8 n5;
   private com.aspose.slides.internal.k0r.y2 l6;
   private com.aspose.slides.internal.z0k.e2 k5;
   private com.aspose.slides.internal.z0k.n5 u3;
   private com.aspose.slides.internal.k0r.c4i a6 = null;
   private x4v[] u9 = new x4v[3];
   private com.aspose.slides.internal.k0r.u6 h0;
   private SortedList<Long, Long> c8 = new SortedList<>();
   private int t2;
   private int s7 = 1252;
   private Object x8;
   private final int[] n3 = new int[]{10, 2, 30, 30, 30, 30, 30, 30, 30, 30, 64, 64, 64, 64, 3, 3, 3, 71, 30, 3};
   private final int[] y4 = new int[]{10, 2, 30, 30, 3, 3, 3, 3, 3, 3, 3, 11, 4108, 4126, 30, 30, 11, 3, 10, 11, 0, 0, 11, 3, 65, 10, 30, 30, 30, 30};

   public f3z(com.aspose.slides.internal.x1.x8 var1, Object var2) {
      this.n5 = var1;
      this.x8 = var2;
      this.l6 = com.aspose.slides.internal.k0r.y2.n5(this.n5);

      try {
         this.t2();
      } catch (PptException var4) {
         throw var4;
      } catch (RuntimeException var5) {
         throw new PptReadException("Couldn't read \"PowerPoint Document\" record.", var5);
      }
   }

   public final ISlideText[] n5(int var1) {
      this.t2 = var1;
      x4v var2 = this.a6();
      if (var2 == null) {
         return new ISlideText[0];
      }

      int var3 = var2.k5();
      if (this.k5() && var3 > 2) {
         var3 = 2;
      }

      ISlideText[] var4 = new ISlideText[var3];
      if (var1 == 1) {
         int var5 = 90;

         for (int var6 = 0; var6 < var3; var6++) {
            s3x var7 = var2.n5(var6);
            var7.n5(90);
            var7.n5(true);
            if (var7.s7() > 0 && var5 > var7.s7()) {
               var5 = var7.s7();
            }
         }

         for (int var13 = 0; var13 < var3; var13++) {
            s3x var15 = var2.n5(var13);
            s3x var8 = var15.u9();
            var15.n5(var5);
            if (var8 == null) {
               var4[var13] = new y2t(var15.t2(), null, null, null, var15.c8());
            } else {
               var8.n5(var5);
               var4[var13] = new y2t(var15.t2(), null, null, var8.t2(), null);
            }
         }
      } else {
         for (int var12 = 0; var12 < var3; var12++) {
            s3x var14 = var2.n5(var12);
            String var16 = null;
            String var17 = null;
            String var9 = var14.h0();
            String var10 = var14.c8();
            if (this.u9[1] != null) {
               s3x var11 = this.u9().n5(var14.n3());
               if (var11 != null) {
                  var16 = var11.h0();
               }
            }

            if (this.u9[2] != null) {
               s3x var18 = this.h0().n5(var14.x8());
               if (var18 != null) {
                  var17 = var18.h0();
               }
            }

            var4[var12] = new y2t(var9, var16, null, var17, var10);
         }
      }

      return var4;
   }

   private void c8() {
      this.k5 = new com.aspose.slides.internal.z0k.e2(((com.aspose.slides.internal.x1.u9)this.n5.n5().u3("PowerPoint Document")).n5());
      this.u3 = new com.aspose.slides.internal.z0k.n5(this.k5);
      long var1 = this.l6.l6();

      boolean var8;
      do {
         com.aspose.slides.internal.k0r.c4i var3 = new com.aspose.slides.internal.k0r.c4i();
         this.n5(var3, var1 & 4294967295L);
         if (this.a6 == null) {
            this.a6 = var3;
         }

         com.aspose.slides.internal.k0r.j2 var4 = new com.aspose.slides.internal.k0r.j2();
         this.n5(var4, var3.k5());
         List$Enumerator var5 = var4.l6().iterator();

         try {
            while (var5.hasNext()) {
               com.aspose.slides.internal.k0r.w6 var6 = (com.aspose.slides.internal.k0r.w6)var5.next();
               if (!this.c8.containsKey(var6.n5())) {
                  this.c8.addItem(var6.n5(), var6.l6());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         var1 = var3.l6();
         var8 = (var1 & 4294967295L) > 0L;
      } while (var8);

      this.k5.setPosition(this.c8.get_Item(this.a6.u3()) & 4294967295L);
      this.s7();
   }

   private void t2() {
      this.c8();
   }

   private void s7() {
      com.aspose.slides.internal.k0r.z6z var1 = new com.aspose.slides.internal.k0r.z6z(this.u3);
      g4x var2 = new g4x(var1, this.u3);

      try {
         for (com.aspose.slides.internal.k0r.z6z var3 = var2.l6(); var3 != null; var3 = var2.l6()) {
            switch (var3.u3()) {
               case 1001:
                  this.n5(var3);
                  break;
               case 4080:
                  this.u9[var3.k5()] = new x4v(var3, this);
            }
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.k0r.z6z var1) {
      this.h0 = new com.aspose.slides.internal.k0r.u6();
      this.h0.n5(this.u3, var1);
   }

   private void n5(com.aspose.slides.internal.k0r.e6r var1, long var2) {
      this.k5.setPosition(var2);
      this.n5(var1);
   }

   private void n5(com.aspose.slides.internal.k0r.e6r var1) {
      var1.k5(this.u3);
   }

   final com.aspose.slides.internal.z0k.n5 n5() {
      return this.u3;
   }

   final SortedList<Long, Long> l6() {
      return this.c8;
   }

   final boolean k5() {
      Object var1 = null;
      String[] var2 = new String[]{(String)var1};
      String[] var3 = null;
      String[][] var4 = new String[][]{var3};
      byte[] var5 = null;
      byte[][] var6 = new byte[][]{var5};
      int[] var7 = Presentation.n5((s4e)this.x8, var6);
      var5 = var6[0];
      var4[0] = com.aspose.slides.internal.n8e.w1.u3();
      if (Arrays.equals(var7, i7t.l6) && var5 != null && var5.length > 0) {
         var4[0] = com.aspose.slides.ms.System.d1.n5(Presentation.n5(var5), new String[]{"\r\n", "\n", "\r", "\n\r"}, 0);
      }

      int[] var8 = com.aspose.slides.internal.n8e.z7.n5;
      if (com.aspose.slides.internal.n8e.f2.l6() == com.aspose.slides.internal.n8e.z7.l6) {
         try {
            var8 = com.aspose.slides.internal.n8e.f2.l6();
         } catch (IllegalStateException var10) {
            var8 = com.aspose.slides.internal.n8e.z7.n5;
            com.aspose.slides.internal.n8e.v4.n5(var10);
         }
      }

      var3 = var4[0];
      var2[0] = com.aspose.slides.ms.System.d1.n5(" ", var3);
      return (
            !Arrays.equals(com.aspose.slides.internal.n8e.w1.n5(), com.aspose.slides.internal.n8e.r4.l6)
               || com.aspose.slides.internal.n8e.j5.n5() == null
               || !(com.aspose.slides.internal.n8e.j5.n5() instanceof com.aspose.slides.internal.n8e.w1)
         )
         && !Arrays.equals(var7, i7t.k5)
         && !Arrays.equals(var8, com.aspose.slides.internal.n8e.z7.l6)
         && !Arrays.equals(var7, i7t.l6);
   }

   final com.aspose.slides.internal.k0r.u6 u3() {
      return this.h0;
   }

   final x4v a6() {
      return this.u9[0];
   }

   final x4v u9() {
      return this.u9[1];
   }

   final x4v h0() {
      return this.u9[2];
   }
}

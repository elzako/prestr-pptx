package com.aspose.slides.internal.y3;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.w0.c8;
import com.aspose.slides.internal.w0.s7;
import com.aspose.slides.internal.x4.n3;
import com.aspose.slides.internal.x4.t4;
import com.aspose.slides.internal.x4.x8;
import com.aspose.slides.ms.System.q1;

public class a6 extends x8 {
   private n3 n5;
   private float l6 = Float.MAX_VALUE;
   private float k5 = Float.MAX_VALUE;
   private float u3 = -Float.MAX_VALUE;
   private float a6 = -Float.MAX_VALUE;
   private boolean u9 = false;
   private int h0 = 0;

   public a6(n3 var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(w1 var1, String var2) {
      this.h0++;
      this.l6(var1.u3(), var2, null);
   }

   @Override
   public void n5(w1 var1, String var2, short[] var3) {
      this.h0++;
      this.l6(var1.u3(), var2, var3);
   }

   @Override
   public void n5(w1 var1, com.aspose.slides.internal.p1s.n5 var2) {
      this.n5(var1.u3(), this.z1());
   }

   @Override
   public void n5(w1 var1) {
      float var2 = this.z1();
      this.n5(new w1[]{this.n5.h0(), var1}, var2);
   }

   @Override
   public void n5(y1 var1) {
      this.h0(var1.y4());
   }

   @Override
   public void l6(y1 var1) {
      this.h0(var1.y4());
   }

   @Override
   public void k5(y1 var1) {
      this.h0(var1.y4());
   }

   @Override
   public void n5(t4 var1, s7 var2, com.aspose.slides.internal.w0.l6 var3) {
      this.h0(var1.k5().y4());
   }

   @Override
   public void n5(w1[] var1) {
      this.n5(var1, this.z1());
   }

   @Override
   public void l6(w1[] var1) {
      this.n5(var1, this.z1());
   }

   @Override
   public void n5(w1[][] var1) {
      this.n5(var1, this.z1());
   }

   @Override
   public void k5(w1[] var1) {
      this.n5(var1, this.z1());
   }

   @Override
   public void l6(w1[][] var1) {
      this.n5(var1, this.z1());
   }

   @Override
   public void n5(y1 var1, w1 var2, w1 var3) {
      this.u3(var1.y4(), var2.u3(), var3.u3());
   }

   @Override
   public void u3(y1 var1) {
      this.h0(var1.y4());
   }

   @Override
   public void l6(y1 var1, w1 var2, w1 var3) {
      this.u3(var1.y4(), var2.u3(), var3.u3());
   }

   @Override
   public void k5(y1 var1, w1 var2, w1 var3) {
      this.u3(var1.y4(), var2.u3(), var3.u3());
   }

   @Override
   public void n5(y1 var1, f2 var2) {
      this.h0(var1.y4());
   }

   @Override
   public void n5(y1 var1, y1 var2, byte[] var3) {
      this.h0(var2.y4());
   }

   @Override
   public void n5(y1 var1, y1 var2, c8 var3, com.aspose.slides.internal.p1s.n5 var4, int var5, byte[] var6) {
      t9();
   }

   @Override
   public void u9() {
      t9();
   }

   @Override
   public void u3() {
      t9();
   }

   @Override
   public void a6() {
      t9();
   }

   @Override
   public void k5() {
      t9();
   }

   @Override
   public void h0() {
      t9();
   }

   @Override
   public void c8() {
      t9();
   }

   @Override
   public void t2() {
      t9();
   }

   @Override
   public void l6(int var1) {
      t9();
   }

   @Override
   public void n5(int var1) {
      t9();
   }

   @Override
   public void n5(boolean var1) {
   }

   private static void t9() {
      throw new InvalidOperationException("Metafile size scanning is expected to be used for WMF only.");
   }

   private void l6(w1 var1, String var2, short[] var3) {
      if (var3 != null) {
         this.u9 = true;
      }

      com.aspose.slides.internal.x4.k5 var4 = this.n5.a6();
      f2 var5 = var4.n5(var2).a6();
      boolean var6 = (var4.s7() & 1) != 0;
      if (var6) {
         this.n5.h0().n5(var1);
         this.n5.u9(new w1(var1.l6() + var5.l6(), var1.k5()));
      }

      var5 = new f2(var5.l6() + var4.y4() * var2.length(), var5.k5());
      w1[] var7 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), 1));
      var1.n5(var7[0]);
      c8 var8 = com.aspose.slides.internal.p1.l6.n5(var7[0].u3(), var4.z1(), var5.a6(), var4.a6(), var4.s7(), var4.u3().a6());
      var7[0].n5(var1);
      w1[] var9 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), 4));
      var9[0] = new w1(var1.l6(), var1.k5());
      var9[1] = new w1(var1.l6() + var5.l6(), var1.k5());
      var9[2] = new w1(var1.l6(), var1.k5() + q1.l6(var1.k5()) * var5.k5());
      var9[3] = new w1(var1.l6() + var5.l6(), var1.k5() + q1.l6(var1.k5()) * var5.k5());
      var8.n5(var9);
      this.l6(var9, 0.0F);
   }

   private void h0(y1 var1) {
      float var2 = this.z1();
      this.n5(new w1[]{new w1(var1.x8(), var1.n3()), new w1(var1.x8() + var1.s7(), var1.n3() + var1.k5())}, var2);
   }

   private void u3(y1 var1, w1 var2, w1 var3) {
      float var4 = this.z1();
      this.n5(new w1[]{var2, var3}, var4);
      w1 var5 = new w1(var1.x8(), var1.n3());
      w1 var6 = new w1(var1.x8() + var1.s7(), var1.n3() + var1.k5());
      w1 var7 = new w1((var5.l6() + var6.l6()) / 2.0F, (var5.k5() + var6.k5()) / 2.0F);
      var2 = new w1(var2.l6() - var7.l6(), var2.k5() - var7.k5());
      var3 = new w1(var3.l6() - var7.l6(), var3.k5() - var7.k5());
      int var8 = l6(var2.u3());
      int var9 = l6(var3.u3());
      switch (var8) {
         case 1:
            switch (var9) {
               case 1:
                  if (!(var3.l6() < var2.l6()) || !(var3.k5() < var2.k5())) {
                     this.n5(new w1(var6.l6(), var7.k5()), var4);
                     this.n5(new w1(var7.l6(), var6.k5()), var4);
                     this.n5(new w1(var5.l6(), var7.k5()), var4);
                     this.n5(new w1(var7.l6(), var5.k5()), var4);
                  }

                  return;
               case 2:
                  this.n5(new w1(var7.l6(), var5.k5()), var4);
                  return;
               case 3:
                  this.n5(new w1(var5.l6(), var7.k5()), var4);
                  this.n5(new w1(var7.l6(), var5.k5()), var4);
                  return;
               case 4:
                  this.n5(new w1(var7.l6(), var6.k5()), var4);
                  this.n5(new w1(var5.l6(), var7.k5()), var4);
                  this.n5(new w1(var7.l6(), var5.k5()), var4);
                  return;
               default:
                  throw new InvalidOperationException("Unknown quarter.");
            }
         case 2:
            switch (var9) {
               case 1:
                  this.n5(new w1(var6.l6(), var7.k5()), var4);
                  this.n5(new w1(var7.l6(), var6.k5()), var4);
                  this.n5(new w1(var5.l6(), var7.k5()), var4);
                  return;
               case 2:
                  if (!(var3.l6() < var2.l6()) || !(var3.k5() > var2.k5())) {
                     this.n5(new w1(var7.l6(), var5.k5()), var4);
                     this.n5(new w1(var6.l6(), var7.k5()), var4);
                     this.n5(new w1(var7.l6(), var6.k5()), var4);
                     this.n5(new w1(var5.l6(), var7.k5()), var4);
                  }

                  return;
               case 3:
                  this.n5(new w1(var5.l6(), var7.k5()), var4);
                  return;
               case 4:
                  this.n5(new w1(var7.l6(), var6.k5()), var4);
                  this.n5(new w1(var5.l6(), var7.k5()), var4);
                  return;
               default:
                  throw new InvalidOperationException("Unknown quarter.");
            }
         case 3:
            switch (var9) {
               case 1:
                  this.n5(new w1(var6.l6(), var7.k5()), var4);
                  this.n5(new w1(var7.l6(), var6.k5()), var4);
                  return;
               case 2:
                  this.n5(new w1(var7.l6(), var5.k5()), var4);
                  this.n5(new w1(var6.l6(), var7.k5()), var4);
                  this.n5(new w1(var7.l6(), var6.k5()), var4);
                  return;
               case 3:
                  if (!(var3.l6() > var2.l6()) || !(var3.k5() > var2.k5())) {
                     this.n5(new w1(var5.l6(), var7.k5()), var4);
                     this.n5(new w1(var7.l6(), var5.k5()), var4);
                     this.n5(new w1(var6.l6(), var7.k5()), var4);
                     this.n5(new w1(var7.l6(), var6.k5()), var4);
                  }

                  return;
               case 4:
                  this.n5(new w1(var7.l6(), var6.k5()), var4);
                  return;
               default:
                  throw new InvalidOperationException("Unknown quarter.");
            }
         case 4:
            switch (var9) {
               case 1:
                  this.n5(new w1(var6.l6(), var7.k5()), var4);
                  return;
               case 2:
                  this.n5(new w1(var7.l6(), var5.k5()), var4);
                  this.n5(new w1(var6.l6(), var7.k5()), var4);
                  return;
               case 3:
                  this.n5(new w1(var5.l6(), var7.k5()), var4);
                  this.n5(new w1(var7.l6(), var5.k5()), var4);
                  this.n5(new w1(var6.l6(), var7.k5()), var4);
                  return;
               case 4:
                  if (!(var3.l6() > var2.l6()) || !(var3.k5() < var2.k5())) {
                     this.n5(new w1(var7.l6(), var6.k5()), var4);
                     this.n5(new w1(var5.l6(), var7.k5()), var4);
                     this.n5(new w1(var7.l6(), var5.k5()), var4);
                     this.n5(new w1(var6.l6(), var7.k5()), var4);
                  }

                  return;
               default:
                  throw new InvalidOperationException("Unknown quarter.");
            }
         default:
            throw new InvalidOperationException("Unknown quarter.");
      }
   }

   private static int l6(w1 var0) {
      if (var0.l6() > 0.0F && var0.k5() >= 0.0F) {
         return 1;
      } else if (var0.l6() <= 0.0F && var0.k5() > 0.0F) {
         return 2;
      } else {
         return var0.l6() < 0.0F && var0.k5() <= 0.0F ? 3 : 4;
      }
   }

   private float z1() {
      s7 var1 = this.n5.a6().l6();
      return var1 != null ? var1.l6() / 2.0F : 0.0F;
   }

   public final void n5(w1 var1, float var2) {
      w1[] var3 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), 1));
      var1.n5(var3[0]);
      this.n5.a6().z1().n5(var3);
      var3[0].n5(var1);
      this.l6(var1.u3(), var2);
   }

   public final void n5(w1[] var1, float var2) {
      this.n5.a6().z1().n5(var1);

      for (int var3 = 0; var3 < var1.length; var3++) {
         this.l6(var1[var3].u3(), var2);
      }
   }

   public final void n5(w1[][] var1, float var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         this.n5(var1[var3], var2);
      }
   }

   public final void l6(w1[] var1, float var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         this.l6(var1[var3].u3(), var2);
      }
   }

   private void l6(w1 var1, float var2) {
      this.l6 = q1.l6(this.l6, var1.l6() - var2);
      this.k5 = q1.l6(this.k5, var1.k5() - var2);
      this.u3 = q1.n5(this.u3, var1.l6() + var2);
      this.a6 = q1.n5(this.a6, var1.k5() + var2);
   }

   public final y1 l6() {
      return y1.n5(this.l6, this.k5, this.u3, this.a6);
   }

   public final boolean y4() {
      return this.u9;
   }

   public final int e2() {
      return this.h0;
   }
}

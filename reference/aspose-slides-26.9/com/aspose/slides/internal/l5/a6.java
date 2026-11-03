package com.aspose.slides.internal.l5;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;

public class a6 extends u9 {
   private z1 n5;

   public a6(z1 var1) {
      this.n5 = var1;
   }

   @Override
   public void dispose() {
      this.n5.dispose();
   }

   @Override
   public void n5(c8 var1, y1 var2, y1 var3, int var4) {
      if (var1 == null) {
         throw new ArgumentNullException("image");
      }

      this.n5.n5(((u3)var1).n5(), var2.y4(), var3.y4(), var4);
   }

   @Override
   public void n5(c8 var1, y2 var2, float var3, float var4, float var5, float var6, int var7) {
      if (var1 == null) {
         throw new ArgumentNullException("image");
      }

      this.n5.n5(((u3)var1).n5(), var2.n3(), var3, var4, var5, var6, var7);
   }

   @Override
   public void n5(c8 var1, y2 var2, float var3, float var4, float var5, float var6, int var7, t2 var8) {
      if (var1 == null) {
         throw new ArgumentNullException("image");
      }

      this.n5.n5(((u3)var1).n5(), var2.n3(), var3, var4, var5, var6, var7, var8 == null ? null : var8.k5());
   }

   @Override
   public void n5(n3 var1, com.aspose.slides.internal.x4g.s7 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("pen");
      }

      this.n5.n5(var1.n5(), var2);
   }

   @Override
   public void n5(l6 var1, com.aspose.slides.internal.x4g.s7 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("brush");
      }

      this.n5.n5(var1.n5(), var2);
   }

   @Override
   public void n5(l6 var1, y1 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("brush");
      }

      this.n5.l6(var1.n5(), var2.y4());
   }

   @Override
   public void n5(m1 var1, int var2) {
      this.n5.n5(var1, var2);
   }

   @Override
   public a0 l6() {
      return this.n5.u9();
   }

   @Override
   public void l6(a0 var1) {
      this.n5.l6(var1);
   }

   @Override
   public void n5(y1 var1, int var2) {
      this.n5.n5(var1.y4(), var2);
   }

   @Override
   public void n5(a0 var1, int var2) {
      this.n5.n5(var1, var2);
   }

   @Override
   public int k5() {
      return this.n5.c8();
   }

   @Override
   public void n5(int var1) {
      this.n5.n5(var1);
   }

   @Override
   public int u3() {
      return this.n5.t9();
   }

   @Override
   public void l6(int var1) {
      this.n5.a6(var1);
   }

   @Override
   public void k5(int var1) {
      this.n5.u9(var1);
   }

   @Override
   public m1 a6() {
      return this.n5.m1();
   }

   @Override
   public void n5(m1 var1) {
      this.n5.l6(var1);
   }
}

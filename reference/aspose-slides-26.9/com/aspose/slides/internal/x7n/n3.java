package com.aspose.slides.internal.x7n;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j5;

@j3
public class n3 extends t4 {
   static final j5 n5 = new j5(1912, 1, 1);
   com.aspose.slides.internal.o3n.l6 l6 = new com.aspose.slides.internal.o3n.l6(this, com.aspose.slides.internal.o3n.n5.u3());

   @Override
   public int[] l6() {
      return this.l6.n5();
   }

   @Override
   public j5 k5() {
      return j5.k5.m3();
   }

   @Override
   public j5 u3() {
      return n5;
   }

   @Override
   public int a6() {
      if (super.a6 == -1) {
         super.a6 = 99;
      }

      return super.a6;
   }

   @Override
   public void n5(int var1) {
      super.c8();
      if (var1 >= 99 && var1 <= this.l6.l6()) {
         super.a6 = var1;
      } else {
         throw new ArgumentOutOfRangeException("year");
      }
   }

   @Override
   public int n5(j5 var1) {
      return this.l6.n5(var1);
   }

   @Override
   public int l6(j5 var1) {
      return this.l6.l6(var1);
   }

   @Override
   public int k5(j5 var1) {
      return this.l6.k5(var1);
   }

   @Override
   public int n5(int var1, int var2) {
      return this.l6.n5(var1, var2);
   }

   @Override
   public int u3(j5 var1) {
      return this.l6.u3(var1);
   }

   @Override
   public int a6(j5 var1) {
      return this.l6.a6(var1);
   }

   @Override
   public int n5(j5 var1, int var2, int var3) {
      return this.l6.n5(var1, var2, var3);
   }

   @Override
   public int u9(j5 var1) {
      return this.l6.u9(var1);
   }

   @Override
   public j5 n5(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return this.l6.n5(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public int h0() {
      return 1;
   }

   @Override
   public Object deepClone() {
      n3 var1 = new n3();
      var1.n5(this.a6());
      return var1;
   }
}

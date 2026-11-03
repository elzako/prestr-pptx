package com.aspose.slides.internal.o8m;

import com.aspose.slides.ms.System.IDisposable;

public final class p6 implements i1, IDisposable {
   private d1 n5;
   private int l6;

   p6(j3 var1, boolean var2, byte[] var3, byte[] var4) {
      this.n5 = new d1(var1, var2, var3, var4);
      this.l6 = var1.c8();
   }

   @Override
   public boolean k5() {
      return this.n5.k5();
   }

   @Override
   public boolean as_() {
      return this.n5.as_();
   }

   @Override
   public int at_() {
      return this.n5.at_();
   }

   @Override
   public int au_() {
      return this.n5.au_();
   }

   @Override
   public void dispose() {
      this.n5.a6();
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      return this.n5.n5(var1, var2, var3, var4, var5);
   }

   @Override
   public byte[] n5(byte[] var1, int var2, int var3) {
      return this.n5.n5(var1, var2, var3);
   }
}

package com.aspose.slides.internal.m9;

import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.z0k.m3;

public class c8 extends h0 {
   public static c8 n3(int var0) {
      n5 var1 = null;
      if (var0 > 0) {
         var1 = new u9(var0);
         var1.l6(var0);
      } else {
         var1 = new a6();
      }

      return new c8(var1);
   }

   private c8(n5 var1) {
      super(var1);
   }

   private c8(c8 var1, int var2) {
      super(var1, var2);
   }

   private c8(c8 var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public l6 k5(int var1, int var2) {
      if (var1 >= 0 && var1 + var2 <= this.l6()) {
         return new c8(this, var1, var2);
      } else {
         throw new IndexOutOfRangeException("Attempt to bind data outside of its limits.");
      }
   }

   @Override
   public l6 l6(int var1) {
      if (var1 >= 0 && var1 <= this.l6()) {
         return new c8(this, var1);
      } else {
         throw new IndexOutOfRangeException("Attempt to bind data outside of its limits.");
      }
   }

   public final int n5(int var1, byte var2) {
      this.n5.n5(this.n5(var1), var2);
      return 1;
   }

   public final int l6(int var1, byte[] var2, int var3, int var4) {
      return this.n5.l6(this.n5(var1), var2, var3, this.l6(var1, var4));
   }

   public final int n5(int var1, byte[] var2) {
      return this.l6(var1, var2, 0, var2.length);
   }

   public final int u3(int var1, int var2) {
      this.n5(var1, (byte)(var2 >> 8 & 0xFF));
      this.n5(var1 + 1, (byte)(var2 & 0xFF));
      return 2;
   }

   public final int a6(int var1, int var2) {
      this.n5.n5(var1, (byte)(var2 & 0xFF));
      this.n5.n5(var1 + 1, (byte)(var2 >> 8 & 0xFF));
      return 2;
   }

   public final int n5(int var1, long var2) {
      this.n5(var1, (byte)(var2 >> 24 & 255L));
      this.n5(var1 + 1, (byte)(var2 >> 16 & 255L));
      this.n5(var1 + 2, (byte)(var2 >> 8 & 255L));
      this.n5(var1 + 3, (byte)(var2 & 255L));
      return 4;
   }

   public final int l6(int var1, long var2) {
      this.n5.n5(var1, (byte)(var2 & 255L));
      this.n5.n5(var1 + 1, (byte)(var2 >> 8 & 255L));
      this.n5.n5(var1 + 2, (byte)(var2 >> 16 & 255L));
      this.n5.n5(var1 + 3, (byte)(var2 >> 24 & 255L));
      return 4;
   }

   public final int k5(int var1, long var2) {
      return this.n5(var1, var2);
   }

   public final void n5(m3 var1, int var2) {
      this.n5.n5(var1, var2);
   }

   public final void n5(m3 var1) {
      this.n5.n5(var1);
   }
}

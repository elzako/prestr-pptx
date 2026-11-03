package com.aspose.slides.internal.l7h;

public class j5$u3 {
   private char[] n5;
   private int[] l6 = new int[1];
   private int k5;
   private int u3;
   private int a6 = 0;
   private j5 u9;
   private x8 h0;
   private int c8;
   private int t2;
   private byte[] s7;
   private int x8;
   private s7 n3;

   public j5$u3(j5 var1, x8 var2, char[] var3, int var4, int var5, byte[] var6, int var7, int var8) {
      this.u9 = var1;
      this.h0 = var2;
      this.n5 = var3;
      this.l6[0] = var4;
      this.k5 = var4;
      this.u3 = var4 + var5;
      this.c8 = var7;
      this.x8 = var7;
      this.s7 = var6;
      this.t2 = var7 + var8;
      if (this.h0 == null) {
         this.n3 = var1.n3().n5();
      } else {
         this.n3 = this.h0.u3();
      }

      this.n3.n5(this.x8, this.u3);
   }

   public final boolean n5(char var1, int var2) {
      if (this.n5 != null) {
         if (this.l6[0] >= this.u3) {
            this.x8 -= var2;
            this.u9.n5(this.h0, this.x8 <= this.c8);
            return false;
         }

         this.n5[this.l6[0]++] = var1;
      }

      this.a6++;
      return true;
   }

   public final boolean n5(char var1) {
      return this.n5(var1, 1);
   }

   public final boolean n5(char var1, char var2, int var3) {
      if (this.l6[0] >= this.u3 - 1) {
         this.x8 -= var3;
         this.u9.n5(this.h0, this.x8 <= this.c8);
         return false;
      } else {
         return this.n5(var1, var3) && this.n5(var2, var3);
      }
   }

   public final void n5(int var1) {
      this.x8 += var1;
   }

   public final boolean n5() {
      return this.x8 < this.t2;
   }

   public final boolean l6(int var1) {
      return this.x8 <= this.t2 - var1;
   }

   public final byte l6() {
      return this.x8 >= this.t2 ? 0 : this.s7[this.x8++];
   }

   public final int k5() {
      return this.x8 - this.c8;
   }

   public final boolean n5(byte var1) {
      byte[] var2 = new byte[]{var1};
      return this.n5(var2);
   }

   public final boolean n5(byte var1, byte var2) {
      byte[] var3 = new byte[]{var1, var2};
      return this.n5(var3);
   }

   public final boolean n5(byte var1, byte var2, byte var3, byte var4) {
      byte[] var5 = new byte[]{var1, var2, var3, var4};
      return this.n5(var5);
   }

   public final boolean n5(byte[] var1) {
      if (this.n5 != null) {
         int var2 = this.l6[0];
         if (!this.n3.n5(var1, this.x8, this.n5, this.l6)) {
            this.x8 -= var1.length;
            this.n3.u3();
            this.u9.n5(this.h0, this.l6[0] == this.k5);
            return false;
         }

         this.a6 = this.a6 + (this.l6[0] - var2);
      } else {
         this.a6 = this.a6 + this.n3.l6(var1, this.x8);
      }

      return true;
   }

   public final int u3() {
      return this.a6;
   }
}

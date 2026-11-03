package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class y3 {
   private int n5;
   private final com.aspose.slides.internal.l7h.a5 l6 = new com.aspose.slides.internal.l7h.a5();
   private char k5;
   private int u3;
   private char a6;
   private int u9;
   private char h0;
   private int c8;
   private char t2;
   private int s7;
   private char x8;
   private int n3;
   private long y4;
   private int e2;
   private d4 t9;
   private char z1;
   private char t4;
   private int q0;
   private long z3;
   private char m1;
   private char k7;
   private int m3;
   private long z8;
   private final List<Long> j5 = new List<>();
   private final List<Integer> w1 = new List<>();

   public y3(d4 var1, int var2) {
      this.t9 = var1;
      this.n5 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = 0;
      this.h0 = 0;
      this.c8 = 0;
      this.t2 = 0;
      this.s7 = 0;
      this.x8 = 0;
      this.n3 = 0;
      this.y4 = 0L;
      this.e2 = -1;
      this.q0 = 0;
      this.z3 = 0L;
      this.m1 = 0;
      this.k7 = 0;
      this.m3 = 0;
      this.z8 = 0L;

      for (int var3 = 0; var3 < var2; var3++) {
         this.w1.addItem(-1);
         this.j5.addItem(com.aspose.slides.internal.v6g.k5.h0(0, 9));
      }
   }

   private void n5(int var1, int var2) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException(com.aspose.slides.ms.System.d1.n5("parameter outIndexParam = {0} must be greater than 0", new Object[]{var1}));
      }

      if (var1 > this.w1.size() - 1) {
         int var3 = var1 + 1 - this.w1.size();

         for (int var4 = 0; var4 < var3; var4++) {
            this.w1.addItem(-1);
         }
      }

      this.w1.set_Item(var1, var2);
   }

   private void n5(int var1, long var2) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException(com.aspose.slides.ms.System.d1.n5("parameter outIndexParam = {0} must be greater than 0", new Object[]{var1}));
      }

      if (var1 > this.j5.size() - 1) {
         int var4 = var1 + 1 - this.j5.size();

         for (int var5 = 0; var5 < var4; var5++) {
            this.j5.addItem(com.aspose.slides.internal.v6g.k5.h0(0, 9));
         }
      }

      this.j5.set_Item(var1, com.aspose.slides.internal.v6g.k5.h0(var2, 10));
   }

   private void l6(char var1, int var2, long var3) {
      if (e4.x8(var3)) {
         this.x8 = var1;
         this.n3 = var2;
      } else {
         switch ((int)(var3 & 3145728L & 4294967295L)) {
            case 0:
               this.t2 = var1;
               this.s7 = var2;
               break;
            case 1048576:
               this.h0 = var1;
               this.c8 = var2;
               break;
            case 2097152:
               this.a6 = var1;
               this.u9 = var2;
               break;
            case 3145728:
               this.k5 = var1;
               this.u3 = var2;
         }
      }
   }

   public final void n5() {
      this.k5 = this.a6 = this.h0 = this.t2 = this.x8 = 0;
      this.e2 = -1;
      this.z1 = this.t4 = 0;
      this.m1 = this.k7 = 0;
   }

   public final boolean n5(e4 var1, char var2, int var3, long var4) {
      long var6 = var1.n5(var2);
      this.y4 = var4;
      if (!e4.t2(var6)) {
         return false;
      }

      if (e4.s7(var6)) {
         long[] var8 = var1.n5(var6);

         for (int var9 = 0; var9 < 3 && (var8[var9] & 4294967295L) != 0L; var9++) {
            char var10 = (char)var8[var9];
            long var11 = var1.n5(var10);
            this.l6(var10, var3, var11);
         }
      } else {
         this.l6(var2, var3, var6);
      }

      return true;
   }

   public final void l6(e4 var1, char var2, int var3, long var4) {
      long var6 = var1.n5(var2);
      this.q0 = var3;
      this.z3 = var4;
      if (e4.l6(var6)) {
         switch ((int)(var6 & 3145728L & 4294967295L)) {
            case 0:
               this.t4 = var2;
               break;
            case 1048576:
               this.z1 = var2;
         }
      }
   }

   public final void k5(e4 var1, char var2, int var3, long var4) {
      long var6 = var1.n5(var2);
      this.m3 = var3;
      this.z8 = var4;
      if (e4.k5(var6)) {
         switch ((int)(var6 & 3145728L & 4294967295L)) {
            case 1048576:
               this.m1 = var2;
               break;
            case 2097152:
               this.k7 = var2;
         }
      }
   }

   public final void l6() {
      if (this.t9 != null && this.e2 >= 0) {
         this.t9.n5(this.n5, this.e2);
      }
   }

   public final void k5() {
      if (this.k5 != 0) {
         this.e2 = this.n5;
         this.n5(this.k5, this.u3, this.y4);
      }
   }

   public final void u3() {
      if (this.a6 != 0) {
         this.n5(this.a6, this.u9, this.y4);
      }
   }

   public final void a6() {
      if (this.h0 != 0) {
         this.n5(this.h0, this.c8, this.y4);
      }
   }

   public final void u9() {
      if (this.t2 != 0) {
         this.n5(this.t2, this.s7, this.y4);
      }
   }

   public final void h0() {
      if (this.x8 != 0) {
         this.n5(this.x8, this.n3, this.y4);
      }
   }

   public final void c8() {
      if (this.z1 != 0) {
         this.n5(this.z1, this.q0, this.z3);
      }
   }

   public final void t2() {
      if (this.t4 != 0) {
         this.n5(this.t4, this.q0, this.z3);
      }
   }

   public final void s7() {
      if (this.m1 != 0) {
         this.n5(this.m1, this.m3, this.z8);
      }
   }

   public final void x8() {
      if (this.k7 != 0) {
         this.n5(this.k7, this.m3, this.z8);
      }
   }

   public final void n5(char var1, int var2, long var3) {
      this.l6.n5(var1);
      this.n5(this.n5, var2);
      this.n5(this.n5, var3 & 4294967295L);
      this.n5++;
   }

   public final List<Long> n3() {
      return this.j5;
   }

   public final List<Integer> y4() {
      return this.w1;
   }

   public final String e2() {
      return this.l6.toString();
   }
}

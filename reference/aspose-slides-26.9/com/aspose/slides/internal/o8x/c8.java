package com.aspose.slides.internal.o8x;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class c8 extends com.aspose.slides.internal.v6g.h0<c8> {
   private s7 n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private long u9;
   private String h0;

   public final int n5() {
      return (int)(this.u9 & 15L);
   }

   public final String l6() {
      return this.n5.u3();
   }

   public final String k5() {
      return this.n5.l6();
   }

   public final String u3() {
      return this.l6().length() == 0 ? this.k5() : d1.n5(new String[]{this.l6(), ":", this.k5()});
   }

   public final String a6() {
      return this.n5.k5();
   }

   public final com.aspose.slides.internal.x6s.l6 u9() {
      return this.n5.t2();
   }

   public final String h0() {
      return this.n5.a6();
   }

   public final int c8() {
      return this.n5.s7() + (int)((this.u9 & 16776192L & 4294967295L) >> 10);
   }

   public final int t2() {
      return this.n5.x8() + (this.a6 & 65535);
   }

   public final int s7() {
      return this.t2() + (int)((this.u9 & 4294967295L) >> 24);
   }

   public final n3 x8() {
      return this.n5.n5();
   }

   public final int n5(c8[][] var1) {
      return this.n5.t2().l6(var1);
   }

   public final int l6(c8[][] var1) {
      var1[0] = this.n5.c8();
      return this.k5 & 65535;
   }

   public final int k5(c8[][] var1) {
      var1[0] = this.n5.u9();
      return this.l6 & 65535;
   }

   public final int u3(c8[][] var1) {
      var1[0] = this.n5.h0();
      return this.u3 & 65535;
   }

   public final boolean n5(String var1, String var2) {
      return this.n5.l6() == var1 && d1.a6(this.n5.k5(), var2);
   }

   public final boolean l6(String var1, String var2) {
      return this.n5() == 1 && this.n5.l6() == var1 && d1.a6(this.n5.k5(), var2);
   }

   public final boolean n3() {
      String var1 = this.n5.l6();
      return this.n5() == 3 && var1.length() == 3 && "xml".equals(var1);
   }

   public final boolean y4() {
      return (this.l6 & 65535) != 0;
   }

   public final boolean e2() {
      return (this.u9 & 128L & 4294967295L) != 0L;
   }

   public final boolean t9() {
      return (this.u9 & 16L & 4294967295L) != 0L;
   }

   public final boolean z1() {
      return (this.u9 & 32L & 4294967295L) != 0L;
   }

   public final boolean t4() {
      return (this.u9 & 64L & 4294967295L) != 0L;
   }

   public final boolean q0() {
      int var1 = this.n5();
      return var1 == 2 || var1 == 3;
   }

   public final boolean z3() {
      return com.aspose.slides.internal.x6s.a6.t2(this.n5());
   }

   public final boolean m1() {
      return (this.u9 & 512L & 4294967295L) != 0L;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.u9 = (this.u9 | 512L) & 4294967295L;
      } else {
         this.u9 = this.u9 & 4294967295L & 255L & 4294967295L;
      }
   }

   public final boolean k7() {
      return (this.u9 & 256L & 4294967295L) != 0L;
   }

   public final int m3() {
      return this.n5.n3();
   }

   public final String z8() {
      return this.h0;
   }

   public final void n5(n3 var1) {
      this.n5 = new s7(var1);
   }

   public final void n5(s7 var1, int var2, int var3) {
      this.n5 = var1;
      this.u9 = var2 & 4294967295L;
      this.k5 = var3 & 65535;
   }

   public final void n5(int var1, int var2) {
      this.u9 = (this.u9 | (var1 & 4294967295L) << 10) & 4294967295L;
      this.a6 = var2 & 65535;
   }

   public final void n5(int var1) {
      this.u9 = (this.u9 | (var1 & 4294967295L) << 24) & 4294967295L;
   }

   public final void n5(String var1) {
      this.h0 = var1;
   }

   public final void l6(boolean var1) {
      this.h0 = d1.n5;
      if (var1) {
         this.u9 = (this.u9 | 256L) & 4294967295L;
      }
   }

   public final void l6(String var1) {
      this.h0 = var1;
      this.u9 = (this.u9 | 32L | 128L) & 4294967295L;
   }

   public final void l6(int var1) {
      if (var1 == 2) {
         this.u9 = (this.u9 | 16L) & 4294967295L;
      } else {
         this.u9 = (this.u9 | 32L) & 4294967295L;
         if (var1 == 1) {
            this.u9 = (this.u9 | 64L) & 4294967295L;
         }
      }
   }

   public final void n5(x8 var1, c8[] var2, int var3) {
      this.l6 = var3 & 65535;
      if (var2 != this.n5.u9()) {
         this.n5 = var1.n5(this.n5.l6(), this.n5.k5(), this.n5.u3(), this.n5.a6(), this.n5.c8(), var2, this.n5.h0(), this.n5.t2(), this.n5.s7(), this.n5.x8());
      }
   }

   public final void l6(x8 var1, c8[] var2, int var3) {
      this.u3 = var3 & 65535;
      if (var2 != this.n5.h0()) {
         this.n5 = var1.n5(this.n5.l6(), this.n5.k5(), this.n5.u3(), this.n5.a6(), this.n5.c8(), this.n5.u9(), var2, this.n5.t2(), this.n5.s7(), this.n5.x8());
      }
   }

   public void n5(c8 var1) {
      var1 = var1 == null ? new c8() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
   }

   public c8 j5() {
      c8 var1 = new c8();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.j5();
   }

   private boolean l6(c8 var1) {
      return j8.n5(var1.n5, this.n5)
         && var1.l6 == this.l6
         && var1.k5 == this.k5
         && var1.u3 == this.u3
         && var1.a6 == this.a6
         && var1.u9 == this.u9
         && j8.n5(var1.h0, this.h0);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof c8) ? false : this.l6((c8)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public c8 Clone() {
      return this.j5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(c8 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}

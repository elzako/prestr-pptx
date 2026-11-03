package com.aspose.slides.internal.y5s;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.q1;

@j3
public class j5 extends com.aspose.slides.internal.v6g.h0<j5> {
   private static final j5 n5 = new j5();
   private int l6;
   private int k5;
   private int u3;
   private int a6;

   public j5() {
   }

   public j5(int var1, int var2, int var3, int var4) {
      this.u3 = var1;
      this.a6 = var2;
      this.k5 = var3;
      this.l6 = var4;
   }

   public j5(z3 var1, y2 var2) {
      this.u3 = var1.l6();
      this.a6 = var1.k5();
      this.k5 = var2.n5();
      this.l6 = var2.l6();
   }

   public static j5 n5() {
      return n5;
   }

   public z3 l6() {
      return new z3(this.k5(), this.u3());
   }

   public int k5() {
      return this.u3;
   }

   public void n5(int var1) {
      this.u3 = var1;
   }

   public int u3() {
      return this.a6;
   }

   public void l6(int var1) {
      this.a6 = var1;
   }

   public int a6() {
      return this.k5;
   }

   public void k5(int var1) {
      this.k5 = var1;
   }

   public int u9() {
      return this.l6;
   }

   public void u3(int var1) {
      this.l6 = var1;
   }

   public int h0() {
      return this.u3;
   }

   public void a6(int var1) {
      int var2 = var1 - this.u3;
      this.u3 = var1;
      this.k5 -= var2;
   }

   public int c8() {
      return this.a6;
   }

   public void u9(int var1) {
      int var2 = var1 - this.a6;
      this.a6 = var1;
      this.l6 -= var2;
   }

   public int t2() {
      return this.k5() + this.a6();
   }

   public void h0(int var1) {
      int var2 = var1 - this.t2();
      this.k5 += var2;
   }

   public int s7() {
      return this.u3() + this.u9();
   }

   public void c8(int var1) {
      int var2 = var1 - this.s7();
      this.l6 += var2;
   }

   public boolean x8() {
      return this.l6 == 0 && this.k5 == 0 && this.u3 == 0 && this.a6 == 0;
   }

   public static j5 n5(j5 var0, j5 var1) {
      int var2 = q1.n5(var0.k5(), var1.k5());
      int var3 = q1.l6(var0.k5() + var0.a6(), var1.k5() + var1.a6());
      int var4 = q1.n5(var0.u3(), var1.u3());
      int var5 = q1.l6(var0.u3() + var0.u9(), var1.u3() + var1.u9());
      return var3 >= var2 && var5 >= var4 ? new j5(var2, var4, var3 - var2, var5 - var4) : n5;
   }

   public static boolean l6(j5 var0, j5 var1) {
      return var0.k5() == var1.k5() && var0.u3() == var1.u3() && var0.a6() == var1.a6() && var0.u9() == var1.u9();
   }

   public static j5 n5(int var0, int var1, int var2, int var3) {
      return new j5(var0, var1, var2 - var0, var3 - var1);
   }

   public void n5(z3 var1) {
      this.n5(var1.l6(), var1.k5());
   }

   public void n5(int var1, int var2) {
      this.n5(this.k5() + var1);
      this.l6(this.u3() + var2);
   }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof j5)) {
         return false;
      }

      j5 var2 = ((j5)obj).n3();
      return var2.k5() == this.k5() && var2.u3() == this.u3() && var2.a6() == this.a6() && var2.u9() == this.u9();
   }

   @Override
   public int hashCode() {
      return this.k5() ^ (this.u3() << 13 | this.u3() >> 19) ^ (this.a6() << 26 | this.a6() >> 6) ^ (this.u9() << 7 | this.u9() >> 25);
   }

   @Override
   public String toString() {
      return d1.n5(com.aspose.slides.internal.x7n.l6.u3(), "{{X={0}, Y={1}, Width={2}, Height={3}}}", this.u3, this.a6, this.k5, this.l6);
   }

   public void n5(j5 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public j5 n3() {
      j5 var1 = new j5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n3();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public j5 Clone() {
      return this.n3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(j5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}

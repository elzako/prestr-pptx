package com.aspose.slides.internal.o9b;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;
import java.awt.Rectangle;

@j3
public class y2 extends com.aspose.slides.internal.v6g.h0<y2> {
   private Rectangle k5 = new Rectangle();
   public static y2 n5 = new y2();
   // $VF: synthetic field
   static final boolean l6 = !y2.class.desiredAssertionStatus();

   public y2() {
   }

   public y2(Rectangle var1) {
      this.k5 = var1;
   }

   public static y2 n5(y1 var0) {
      int var1 = (int)Math.ceil(var0.x8());
      int var2 = (int)Math.ceil(var0.n3());
      int var3 = (int)Math.ceil(var0.s7());
      int var4 = (int)Math.ceil(var0.k5());
      return new y2(var1, var2, var3, var4);
   }

   public static y2 n5(int var0, int var1, int var2, int var3) {
      return new y2(var0, var1, var2 - var0, var3 - var1);
   }

   public void n5(int var1, int var2) {
      this.n5(new p8(var1, var2));
   }

   public void n5(p8 var1) {
      this.k5.x = this.k5.x - var1.l6();
      this.k5.y = this.k5.y - var1.k5();
      this.l6(this.t2() + var1.l6() * 2);
      this.n5(this.l6() + var1.k5() * 2);
   }

   public static y2 n5(y2 var0, y2 var1) {
      return !var0.u9(var1.n3())
         ? n5
         : n5(Math.max(var0.u3(), var1.u3()), Math.max(var0.c8(), var1.c8()), Math.min(var0.u9(), var1.u9()), Math.min(var0.n5(), var1.n5()));
   }

   public void n5(y2 var1) {
      n5(this.n3(), var1.n3()).u3(this);
   }

   public static y2 l6(y1 var0) {
      int var1 = (int)q1.u3(var0.x8());
      int var2 = (int)q1.u3(var0.n3());
      int var3 = (int)q1.u3(var0.s7());
      int var4 = (int)q1.u3(var0.k5());
      return new y2(var1, var2, var3, var4);
   }

   public static y2 k5(y1 var0) {
      int var1 = (int)var0.x8();
      int var2 = (int)var0.n3();
      int var3 = (int)var0.s7();
      int var4 = (int)var0.k5();
      return new y2(var1, var2, var3, var4);
   }

   public static y2 l6(y2 var0, y2 var1) {
      return n5(Math.min(var0.u3(), var1.u3()), Math.min(var0.c8(), var1.c8()), Math.max(var0.u9(), var1.u9()), Math.max(var0.n5(), var1.n5()));
   }

   public static boolean k5(y2 var0, y2 var1) {
      return j5.l6(var0.a6(), var1.a6()) && p8.l6(var0.h0(), var1.h0());
   }

   public static boolean u3(y2 var0, y2 var1) {
      return !j5.l6(var0.a6(), var1.a6()) || !p8.l6(var0.h0(), var1.h0());
   }

   public y2(j5 var1, p8 var2) {
      this.k5 = new Rectangle(var1.n5(), var1.l6(), var2.l6(), var2.k5());
   }

   public y2(int var1, int var2, int var3, int var4) {
      this.k5 = new Rectangle(var1, var2, var3, var4);
   }

   public int n5() {
      return this.x8() + this.l6();
   }

   public int l6() {
      return this.k5.height;
   }

   public void n5(int var1) {
      this.k5.height = var1;
   }

   public boolean k5() {
      return this.s7() == 0 && this.x8() == 0 && this.t2() == 0 && this.l6() == 0;
   }

   public int u3() {
      return this.s7();
   }

   public j5 a6() {
      return new j5(this.s7(), this.x8());
   }

   public void n5(j5 var1) {
      this.k5.x = var1.n5();
      this.k5.y = var1.l6();
   }

   public int u9() {
      return this.s7() + this.t2();
   }

   public p8 h0() {
      return new p8(this.t2(), this.l6());
   }

   public void l6(p8 var1) {
      this.l6(var1.l6());
      this.n5(var1.k5());
   }

   public int c8() {
      return this.x8();
   }

   public int t2() {
      return this.k5.width;
   }

   public void l6(int var1) {
      this.k5.width = var1;
   }

   public int s7() {
      return this.k5.x;
   }

   public void k5(int var1) {
      this.k5.x = var1;
   }

   public int x8() {
      return this.k5.y;
   }

   public void u3(int var1) {
      this.k5.y = var1;
   }

   public boolean l6(int var1, int var2) {
      return var1 >= this.u3() && var1 < this.u9() && var2 >= this.c8() && var2 < this.n5();
   }

   public boolean l6(j5 var1) {
      return this.l6(var1.n5(), var1.l6());
   }

   public boolean l6(y2 var1) {
      return a6(var1, n5(this.n3(), var1.n3()));
   }

   @Override
   public int hashCode() {
      return this.l6() + this.t2() ^ this.s7() + this.x8();
   }

   public boolean k5(y2 var1) {
      return this.u3() < var1.u9() && this.u9() > var1.u3() && this.c8() < var1.n5() && this.n5() > var1.c8();
   }

   private boolean u9(y2 var1) {
      return this.u3() <= var1.u9() && this.u9() >= var1.u3() && this.c8() <= var1.n5() && this.n5() >= var1.c8();
   }

   public void k5(int var1, int var2) {
      this.k5.x += var1;
      this.k5.y += var2;
   }

   public void k5(j5 var1) {
      this.k5.x = this.k5.x + var1.n5();
      this.k5.y = this.k5.y + var1.l6();
   }

   @Override
   public String toString() {
      return d1.n5("{{X={0},Y={1},Width={2},Height={3}}}", this.s7(), this.x8(), this.t2(), this.l6());
   }

   public void u3(y2 var1) {
      var1.k5(this.s7());
      var1.u3(this.x8());
      var1.l6(this.t2());
      var1.n5(this.l6());
   }

   public y2 n3() {
      y2 var1 = new y2();
      this.u3(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n3();
   }

   private boolean h0(y2 var1) {
      return var1.s7() == this.s7() && var1.x8() == this.x8() && var1.t2() == this.t2() && var1.l6() == this.l6();
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof y2) ? false : this.h0((y2)obj);
      }
   }

   public static boolean a6(y2 var0, y2 var1) {
      return var0.equals(var1);
   }

   public static y2 n5(Rectangle var0) {
      return var0 == null ? new y2() : new y2(var0);
   }

   public static Rectangle a6(y2 var0) {
      return var0 == null ? null : var0.k5;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y2 Clone() {
      return this.n3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(y2 bridgeArg0) {
      this.u3(bridgeArg0);
   }

}

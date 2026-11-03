package com.aspose.slides.internal.o9b;

import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.n1;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.Rectangle2D.Float;

@j3
public class y1 extends com.aspose.slides.internal.v6g.h0<y1> {
   private Float k5 = new Float();
   public static y1 n5 = new y1();
   // $VF: synthetic field
   static final boolean l6 = !y1.class.desiredAssertionStatus();

   public y1() {
   }

   Float n5() {
      return this.k5;
   }

   public static y1 n5(float var0, float var1, float var2, float var3) {
      return new y1(var0, var1, var2 - var0, var3 - var1);
   }

   public static y1 n5(y1 var0, float var1, float var2) {
      y1 var3 = new y1(var0.x8(), var0.n3(), var0.s7(), var0.k5());
      var3.n5(var1, var2);
      return var3;
   }

   public void n5(float var1, float var2) {
      this.n5(new f2(var1, var2));
   }

   public void n5(f2 var1) {
      this.k5.x = this.k5.x - var1.l6();
      this.k5.y = this.k5.y - var1.k5();
      this.k5.width = this.k5.width + var1.l6() * 2.0F;
      this.k5.height = this.k5.height + var1.k5() * 2.0F;
   }

   public static y1 n5(y1 var0, y1 var1) {
      return !var0.u3(var1.y4())
         ? n5
         : n5(Math.max(var0.a6(), var1.a6()), Math.max(var0.t2(), var1.t2()), Math.min(var0.h0(), var1.h0()), Math.min(var0.l6(), var1.l6()));
   }

   public void n5(y1 var1) {
      n5(this.y4(), var1.y4()).a6(this);
   }

   public static y1 l6(y1 var0, y1 var1) {
      return n5(Math.min(var0.a6(), var1.a6()), Math.min(var0.t2(), var1.t2()), Math.max(var0.h0(), var1.h0()), Math.max(var0.l6(), var1.l6()));
   }

   public static boolean k5(y1 var0, y1 var1) {
      return var0.x8() == var1.x8() && var0.n3() == var1.n3() && var0.s7() == var1.s7() && var0.k5() == var1.k5();
   }

   public static boolean u3(y1 var0, y1 var1) {
      return var0.x8() != var1.x8() || var0.n3() != var1.n3() || var0.s7() != var1.s7() || var0.k5() != var1.k5();
   }

   public static y1 n5(y2 var0) {
      return new y1(var0.s7(), var0.x8(), var0.t2(), var0.l6());
   }

   public y1(w1 var1, f2 var2) {
      this.k5 = new Float(var1.l6(), var1.k5(), var2.l6(), var2.k5());
   }

   public y1(float var1, float var2, float var3, float var4) {
      this.k5 = new Float(var1, var2, var3, var4);
   }

   public y1(RectangularShape var1) {
      this.k5 = new Float((float)var1.getX(), (float)var1.getY(), (float)var1.getWidth(), (float)var1.getHeight());
   }

   public float l6() {
      return this.n3() + this.k5();
   }

   public float k5() {
      return this.k5.height;
   }

   public void n5(float var1) {
      this.k5.height = var1;
   }

   public boolean u3() {
      return this.s7() <= 0.0F || this.k5() <= 0.0F;
   }

   public float a6() {
      return this.x8();
   }

   public w1 u9() {
      return new w1(this.x8(), this.n3());
   }

   public void n5(w1 var1) {
      this.k5(var1.l6());
      this.u3(var1.k5());
   }

   public float h0() {
      return this.x8() + this.s7();
   }

   public f2 c8() {
      return new f2(this.s7(), this.k5());
   }

   public void l6(f2 var1) {
      this.l6(var1.l6());
      this.n5(var1.k5());
   }

   public float t2() {
      return this.n3();
   }

   public float s7() {
      return this.k5.width;
   }

   public void l6(float var1) {
      this.k5.width = var1;
   }

   public float x8() {
      return this.k5.x;
   }

   public void k5(float var1) {
      this.k5.x = var1;
   }

   public float n3() {
      return this.k5.y;
   }

   public void u3(float var1) {
      this.k5.y = var1;
   }

   public boolean l6(float var1, float var2) {
      return var1 >= this.a6() && var1 < this.h0() && var2 >= this.t2() && var2 < this.l6();
   }

   public boolean l6(y1 var1) {
      return this.x8() <= var1.x8() && var1.h0() <= this.h0() && this.n3() <= var1.n3() && var1.l6() <= this.l6();
   }

   @Override
   public int hashCode() {
      return (int)(this.x8() + this.n3() + this.s7() + this.k5());
   }

   public boolean k5(y1 var1) {
      return !(this.a6() >= var1.h0()) && !(this.h0() <= var1.a6()) && !(this.t2() >= var1.l6()) && !(this.l6() <= var1.t2());
   }

   public boolean u3(y1 var1) {
      return !(this.a6() > var1.h0()) && !(this.h0() < var1.a6()) && !(this.t2() > var1.l6()) && !(this.l6() < var1.t2());
   }

   public void k5(float var1, float var2) {
      this.k5(this.x8() + var1);
      this.u3(this.n3() + var2);
   }

   private static String a6(float var0) {
      return n1.u9(var0);
   }

   @Override
   public String toString() {
      return "{X=" + a6(this.x8()) + ",Y=" + a6(this.n3()) + ",Width=" + a6(this.s7()) + ",Height=" + a6(this.k5()) + "}";
   }

   public void a6(y1 var1) {
      var1.k5(this.x8());
      var1.u3(this.n3());
      var1.l6(this.s7());
      var1.n5(this.k5());
   }

   public y1 y4() {
      y1 var1 = new y1();
      this.a6(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.y4();
   }

   private boolean h0(y1 var1) {
      return var1.x8() == this.x8() && var1.n3() == this.n3() && var1.s7() == this.s7() && var1.k5() == this.k5();
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof y1) ? false : this.h0((y1)obj);
      }
   }

   public static y1 n5(Rectangle2D var0) {
      return var0 == null ? new y1() : new y1(var0);
   }

   public static Float u9(y1 var0) {
      return var0 == null ? null : var0.n5();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y1 Clone() {
      return this.y4();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(y1 bridgeArg0) {
      this.a6(bridgeArg0);
   }

}

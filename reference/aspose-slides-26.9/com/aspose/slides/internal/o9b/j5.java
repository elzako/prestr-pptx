package com.aspose.slides.internal.o9b;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;
import java.awt.Point;

@j3
public class j5 extends com.aspose.slides.internal.v6g.h0<j5> {
   private Point k5 = new Point(0, 0);
   public static j5 n5 = new j5();
   // $VF: synthetic field
   static final boolean l6 = !j5.class.desiredAssertionStatus();

   public j5() {
   }

   public static j5 n5(w1 var0) {
      int var1 = (int)var0.l6();
      int var2 = (int)var0.k5();
      return new j5(var1, var2);
   }

   public static boolean n5(j5 var0, j5 var1) {
      return var0.n5() != var1.n5() || var0.l6() != var1.l6();
   }

   public static w1 n5(j5 var0) {
      return new w1(var0.n5(), var0.l6());
   }

   public j5(int var1, int var2) {
      this.k5 = new Point(var1, var2);
   }

   public int n5() {
      return this.k5.x;
   }

   public void n5(int var1) {
      this.k5.x = var1;
   }

   public int l6() {
      return this.k5.y;
   }

   public void l6(int var1) {
      this.k5.y = var1;
   }

   @Override
   public int hashCode() {
      return this.n5() ^ this.l6();
   }

   public void n5(int var1, int var2) {
      this.k5.x += var1;
      this.k5.y += var2;
   }

   @Override
   public String toString() {
      return d1.n5("{{X={0},Y={1}}}",new Object[]{ a3.n5(this.n5(), com.aspose.slides.internal.x7n.l6.k5()), a3.n5(this.l6(), com.aspose.slides.internal.x7n.l6.k5())});
   }

   public void l6(j5 var1) {
      this.n5(var1.n5(), var1.l6());
   }

   public void k5(j5 var1) {
      var1.n5(this.n5());
      var1.l6(this.l6());
   }

   public j5 k5() {
      j5 var1 = new j5();
      this.k5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean a6(j5 var1) {
      return var1.n5() == this.n5() && var1.l6() == this.l6();
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof j5) ? false : this.a6((j5)obj);
      }
   }

   public static boolean l6(j5 var0, j5 var1) {
      return var0.equals(var1);
   }

   public static Point u3(j5 var0) {
      return var0 == null ? null : var0.k5;
   }

   public static j5 l6(w1 var0) {
      return var0.a6();
   }

   public static j5 k5(w1 var0) {
      return var0.u9();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public j5 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(j5 bridgeArg0) {
      this.k5(bridgeArg0);
   }

}

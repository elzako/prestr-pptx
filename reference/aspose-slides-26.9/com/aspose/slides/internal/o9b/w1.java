package com.aspose.slides.internal.o9b;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.n1;
import java.awt.geom.Point2D.Float;

@j3
public class w1 extends com.aspose.slides.internal.v6g.h0<w1> {
   private Float k5 = new Float(0.0F, 0.0F);
   public static w1 n5 = new w1();
   // $VF: synthetic field
   static final boolean l6 = !w1.class.desiredAssertionStatus();

   public w1() {
   }

   public w1(Float var1) {
      this.k5 = var1;
   }

   public static w1 n5(w1 var0, f2 var1) {
      return new w1(var0.l6() + var1.l6(), var0.k5() + var1.k5());
   }

   public static boolean n5(w1 var0, w1 var1) {
      return var0.l6() == var1.l6() && var0.k5() == var1.k5();
   }

   public static boolean l6(w1 var0, w1 var1) {
      return var0.l6() != var1.l6() || var0.k5() != var1.k5();
   }

   public w1(float var1, float var2) {
      this.k5 = new Float(var1, var2);
   }

   public boolean n5() {
      return this.l6() == 0.0 && this.k5() == 0.0;
   }

   public float l6() {
      return this.k5.x;
   }

   public void n5(float var1) {
      this.k5.x = var1;
   }

   public float k5() {
      return this.k5.y;
   }

   public void l6(float var1) {
      this.k5.y = var1;
   }

   @Override
   public int hashCode() {
      return (int)this.l6() ^ (int)this.k5();
   }

   @Override
   public String toString() {
      return d1.n5("{{X={0}, Y={1}}}",new Object[]{ n1.n5(this.l6(), com.aspose.slides.internal.x7n.l6.u3()), n1.n5(this.k5(), com.aspose.slides.internal.x7n.l6.u3())});
   }

   public static w1 l6(w1 var0, f2 var1) {
      return new w1(var0.l6() + var1.l6(), var0.k5() + var1.k5());
   }

   public void n5(w1 var1) {
      var1.n5(this.l6());
      var1.l6(this.k5());
   }

   public w1 u3() {
      w1 var1 = new w1();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   private boolean k5(w1 var1) {
      return var1.l6() == this.l6() && var1.k5() == this.k5();
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof w1) ? false : this.k5((w1)obj);
      }
   }

   public static w1 n5(Float var0) {
      return var0 == null ? new w1(0.0F, 0.0F) : new w1(var0);
   }

   public static Float l6(w1 var0) {
      return var0 == null ? null : var0.k5;
   }

   public j5 a6() {
      return new j5((int)this.l6(), (int)this.k5());
   }

   public j5 u9() {
      return new j5(Math.round(this.l6()), Math.round(this.k5()));
   }

   public static w1 n5(j5 var0) {
      return new w1(var0.n5(), var0.l6());
   }

   public static w1[] n5(j5[] var0) {
      if (var0 == null) {
         return null;
      }

      if (var0.length == 0) {
         return new w1[0];
      }

      w1[] var1 = new w1[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = n5(var0[var2]);
      }

      return var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public w1 Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(w1 bridgeArg0) {
      this.n5(bridgeArg0);
   }


   static {
      com.aspose.slides.internal.v6g.k5.n5(w1.class, new r4());
   }
}

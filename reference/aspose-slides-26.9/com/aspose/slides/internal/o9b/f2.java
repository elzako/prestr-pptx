package com.aspose.slides.internal.o9b;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.n1;
import java.awt.geom.Dimension2D;

@j3
public class f2 extends com.aspose.slides.internal.v6g.h0<f2> {
   private Dimension2D k5 = new com.aspose.slides.internal.c9b.u9(0.0F, 0.0F);
   public static f2 n5 = new f2();
   // $VF: synthetic field
   static final boolean l6 = !f2.class.desiredAssertionStatus();

   public f2() {
   }

   private f2(Dimension2D var1) {
      this.k5 = var1;
   }

   public static f2 n5(f2 var0, f2 var1) {
      return new f2(var0.l6() + var1.l6(), var0.k5() + var1.k5());
   }

   public static boolean l6(f2 var0, f2 var1) {
      return var0.l6() == var1.l6() && var0.k5() == var1.k5();
   }

   public static boolean k5(f2 var0, f2 var1) {
      return var0.l6() != var1.l6() || var0.k5() != var1.k5();
   }

   public f2(float var1, float var2) {
      this.k5.setSize(var1, var2);
   }

   public boolean n5() {
      return this.l6() == 0.0 && this.k5() == 0.0;
   }

   public float l6() {
      return (float)this.k5.getWidth();
   }

   public void n5(float var1) {
      this.k5.setSize(var1, this.k5.getHeight());
   }

   public float k5() {
      return (float)this.k5.getHeight();
   }

   public void l6(float var1) {
      this.k5.setSize(this.k5.getWidth(), var1);
   }

   @Override
   public int hashCode() {
      return (int)this.l6() ^ (int)this.k5();
   }

   public p8 u3() {
      int var1 = (int)this.l6();
      int var2 = (int)this.k5();
      return new p8(var1, var2);
   }

   @Override
   public String toString() {
      return d1.n5(
         "{{Width={0}, Height={1}}}",new Object[]{ n1.n5(this.l6(), com.aspose.slides.internal.x7n.l6.u3()), n1.n5(this.k5(), com.aspose.slides.internal.x7n.l6.u3())
      });
   }

   public static f2 n5(Dimension2D var0) {
      return var0 == null ? new f2(0.0F, 0.0F) : new f2(var0);
   }

   public static Dimension2D n5(f2 var0) {
      return var0 == null ? null : var0.k5;
   }

   public void l6(f2 var1) {
      var1.n5(this.l6());
      var1.l6(this.k5());
   }

   public f2 a6() {
      f2 var1 = new f2();
      this.l6(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.a6();
   }

   private boolean k5(f2 var1) {
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
         return !(obj instanceof f2) ? false : this.k5((f2)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public f2 Clone() {
      return this.a6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(f2 bridgeArg0) {
      this.l6(bridgeArg0);
   }

}

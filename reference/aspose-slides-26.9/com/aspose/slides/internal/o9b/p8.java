package com.aspose.slides.internal.o9b;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;
import java.awt.Dimension;

@j3
public class p8 extends com.aspose.slides.internal.v6g.h0<p8> {
   private Dimension k5 = new Dimension(0, 0);
   public static p8 n5 = new p8();
   // $VF: synthetic field
   static final boolean l6 = !p8.class.desiredAssertionStatus();

   public p8() {
   }

   public static p8 n5(f2 var0) {
      int var1 = (int)Math.ceil(var0.l6());
      int var2 = (int)Math.ceil(var0.k5());
      return new p8(var1, var2);
   }

   public static p8 l6(f2 var0) {
      int var1 = (int)q1.u3(var0.l6());
      int var2 = (int)q1.u3(var0.k5());
      return new p8(var1, var2);
   }

   public static boolean n5(p8 var0, p8 var1) {
      return var0.l6() != var1.l6() || var0.k5() != var1.k5();
   }

   public static f2 n5(p8 var0) {
      return new f2(var0.l6(), var0.k5());
   }

   private p8(Dimension var1) {
      this.k5 = var1;
   }

   public p8(int var1, int var2) {
      this.k5 = new Dimension(var1, var2);
   }

   public boolean n5() {
      return this.l6() == 0 && this.k5() == 0;
   }

   public int l6() {
      return this.k5.width;
   }

   public void n5(int var1) {
      this.k5.width = var1;
   }

   public int k5() {
      return this.k5.height;
   }

   public void l6(int var1) {
      this.k5.height = var1;
   }

   @Override
   public int hashCode() {
      return this.l6() ^ this.k5();
   }

   @Override
   public String toString() {
      return d1.n5("{{Width={0}, Height={1}}}",new Object[]{ this.l6(), this.k5()});
   }

   public static p8 n5(Dimension var0) {
      return var0 == null ? new p8(0, 0) : new p8(var0);
   }

   public static Dimension l6(p8 var0) {
      return var0 == null ? null : var0.k5;
   }

   public void k5(p8 var1) {
      var1.n5(this.l6());
      var1.l6(this.k5());
   }

   public p8 u3() {
      p8 var1 = new p8();
      this.k5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   private boolean u3(p8 var1) {
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
         return !(obj instanceof p8) ? false : this.u3((p8)obj);
      }
   }

   public static boolean l6(p8 var0, p8 var1) {
      return var0.equals(var1);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public p8 Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(p8 bridgeArg0) {
      this.k5(bridgeArg0);
   }

}

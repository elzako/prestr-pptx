package com.aspose.slides.internal.f3c;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.s3;

public class z1 extends com.aspose.slides.internal.v6g.h0<z1> {
   private int l6;
   private String k5;
   // $VF: synthetic field
   static final boolean n5 = !z1.class.desiredAssertionStatus();

   public z1() {
   }

   public z1(int var1) {
      this.l6 = var1;
      this.k5 = l6(var1);
   }

   public int n5() {
      return this.l6;
   }

   public void n5(int var1) {
      this.l6 = var1;
   }

   public void n5(String var1) {
      this.k5 = var1;
   }

   public static String l6(int var0) {
      switch (var0) {
         case 0:
         default:
            return d1.n5;
         case 1:
         case 2:
         case 4:
         case 8:
         case 16:
         case 32:
         case 64:
         case 128:
         case 256:
         case 512:
         case 1024:
         case 2048:
         case 4096:
         case 8192:
         case 16384:
         case 32768:
         case 65536:
         case 131072:
         case 262144:
         case 524288:
         case 16777216:
         case 33554432:
            return d1.n5(s3.n5(t4.class, var0), new Object[]{});
      }
   }

   public void n5(z1 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public z1 l6() {
      z1 var1 = new z1();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   private boolean l6(z1 var1) {
      return var1.l6 == this.l6 && j8.n5(var1.k5, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof z1) ? false : this.l6((z1)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.l6;
      return 31 * var1 + (this.k5 != null ? this.k5.hashCode() : 0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public z1 Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(z1 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
